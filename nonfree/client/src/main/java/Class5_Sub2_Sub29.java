import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class5_Sub2_Sub29 extends Class5_Sub2 {

	@OriginalMember(owner = "client!sca", name = "J", descriptor = "I")
	private int anInt8823 = 32768;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		Static47.method612();
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(21) int[] local21 = this.method8945(arg0, 1);
			@Pc(27) int[] local27 = this.method8945(arg0, 2);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static195.anInt3759; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt8823 * local27[local41] >> 12;
				@Pc(70) int local70 = local62 * Static378.anIntArray381[local53] >> 12;
				@Pc(78) int local78 = local62 * Static122.anIntArray545[local53] >> 12;
				@Pc(86) int local86 = Static388.anInt6925 & local41 + (local70 >> 12);
				@Pc(94) int local94 = arg0 + (local78 >> 12) & Static115.anInt2379;
				@Pc(100) int[][] local100 = this.method8952(0, local94);
				local31[local41] = local100[0][local86];
				local35[local41] = local100[1][local86];
				local39[local41] = local100[2][local86];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8823 = arg0.method7860() << 4;
		} else if (arg1 == 1) {
			super.aBoolean910 = arg0.method7816() == 1;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(26) int[] local26 = this.method8945(arg0, 1);
			@Pc(32) int[] local32 = this.method8945(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static195.anInt3759; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt8823 * local32[local34] >> 12;
				@Pc(61) int local61 = local53 * Static378.anIntArray381[local44] >> 12;
				@Pc(69) int local69 = Static122.anIntArray545[local44] * local53 >> 12;
				@Pc(77) int local77 = Static388.anInt6925 & (local61 >> 12) + local34;
				@Pc(85) int local85 = (local69 >> 12) + arg0 & Static115.anInt2379;
				@Pc(91) int[] local91 = this.method8945(local85, 0);
				local16[local34] = local91[local77];
			}
		}
		return local16;
	}
}
