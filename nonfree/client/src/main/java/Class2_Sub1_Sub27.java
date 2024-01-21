import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub1_Sub27 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ta", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!ta", name = "gb", descriptor = "[I")
	private int[] anIntArray364;

	@OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
	private int anInt3670 = 0;

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "[S")
	private final short[] aShortArray40 = new short[257];

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3670 = arg0.method260();
		this.anIntArrayArray32 = new int[arg0.method260()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray32.length; local17++) {
			this.anIntArrayArray32[local17][0] = arg0.method269();
			this.anIntArrayArray32[local17][1] = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		if (this.anIntArrayArray32 == null) {
			this.anIntArrayArray32 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray32.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3670 == 2) {
			this.method2789();
		}
		Static50.method997();
		this.method2787();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(23) int[] local23 = this.method3265(arg0, 0);
			for (@Pc(25) int local25 = 0; local25 < Static135.anInt2897; local25++) {
				@Pc(33) int local33 = local23[local25] >> 4;
				if (local33 < 0) {
					local33 = 0;
				}
				if (local33 > 256) {
					local33 = 256;
				}
				local7[local25] = this.aShortArray40[local33];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I")
	private int[] method2784(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray364;
		} else if (arg0 >= this.anIntArrayArray32.length) {
			return this.anIntArray363;
		} else {
			return this.anIntArrayArray32[arg0];
		}
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
	private void method2787() {
		@Pc(8) int local8 = this.anInt3670;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray32.length - 1 && local26 >= this.anIntArrayArray32[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray32[local28 - 1];
				local68 = this.anIntArrayArray32[local28];
				local77 = this.method2784(local28 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method2784(local28 + 1)[1];
				@Pc(112) int local112 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(128) int local128 = local94 + local81 - local85 - local77;
				@Pc(135) int local135 = local77 - local128 - local81;
				@Pc(147) int local147 = local118 * (local112 * local128 >> 12) >> 12;
				@Pc(152) int local152 = local85 - local77;
				@Pc(158) int local158 = local135 * local118 >> 12;
				@Pc(164) int local164 = local112 * local152 >> 12;
				@Pc(172) int local172 = local81 + local164 + local158 + local147;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray40[local8] = (short) local172;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray32.length - 1 && local26 >= this.anIntArrayArray32[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray32[local28 - 1];
				local68 = this.anIntArrayArray32[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static203.anIntArray399[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local81 * local68[1] + local63[1] * local85 >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray40[local8] = (short) local94;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray32.length - 1 && local26 >= this.anIntArrayArray32[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray32[local28 - 1];
				local68 = this.anIntArrayArray32[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local63[1] * local81 + local77 * local68[1] >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray40[local8] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
	private void method2789() {
		@Pc(8) int[] local8 = this.anIntArrayArray32[0];
		@Pc(13) int[] local13 = this.anIntArrayArray32[1];
		@Pc(32) int[] local32 = this.anIntArrayArray32[this.anIntArrayArray32.length - 2];
		@Pc(41) int[] local41 = this.anIntArrayArray32[this.anIntArrayArray32.length - 1];
		this.anIntArray364 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - (-local8[1] - local8[1]) };
		this.anIntArray363 = new int[] { local32[0] + local32[0] - local41[0], local32[1] - local41[1] + local32[1] };
	}
}
