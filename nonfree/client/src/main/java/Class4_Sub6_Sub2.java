import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class4_Sub6_Sub2 extends Class4_Sub6 {

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
	private int anInt690 = 0;

	@OriginalMember(owner = "client!bt", name = "P", descriptor = "[S")
	private final short[] aShortArray21 = new short[257];

	static {
		new Class83("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(29) int[] local29 = this.method5508(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static80.anInt1616; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local11[local31] = this.aShortArray21[local39];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)V")
	private void method690() {
		@Pc(8) int local8 = this.anInt690;
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
				for (local28 = 1; this.anIntArrayArray6.length - 1 > local28 && this.anIntArrayArray6[local28][0] <= local26; local28++) {
				}
				local63 = this.anIntArrayArray6[local28 - 1];
				local68 = this.anIntArrayArray6[local28];
				local77 = this.method692(local28 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method692(local28 + 1)[1];
				@Pc(112) int local112 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(128) int local128 = local81 + local94 - local77 - local85;
				@Pc(135) int local135 = local77 - local128 - local81;
				@Pc(139) int local139 = local85 - local77;
				@Pc(151) int local151 = (local128 * local112 >> 12) * local118 >> 12;
				@Pc(157) int local157 = local135 * local118 >> 12;
				@Pc(163) int local163 = local112 * local139 >> 12;
				@Pc(172) int local172 = local81 + local163 + local151 + local157;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray21[local8] = (short) local172;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray6.length - 1 && local26 >= this.anIntArrayArray6[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray6[local28 - 1];
				local68 = this.anIntArrayArray6[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static345.anIntArray416[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local81 * local68[1] + local85 * local63[1] >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray21[local8] = (short) local94;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray6.length - 1 && local26 >= this.anIntArrayArray6[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray6[local28 - 1];
				local68 = this.anIntArrayArray6[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local68[1] * local77 + local81 * local63[1] >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray21[local8] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)V")
	private void method691() {
		@Pc(8) int[] local8 = this.anIntArrayArray6[0];
		@Pc(13) int[] local13 = this.anIntArrayArray6[1];
		@Pc(22) int[] local22 = this.anIntArrayArray6[this.anIntArrayArray6.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray6[this.anIntArrayArray6.length - 1];
		this.anIntArray39 = new int[] { local22[0] + local22[0] - local36[0], -local36[1] - -local22[1] + local22[1] };
		this.anIntArray38 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)[I")
	private int[] method692(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray38;
		} else if (this.anIntArrayArray6.length <= arg0) {
			return this.anIntArray39;
		} else {
			return this.anIntArrayArray6[arg0];
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt690 = arg1.method2490();
		this.anIntArrayArray6 = new int[arg1.method2490()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray6.length; local26++) {
			this.anIntArrayArray6[local26][0] = arg1.method2536();
			this.anIntArrayArray6[local26][1] = arg1.method2536();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		if (this.anIntArrayArray6 == null) {
			this.anIntArrayArray6 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray6.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt690 == 2) {
			this.method691();
		}
		Static101.method1784();
		this.method690();
	}
}
