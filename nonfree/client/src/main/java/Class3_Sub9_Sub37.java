import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class3_Sub9_Sub37 extends Class3_Sub9 {

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "[I")
	private int[] anIntArray896;

	@OriginalMember(owner = "client!vo", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!vo", name = "Q", descriptor = "[I")
	private int[] anIntArray897;

	@OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
	private int anInt10224 = 0;

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "[S")
	private final short[] aShortArray151 = new short[257];

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(27) int[] local27 = this.method9162(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static62.anInt1251; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray151[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		if (this.anIntArrayArray64 == null) {
			this.anIntArrayArray64 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray64.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt10224 == 2) {
			this.method8953();
		}
		Static609.method8656();
		this.method8958();
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(B)V")
	private void method8953() {
		@Pc(8) int[] local8 = this.anIntArrayArray64[0];
		@Pc(13) int[] local13 = this.anIntArrayArray64[1];
		@Pc(22) int[] local22 = this.anIntArrayArray64[this.anIntArrayArray64.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray64[this.anIntArrayArray64.length - 1];
		this.anIntArray896 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (-local8[1] - -local13[1]) };
		this.anIntArray897 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + local22[1] - local31[1] };
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt10224 = arg0.method8632();
		this.anIntArrayArray64 = new int[arg0.method8632()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray64.length; local20++) {
			this.anIntArrayArray64[local20][0] = arg0.method8593();
			this.anIntArrayArray64[local20][1] = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "(B)V")
	private void method8958() {
		@Pc(8) int local8 = this.anInt10224;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(55) int[] local55;
		@Pc(60) int[] local60;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(90) int local90;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray64.length - 1 && this.anIntArrayArray64[local28][0] <= local26; local28++) {
				}
				local55 = this.anIntArrayArray64[local28 - 1];
				local60 = this.anIntArrayArray64[local28];
				local71 = this.method8959(local28 - 2)[1];
				local75 = local55[1];
				local79 = local60[1];
				local90 = this.method8959(local28 + 1)[1];
				@Pc(107) int local107 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(113) int local113 = local107 * local107 >> 12;
				@Pc(123) int local123 = local75 + local90 - local71 - local79;
				@Pc(131) int local131 = local71 - local75 - local123;
				@Pc(136) int local136 = local79 - local71;
				@Pc(148) int local148 = local113 * (local107 * local123 >> 12) >> 12;
				@Pc(154) int local154 = local131 * local113 >> 12;
				@Pc(160) int local160 = local136 * local107 >> 12;
				@Pc(169) int local169 = local154 + local148 + local160 + local75;
				if (local169 <= -32768) {
					local169 = -32767;
				}
				if (local169 >= 32768) {
					local169 = 32767;
				}
				this.aShortArray151[local8] = (short) local169;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray64.length - 1 && this.anIntArrayArray64[local28][0] <= local26; local28++) {
				}
				local55 = this.anIntArrayArray64[local28 - 1];
				local60 = this.anIntArrayArray64[local28];
				local71 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				local75 = 4096 - Static144.anIntArray235[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local90 = local60[1] * local75 + local55[1] * local79 >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray151[local8] = (short) local90;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray64.length - 1 && local26 >= this.anIntArrayArray64[local28][0]; local28++) {
				}
				local55 = this.anIntArrayArray64[local28 - 1];
				local60 = this.anIntArrayArray64[local28];
				local71 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				local75 = 4096 - local71;
				local79 = local71 * local60[1] + local75 * local55[1] >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray151[local8] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)[I")
	private int[] method8959(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray896;
		} else if (arg0 >= this.anIntArrayArray64.length) {
			return this.anIntArray897;
		} else {
			return this.anIntArrayArray64[arg0];
		}
	}
}
