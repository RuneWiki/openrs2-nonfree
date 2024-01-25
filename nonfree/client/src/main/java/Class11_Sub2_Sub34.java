import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class11_Sub2_Sub34 extends Class11_Sub2 {

	@OriginalMember(owner = "client!sm", name = "G", descriptor = "[I")
	private int[] anIntArray447;

	@OriginalMember(owner = "client!sm", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!sm", name = "O", descriptor = "[I")
	private int[] anIntArray448;

	@OriginalMember(owner = "client!sm", name = "D", descriptor = "[S")
	private final short[] aShortArray99 = new short[257];

	@OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
	private int anInt5763 = 0;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)[I")
	private int[] method4843(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray448;
		} else if (this.anIntArrayArray66.length <= arg0) {
			return this.anIntArray447;
		} else {
			return this.anIntArrayArray66[arg0];
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5763 = arg0.method5185();
		this.anIntArrayArray66 = new int[arg0.method5185()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray66.length; local17++) {
			this.anIntArrayArray66[local17][0] = arg0.method5187();
			this.anIntArrayArray66[local17][1] = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)V")
	private void method4845() {
		@Pc(8) int[] local8 = this.anIntArrayArray66[0];
		@Pc(13) int[] local13 = this.anIntArrayArray66[1];
		@Pc(22) int[] local22 = this.anIntArrayArray66[this.anIntArrayArray66.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray66[this.anIntArrayArray66.length - 1];
		this.anIntArray447 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (local31[1] + -local22[1]) };
		this.anIntArray448 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(26) int[] local26 = this.method5710(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static339.anInt6549; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local11[local28] = this.aShortArray99[local36];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V")
	private void method4847() {
		@Pc(14) int local14 = this.anInt5763;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local14 == 2) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray66.length - 1 > local32 && this.anIntArrayArray66[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray66[local32 - 1];
				local68 = this.anIntArrayArray66[local32];
				local77 = this.method4843(local32 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method4843(local32 + 1)[1];
				@Pc(111) int local111 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(117) int local117 = local111 * local111 >> 12;
				@Pc(126) int local126 = local81 + local94 - local85 - local77;
				@Pc(134) int local134 = local77 - local81 - local126;
				@Pc(139) int local139 = local85 - local77;
				@Pc(151) int local151 = (local111 * local126 >> 12) * local117 >> 12;
				@Pc(157) int local157 = local134 * local117 >> 12;
				@Pc(163) int local163 = local111 * local139 >> 12;
				@Pc(173) int local173 = local163 + local151 + local157 + local81;
				if (local173 <= -32768) {
					local173 = -32767;
				}
				if (local173 >= 32768) {
					local173 = 32767;
				}
				this.aShortArray99[local14] = (short) local173;
			}
		} else if (local14 == 1) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray66.length - 1 && this.anIntArrayArray66[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray66[local32 - 1];
				local68 = this.anIntArrayArray66[local32];
				local77 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static333.anIntArray526[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local85 * local63[1] + local68[1] * local81 >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray99[local14] = (short) local94;
			}
		} else {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray66.length - 1 > local32 && this.anIntArrayArray66[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray66[local32 - 1];
				local68 = this.anIntArrayArray66[local32];
				local77 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local81 * local63[1] + local68[1] * local77 >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray99[local14] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		if (this.anIntArrayArray66 == null) {
			this.anIntArrayArray66 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray66.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5763 == 2) {
			this.method4845();
		}
		Static22.method318();
		this.method4847();
	}
}
