import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class237 {

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!sw;")
	private final Class277 aClass277_53 = new Class277(256);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!n;")
	private final Interface13 anInterface13_12;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_35;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!mh;Lclient!n;)V")
	public Class237(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Interface13 arg1) {
		this.anInterface13_12 = arg1;
		this.aClass4_Sub3_35 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public void method6235() {
		this.aClass277_53.method7018(5);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lclient!rr;")
	public Class164_Sub3 method6236(@OriginalArg(0) int arg0) {
		@Pc(17) Object local17 = this.aClass277_53.method7014((long) arg0);
		if (local17 != null) {
			return (Class164_Sub3) local17;
		} else if (this.anInterface13_12.method5788(arg0)) {
			@Pc(36) Class296 local36 = this.anInterface13_12.method5789(arg0);
			@Pc(45) int local45 = local36.aBoolean638 ? 64 : this.aClass4_Sub3_35.anInt5790;
			@Pc(83) Class164_Sub3 local83;
			if (local36.aBoolean644 && this.aClass4_Sub3_35.method7182()) {
				@Pc(62) float[] local62 = this.anInterface13_12.method5787(local45, local45, 0.7F, arg0);
				local83 = new Class164_Sub3(this.aClass4_Sub3_35, 3553, 34842, local45, local45, local36.aByte102 != 0, local62, 6408);
			} else {
				@Pc(98) int[] local98;
				if (local36.aBoolean637) {
					local98 = this.anInterface13_12.method5786(0.7F, local45, local45, arg0);
				} else {
					local98 = this.anInterface13_12.method5790(local45, true, 0.7F, arg0, local45);
				}
				local83 = new Class164_Sub3(this.aClass4_Sub3_35, 3553, 6408, local45, local45, local36.aByte102 != 0, local98, false);
			}
			local83.method8159(local36.aBoolean643, local36.aBoolean645);
			this.aClass277_53.method7016(local83, (long) arg0);
			return local83;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	public void method6239() {
		this.aClass277_53.method7019();
	}
}
