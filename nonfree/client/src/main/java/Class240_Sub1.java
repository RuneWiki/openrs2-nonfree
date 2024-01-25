import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class240_Sub1 extends Class240 {

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Lclient!qk;")
	private final Class275 aClass275_1;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "Lclient!ib;")
	private final Class140 aClass140_1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class240_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass275_1 = new Class275(this.aSocket1.getInputStream(), arg1);
		this.aClass140_1 = new Class140(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ol", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6372();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	@Override
	public void method6372() {
		try {
			this.aSocket1.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass275_1.method6947();
		this.aClass140_1.method4120();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIII)I")
	@Override
	public int method6374(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass275_1.method6946(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method6379(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass275_1.method6948(arg0);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "([BIII)V")
	@Override
	public void method6378(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass140_1.method4117(arg1, arg0);
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	@Override
	public void method6377() {
		this.aClass275_1.method6949();
		this.aClass140_1.method4119();
	}
}
