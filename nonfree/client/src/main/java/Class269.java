import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class269 {

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "Lclient!jo;")
	private final Class126 aClass126_62 = new Class126(256);

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Lclient!ga;")
	private final Interface4 anInterface4_9;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_42;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!vd;Lclient!ga;)V")
	public Class269(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_9 = arg1;
		this.aClass51_Sub2_42 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)Lclient!ud;")
	public Class59_Sub3 method5750(@OriginalArg(1) int arg0) {
		@Pc(17) Object local17 = this.aClass126_62.method2822((long) arg0);
		if (local17 != null) {
			return (Class59_Sub3) local17;
		} else if (this.anInterface4_9.method3140(arg0)) {
			@Pc(36) Class203 local36 = this.anInterface4_9.method3138(arg0);
			@Pc(45) int local45 = local36.aBoolean365 ? 64 : this.aClass51_Sub2_42.anInt6907;
			@Pc(83) Class59_Sub3 local83;
			if (local36.aBoolean363 && this.aClass51_Sub2_42.method5326()) {
				@Pc(62) float[] local62 = this.anInterface4_9.method3141(arg0, local45, 0.7F, local45);
				local83 = new Class59_Sub3(this.aClass51_Sub2_42, 3553, 34842, local45, local45, local36.aByte61 != 0, local62, 6408);
			} else {
				@Pc(95) short local95;
				@Pc(105) int[] local105;
				if (local36.aBoolean361 && Static270.method3631(local36.aByte59)) {
					local95 = 6407;
					local105 = this.anInterface4_9.method3142(false, local45, 0.7F, arg0, local45);
				} else {
					local95 = 6408;
					local105 = this.anInterface4_9.method3139(0.7F, arg0, local45, local45);
				}
				local83 = new Class59_Sub3(this.aClass51_Sub2_42, 3553, local95, local45, local45, local36.aByte61 != 0, local105, false);
			}
			local83.method5770(local36.aBoolean359, local36.aBoolean362);
			this.aClass126_62.method2824((long) arg0, local83);
			return local83;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
	public void method5751() {
		this.aClass126_62.method2827();
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)V")
	public void method5753() {
		this.aClass126_62.method2828(5);
	}
}
