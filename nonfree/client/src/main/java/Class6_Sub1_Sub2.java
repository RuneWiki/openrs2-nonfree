import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!aha", name = "H", descriptor = "I")
	private int anInt580 = 32768;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub2() {
		super(3, false);
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(27) int[] local27 = this.method8731(arg0, 1);
			@Pc(33) int[] local33 = this.method8731(arg0, 2);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			for (@Pc(47) int local47 = 0; local47 < Static53.anInt1787; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = local33[local47] * this.anInt580 >> 12;
				@Pc(76) int local76 = Static420.anIntArray408[local59] * local68 >> 12;
				@Pc(84) int local84 = Static227.anIntArray214[local59] * local68 >> 12;
				@Pc(92) int local92 = Static564.anInt9697 & (local76 >> 12) + local47;
				@Pc(100) int local100 = Static117.anInt3013 & (local84 >> 12) + arg0;
				@Pc(106) int[][] local106 = this.method8725(local100, 0);
				local37[local47] = local106[0][local92];
				local41[local47] = local106[1][local92];
				local45[local47] = local106[2][local92];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		Static621.method8513();
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(21) int[] local21 = this.method8731(arg0, 1);
			@Pc(27) int[] local27 = this.method8731(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static53.anInt1787; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = this.anInt580 * local27[local29] >> 12;
				@Pc(56) int local56 = local48 * Static420.anIntArray408[local39] >> 12;
				@Pc(64) int local64 = Static227.anIntArray214[local39] * local48 >> 12;
				@Pc(72) int local72 = Static564.anInt9697 & (local56 >> 12) + local29;
				@Pc(80) int local80 = Static117.anInt3013 & (local64 >> 12) + arg0;
				@Pc(86) int[] local86 = this.method8731(local80, 0);
				local11[local29] = local86[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt580 = arg1.method8220() << 4;
		} else if (arg0 == 1) {
			super.aBoolean842 = arg1.method8246() == 1;
		}
	}
}
