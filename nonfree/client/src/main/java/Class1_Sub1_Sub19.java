import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ke", name = "pb", descriptor = "Z")
	private boolean aBoolean100 = true;

	@OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
	private int anInt2438 = 4096;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(32) int[] local32 = this.method3303(Static134.anInt3338 & arg0 - 1, 0);
			@Pc(38) int[] local38 = this.method3303(arg0, 0);
			@Pc(48) int[] local48 = this.method3303(Static134.anInt3338 & arg0 + 1, 0);
			@Pc(52) int[] local52 = local12[1];
			@Pc(56) int[] local56 = local12[0];
			@Pc(60) int[] local60 = local12[2];
			for (@Pc(62) int local62 = 0; local62 < Static176.anInt3921; local62++) {
				@Pc(76) int local76 = (local48[local62] - local32[local62]) * this.anInt2438;
				@Pc(96) int local96 = (local38[Static70.anInt1730 & local62 + 1] - local38[local62 - 1 & Static70.anInt1730]) * this.anInt2438;
				@Pc(100) int local100 = local76 >> 12;
				@Pc(104) int local104 = local96 >> 12;
				@Pc(110) int local110 = local104 * local104 >> 12;
				@Pc(116) int local116 = local100 * local100 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((float) (local116 + local110 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(139) int local139;
				@Pc(141) int local141;
				@Pc(137) int local137;
				if (local130 == 0) {
					local137 = 0;
					local139 = 0;
					local141 = 0;
				} else {
					local139 = local96 / local130;
					local141 = local76 / local130;
					local137 = 16777216 / local130;
				}
				if (this.aBoolean100) {
					local137 = (local137 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
				}
				local56[local62] = local139;
				local52[local62] = local141;
				local60[local62] = local137;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2438 = arg1.method1753();
		} else if (arg0 == 1) {
			this.aBoolean100 = arg1.method1738() == 1;
		}
	}
}
