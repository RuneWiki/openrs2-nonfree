import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class4_Sub1_Sub19 extends Class4_Sub1 {

	@OriginalMember(owner = "client!no", name = "X", descriptor = "I")
	private int anInt3634 = 4096;

	@OriginalMember(owner = "client!no", name = "T", descriptor = "Z")
	private boolean aBoolean263 = true;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3634 = arg0.method4653();
		} else if (arg1 == 1) {
			this.aBoolean263 = arg0.method4666() == 1;
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(33) int[] local33 = this.method4736(Static262.anInt5002 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method4736(arg0, 0);
			@Pc(51) int[] local51 = this.method4736(arg0 + 1 & Static262.anInt5002, 0);
			@Pc(55) int[] local55 = local16[0];
			@Pc(59) int[] local59 = local16[1];
			@Pc(63) int[] local63 = local16[2];
			for (@Pc(65) int local65 = 0; local65 < Static73.anInt1626; local65++) {
				@Pc(84) int local84 = (local51[local65] - local33[local65]) * this.anInt3634;
				@Pc(103) int local103 = this.anInt3634 * (local39[local65 + 1 & Static48.anInt901] - local39[local65 - 1 & Static48.anInt901]);
				@Pc(107) int local107 = local84 >> 12;
				@Pc(111) int local111 = local103 >> 12;
				@Pc(117) int local117 = local107 * local107 >> 12;
				@Pc(123) int local123 = local111 * local111 >> 12;
				@Pc(137) int local137 = (int) (Math.sqrt((double) ((float) (local117 + local123 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(148) int local148;
				@Pc(144) int local144;
				@Pc(146) int local146;
				if (local137 == 0) {
					local144 = 0;
					local146 = 0;
					local148 = 0;
				} else {
					local144 = local84 / local137;
					local146 = 16777216 / local137;
					local148 = local103 / local137;
				}
				if (this.aBoolean263) {
					local148 = (local148 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local146 = (local146 >> 1) + 2048;
				}
				local55[local65] = local148;
				local59[local65] = local144;
				local63[local65] = local146;
			}
		}
		return local16;
	}
}
