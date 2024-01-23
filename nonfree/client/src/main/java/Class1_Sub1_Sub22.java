import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oi", name = "ob", descriptor = "I")
	private int anInt3486 = 32768;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3486 = arg0.method2964() << 4;
		} else if (arg1 == 1) {
			super.aBoolean442 = arg0.method2945() == 1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		Static96.method1624();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(22) int[] local22 = this.method3706(arg0, 1);
			@Pc(28) int[] local28 = this.method3706(arg0, 2);
			for (@Pc(30) int local30 = 0; local30 < Static11.anInt294; local30++) {
				@Pc(41) int local41 = this.anInt3486 * local28[local30] >> 12;
				@Pc(49) int local49 = local22[local30] >> 4 & 0xFF;
				@Pc(57) int local57 = local41 * Static167.anIntArray320[local49] >> 12;
				@Pc(65) int local65 = Static10.anIntArray33[local49] * local41 >> 12;
				@Pc(73) int local73 = arg0 + (local65 >> 12) & Static30.anInt589;
				@Pc(81) int local81 = (local57 >> 12) + local30 & Static147.anInt3169;
				@Pc(87) int[] local87 = this.method3706(local73, 0);
				local12[local30] = local87[local81];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(21) int[] local21 = this.method3706(arg0, 1);
			@Pc(27) int[] local27 = this.method3706(arg0, 2);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static11.anInt294; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt3486 * local27[local41] >> 12;
				@Pc(70) int local70 = Static10.anIntArray33[local53] * local62 >> 12;
				@Pc(78) int local78 = local62 * Static167.anIntArray320[local53] >> 12;
				@Pc(87) int local87 = local41 + (local78 >> 12) & Static147.anInt3169;
				@Pc(95) int local95 = Static30.anInt589 & (local70 >> 12) + arg0;
				@Pc(101) int[][] local101 = this.method3713(local95, 0);
				local31[local41] = local101[0][local87];
				local35[local41] = local101[1][local87];
				local39[local41] = local101[2][local87];
			}
		}
		return local11;
	}
}
