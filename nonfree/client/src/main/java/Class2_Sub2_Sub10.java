import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
	private int anInt2527 = 32768;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub10() {
		super(3, false);
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(26) int[] local26 = this.method5839(arg0, 1);
			@Pc(32) int[] local32 = this.method5839(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static429.anInt6518; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt2527 >> 12;
				@Pc(61) int local61 = local53 * Static90.anIntArray171[local44] >> 12;
				@Pc(69) int local69 = Static381.anIntArray532[local44] * local53 >> 12;
				@Pc(77) int local77 = (local61 >> 12) + local34 & Static303.anInt5406;
				@Pc(86) int local86 = arg0 + (local69 >> 12) & Static246.anInt4669;
				@Pc(92) int[] local92 = this.method5839(local86, 0);
				local11[local34] = local92[local77];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(21) int[] local21 = this.method5839(arg0, 1);
			@Pc(27) int[] local27 = this.method5839(arg0, 2);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static429.anInt6518; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt2527 * local27[local41] >> 12;
				@Pc(70) int local70 = local62 * Static90.anIntArray171[local53] >> 12;
				@Pc(78) int local78 = local62 * Static381.anIntArray532[local53] >> 12;
				@Pc(87) int local87 = Static303.anInt5406 & local41 + (local70 >> 12);
				@Pc(95) int local95 = Static246.anInt4669 & (local78 >> 12) + arg0;
				@Pc(101) int[][] local101 = this.method5840(local95, 0);
				local31[local41] = local101[0][local87];
				local35[local41] = local101[1][local87];
				local39[local41] = local101[2][local87];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2527 = arg0.method5500() << 4;
		} else if (arg1 == 1) {
			super.aBoolean488 = arg0.method5495() == 1;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		Static180.method2885();
	}
}
