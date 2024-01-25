import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class51 {

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_12 = new Class307(64);

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "Lclient!ik;")
	private final Class182 aClass182_14;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class51(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_14 = arg2;
		this.aClass182_14.method3970(5);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)Lclient!cda;")
	public Class3_Sub7_Sub3 method1491(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_12;
		@Pc(16) Class3_Sub7_Sub3 local16;
		synchronized (this.aClass307_12) {
			local16 = (Class3_Sub7_Sub3) this.aClass307_12.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_14;
		@Pc(39) byte[] local39;
		synchronized (this.aClass182_14) {
			local39 = this.aClass182_14.method3985(arg0, 5);
		}
		local16 = new Class3_Sub7_Sub3();
		if (local39 != null) {
			local16.method1585(new Class3_Sub2(local39));
		}
		@Pc(71) Class307 local71 = this.aClass307_12;
		synchronized (this.aClass307_12) {
			this.aClass307_12.method7000(local16, (long) arg0);
			return local16;
		}
	}
}
