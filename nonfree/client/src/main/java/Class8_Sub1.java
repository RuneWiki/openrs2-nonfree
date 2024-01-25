import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "Lclient!sq;")
	private final Class301 aClass301_1;

	@OriginalMember(owner = "client!aga", name = "s", descriptor = "Lclient!ps;")
	private final Class258 aClass258_1;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class8_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass301_1 = new Class301(this.aSocket1.getInputStream(), arg1);
		this.aClass258_1 = new Class258(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method359(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass301_1.method7420(arg0);
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V")
	@Override
	public void method362() {
		try {
			this.aSocket1.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass301_1.method7419();
		this.aClass258_1.method6661();
	}

	@OriginalMember(owner = "client!aga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method362();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I[BII)I")
	@Override
	public int method360(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass301_1.method7417(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V")
	@Override
	public void method357() {
		this.aClass301_1.method7422();
		this.aClass258_1.method6662();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method361(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		this.aClass258_1.method6664(arg1, arg0);
	}
}
