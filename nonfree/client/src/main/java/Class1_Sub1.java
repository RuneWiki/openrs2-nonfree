import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lclient!gl;")
	private final Class120 aClass120_1;

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lclient!cf;")
	private final Class50 aClass50_1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class1_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass120_1 = new Class120(this.aSocket1.getInputStream(), arg1);
		this.aClass50_1 = new Class50(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method49(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass120_1.method2960(arg0);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "([BZII)V")
	@Override
	public void method53(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		this.aClass50_1.method910(arg1, arg0);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	@Override
	public void method50() {
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass120_1.method2956();
		this.aClass50_1.method911();
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
	@Override
	public void method47() {
		this.aClass120_1.method2955();
		this.aClass50_1.method912();
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIB[B)I")
	@Override
	public int method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass120_1.method2959(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!aaa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method50();
	}
}
