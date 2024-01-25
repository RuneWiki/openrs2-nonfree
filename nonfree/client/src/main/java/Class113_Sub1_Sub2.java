import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class113_Sub1_Sub2 extends Class113_Sub1 {

	@OriginalMember(owner = "client!up", name = "B", descriptor = "Lclient!pi;")
	private Class66_Sub4 aClass66_Sub4_2;

	@OriginalMember(owner = "client!up", name = "u", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_43;

	@OriginalMember(owner = "client!up", name = "A", descriptor = "I")
	private final int anInt6267;

	@OriginalMember(owner = "client!up", name = "v", descriptor = "I")
	private final int anInt6262;

	@OriginalMember(owner = "client!up", name = "z", descriptor = "I")
	private final int anInt6266;

	@OriginalMember(owner = "client!up", name = "x", descriptor = "I")
	private final int anInt6264;

	@OriginalMember(owner = "client!up", name = "w", descriptor = "I")
	private final int anInt6263;

	@OriginalMember(owner = "client!up", name = "y", descriptor = "I")
	private final int anInt6265;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!se;IIIIII)V")
	public Class113_Sub1_Sub2(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass122_Sub2_43 = arg0;
		this.anInt6267 = arg2;
		this.anInt6262 = arg3;
		this.anInt6266 = arg6;
		this.anInt6264 = arg4;
		this.anInt6263 = arg5;
		this.anInt6265 = arg1;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(B)Lclient!pi;")
	@Override
	public Class66_Sub4 method5316() {
		if (this.aClass66_Sub4_2 == null) {
			Static325.anIntArray525[4] = this.anInt6263;
			Static325.anIntArray525[2] = this.anInt6262;
			Static325.anIntArray525[1] = this.anInt6267;
			@Pc(28) Interface9 local28 = this.aClass122_Sub2_43.anInterface9_5;
			Static325.anIntArray525[5] = this.anInt6266;
			Static325.anIntArray525[0] = this.anInt6265;
			Static325.anIntArray525[3] = this.anInt6264;
			@Pc(45) byte local45 = 0;
			@Pc(47) int local47 = 0;
			@Pc(49) int local49;
			for (local49 = 0; local49 < 6; local49++) {
				if (!local28.method2394(Static325.anIntArray525[local49])) {
					return null;
				}
				@Pc(68) Class171 local68 = local28.method2396(Static325.anIntArray525[local49]);
				@Pc(75) int local75 = local68.aBoolean321 ? 64 : 128;
				if (local68.aByte56 > 0) {
					local45 = 1;
				}
				if (local75 > local47) {
					local47 = local75;
				}
			}
			for (local49 = 0; local49 < 6; local49++) {
				Static325.anIntArrayArray59[local49] = local28.method2395(local47, false, Static325.anIntArray525[local49], 1.0F, local47);
			}
			this.aClass66_Sub4_2 = new Class66_Sub4(this.aClass122_Sub2_43, 6407, local47, local45 != 0, Static325.anIntArrayArray59);
		}
		return this.aClass66_Sub4_2;
	}
}
