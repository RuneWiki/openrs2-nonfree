import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!tg;")
	private final Class314 aClass314_1;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "Lclient!nd;")
	private final Class238 aClass238_1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class45_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass314_1 = new Class314(this.aSocket1.getInputStream(), arg1);
		this.aClass238_1 = new Class238(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III[B)I")
	@Override
	public int method838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass314_1.method7173(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method841(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass314_1.method7174(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	@Override
	public void method839() {
		try {
			this.aSocket1.close();
		} catch (@Pc(9) IOException local9) {
		}
		this.aClass314_1.method7170();
		this.aClass238_1.method5168();
	}

	@OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method839();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	@Override
	public void method840() {
		this.aClass314_1.method7171();
		this.aClass238_1.method5166();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([BZII)V")
	@Override
	public void method837(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass238_1.method5171(arg1, arg0);
	}
}
