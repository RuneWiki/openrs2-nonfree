import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class5_Sub1_Sub29 extends Class5_Sub1 {

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "[I")
	private int[] anIntArray355;

	@OriginalMember(owner = "client!rg", name = "U", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
	private int anInt3348 = 0;

	@OriginalMember(owner = "client!rg", name = "db", descriptor = "[S")
	private final short[] aShortArray47 = new short[257];

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		if (this.anIntArrayArray35 == null) {
			this.anIntArrayArray35 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray35.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3348 == 2) {
			this.method2531();
		}
		Static64.method1048();
		this.method2537();
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
	private void method2531() {
		@Pc(8) int[] local8 = this.anIntArrayArray35[0];
		@Pc(13) int[] local13 = this.anIntArrayArray35[1];
		@Pc(26) int[] local26 = this.anIntArrayArray35[this.anIntArrayArray35.length - 1];
		@Pc(35) int[] local35 = this.anIntArrayArray35[this.anIntArrayArray35.length - 2];
		this.anIntArray355 = new int[] { local35[0] + local35[0] - local26[0], local35[1] - (local26[1] + -local35[1]) };
		this.anIntArray356 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (-local8[1] - -local13[1]) };
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(21) int[] local21 = this.method3196(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static174.anInt3489; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local7[local23] = this.aShortArray47[local31];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)[I")
	private int[] method2534(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray356;
		} else if (this.anIntArrayArray35.length <= arg0) {
			return this.anIntArray355;
		} else {
			return this.anIntArrayArray35[arg0];
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3348 = arg0.method3062();
		this.anIntArrayArray35 = new int[arg0.method3062()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray35.length; local26++) {
			this.anIntArrayArray35[local26][0] = arg0.method3077();
			this.anIntArrayArray35[local26][1] = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
	private void method2537() {
		@Pc(8) int local8 = this.anInt3348;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(88) int local88;
		@Pc(79) int local79;
		@Pc(97) int local97;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; this.anIntArrayArray35.length - 1 > local30 && this.anIntArrayArray35[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray35[local30 - 1];
				local66 = this.anIntArrayArray35[local30];
				local75 = this.method2534(local30 - 2)[1];
				local79 = local66[1];
				@Pc(84) int local84 = local79 - local75;
				local88 = local61[1];
				local97 = this.method2534(local30 + 1)[1];
				@Pc(107) int local107 = local88 + local97 - local79 - local75;
				@Pc(126) int local126 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(132) int local132 = local126 * local126 >> 12;
				@Pc(142) int local142 = (local126 * local107 >> 12) * local132 >> 12;
				@Pc(150) int local150 = local75 - local107 - local88;
				@Pc(156) int local156 = local126 * local84 >> 12;
				@Pc(162) int local162 = local150 * local132 >> 12;
				@Pc(170) int local170 = local162 + local142 + local156 + local88;
				if (local170 <= -32768) {
					local170 = -32767;
				}
				if (local170 >= 32768) {
					local170 = 32767;
				}
				this.aShortArray47[local8] = (short) local170;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray35.length - 1 && local28 >= this.anIntArrayArray35[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray35[local30 - 1];
				local66 = this.anIntArrayArray35[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local88 = 4096 - Static106.anIntArray238[local75 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local88;
				local97 = local66[1] * local88 + local79 * local61[1] >> 12;
				if (local97 <= -32768) {
					local97 = -32767;
				}
				if (local97 >= 32768) {
					local97 = 32767;
				}
				this.aShortArray47[local8] = (short) local97;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; this.anIntArrayArray35.length - 1 > local30 && local28 >= this.anIntArrayArray35[local30][0]; local30++) {
				}
				local66 = this.anIntArrayArray35[local30];
				local61 = this.anIntArrayArray35[local30 - 1];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local88 = 4096 - local75;
				local79 = local75 * local66[1] + local88 * local61[1] >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray47[local8] = (short) local79;
			}
		}
	}
}
