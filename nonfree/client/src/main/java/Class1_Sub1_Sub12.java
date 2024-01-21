import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fe", name = "cb", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!fe", name = "gb", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!fe", name = "kb", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
	private int anInt1412 = 0;

	@OriginalMember(owner = "client!fe", name = "hb", descriptor = "[S")
	private final short[] aShortArray25 = new short[257];

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)[I")
	private int[] method1088(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray123;
		} else if (this.anIntArrayArray11.length <= arg0) {
			return this.anIntArray122;
		} else {
			return this.anIntArrayArray11[arg0];
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(26) int[] local26 = this.method3580(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static115.anInt2578; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray25[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		if (this.anIntArrayArray11 == null) {
			this.anIntArrayArray11 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray11.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1412 == 2) {
			this.method1094();
		}
		Static64.method1304();
		this.method1090();
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V")
	private void method1090() {
		@Pc(4) int local4 = this.anInt1412;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(60) int[] local60;
		@Pc(53) int[] local53;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray11.length - 1 > local24 && this.anIntArrayArray11[local24][0] <= local22; local24++) {
				}
				local53 = this.anIntArrayArray11[local24];
				local60 = this.anIntArrayArray11[local24 - 1];
				local69 = this.method1088(local24 - 2)[1];
				local73 = local60[1];
				local77 = local53[1];
				local86 = this.method1088(local24 + 1)[1];
				@Pc(91) int local91 = local77 - local69;
				@Pc(109) int local109 = (local22 - local60[0] << 12) / (local53[0] - local60[0]);
				@Pc(120) int local120 = local86 + local73 - local69 - local77;
				@Pc(126) int local126 = local109 * local109 >> 12;
				@Pc(138) int local138 = (local109 * local120 >> 12) * local126 >> 12;
				@Pc(144) int local144 = local91 * local109 >> 12;
				@Pc(152) int local152 = local69 - local120 - local73;
				@Pc(158) int local158 = local152 * local126 >> 12;
				@Pc(166) int local166 = local73 + local158 + local138 + local144;
				if (local166 <= -32768) {
					local166 = -32767;
				}
				if (local166 >= 32768) {
					local166 = 32767;
				}
				this.aShortArray25[local4] = (short) local166;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray11.length - 1 > local24 && this.anIntArrayArray11[local24][0] <= local22; local24++) {
				}
				local53 = this.anIntArrayArray11[local24];
				local60 = this.anIntArrayArray11[local24 - 1];
				local69 = (local22 - local60[0] << 12) / (local53[0] - local60[0]);
				local73 = 4096 - Static189.anIntArray364[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local60[1] * local77 + local53[1] * local73 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray25[local4] = (short) local86;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray11.length - 1 && local22 >= this.anIntArrayArray11[local24][0]; local24++) {
				}
				local60 = this.anIntArrayArray11[local24 - 1];
				local53 = this.anIntArrayArray11[local24];
				local69 = (local22 - local60[0] << 12) / (local53[0] - local60[0]);
				local73 = 4096 - local69;
				local77 = local53[1] * local69 + local73 * local60[1] >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray25[local4] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt1412 = arg0.method2771();
		this.anIntArrayArray11 = new int[arg0.method2771()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray11.length; local26++) {
			this.anIntArrayArray11[local26][0] = arg0.method2765();
			this.anIntArrayArray11[local26][1] = arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
	private void method1094() {
		@Pc(8) int[] local8 = this.anIntArrayArray11[1];
		@Pc(17) int[] local17 = this.anIntArrayArray11[this.anIntArrayArray11.length - 2];
		@Pc(22) int[] local22 = this.anIntArrayArray11[0];
		@Pc(31) int[] local31 = this.anIntArrayArray11[this.anIntArrayArray11.length - 1];
		this.anIntArray123 = new int[] { local22[0] + local22[0] - local8[0], -local8[1] + local22[1] + local22[1] };
		this.anIntArray122 = new int[] { local17[0] + local17[0] - local31[0], local17[1] - (local31[1] - local17[1]) };
	}
}
