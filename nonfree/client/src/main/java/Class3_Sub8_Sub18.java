import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class3_Sub8_Sub18 extends Class3_Sub8 {

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
	private int anInt6100 = 32768;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub18() {
		super(3, false);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(29) int[] local29 = this.method8776(arg0, 1);
			@Pc(35) int[] local35 = this.method8776(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static91.anInt1849; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt6100 * local35[local37] >> 12;
				@Pc(64) int local64 = local56 * Static217.anIntArray548[local47] >> 12;
				@Pc(72) int local72 = local56 * Static235.anIntArray250[local47] >> 12;
				@Pc(80) int local80 = (local64 >> 12) + local37 & Static348.anInt5973;
				@Pc(88) int local88 = (local72 >> 12) + arg0 & Static635.anInt10496;
				@Pc(94) int[] local94 = this.method8776(local88, 0);
				local11[local37] = local94[local80];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(27) int[] local27 = this.method8776(arg0, 1);
			@Pc(33) int[] local33 = this.method8776(arg0, 2);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			for (@Pc(47) int local47 = 0; local47 < Static91.anInt1849; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = this.anInt6100 * local33[local47] >> 12;
				@Pc(76) int local76 = Static217.anIntArray548[local59] * local68 >> 12;
				@Pc(84) int local84 = local68 * Static235.anIntArray250[local59] >> 12;
				@Pc(93) int local93 = local47 + (local76 >> 12) & Static348.anInt5973;
				@Pc(101) int local101 = Static635.anInt10496 & arg0 + (local84 >> 12);
				@Pc(107) int[][] local107 = this.method8779(0, local101);
				local37[local47] = local107[0][local93];
				local41[local47] = local107[1][local93];
				local45[local47] = local107[2][local93];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		Static427.method5897();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt6100 = arg1.method7951() << 4;
		} else if (arg0 == 1) {
			super.aBoolean737 = arg1.method7954() == 1;
		}
	}
}
