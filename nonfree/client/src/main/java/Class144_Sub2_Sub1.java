import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class144_Sub2_Sub1 extends Class144_Sub2 {

	@OriginalMember(owner = "client!iia", name = "i", descriptor = "Lclient!qba;")
	private Class66_Sub4 aClass66_Sub4_1;

	@OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
	private final int anInt4423;

	@OriginalMember(owner = "client!iia", name = "l", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_16;

	@OriginalMember(owner = "client!iia", name = "k", descriptor = "I")
	private final int anInt4421;

	@OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
	private final int anInt4420;

	@OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
	private final int anInt4419;

	@OriginalMember(owner = "client!iia", name = "g", descriptor = "I")
	private final int anInt4418;

	@OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
	private final int anInt4422;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!qfa;IIIIII)V")
	public Class144_Sub2_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4423 = arg1;
		this.aClass137_Sub3_16 = arg0;
		this.anInt4421 = arg3;
		this.anInt4420 = arg6;
		this.anInt4419 = arg5;
		this.anInt4418 = arg4;
		this.anInt4422 = arg2;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)Lclient!qba;")
	@Override
	public Class66_Sub4 method8465() {
		if (this.aClass66_Sub4_1 == null) {
			@Pc(17) Interface3 local17 = this.aClass137_Sub3_16.anInterface3_11;
			Static262.anIntArray352[0] = this.anInt4423;
			Static262.anIntArray352[1] = this.anInt4422;
			Static262.anIntArray352[2] = this.anInt4421;
			Static262.anIntArray352[5] = this.anInt4420;
			Static262.anIntArray352[3] = this.anInt4418;
			Static262.anIntArray352[4] = this.anInt4419;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method6181(Static262.anIntArray352[local53])) {
					return null;
				}
				@Pc(71) Class224 local71 = local17.method6177(Static262.anIntArray352[local53]);
				@Pc(78) int local78 = local71.aBoolean455 ? 64 : 128;
				if (local51 < local78) {
					local51 = local78;
				}
				if (local71.aByte95 > 0) {
					local49 = 1;
				}
			}
			for (@Pc(103) int local103 = 0; local103 < 6; local103++) {
				Static198.anIntArrayArray23[local103] = local17.method6180(local51, local51, false, Static262.anIntArray352[local103], 1.0F);
			}
			this.aClass66_Sub4_1 = new Class66_Sub4(this.aClass137_Sub3_16, 6407, local51, local49 != 0, Static198.anIntArrayArray23);
		}
		return this.aClass66_Sub4_1;
	}
}
