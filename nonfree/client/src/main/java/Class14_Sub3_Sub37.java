import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class14_Sub3_Sub37 extends Class14_Sub3 {

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
	private int anInt6572 = 32768;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub37() {
		super(3, false);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(21) int[] local21 = this.method6004(1, arg0);
			@Pc(27) int[] local27 = this.method6004(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static294.anInt5657; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = local27[local41] * this.anInt6572 >> 12;
				@Pc(70) int local70 = local62 * Static153.anIntArray287[local53] >> 12;
				@Pc(78) int local78 = Static345.anIntArray635[local53] * local62 >> 12;
				@Pc(86) int local86 = (local70 >> 12) + local41 & Static329.anInt6352;
				@Pc(95) int local95 = arg0 + (local78 >> 12) & Static179.anInt3689;
				@Pc(101) int[][] local101 = this.method5997(local95, 0);
				local31[local41] = local101[0][local86];
				local35[local41] = local101[1][local86];
				local39[local41] = local101[2][local86];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		Static74.method4762();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6572 = arg0.method2498() << 4;
		} else if (arg1 == 1) {
			super.aBoolean446 = arg0.method2548() == 1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(26) int[] local26 = this.method6004(1, arg0);
			@Pc(32) int[] local32 = this.method6004(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static294.anInt5657; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt6572 >> 12;
				@Pc(61) int local61 = Static153.anIntArray287[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static345.anIntArray635[local44] >> 12;
				@Pc(78) int local78 = local34 + (local61 >> 12) & Static329.anInt6352;
				@Pc(87) int local87 = Static179.anInt3689 & arg0 + (local69 >> 12);
				@Pc(93) int[] local93 = this.method6004(0, local87);
				local16[local34] = local93[local78];
			}
		}
		return local16;
	}
}
