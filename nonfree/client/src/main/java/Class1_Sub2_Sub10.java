import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
	private int anInt2567 = 32768;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub10() {
		super(3, false);
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		Static1.method20();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2567 = arg0.method2896() << 4;
		} else if (arg1 == 1) {
			super.aBoolean650 = arg0.method2915() == 1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(21) int[] local21 = this.method5964(arg0, 1);
			@Pc(27) int[] local27 = this.method5964(arg0, 2);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static218.anInt3990; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt2567 * local27[local41] >> 12;
				@Pc(70) int local70 = local62 * Static117.anIntArray157[local53] >> 12;
				@Pc(78) int local78 = local62 * Static157.anIntArray201[local53] >> 12;
				@Pc(86) int local86 = Static147.anInt2302 & (local70 >> 12) + local41;
				@Pc(95) int local95 = Static464.anInt6761 & arg0 + (local78 >> 12);
				@Pc(101) int[][] local101 = this.method5968(0, local95);
				local31[local41] = local101[0][local86];
				local35[local41] = local101[1][local86];
				local39[local41] = local101[2][local86];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(29) int[] local29 = this.method5964(arg0, 1);
			@Pc(35) int[] local35 = this.method5964(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static218.anInt3990; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt2567 >> 12;
				@Pc(64) int local64 = local56 * Static117.anIntArray157[local47] >> 12;
				@Pc(72) int local72 = local56 * Static157.anIntArray201[local47] >> 12;
				@Pc(81) int local81 = local37 + (local64 >> 12) & Static147.anInt2302;
				@Pc(89) int local89 = (local72 >> 12) + arg0 & Static464.anInt6761;
				@Pc(95) int[] local95 = this.method5964(local89, 0);
				local19[local37] = local95[local81];
			}
		}
		return local19;
	}
}
