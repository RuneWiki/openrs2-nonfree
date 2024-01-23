import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dk", name = "L", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
	private int anInt1078 = 4096;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt1078 = arg1.method3948();
		} else if (arg0 == 1) {
			this.aBoolean81 = arg1.method3915() == 1;
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(27) int[] local27 = this.method4954(arg0 - 1 & Static148.anInt2810, 0);
			@Pc(33) int[] local33 = this.method4954(arg0, 0);
			@Pc(43) int[] local43 = this.method4954(Static148.anInt2810 & arg0 + 1, 0);
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			for (@Pc(57) int local57 = 0; local57 < Static22.anInt421; local57++) {
				@Pc(80) int local80 = this.anInt1078 * (local33[local57 + 1 & Static84.anInt1566] - local33[Static84.anInt1566 & local57 - 1]);
				@Pc(84) int local84 = local80 >> 12;
				@Pc(96) int local96 = (local43[local57] - local27[local57]) * this.anInt1078;
				@Pc(100) int local100 = local96 >> 12;
				@Pc(106) int local106 = local84 * local84 >> 12;
				@Pc(112) int local112 = local100 * local100 >> 12;
				@Pc(126) int local126 = (int) (Math.sqrt((double) ((float) (local106 + local112 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(143) int local143;
				@Pc(139) int local139;
				if (local126 == 0) {
					local143 = 0;
					local139 = 0;
					local135 = 0;
				} else {
					local135 = local80 / local126;
					local139 = 16777216 / local126;
					local143 = local96 / local126;
				}
				if (this.aBoolean81) {
					local143 = (local143 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
				}
				local47[local57] = local135;
				local51[local57] = local143;
				local55[local57] = local139;
			}
		}
		return local13;
	}
}
