import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!bca", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!bca", name = "h", descriptor = "Lclient!nfa;")
	private final Class246 aClass246_1;

	@OriginalMember(owner = "client!bca", name = "p", descriptor = "Lclient!qs;")
	private final Class299 aClass299_1;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class26_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass246_1 = new Class246(this.aSocket1.getInputStream(), arg1);
		this.aClass299_1 = new Class299(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method741(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass246_1.method5502(arg0);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method745(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass299_1.method6580(arg0, arg1);
	}

	@OriginalMember(owner = "client!bca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method746();
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI[BI)I")
	@Override
	public int method743(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass246_1.method5501(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	@Override
	public void method744() {
		this.aClass246_1.method5504();
		this.aClass299_1.method6577();
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V")
	@Override
	public void method746() {
		try {
			this.aSocket1.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass246_1.method5505();
		this.aClass299_1.method6578();
	}
}
