import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class2_Sub1_Sub33 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tg", name = "jb", descriptor = "Z")
	private boolean aBoolean159;

	@OriginalMember(owner = "client!tg", name = "gb", descriptor = "I")
	private int anInt3880;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(35) int[] local35 = this.method2980(0, Static78.anInt2044 & arg0 - 1);
			@Pc(43) int[] local43 = this.method2980(0, arg0);
			@Pc(53) int[] local53 = this.method2980(0, Static78.anInt2044 & arg0 + 1);
			@Pc(57) int[] local57 = local21[1];
			@Pc(61) int[] local61 = local21[0];
			@Pc(65) int[] local65 = local21[2];
			for (@Pc(67) int local67 = 0; local67 < Static129.anInt3118; local67++) {
				@Pc(81) int local81 = this.anInt3880 * (local53[local67] - local35[local67]);
				@Pc(101) int local101 = (local43[local67 + 1 & Static8.anInt230] - local43[Static8.anInt230 & local67 - 1]) * this.anInt3880;
				@Pc(105) int local105 = local81 >> 12;
				@Pc(109) int local109 = local101 >> 12;
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(121) int local121 = local105 * local105 >> 12;
				@Pc(134) int local134 = (int) (Math.sqrt((double) ((local121 + local115 + 4096) / 4096)) * 4096.0D);
				@Pc(140) int local140;
				@Pc(148) int local148;
				@Pc(144) int local144;
				if (local134 == 0) {
					local144 = 0;
					local140 = 0;
					local148 = 0;
				} else {
					local140 = local101 / local134;
					local144 = 16777216 / local134;
					local148 = local81 / local134;
				}
				if (this.aBoolean159) {
					local140 = (local140 >> 1) + 2048;
					local148 = (local148 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
				}
				local61[local67] = local140;
				local57[local67] = local148;
				local65[local67] = local144;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3880 = arg0.method2353();
		} else if (arg1 == 1) {
			this.aBoolean159 = arg0.method2387() == 1;
		}
	}
}
