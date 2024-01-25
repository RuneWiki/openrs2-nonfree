import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class6_Sub1_Sub8 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fba", name = "N", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!fba", name = "O", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!fba", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
	private int anInt2876 = 0;

	@OriginalMember(owner = "client!fba", name = "T", descriptor = "[S")
	private final short[] aShortArray32 = new short[257];

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "(I)V")
	private void method2553() {
		@Pc(16) int local16 = this.anInt2876;
		@Pc(38) int local38;
		@Pc(36) int local36;
		@Pc(65) int[] local65;
		@Pc(70) int[] local70;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(96) int local96;
		if (local16 == 2) {
			for (local16 = 0; local16 < 257; local16++) {
				local36 = local16 << 4;
				for (local38 = 1; local38 < this.anIntArrayArray19.length - 1 && this.anIntArrayArray19[local38][0] <= local36; local38++) {
				}
				local65 = this.anIntArrayArray19[local38 - 1];
				local70 = this.anIntArrayArray19[local38];
				local79 = this.method2554(local38 - 2)[1];
				local83 = local65[1];
				local87 = local70[1];
				local96 = this.method2554(local38 + 1)[1];
				@Pc(113) int local113 = (local36 - local65[0] << 12) / (local70[0] - local65[0]);
				@Pc(119) int local119 = local113 * local113 >> 12;
				@Pc(129) int local129 = local83 + local96 - local79 - local87;
				@Pc(137) int local137 = local79 - local83 - local129;
				@Pc(142) int local142 = local87 - local79;
				@Pc(154) int local154 = local119 * (local129 * local113 >> 12) >> 12;
				@Pc(160) int local160 = local137 * local119 >> 12;
				@Pc(166) int local166 = local113 * local142 >> 12;
				@Pc(174) int local174 = local83 + local166 + local160 + local154;
				if (local174 <= -32768) {
					local174 = -32767;
				}
				if (local174 >= 32768) {
					local174 = 32767;
				}
				this.aShortArray32[local16] = (short) local174;
			}
		} else if (local16 == 1) {
			for (local16 = 0; local16 < 257; local16++) {
				local36 = local16 << 4;
				for (local38 = 1; this.anIntArrayArray19.length - 1 > local38 && this.anIntArrayArray19[local38][0] <= local36; local38++) {
				}
				local65 = this.anIntArrayArray19[local38 - 1];
				local70 = this.anIntArrayArray19[local38];
				local79 = (local36 - local65[0] << 12) / (local70[0] - local65[0]);
				local83 = 4096 - Static293.anIntArray416[local79 >> 5 & 0xFF] >> 1;
				local87 = 4096 - local83;
				local96 = local70[1] * local83 + local65[1] * local87 >> 12;
				if (local96 <= -32768) {
					local96 = -32767;
				}
				if (local96 >= 32768) {
					local96 = 32767;
				}
				this.aShortArray32[local16] = (short) local96;
			}
		} else {
			for (local16 = 0; local16 < 257; local16++) {
				local36 = local16 << 4;
				for (local38 = 1; this.anIntArrayArray19.length - 1 > local38 && local36 >= this.anIntArrayArray19[local38][0]; local38++) {
				}
				local65 = this.anIntArrayArray19[local38 - 1];
				local70 = this.anIntArrayArray19[local38];
				local79 = (local36 - local65[0] << 12) / (local70[0] - local65[0]);
				local83 = 4096 - local79;
				local87 = local70[1] * local79 + local65[1] * local83 >> 12;
				if (local87 <= -32768) {
					local87 = -32767;
				}
				if (local87 >= 32768) {
					local87 = 32767;
				}
				this.aShortArray32[local16] = (short) local87;
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BI)[I")
	private int[] method2554(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray222;
		} else if (arg0 >= this.anIntArrayArray19.length) {
			return this.anIntArray221;
		} else {
			return this.anIntArrayArray19[arg0];
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		if (this.anIntArrayArray19 == null) {
			this.anIntArrayArray19 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray19.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2876 == 2) {
			this.method2555();
		}
		Static463.method7157();
		this.method2553();
	}

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "(I)V")
	private void method2555() {
		@Pc(8) int[] local8 = this.anIntArrayArray19[0];
		@Pc(13) int[] local13 = this.anIntArrayArray19[1];
		@Pc(22) int[] local22 = this.anIntArrayArray19[this.anIntArrayArray19.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray19[this.anIntArrayArray19.length - 1];
		this.anIntArray221 = new int[] { local22[0] + local22[0] - local31[0], -local31[1] - (-local22[1] - local22[1]) };
		this.anIntArray222 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2876 = arg1.method4966();
		this.anIntArrayArray19 = new int[arg1.method4966()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray19.length; local29++) {
			this.anIntArrayArray19[local29][0] = arg1.method4999();
			this.anIntArrayArray19[local29][1] = arg1.method4999();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(26) int[] local26 = this.method8165(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static289.anInt5549; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray32[local36];
			}
		}
		return local16;
	}
}
