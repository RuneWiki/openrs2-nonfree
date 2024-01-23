import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
	private int anInt4985 = 4096;

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "Z")
	private boolean aBoolean474 = true;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(33) int[] local33 = this.method4464(arg0 - 1 & Static202.anInt3956, 0);
			@Pc(39) int[] local39 = this.method4464(arg0, 0);
			@Pc(51) int[] local51 = this.method4464(Static202.anInt3956 & arg0 + 1, 0);
			@Pc(55) int[] local55 = local17[0];
			@Pc(59) int[] local59 = local17[2];
			@Pc(63) int[] local63 = local17[1];
			for (@Pc(65) int local65 = 0; local65 < Static6.anInt4960; local65++) {
				@Pc(83) int local83 = this.anInt4985 * (local51[local65] - local33[local65]);
				@Pc(103) int local103 = this.anInt4985 * (local39[local65 + 1 & Static274.anInt5042] - local39[local65 - 1 & Static274.anInt5042]);
				@Pc(107) int local107 = local103 >> 12;
				@Pc(113) int local113 = local107 * local107 >> 12;
				@Pc(117) int local117 = local83 >> 12;
				@Pc(123) int local123 = local117 * local117 >> 12;
				@Pc(137) int local137 = (int) (Math.sqrt((double) ((float) (local123 + local113 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(150) int local150;
				@Pc(154) int local154;
				@Pc(146) int local146;
				if (local137 == 0) {
					local146 = 0;
					local154 = 0;
					local150 = 0;
				} else {
					local146 = 16777216 / local137;
					local150 = local103 / local137;
					local154 = local83 / local137;
				}
				if (this.aBoolean474) {
					local146 = (local146 >> 1) + 2048;
					local150 = (local150 >> 1) + 2048;
					local154 = (local154 >> 1) + 2048;
				}
				local55[local65] = local150;
				local63[local65] = local154;
				local59[local65] = local146;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4985 = arg0.method1879();
		} else if (arg1 == 1) {
			this.aBoolean474 = arg0.method1853() == 1;
		}
	}
}
