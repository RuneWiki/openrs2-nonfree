import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	private int anInt2382 = 4096;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2382 = arg1.method3115();
		} else if (arg0 == 1) {
			this.aBoolean198 = arg1.method3141() == 1;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(27) int[] local27 = this.method5654(0, Static206.anInt4136 & arg0 - 1);
			@Pc(33) int[] local33 = this.method5654(0, arg0);
			@Pc(45) int[] local45 = this.method5654(0, Static206.anInt4136 & arg0 + 1);
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[2];
			for (@Pc(59) int local59 = 0; local59 < Static251.anInt6509; local59++) {
				@Pc(73) int local73 = this.anInt2382 * (local45[local59] - local27[local59]);
				@Pc(93) int local93 = (local33[local59 + 1 & Static260.anInt5056] - local33[local59 - 1 & Static260.anInt5056]) * this.anInt2382;
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local113 + local107 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(138) int local138;
				@Pc(134) int local134;
				@Pc(136) int local136;
				if (local127 == 0) {
					local134 = 0;
					local136 = 0;
					local138 = 0;
				} else {
					local134 = local73 / local127;
					local138 = local93 / local127;
					local136 = 16777216 / local127;
				}
				if (this.aBoolean198) {
					local138 = (local138 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
				}
				local49[local59] = local138;
				local53[local59] = local134;
				local57[local59] = local136;
			}
		}
		return local11;
	}
}
