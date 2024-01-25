import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class241_Sub1 extends Class241 {

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!vh;")
	private final Class341 aClass341_1;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!ao;")
	private final Class19 aClass19_1;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class241_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass341_1 = new Class341(this.aSocket2.getInputStream(), arg1);
		this.aClass19_1 = new Class19(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BIBI)I")
	@Override
	public int method7085(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass341_1.method8032(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	@Override
	public void method7090() {
		this.aClass341_1.method8036();
		this.aClass19_1.method229();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	@Override
	public void method7087() {
		try {
			this.aSocket2.close();
		} catch (@Pc(12) IOException local12) {
		}
		this.aClass341_1.method8035();
		this.aClass19_1.method230();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[B)V")
	@Override
	public void method7088(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass19_1.method232(arg1, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7084(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass341_1.method8033(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7087();
	}
}
