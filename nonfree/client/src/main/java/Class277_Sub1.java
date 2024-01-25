import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class277_Sub1 extends Class277 {

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Lclient!eq;")
	private final Class94 aClass94_1;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "Lclient!vp;")
	private final Class306 aClass306_1;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class277_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass94_1 = new Class94(this.aSocket2.getInputStream(), arg1);
		this.aClass306_1 = new Class306(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	@Override
	public void method7170() {
		try {
			this.aSocket2.close();
		} catch (@Pc(9) IOException local9) {
		}
		this.aClass94_1.method2487();
		this.aClass306_1.method7729();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method7164(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass306_1.method7728(arg1, arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	@Override
	public void method7167() {
		this.aClass94_1.method2484();
		this.aClass306_1.method7730();
	}

	@OriginalMember(owner = "client!ts", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7170();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([BIII)I")
	@Override
	public int method7168(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass94_1.method2485(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method7166(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass94_1.method2486(arg0);
	}
}
