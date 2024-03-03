import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class2_Sub3_Sub39 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wt", name = "ab", descriptor = "I")
	public static int anInt7250 = -1;

	@OriginalMember(owner = "client!wt", name = "X", descriptor = "Lclient!h;")
	public static final Class89 aClass89_258 = new Class89(26, 28);

	@OriginalMember(owner = "client!wt", name = "bb", descriptor = "Lclient!h;")
	public static final Class89 aClass89_259 = new Class89(6, -2);

	@OriginalMember(owner = "client!wt", name = "cb", descriptor = "I")
	public static int anInt7251 = 0;

	@OriginalMember(owner = "client!wt", name = "S", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!wt", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!wt", name = "Z", descriptor = "[I")
	private int[] anIntArray526;

	@OriginalMember(owner = "client!wt", name = "R", descriptor = "I")
	private int anInt7246 = 0;

	@OriginalMember(owner = "client!wt", name = "V", descriptor = "[S")
	private final short[] aShortArray128 = new short[257];

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V", line = 5)
	public Class2_Sub3_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)[I", line = 9)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(26) int[] local26 = this.method6474(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static211.anInt4031; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray128[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V", line = 52)
	private void method6487() {
		@Pc(8) int[] local8 = this.anIntArrayArray65[0];
		@Pc(21) int[] local21 = this.anIntArrayArray65[1];
		@Pc(30) int[] local30 = this.anIntArrayArray65[this.anIntArrayArray65.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray65[this.anIntArrayArray65.length - 1];
		this.anIntArray526 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
		this.anIntArray525 = new int[] { local8[0] + local8[0] - local21[0], local8[1] + -local21[1] + local8[1] };
	}

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)V", line = 97)
	private void method6489() {
		@Pc(4) int local4 = this.anInt7246;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(55) int[] local55;
		@Pc(60) int[] local60;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray65.length - 1 && this.anIntArrayArray65[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray65[local24 - 1];
				local60 = this.anIntArrayArray65[local24];
				local69 = this.method6490(local24 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method6490(local24 + 1)[1];
				@Pc(103) int local103 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(109) int local109 = local103 * local103 >> 12;
				@Pc(119) int local119 = local73 + local86 - local69 - local77;
				@Pc(127) int local127 = local69 - local119 - local73;
				@Pc(132) int local132 = local77 - local69;
				@Pc(144) int local144 = local109 * (local119 * local103 >> 12) >> 12;
				@Pc(150) int local150 = local127 * local109 >> 12;
				@Pc(156) int local156 = local103 * local132 >> 12;
				@Pc(165) int local165 = local150 + local144 + local156 + local73;
				if (local165 <= -32768) {
					local165 = -32767;
				}
				if (local165 >= 32768) {
					local165 = 32767;
				}
				this.aShortArray128[local4] = (short) local165;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray65.length - 1 > local24 && local22 >= this.anIntArrayArray65[local24][0]; local24++) {
				}
				local55 = this.anIntArrayArray65[local24 - 1];
				local60 = this.anIntArrayArray65[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static169.anIntArray203[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local73 * local60[1] + local77 * local55[1] >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray128[local4] = (short) local86;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray65.length - 1 > local24 && this.anIntArrayArray65[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray65[local24 - 1];
				local60 = this.anIntArrayArray65[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local69 * local60[1] + local55[1] * local73 >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray128[local4] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V", line = 274)
	@Override
	public void method6481() {
		if (this.anIntArrayArray65 == null) {
			this.anIntArrayArray65 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray65.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt7246 == 2) {
			this.method6487();
		}
		Static28.method937();
		this.method6489();
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)[I", line = 299)
	private int[] method6490(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray525;
		} else if (this.anIntArrayArray65.length <= arg0) {
			return this.anIntArray526;
		} else {
			return this.anIntArrayArray65[arg0];
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!bt;I)V", line = 317)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt7246 = arg1.method4816();
		this.anIntArrayArray65 = new int[arg1.method4816()][2];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray65.length; local22++) {
			this.anIntArrayArray65[local22][0] = arg1.method4830();
			this.anIntArrayArray65[local22][1] = arg1.method4830();
		}
	}
}
