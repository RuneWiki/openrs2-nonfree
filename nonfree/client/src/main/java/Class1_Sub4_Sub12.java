import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class1_Sub4_Sub12 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hq", name = "G", descriptor = "[J")
	public static final long[] aLongArray3 = new long[256];

	@OriginalMember(owner = "client!hq", name = "K", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!hq", name = "M", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!hq", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
	private int anInt2947 = 0;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "[S")
	private final short[] aShortArray45 = new short[257];

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(10) long local10 = (long) local6;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray3[local6] = local10;
		}
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2947 = arg1.method5366();
		this.anIntArrayArray34 = new int[arg1.method5366()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray34.length; local29++) {
			this.anIntArrayArray34[local29][0] = arg1.method5362();
			this.anIntArrayArray34[local29][1] = arg1.method5362();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		if (this.anIntArrayArray34 == null) {
			this.anIntArrayArray34 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray34.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2947 == 2) {
			this.method2547();
		}
		Static170.method2715();
		this.method2546();
	}

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "(I)V")
	private void method2546() {
		@Pc(16) int local16 = this.anInt2947;
		@Pc(34) int local34;
		@Pc(32) int local32;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local16 == 2) {
			for (local16 = 0; local16 < 257; local16++) {
				local32 = local16 << 4;
				for (local34 = 1; this.anIntArrayArray34.length - 1 > local34 && local32 >= this.anIntArrayArray34[local34][0]; local34++) {
				}
				local61 = this.anIntArrayArray34[local34 - 1];
				local66 = this.anIntArrayArray34[local34];
				local75 = this.method2548(local34 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method2548(local34 + 1)[1];
				@Pc(109) int local109 = (local32 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(126) int local126 = local92 + local79 - local83 - local75;
				@Pc(134) int local134 = local75 - local126 - local79;
				@Pc(139) int local139 = local83 - local75;
				@Pc(151) int local151 = local115 * (local109 * local126 >> 12) >> 12;
				@Pc(157) int local157 = local134 * local115 >> 12;
				@Pc(163) int local163 = local109 * local139 >> 12;
				@Pc(173) int local173 = local79 + local151 + local157 + local163;
				if (local173 <= -32768) {
					local173 = -32767;
				}
				if (local173 >= 32768) {
					local173 = 32767;
				}
				this.aShortArray45[local16] = (short) local173;
			}
		} else if (local16 == 1) {
			for (local16 = 0; local16 < 257; local16++) {
				local32 = local16 << 4;
				for (local34 = 1; this.anIntArrayArray34.length - 1 > local34 && this.anIntArrayArray34[local34][0] <= local32; local34++) {
				}
				local61 = this.anIntArrayArray34[local34 - 1];
				local66 = this.anIntArrayArray34[local34];
				local75 = (local32 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static268.anIntArray411[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local83 * local61[1] + local79 * local66[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray45[local16] = (short) local92;
			}
		} else {
			for (local16 = 0; local16 < 257; local16++) {
				local32 = local16 << 4;
				for (local34 = 1; local34 < this.anIntArrayArray34.length - 1 && this.anIntArrayArray34[local34][0] <= local32; local34++) {
				}
				local61 = this.anIntArrayArray34[local34 - 1];
				local66 = this.anIntArrayArray34[local34];
				local75 = (local32 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local66[1] * local75 + local61[1] * local79 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray45[local16] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
	private void method2547() {
		@Pc(8) int[] local8 = this.anIntArrayArray34[0];
		@Pc(13) int[] local13 = this.anIntArrayArray34[1];
		@Pc(22) int[] local22 = this.anIntArrayArray34[this.anIntArrayArray34.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray34[this.anIntArrayArray34.length - 1];
		this.anIntArray266 = new int[] { local22[0] + local22[0] - local36[0], local22[1] + -local36[1] + local22[1] };
		this.anIntArray267 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + local8[1] + -local13[1] };
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)[I")
	private int[] method2548(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray267;
		} else if (arg0 >= this.anIntArrayArray34.length) {
			return this.anIntArray266;
		} else {
			return this.anIntArrayArray34[arg0];
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(28) int[] local28 = this.method5958(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static66.anInt1511; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local16[local30] = this.aShortArray45[local38];
			}
		}
		return local16;
	}
}
