import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!am", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Lclient!lc;")
	private final Class141 aClass141_1;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "Lclient!hd;")
	private final Class94 aClass94_1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class13_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass141_1 = new Class141(this.aSocket1.getInputStream(), arg1);
		this.aClass94_1 = new Class94(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!am", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method172();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	@Override
	public void method172() {
		try {
			this.aSocket1.close();
		} catch (@Pc(13) IOException local13) {
		}
		this.aClass141_1.method3810();
		this.aClass94_1.method2625();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method179(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass141_1.method3805(arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	@Override
	public void method173() {
		this.aClass141_1.method3809();
		this.aClass94_1.method2627();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III[B)V")
	@Override
	public void method177(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass94_1.method2624(arg1, arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([BIII)I")
	@Override
	public int method180(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass141_1.method3811(arg0, arg2, arg1);
	}
}
