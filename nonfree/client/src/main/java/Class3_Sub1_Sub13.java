import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gq", name = "O", descriptor = "I")
	private int anInt2311 = 4096;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2311 = arg0.method2767();
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(32) int[] local32 = this.method5547(arg0 - 1 & Static300.anInt5187, 0);
			@Pc(38) int[] local38 = this.method5547(arg0, 0);
			@Pc(48) int[] local48 = this.method5547(arg0 + 1 & Static300.anInt5187, 0);
			for (@Pc(50) int local50 = 0; local50 < Static238.anInt4221; local50++) {
				@Pc(64) int local64 = (local48[local50] - local32[local50]) * this.anInt2311;
				@Pc(83) int local83 = this.anInt2311 * (local38[local50 + 1 & Static171.anInt3000] - local38[local50 - 1 & Static171.anInt3000]);
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local64 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local118 == 0 ? 0 : 16777216 / local118;
				local18[local50] = 4096 - local126;
			}
		}
		return local18;
	}
}
