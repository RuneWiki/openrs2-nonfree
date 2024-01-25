import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class2_Sub4_Sub13 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fu", name = "J", descriptor = "[I")
	public static final int[] anIntArray228 = new int[120];

	@OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
	private int anInt3500 = 32768;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray228[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub13() {
		super(3, false);
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		Static154.method2691();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(27) int[] local27 = this.method8892(arg0, 1);
			@Pc(33) int[] local33 = this.method8892(arg0, 2);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			for (@Pc(47) int local47 = 0; local47 < Static395.anInt6816; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = local33[local47] * this.anInt3500 >> 12;
				@Pc(76) int local76 = local68 * Static511.anIntArray605[local59] >> 12;
				@Pc(84) int local84 = Static246.anIntArray290[local59] * local68 >> 12;
				@Pc(92) int local92 = Static104.anInt2340 & local47 + (local76 >> 12);
				@Pc(101) int local101 = arg0 + (local84 >> 12) & Static463.anInt7489;
				@Pc(107) int[][] local107 = this.method8898(0, local101);
				local37[local47] = local107[0][local92];
				local41[local47] = local107[1][local92];
				local45[local47] = local107[2][local92];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3500 = arg0.method2825() << 4;
		} else if (arg1 == 1) {
			super.aBoolean763 = arg0.method2859() == 1;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(27) int[] local27 = this.method8892(arg0, 1);
			@Pc(33) int[] local33 = this.method8892(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static395.anInt6816; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = local33[local35] * this.anInt3500 >> 12;
				@Pc(62) int local62 = local54 * Static511.anIntArray605[local45] >> 12;
				@Pc(70) int local70 = Static246.anIntArray290[local45] * local54 >> 12;
				@Pc(78) int local78 = Static104.anInt2340 & (local62 >> 12) + local35;
				@Pc(86) int local86 = Static463.anInt7489 & (local70 >> 12) + arg0;
				@Pc(92) int[] local92 = this.method8892(local86, 0);
				local17[local35] = local92[local78];
			}
		}
		return local17;
	}
}
