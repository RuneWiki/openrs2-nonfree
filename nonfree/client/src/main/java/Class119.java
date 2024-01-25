import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class119 {

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "Lclient!gw;")
	private final Class136 aClass136_24 = new Class136(64);

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "Lclient!uu;")
	private final Class343 aClass343_83;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class119(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_83 = arg2;
		this.aClass343_83.method8157(32);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
	public void method2839() {
		@Pc(2) Class136 local2 = this.aClass136_24;
		synchronized (this.aClass136_24) {
			this.aClass136_24.method3142();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V")
	public void method2841() {
		@Pc(6) Class136 local6 = this.aClass136_24;
		synchronized (this.aClass136_24) {
			this.aClass136_24.method3138();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)V")
	public void method2843() {
		@Pc(6) Class136 local6 = this.aClass136_24;
		synchronized (this.aClass136_24) {
			this.aClass136_24.method3132(5);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IB)Lclient!jha;")
	public Class176 method2845(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_24;
		@Pc(16) Class176 local16;
		synchronized (this.aClass136_24) {
			local16 = (Class176) this.aClass136_24.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) Class343 local36 = this.aClass343_83;
		@Pc(47) byte[] local47;
		synchronized (this.aClass343_83) {
			local47 = this.aClass343_83.method8132(32, arg0);
		}
		local16 = new Class176();
		if (local47 != null) {
			local16.method4476(new Class3_Sub9(local47));
		}
		@Pc(69) Class136 local69 = this.aClass136_24;
		synchronized (this.aClass136_24) {
			this.aClass136_24.method3135(local16, (long) arg0);
			return local16;
		}
	}
}
