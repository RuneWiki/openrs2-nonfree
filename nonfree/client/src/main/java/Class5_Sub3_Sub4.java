import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class5_Sub3_Sub4 extends Class5_Sub3 {

	@OriginalMember(owner = "client!bo", name = "Q", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!bo", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!bo", name = "ab", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!bo", name = "V", descriptor = "[S")
	private final short[] aShortArray6 = new short[257];

	@OriginalMember(owner = "client!bo", name = "db", descriptor = "I")
	private int anInt597 = 0;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt597 = arg0.method5115();
		this.anIntArrayArray17 = new int[arg0.method5115()][2];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray17.length; local27++) {
			this.anIntArrayArray17[local27][0] = arg0.method5106();
			this.anIntArrayArray17[local27][1] = arg0.method5106();
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		if (this.anIntArrayArray17 == null) {
			this.anIntArrayArray17 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray17.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt597 == 2) {
			this.method533();
		}
		Static124.method2201();
		this.method535();
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V")
	private void method533() {
		@Pc(8) int[] local8 = this.anIntArrayArray17[0];
		@Pc(19) int[] local19 = this.anIntArrayArray17[1];
		@Pc(28) int[] local28 = this.anIntArrayArray17[this.anIntArrayArray17.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray17[this.anIntArrayArray17.length - 1];
		this.anIntArray66 = new int[] { local8[0] + local8[0] - local19[0], local8[1] + -local19[1] + local8[1] };
		this.anIntArray67 = new int[] { local28[0] + local28[0] - local37[0], local28[1] + -local37[1] + local28[1] };
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(29) int[] local29 = this.method6020(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static7.anInt129; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local11[local31] = this.aShortArray6[local39];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(B)V")
	private void method535() {
		@Pc(4) int local4 = this.anInt597;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(51) int[] local51;
		@Pc(56) int[] local56;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(82) int local82;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray17.length - 1 && this.anIntArrayArray17[local24][0] <= local22; local24++) {
				}
				local51 = this.anIntArrayArray17[local24 - 1];
				local56 = this.anIntArrayArray17[local24];
				local65 = this.method538(local24 - 2)[1];
				local69 = local51[1];
				local73 = local56[1];
				local82 = this.method538(local24 + 1)[1];
				@Pc(100) int local100 = (local22 - local51[0] << 12) / (local56[0] - local51[0]);
				@Pc(106) int local106 = local100 * local100 >> 12;
				@Pc(116) int local116 = local69 + local82 - local73 - local65;
				@Pc(123) int local123 = local65 - local69 - local116;
				@Pc(128) int local128 = local73 - local65;
				@Pc(140) int local140 = (local116 * local100 >> 12) * local106 >> 12;
				@Pc(146) int local146 = local123 * local106 >> 12;
				@Pc(152) int local152 = local100 * local128 >> 12;
				@Pc(161) int local161 = local140 + local146 + local152 + local69;
				if (local161 <= -32768) {
					local161 = -32767;
				}
				if (local161 >= 32768) {
					local161 = 32767;
				}
				this.aShortArray6[local4] = (short) local161;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray17.length - 1 && this.anIntArrayArray17[local24][0] <= local22; local24++) {
				}
				local51 = this.anIntArrayArray17[local24 - 1];
				local56 = this.anIntArrayArray17[local24];
				local65 = (local22 - local51[0] << 12) / (local56[0] - local51[0]);
				local69 = 4096 - Static186.anIntArray370[local65 >> 5 & 0xFF] >> 1;
				local73 = 4096 - local69;
				local82 = local56[1] * local69 + local73 * local51[1] >> 12;
				if (local82 <= -32768) {
					local82 = -32767;
				}
				if (local82 >= 32768) {
					local82 = 32767;
				}
				this.aShortArray6[local4] = (short) local82;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray17.length - 1 > local24 && this.anIntArrayArray17[local24][0] <= local22; local24++) {
				}
				local51 = this.anIntArrayArray17[local24 - 1];
				local56 = this.anIntArrayArray17[local24];
				local65 = (local22 - local51[0] << 12) / (local56[0] - local51[0]);
				local69 = 4096 - local65;
				local73 = local56[1] * local65 + local51[1] * local69 >> 12;
				if (local73 <= -32768) {
					local73 = -32767;
				}
				if (local73 >= 32768) {
					local73 = 32767;
				}
				this.aShortArray6[local4] = (short) local73;
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(BI)[I")
	private int[] method538(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray66;
		} else if (arg0 >= this.anIntArrayArray17.length) {
			return this.anIntArray67;
		} else {
			return this.anIntArrayArray17[arg0];
		}
	}
}
