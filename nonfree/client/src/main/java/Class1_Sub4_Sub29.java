import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class1_Sub4_Sub29 extends Class1_Sub4 {

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
	private int anInt5245 = 4096;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5245 = arg0.method5335();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(22) int[] local22 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(36) int[] local36 = this.method5695(arg0 - 1 & Static452.anInt7487, 0);
			@Pc(42) int[] local42 = this.method5695(arg0, 0);
			@Pc(54) int[] local54 = this.method5695(arg0 + 1 & Static452.anInt7487, 0);
			for (@Pc(56) int local56 = 0; local56 < Static395.anInt6592; local56++) {
				@Pc(70) int local70 = this.anInt5245 * (local54[local56] - local36[local56]);
				@Pc(89) int local89 = (local42[Static247.anInt4469 & local56 + 1] - local42[local56 - 1 & Static247.anInt4469]) * this.anInt5245;
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local70 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local109 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(134) int local134 = local123 == 0 ? 0 : 16777216 / local123;
				local22[local56] = 4096 - local134;
			}
		}
		return local22;
	}
}
