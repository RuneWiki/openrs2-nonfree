import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class1_Sub2_Sub25 extends Class1_Sub2 {

	@OriginalMember(owner = "client!og", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!og", name = "X", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!og", name = "ib", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!og", name = "cb", descriptor = "[S")
	private short[] aShortArray47 = new short[257];

	@OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
	private int anInt3201 = 0;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(27) int[] local27 = this.method3514(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static105.anInt2391; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray47[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3201 = arg0.method895();
		this.anIntArrayArray50 = new int[arg0.method895()][2];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray50.length; local21++) {
			this.anIntArrayArray50[local21][0] = arg0.method946();
			this.anIntArrayArray50[local21][1] = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	private void method2444() {
		@Pc(4) int local4 = this.anInt3201;
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
				for (local24 = 1; local24 < this.anIntArrayArray50.length - 1 && local22 >= this.anIntArrayArray50[local24][0]; local24++) {
				}
				local55 = this.anIntArrayArray50[local24 - 1];
				local60 = this.anIntArrayArray50[local24];
				local69 = this.method2446(local24 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method2446(local24 + 1)[1];
				@Pc(102) int local102 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(108) int local108 = local102 * local102 >> 12;
				@Pc(118) int local118 = local73 + local86 - local69 - local77;
				@Pc(123) int local123 = local77 - local69;
				@Pc(130) int local130 = local69 - local118 - local73;
				@Pc(142) int local142 = local108 * (local118 * local102 >> 12) >> 12;
				@Pc(148) int local148 = local108 * local130 >> 12;
				@Pc(154) int local154 = local123 * local102 >> 12;
				@Pc(162) int local162 = local142 + local148 + local154 + local73;
				if (local162 <= -32768) {
					local162 = -32767;
				}
				if (local162 >= 32768) {
					local162 = 32767;
				}
				this.aShortArray47[local4] = (short) local162;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray50.length - 1 > local24 && this.anIntArrayArray50[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray50[local24 - 1];
				local60 = this.anIntArrayArray50[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static55.anIntArray169[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local60[1] * local73 + local77 * local55[1] >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray47[local4] = (short) local86;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray50.length - 1 > local24 && this.anIntArrayArray50[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray50[local24 - 1];
				local60 = this.anIntArrayArray50[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local60[1] * local69 + local55[1] * local73 >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray47[local4] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[I")
	private int[] method2446(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray417;
		} else if (arg0 >= this.anIntArrayArray50.length) {
			return this.anIntArray416;
		} else {
			return this.anIntArrayArray50[arg0];
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	private void method2448() {
		@Pc(8) int[] local8 = this.anIntArrayArray50[0];
		@Pc(13) int[] local13 = this.anIntArrayArray50[1];
		@Pc(26) int[] local26 = this.anIntArrayArray50[this.anIntArrayArray50.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray50[this.anIntArrayArray50.length - 1];
		this.anIntArray416 = new int[] { local26[0] + local26[0] - local35[0], local26[1] - (-local26[1] - -local35[1]) };
		this.anIntArray417 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		if (this.anIntArrayArray50 == null) {
			this.anIntArrayArray50 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray50.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3201 == 2) {
			this.method2448();
		}
		Static189.method2977();
		this.method2444();
	}
}
