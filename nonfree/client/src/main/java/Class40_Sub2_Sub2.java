import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class40_Sub2_Sub2 extends Class40_Sub2 {

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "Lclient!tc;")
	private Class20_Sub3 aClass20_Sub3_2;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
	private final int anInt4217;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_20;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	private final int anInt4218;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	private final int anInt4214;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	private final int anInt4215;

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
	private final int anInt4216;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	private final int anInt4221;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!nv;IIIIII)V")
	public Class40_Sub2_Sub2(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4217 = arg4;
		this.aClass16_Sub3_20 = arg0;
		this.anInt4218 = arg5;
		this.anInt4214 = arg6;
		this.anInt4215 = arg1;
		this.anInt4216 = arg3;
		this.anInt4221 = arg2;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Lclient!tc;")
	@Override
	public Class20_Sub3 method3440() {
		if (this.aClass20_Sub3_2 == null) {
			Static332.anIntArray370[3] = this.anInt4217;
			@Pc(17) Interface2 local17 = this.aClass16_Sub3_20.anInterface2_12;
			Static332.anIntArray370[0] = this.anInt4215;
			Static332.anIntArray370[2] = this.anInt4216;
			Static332.anIntArray370[5] = this.anInt4214;
			Static332.anIntArray370[1] = this.anInt4221;
			Static332.anIntArray370[4] = this.anInt4218;
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local17.method4025(Static332.anIntArray370[local48])) {
					return null;
				}
				@Pc(66) Class218 local66 = local17.method4027(Static332.anIntArray370[local48]);
				@Pc(73) int local73 = local66.aBoolean476 ? 64 : 128;
				if (local66.aByte65 > 0) {
					local44 = 1;
				}
				if (local46 < local73) {
					local46 = local73;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
				Static15.anIntArrayArray1[local91] = local17.method4026(false, local46, Static332.anIntArray370[local91], 1.0F, local46);
			}
			this.aClass20_Sub3_2 = new Class20_Sub3(this.aClass16_Sub3_20, 6407, local46, local44 != 0, Static15.anIntArrayArray1);
		}
		return this.aClass20_Sub3_2;
	}
}
