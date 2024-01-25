import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!np;")
	private final Class217 aClass217_1;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!ae;")
	private final Class7 aClass7_1;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class71_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass217_1 = new Class217(this.aSocket2.getInputStream(), arg1);
		this.aClass7_1 = new Class7(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIII)I")
	@Override
	public int method5963(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass217_1.method5139(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	@Override
	public void method5965() {
		this.aClass217_1.method5137();
		this.aClass7_1.method119();
	}

	@OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5970();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	@Override
	public void method5970() {
		try {
			this.aSocket2.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass217_1.method5135();
		this.aClass7_1.method117();
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "([BIII)V")
	@Override
	public void method5968(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass7_1.method123(arg0, arg1);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method5964(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass217_1.method5140(arg0);
	}
}
