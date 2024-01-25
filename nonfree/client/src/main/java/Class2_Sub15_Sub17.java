import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jka")
public final class Class2_Sub15_Sub17 extends Class2_Sub15 {

	@OriginalMember(owner = "client!jka", name = "J", descriptor = "I")
	private int anInt5317 = 32768;

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub17() {
		super(3, false);
	}

	@OriginalMember(owner = "client!jka", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		Static410.method6766();
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(27) int[] local27 = this.method9725(1, arg0);
			@Pc(33) int[] local33 = this.method9725(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static329.anInt6017; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = local33[local35] * this.anInt5317 >> 12;
				@Pc(62) int local62 = local54 * Static464.anIntArray420[local45] >> 12;
				@Pc(70) int local70 = Static148.anIntArray154[local45] * local54 >> 12;
				@Pc(78) int local78 = local35 + (local62 >> 12) & Static386.anInt7302;
				@Pc(86) int local86 = (local70 >> 12) + arg0 & Static426.anInt11132;
				@Pc(94) int[] local94 = this.method9725(0, local86);
				local17[local35] = local94[local78];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5317 = arg1.method5211() << 4;
		} else if (arg0 == 1) {
			super.aBoolean803 = arg1.method5203() == 1;
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(27) int[] local27 = this.method9725(1, arg0);
			@Pc(33) int[] local33 = this.method9725(2, arg0);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static329.anInt6017; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = local33[local47] * this.anInt5317 >> 12;
				@Pc(76) int local76 = local68 * Static464.anIntArray420[local59] >> 12;
				@Pc(84) int local84 = Static148.anIntArray154[local59] * local68 >> 12;
				@Pc(92) int local92 = Static386.anInt7302 & (local76 >> 12) + local47;
				@Pc(101) int local101 = arg0 + (local84 >> 12) & Static426.anInt11132;
				@Pc(107) int[][] local107 = this.method9727(0, local101);
				local37[local47] = local107[0][local92];
				local41[local47] = local107[1][local92];
				local45[local47] = local107[2][local92];
			}
		}
		return local11;
	}
}
