import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class1_Sub4_Sub9 extends Class1_Sub4 {

	@OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
	private int anInt1518 = 4096;

	@OriginalMember(owner = "client!eo", name = "K", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1518 = arg0.method1386();
		} else if (arg1 == 1) {
			this.aBoolean85 = arg0.method1378() == 1;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(24) int[][] local24 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(38) int[] local38 = this.method4750(Static171.anInt3359 & arg0 - 1, 0);
			@Pc(44) int[] local44 = this.method4750(arg0, 0);
			@Pc(54) int[] local54 = this.method4750(arg0 + 1 & Static171.anInt3359, 0);
			@Pc(58) int[] local58 = local24[0];
			@Pc(62) int[] local62 = local24[2];
			@Pc(66) int[] local66 = local24[1];
			for (@Pc(68) int local68 = 0; local68 < Static182.anInt3492; local68++) {
				@Pc(91) int local91 = (local44[Static61.anInt1166 & local68 + 1] - local44[local68 - 1 & Static61.anInt1166]) * this.anInt1518;
				@Pc(95) int local95 = local91 >> 12;
				@Pc(107) int local107 = this.anInt1518 * (local54[local68] - local38[local68]);
				@Pc(113) int local113 = local95 * local95 >> 12;
				@Pc(117) int local117 = local107 >> 12;
				@Pc(123) int local123 = local117 * local117 >> 12;
				@Pc(137) int local137 = (int) (Math.sqrt((double) ((float) (local113 + local123 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(148) int local148;
				@Pc(152) int local152;
				@Pc(144) int local144;
				if (local137 == 0) {
					local148 = 0;
					local144 = 0;
					local152 = 0;
				} else {
					local144 = 16777216 / local137;
					local148 = local91 / local137;
					local152 = local107 / local137;
				}
				if (this.aBoolean85) {
					local152 = (local152 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local148 = (local148 >> 1) + 2048;
				}
				local58[local68] = local148;
				local66[local68] = local152;
				local62[local68] = local144;
			}
		}
		return local24;
	}
}
