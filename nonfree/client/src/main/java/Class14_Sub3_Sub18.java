import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class14_Sub3_Sub18 extends Class14_Sub3 {

	@OriginalMember(owner = "client!ip", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!ip", name = "Z", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!ip", name = "ab", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!ip", name = "U", descriptor = "[S")
	private final short[] aShortArray80 = new short[257];

	@OriginalMember(owner = "client!ip", name = "P", descriptor = "I")
	private int anInt2941 = 0;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(27) int[] local27 = this.method6004(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static294.anInt5657; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray80[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2941 = arg0.method2548();
		this.anIntArrayArray47 = new int[arg0.method2548()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray47.length; local17++) {
			this.anIntArrayArray47[local17][0] = arg0.method2498();
			this.anIntArrayArray47[local17][1] = arg0.method2498();
		}
	}

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "(I)V")
	private void method2788() {
		@Pc(8) int[] local8 = this.anIntArrayArray47[0];
		@Pc(13) int[] local13 = this.anIntArrayArray47[1];
		@Pc(22) int[] local22 = this.anIntArrayArray47[this.anIntArrayArray47.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray47[this.anIntArrayArray47.length - 1];
		this.anIntArray267 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - local31[1] - -local22[1] };
		this.anIntArray266 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (-local8[1] + local13[1]) };
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(IB)[I")
	private int[] method2790(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray266;
		} else if (this.anIntArrayArray47.length <= arg0) {
			return this.anIntArray267;
		} else {
			return this.anIntArrayArray47[arg0];
		}
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		if (this.anIntArrayArray47 == null) {
			this.anIntArrayArray47 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray47.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2941 == 2) {
			this.method2788();
		}
		Static74.method4762();
		this.method2791();
	}

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "(I)V")
	private void method2791() {
		@Pc(8) int local8 = this.anInt2941;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(59) int[] local59;
		@Pc(64) int[] local64;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray47.length - 1 > local28 && local26 >= this.anIntArrayArray47[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray47[local28 - 1];
				local64 = this.anIntArrayArray47[local28];
				local73 = this.method2790(local28 - 2)[1];
				local77 = local59[1];
				local81 = local64[1];
				local90 = this.method2790(local28 + 1)[1];
				@Pc(107) int local107 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				@Pc(113) int local113 = local107 * local107 >> 12;
				@Pc(124) int local124 = local90 + local77 - local73 - local81;
				@Pc(131) int local131 = local73 - local77 - local124;
				@Pc(135) int local135 = local81 - local73;
				@Pc(147) int local147 = local113 * (local124 * local107 >> 12) >> 12;
				@Pc(153) int local153 = local131 * local113 >> 12;
				@Pc(159) int local159 = local135 * local107 >> 12;
				@Pc(167) int local167 = local77 + local159 + local153 + local147;
				if (local167 <= -32768) {
					local167 = -32767;
				}
				if (local167 >= 32768) {
					local167 = 32767;
				}
				this.aShortArray80[local8] = (short) local167;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray47.length - 1 && local26 >= this.anIntArrayArray47[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray47[local28 - 1];
				local64 = this.anIntArrayArray47[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - Static153.anIntArray287[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local81 * local59[1] + local64[1] * local77 >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray80[local8] = (short) local90;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray47.length - 1 && this.anIntArrayArray47[local28][0] <= local26; local28++) {
				}
				local59 = this.anIntArrayArray47[local28 - 1];
				local64 = this.anIntArrayArray47[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - local73;
				local81 = local64[1] * local73 + local77 * local59[1] >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray80[local8] = (short) local81;
			}
		}
	}
}
