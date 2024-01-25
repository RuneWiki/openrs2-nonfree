import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class160 {

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "Lclient!vh;")
	private final Class330 aClass330_28 = new Class330(256);

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "Lclient!e;")
	private final Interface2 anInterface2_9;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_21;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!en;Lclient!e;)V")
	public Class160(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_9 = arg1;
		this.aClass90_Sub1_21 = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lclient!waa;")
	public Class16_Sub1 method3926(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass330_28.method7677((long) arg0);
		if (local12 != null) {
			return (Class16_Sub1) local12;
		} else if (this.anInterface2_9.method3089(arg0)) {
			@Pc(36) Class115 local36 = this.anInterface2_9.method3085(arg0);
			@Pc(45) int local45 = local36.aBoolean233 ? 64 : this.aClass90_Sub1_21.anInt2410;
			@Pc(80) Class16_Sub1 local80;
			if (local36.aBoolean229 && this.aClass90_Sub1_21.method7496()) {
				@Pc(62) float[] local62 = this.anInterface2_9.method3086(local45, arg0, 0.7F, local45);
				local80 = new Class16_Sub1(this.aClass90_Sub1_21, 3553, 34842, local45, local45, local36.aByte37 != 0, local62, 6408);
			} else {
				@Pc(95) int[] local95;
				if (local36.aBoolean228) {
					local95 = this.anInterface2_9.method3087(local45, local45, arg0, 0.7F);
				} else {
					local95 = this.anInterface2_9.method3088(arg0, local45, 0.7F, local45, true);
				}
				local80 = new Class16_Sub1(this.aClass90_Sub1_21, 3553, 6408, local45, local45, local36.aByte37 != 0, local95, false);
			}
			local80.method303(local36.aBoolean227, local36.aBoolean234);
			this.aClass330_28.method7676(local80, (long) arg0);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public void method3927() {
		this.aClass330_28.method7688();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
	public void method3930() {
		this.aClass330_28.method7680(5);
	}
}
