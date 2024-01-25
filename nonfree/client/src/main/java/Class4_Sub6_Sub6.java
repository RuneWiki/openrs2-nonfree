import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class4_Sub6_Sub6 extends Class4_Sub6 {

	@OriginalMember(owner = "client!co", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!co", name = "R", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!co", name = "S", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!co", name = "M", descriptor = "[S")
	private final short[] aShortArray17 = new short[257];

	@OriginalMember(owner = "client!co", name = "L", descriptor = "I")
	private int anInt1271 = 0;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)[I")
	private int[] method951(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray58;
		} else if (arg0 >= this.anIntArrayArray29.length) {
			return this.anIntArray57;
		} else {
			return this.anIntArrayArray29[arg0];
		}
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
	private void method953() {
		@Pc(12) int local12 = this.anInt1271;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local12 == 2) {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; this.anIntArrayArray29.length - 1 > local30 && local28 >= this.anIntArrayArray29[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray29[local30 - 1];
				local66 = this.anIntArrayArray29[local30];
				local75 = this.method951(local30 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method951(local30 + 1)[1];
				@Pc(110) int local110 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(116) int local116 = local110 * local110 >> 12;
				@Pc(127) int local127 = local92 + local79 - local83 - local75;
				@Pc(134) int local134 = local75 - local79 - local127;
				@Pc(139) int local139 = local83 - local75;
				@Pc(151) int local151 = (local110 * local127 >> 12) * local116 >> 12;
				@Pc(157) int local157 = local116 * local134 >> 12;
				@Pc(163) int local163 = local110 * local139 >> 12;
				@Pc(173) int local173 = local151 + local157 + local163 + local79;
				if (local173 <= -32768) {
					local173 = -32767;
				}
				if (local173 >= 32768) {
					local173 = 32767;
				}
				this.aShortArray17[local12] = (short) local173;
			}
		} else if (local12 == 1) {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray29.length - 1 && local28 >= this.anIntArrayArray29[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray29[local30 - 1];
				local66 = this.anIntArrayArray29[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static232.anIntArray392[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local83 * local61[1] + local66[1] * local79 >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray17[local12] = (short) local92;
			}
		} else {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; this.anIntArrayArray29.length - 1 > local30 && this.anIntArrayArray29[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray29[local30 - 1];
				local66 = this.anIntArrayArray29[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local61[1] * local79 + local66[1] * local75 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray17[local12] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(27) int[] local27 = this.method5702(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static31.anInt797; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray17[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
	private void method954() {
		@Pc(14) int[] local14 = this.anIntArrayArray29[0];
		@Pc(19) int[] local19 = this.anIntArrayArray29[1];
		@Pc(28) int[] local28 = this.anIntArrayArray29[this.anIntArrayArray29.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray29[this.anIntArrayArray29.length - 1];
		this.anIntArray58 = new int[] { local14[0] + local14[0] - local19[0], local14[1] - (-local14[1] - -local19[1]) };
		this.anIntArray57 = new int[] { local28[0] + local28[0] - local37[0], local28[1] + -local37[1] + local28[1] };
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1271 = arg1.method3440();
		this.anIntArrayArray29 = new int[arg1.method3440()][2];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray29.length; local24++) {
			this.anIntArrayArray29[local24][0] = arg1.method3401();
			this.anIntArrayArray29[local24][1] = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		if (this.anIntArrayArray29 == null) {
			this.anIntArrayArray29 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray29.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1271 == 2) {
			this.method954();
		}
		Static147.method2993();
		this.method953();
	}
}
