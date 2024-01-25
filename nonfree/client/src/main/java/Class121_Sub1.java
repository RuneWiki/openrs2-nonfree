import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class121_Sub1 extends Class121 {

	@OriginalMember(owner = "client!hfa", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!hfa", name = "j", descriptor = "Lclient!bu;")
	private final Class42 aClass42_1;

	@OriginalMember(owner = "client!hfa", name = "n", descriptor = "Lclient!nj;")
	private final Class236 aClass236_1;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class121_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass42_1 = new Class42(this.aSocket1.getInputStream(), arg1);
		this.aClass236_1 = new Class236(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method2936() {
		try {
			this.aSocket1.close();
		} catch (@Pc(12) IOException local12) {
		}
		this.aClass42_1.method845();
		this.aClass236_1.method5071();
	}

	@OriginalMember(owner = "client!hfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2936();
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
	@Override
	public void method2933() {
		this.aClass42_1.method841();
		this.aClass236_1.method5069();
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method2937(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass236_1.method5072(arg0, arg1);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2934(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass42_1.method840(arg0);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(III[B)I")
	@Override
	public int method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass42_1.method842(arg1, arg2, arg0);
	}
}
