import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class75_Sub1_Sub1 extends Class75_Sub1 {

	@OriginalMember(owner = "client!vaa", name = "t", descriptor = "Lclient!jk;")
	private Class114_Sub3 aClass114_Sub3_1;

	@OriginalMember(owner = "client!vaa", name = "y", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_39;

	@OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
	private final int anInt9198;

	@OriginalMember(owner = "client!vaa", name = "n", descriptor = "I")
	private final int anInt9194;

	@OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
	private final int anInt9195;

	@OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
	private final int anInt9197;

	@OriginalMember(owner = "client!vaa", name = "u", descriptor = "I")
	private final int anInt9200;

	@OriginalMember(owner = "client!vaa", name = "z", descriptor = "I")
	private final int anInt9203;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!no;IIIIII)V")
	public Class75_Sub1_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass66_Sub3_39 = arg0;
		this.anInt9198 = arg3;
		this.anInt9194 = arg4;
		this.anInt9195 = arg6;
		this.anInt9197 = arg5;
		this.anInt9200 = arg2;
		this.anInt9203 = arg1;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Lclient!jk;")
	@Override
	public Class114_Sub3 method7904() {
		if (this.aClass114_Sub3_1 == null) {
			@Pc(17) Interface3 local17 = this.aClass66_Sub3_39.anInterface3_15;
			Static273.anIntArray448[2] = this.anInt9198;
			Static273.anIntArray448[4] = this.anInt9197;
			Static273.anIntArray448[0] = this.anInt9203;
			Static273.anIntArray448[5] = this.anInt9195;
			Static273.anIntArray448[1] = this.anInt9200;
			Static273.anIntArray448[3] = this.anInt9194;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method7248(Static273.anIntArray448[local53])) {
					return null;
				}
				@Pc(71) Class271 local71 = local17.method7249(Static273.anIntArray448[local53]);
				@Pc(78) int local78 = local71.aBoolean516 ? 64 : 128;
				if (local71.aByte85 > 0) {
					local49 = 1;
				}
				if (local51 < local78) {
					local51 = local78;
				}
			}
			for (@Pc(103) int local103 = 0; local103 < 6; local103++) {
				Static448.anIntArrayArray64[local103] = local17.method7250(local51, false, Static273.anIntArray448[local103], 1.0F, local51);
			}
			this.aClass114_Sub3_1 = new Class114_Sub3(this.aClass66_Sub3_39, 6407, local51, local49 != 0, Static448.anIntArrayArray64);
		}
		return this.aClass114_Sub3_1;
	}
}
