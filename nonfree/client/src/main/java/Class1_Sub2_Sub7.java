import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!d", name = "H", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "I")
	private int anInt1227 = 0;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "[S")
	private final short[] aShortArray19 = new short[257];

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1227 = arg1.method3141();
		this.anIntArrayArray6 = new int[arg1.method3141()][2];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray6.length; local30++) {
			this.anIntArrayArray6[local30][0] = arg1.method3115();
			this.anIntArrayArray6[local30][1] = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
	private void method1203() {
		@Pc(4) int local4 = this.anInt1227;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray6.length - 1 && local24 >= this.anIntArrayArray6[local26][0]; local26++) {
				}
				local61 = this.anIntArrayArray6[local26 - 1];
				local66 = this.anIntArrayArray6[local26];
				local75 = this.method1207(local26 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method1207(local26 + 1)[1];
				@Pc(110) int local110 = (local24 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(116) int local116 = local110 * local110 >> 12;
				@Pc(126) int local126 = local92 + local79 - local83 - local75;
				@Pc(134) int local134 = local75 - local126 - local79;
				@Pc(138) int local138 = local83 - local75;
				@Pc(150) int local150 = local116 * (local110 * local126 >> 12) >> 12;
				@Pc(156) int local156 = local134 * local116 >> 12;
				@Pc(162) int local162 = local138 * local110 >> 12;
				@Pc(171) int local171 = local79 + local162 + local150 + local156;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray19[local4] = (short) local171;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray6.length - 1 && local24 >= this.anIntArrayArray6[local26][0]; local26++) {
				}
				local61 = this.anIntArrayArray6[local26 - 1];
				local66 = this.anIntArrayArray6[local26];
				local75 = (local24 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static238.anIntArray597[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local61[1] * local83 + local79 * local66[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray19[local4] = (short) local92;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray6.length - 1 > local26 && this.anIntArrayArray6[local26][0] <= local24; local26++) {
				}
				local61 = this.anIntArrayArray6[local26 - 1];
				local66 = this.anIntArrayArray6[local26];
				local75 = (local24 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local66[1] * local75 + local61[1] * local79 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray19[local4] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(BI)[I")
	private int[] method1207(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray138;
		} else if (this.anIntArrayArray6.length <= arg0) {
			return this.anIntArray139;
		} else {
			return this.anIntArrayArray6[arg0];
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		if (this.anIntArrayArray6 == null) {
			this.anIntArrayArray6 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray6.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1227 == 2) {
			this.method1209();
		}
		Static244.method4324();
		this.method1203();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(26) int[] local26 = this.method5654(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static251.anInt6509; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local11[local28] = this.aShortArray19[local36];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!d", name = "i", descriptor = "(I)V")
	private void method1209() {
		@Pc(8) int[] local8 = this.anIntArrayArray6[0];
		@Pc(13) int[] local13 = this.anIntArrayArray6[1];
		@Pc(22) int[] local22 = this.anIntArrayArray6[this.anIntArrayArray6.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray6[this.anIntArrayArray6.length - 1];
		this.anIntArray139 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (local31[1] - local22[1]) };
		this.anIntArray138 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
	}
}
