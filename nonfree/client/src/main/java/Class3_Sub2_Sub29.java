import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class3_Sub2_Sub29 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
	private int anInt5970 = 4096;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5970 = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(32) int[] local32 = this.method5894(0, arg0 - 1 & Static350.anInt3654);
			@Pc(38) int[] local38 = this.method5894(0, arg0);
			@Pc(48) int[] local48 = this.method5894(0, Static350.anInt3654 & arg0 + 1);
			for (@Pc(50) int local50 = 0; local50 < Static406.anInt6694; local50++) {
				@Pc(64) int local64 = (local48[local50] - local32[local50]) * this.anInt5970;
				@Pc(83) int local83 = this.anInt5970 * (local38[local50 + 1 & Static5.anInt72] - local38[Static5.anInt72 & local50 - 1]);
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
