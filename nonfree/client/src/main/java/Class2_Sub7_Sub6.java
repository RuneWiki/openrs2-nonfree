import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class2_Sub7_Sub6 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ew", name = "I", descriptor = "[I")
	private int[] anIntArray311;

	@OriginalMember(owner = "client!ew", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!ew", name = "Q", descriptor = "[I")
	private int[] anIntArray312;

	@OriginalMember(owner = "client!ew", name = "S", descriptor = "[S")
	private final short[] aShortArray58 = new short[257];

	@OriginalMember(owner = "client!ew", name = "R", descriptor = "I")
	private int anInt2425 = 0;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		if (this.anIntArrayArray39 == null) {
			this.anIntArrayArray39 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray39.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2425 == 2) {
			this.method2311();
		}
		Static50.method896();
		this.method2313();
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)[I")
	private int[] method2308(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray311;
		} else if (this.anIntArrayArray39.length <= arg0) {
			return this.anIntArray312;
		} else {
			return this.anIntArrayArray39[arg0];
		}
	}

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "(I)V")
	private void method2311() {
		@Pc(8) int[] local8 = this.anIntArrayArray39[0];
		@Pc(13) int[] local13 = this.anIntArrayArray39[1];
		@Pc(22) int[] local22 = this.anIntArrayArray39[this.anIntArrayArray39.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray39[this.anIntArrayArray39.length - 1];
		this.anIntArray311 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] - -local8[1] };
		this.anIntArray312 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (-local22[1] - -local31[1]) };
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(21) int[] local21 = this.method7581(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static352.anInt6485; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray58[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2425 = arg1.method5170();
		this.anIntArrayArray39 = new int[arg1.method5170()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray39.length; local28++) {
			this.anIntArrayArray39[local28][0] = arg1.method5229();
			this.anIntArrayArray39[local28][1] = arg1.method5229();
		}
	}

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "(I)V")
	private void method2313() {
		@Pc(4) int local4 = this.anInt2425;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(59) int[] local59;
		@Pc(64) int[] local64;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray39.length - 1 > local24 && this.anIntArrayArray39[local24][0] <= local22; local24++) {
				}
				local59 = this.anIntArrayArray39[local24 - 1];
				local64 = this.anIntArrayArray39[local24];
				local75 = this.method2308(local24 - 2)[1];
				local79 = local59[1];
				local83 = local64[1];
				local92 = this.method2308(local24 + 1)[1];
				@Pc(110) int local110 = (local22 - local59[0] << 12) / (local64[0] - local59[0]);
				@Pc(116) int local116 = local110 * local110 >> 12;
				@Pc(126) int local126 = local79 + local92 - local75 - local83;
				@Pc(133) int local133 = local75 - local79 - local126;
				@Pc(138) int local138 = local83 - local75;
				@Pc(150) int local150 = (local110 * local126 >> 12) * local116 >> 12;
				@Pc(156) int local156 = local133 * local116 >> 12;
				@Pc(162) int local162 = local110 * local138 >> 12;
				@Pc(170) int local170 = local162 + local150 + local156 + local79;
				if (local170 <= -32768) {
					local170 = -32767;
				}
				if (local170 >= 32768) {
					local170 = 32767;
				}
				this.aShortArray58[local4] = (short) local170;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray39.length - 1 && local22 >= this.anIntArrayArray39[local24][0]; local24++) {
				}
				local59 = this.anIntArrayArray39[local24 - 1];
				local64 = this.anIntArrayArray39[local24];
				local75 = (local22 - local59[0] << 12) / (local64[0] - local59[0]);
				local79 = 4096 - Static314.anIntArray485[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local59[1] * local83 + local64[1] * local79 >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray58[local4] = (short) local92;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray39.length - 1 && this.anIntArrayArray39[local24][0] <= local22; local24++) {
				}
				local59 = this.anIntArrayArray39[local24 - 1];
				local64 = this.anIntArrayArray39[local24];
				local75 = (local22 - local59[0] << 12) / (local64[0] - local59[0]);
				local79 = 4096 - local75;
				local83 = local79 * local59[1] + local64[1] * local75 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray58[local4] = (short) local83;
			}
		}
	}
}
