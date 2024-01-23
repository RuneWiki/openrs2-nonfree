import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dm", name = "Q", descriptor = "[I")
	public static int[] anIntArray96 = new int[32];

	@OriginalMember(owner = "client!dm", name = "S", descriptor = "Z")
	private boolean aBoolean88 = true;

	@OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
	private int anInt1201 = 4096;

	static {
		@Pc(8) int local8 = 2;
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			anIntArray96[local10] = local8 - 1;
			local8 += local8;
		}
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(29) int[] local29 = this.method4946(arg0 - 1 & Static39.anInt939, 0);
			@Pc(35) int[] local35 = this.method4946(arg0, 0);
			@Pc(45) int[] local45 = this.method4946(arg0 + 1 & Static39.anInt939, 0);
			@Pc(49) int[] local49 = local15[0];
			@Pc(53) int[] local53 = local15[1];
			@Pc(57) int[] local57 = local15[2];
			for (@Pc(59) int local59 = 0; local59 < Static114.anInt1359; local59++) {
				@Pc(78) int local78 = this.anInt1201 * (local45[local59] - local29[local59]);
				@Pc(97) int local97 = (local35[local59 + 1 & Static129.anInt2676] - local35[local59 - 1 & Static129.anInt2676]) * this.anInt1201;
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local78 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(138) int local138;
				@Pc(136) int local136;
				@Pc(140) int local140;
				if (local131 == 0) {
					local136 = 0;
					local138 = 0;
					local140 = 0;
				} else {
					local140 = 16777216 / local131;
					local136 = local78 / local131;
					local138 = local97 / local131;
				}
				if (this.aBoolean88) {
					local136 = (local136 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local49[local59] = local138;
				local53[local59] = local136;
				local57[local59] = local140;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1201 = arg0.method4242();
		} else if (arg1 == 1) {
			this.aBoolean88 = arg0.method4261() == 1;
		}
	}
}
