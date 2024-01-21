import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!md", name = "bb", descriptor = "[I")
	public static int[] anIntArray395 = new int[99];

	@OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
	private int anInt2478;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 99; local8++) {
			@Pc(13) int local13 = local8 + 1;
			@Pc(26) int local26 = (int) ((double) local13 + Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D);
			local6 += local26;
			anIntArray395[local8] = local6 / 4;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(34) int[] local34 = this.method2980(0, Static78.anInt2044 & arg0 - 1);
			@Pc(42) int[] local42 = this.method2980(0, arg0);
			@Pc(52) int[] local52 = this.method2980(0, arg0 + 1 & Static78.anInt2044);
			for (@Pc(54) int local54 = 0; local54 < Static129.anInt3118; local54++) {
				@Pc(76) int local76 = this.anInt2478 * (local42[local54 + 1 & Static8.anInt230] - local42[local54 - 1 & Static8.anInt230]);
				@Pc(88) int local88 = this.anInt2478 * (local52[local54] - local34[local54]);
				@Pc(92) int local92 = local76 >> 12;
				@Pc(96) int local96 = local88 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(121) int local121 = (int) (Math.sqrt((double) ((local108 + local102 + 4096) / 4096)) * 4096.0D);
				@Pc(132) int local132 = local121 == 0 ? 0 : 16777216 / local121;
				local11[local54] = 4096 - local132;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2478 = arg0.method2353();
		}
	}
}
