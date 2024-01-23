import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class1_Sub3_Sub21 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!mc", name = "ab", descriptor = "[S")
	private short[] aShortArray47 = new short[257];

	@OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
	private int anInt3474 = 0;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
	private void method2606() {
		@Pc(4) int[] local4 = this.anIntArrayArray24[0];
		@Pc(17) int[] local17 = this.anIntArrayArray24[this.anIntArrayArray24.length - 2];
		@Pc(22) int[] local22 = this.anIntArrayArray24[1];
		@Pc(31) int[] local31 = this.anIntArrayArray24[this.anIntArrayArray24.length - 1];
		this.anIntArray264 = new int[] { local17[0] + local17[0] - local31[0], local17[1] + -local31[1] + local17[1] };
		this.anIntArray265 = new int[] { local4[0] + local4[0] - local22[0], local4[1] - local22[1] - -local4[1] };
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3474 = arg0.method1772();
		this.anIntArrayArray24 = new int[arg0.method1772()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray24.length; local26++) {
			this.anIntArrayArray24[local26][0] = arg0.method1764();
			this.anIntArrayArray24[local26][1] = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[I")
	private int[] method2607(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray265;
		} else if (arg0 >= this.anIntArrayArray24.length) {
			return this.anIntArray264;
		} else {
			return this.anIntArrayArray24[arg0];
		}
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(B)V")
	private void method2609() {
		@Pc(4) int local4 = this.anInt3474;
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
				for (local24 = 1; local24 < this.anIntArrayArray24.length - 1 && local22 >= this.anIntArrayArray24[local24][0]; local24++) {
				}
				local55 = this.anIntArrayArray24[local24 - 1];
				local60 = this.anIntArrayArray24[local24];
				local69 = this.method2607(local24 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method2607(local24 + 1)[1];
				@Pc(96) int local96 = local73 + local86 - local69 - local77;
				@Pc(104) int local104 = local69 - local73 - local96;
				@Pc(108) int local108 = local77 - local69;
				@Pc(128) int local128 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(134) int local134 = local128 * local128 >> 12;
				@Pc(144) int local144 = (local96 * local128 >> 12) * local134 >> 12;
				@Pc(150) int local150 = local128 * local108 >> 12;
				@Pc(156) int local156 = local104 * local134 >> 12;
				@Pc(165) int local165 = local150 + local144 + local156 + local73;
				if (local165 <= -32768) {
					local165 = -32767;
				}
				if (local165 >= 32768) {
					local165 = 32767;
				}
				this.aShortArray47[local4] = (short) local165;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray24.length - 1 > local24 && local22 >= this.anIntArrayArray24[local24][0]; local24++) {
				}
				local55 = this.anIntArrayArray24[local24 - 1];
				local60 = this.anIntArrayArray24[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static120.anIntArray224[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local73 * local60[1] + local55[1] * local77 >> 12;
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
				for (local24 = 1; this.anIntArrayArray24.length - 1 > local24 && this.anIntArrayArray24[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray24[local24 - 1];
				local60 = this.anIntArrayArray24[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local69 * local60[1] + local73 * local55[1] >> 12;
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

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(28) int[] local28 = this.method4117(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static110.anInt2934; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local11[local30] = this.aShortArray47[local38];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		if (this.anIntArrayArray24 == null) {
			this.anIntArrayArray24 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray24.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3474 == 2) {
			this.method2606();
		}
		Static35.method621();
		this.method2609();
	}
}
