import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class6_Sub5_Sub12 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ft", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!ft", name = "Y", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!ft", name = "cb", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!ft", name = "U", descriptor = "[S")
	private final short[] aShortArray36 = new short[257];

	@OriginalMember(owner = "client!ft", name = "S", descriptor = "I")
	private int anInt2530 = 0;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(Z)V")
	private void method2090() {
		@Pc(14) int[] local14 = this.anIntArrayArray12[0];
		@Pc(19) int[] local19 = this.anIntArrayArray12[1];
		@Pc(28) int[] local28 = this.anIntArrayArray12[this.anIntArrayArray12.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray12[this.anIntArrayArray12.length - 1];
		this.anIntArray155 = new int[] { local14[0] + local14[0] - local19[0], local14[1] - (-local14[1] - -local19[1]) };
		this.anIntArray156 = new int[] { local28[0] + local28[0] - local37[0], local28[1] - local37[1] - -local28[1] };
	}

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)V")
	private void method2091() {
		@Pc(10) int local10 = this.anInt2530;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(65) int[] local65;
		@Pc(70) int[] local70;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(96) int local96;
		if (local10 == 2) {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray12.length - 1 && local28 >= this.anIntArrayArray12[local30][0]; local30++) {
				}
				local65 = this.anIntArrayArray12[local30 - 1];
				local70 = this.anIntArrayArray12[local30];
				local79 = this.method2095(local30 - 2)[1];
				local83 = local65[1];
				local87 = local70[1];
				local96 = this.method2095(local30 + 1)[1];
				@Pc(113) int local113 = (local28 - local65[0] << 12) / (local70[0] - local65[0]);
				@Pc(119) int local119 = local113 * local113 >> 12;
				@Pc(129) int local129 = local83 + local96 - local87 - local79;
				@Pc(137) int local137 = local79 - local83 - local129;
				@Pc(142) int local142 = local87 - local79;
				@Pc(154) int local154 = (local113 * local129 >> 12) * local119 >> 12;
				@Pc(160) int local160 = local137 * local119 >> 12;
				@Pc(166) int local166 = local113 * local142 >> 12;
				@Pc(174) int local174 = local166 + local154 + local160 + local83;
				if (local174 <= -32768) {
					local174 = -32767;
				}
				if (local174 >= 32768) {
					local174 = 32767;
				}
				this.aShortArray36[local10] = (short) local174;
			}
		} else if (local10 == 1) {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; this.anIntArrayArray12.length - 1 > local30 && local28 >= this.anIntArrayArray12[local30][0]; local30++) {
				}
				local65 = this.anIntArrayArray12[local30 - 1];
				local70 = this.anIntArrayArray12[local30];
				local79 = (local28 - local65[0] << 12) / (local70[0] - local65[0]);
				local83 = 4096 - Static227.anIntArray295[local79 >> 5 & 0xFF] >> 1;
				local87 = 4096 - local83;
				local96 = local70[1] * local83 + local87 * local65[1] >> 12;
				if (local96 <= -32768) {
					local96 = -32767;
				}
				if (local96 >= 32768) {
					local96 = 32767;
				}
				this.aShortArray36[local10] = (short) local96;
			}
		} else {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray12.length - 1 && this.anIntArrayArray12[local30][0] <= local28; local30++) {
				}
				local65 = this.anIntArrayArray12[local30 - 1];
				local70 = this.anIntArrayArray12[local30];
				local79 = (local28 - local65[0] << 12) / (local70[0] - local65[0]);
				local83 = 4096 - local79;
				local87 = local65[1] * local83 + local70[1] * local79 >> 12;
				if (local87 <= -32768) {
					local87 = -32767;
				}
				if (local87 >= 32768) {
					local87 = 32767;
				}
				this.aShortArray36[local10] = (short) local87;
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		if (this.anIntArrayArray12 == null) {
			this.anIntArrayArray12 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray12.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2530 == 2) {
			this.method2090();
		}
		Static344.method5292();
		this.method2091();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2530 = arg1.method6433();
		this.anIntArrayArray12 = new int[arg1.method6433()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray12.length; local17++) {
			this.anIntArrayArray12[local17][0] = arg1.method6485();
			this.anIntArrayArray12[local17][1] = arg1.method6485();
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(BI)[I")
	private int[] method2095(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray155;
		} else if (this.anIntArrayArray12.length <= arg0) {
			return this.anIntArray156;
		} else {
			return this.anIntArrayArray12[arg0];
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(27) int[] local27 = this.method6543(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static240.anInt4386; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local29] = this.aShortArray36[local37];
			}
		}
		return local11;
	}
}
