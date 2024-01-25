import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class3_Sub1_Sub25 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "[I")
	private int[] anIntArray407;

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "[I")
	private int[] anIntArray408;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "[S")
	private final short[] aShortArray68 = new short[257];

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
	private int anInt3736 = 0;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(28) int[] local28 = this.method5547(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static238.anInt4221; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local13[local30] = this.aShortArray68[local38];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	private void method3302() {
		@Pc(8) int local8 = this.anInt3736;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray37.length - 1 && this.anIntArrayArray37[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray37[local30 - 1];
				local66 = this.anIntArrayArray37[local30];
				local75 = this.method3306(local30 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method3306(local30 + 1)[1];
				@Pc(110) int local110 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(116) int local116 = local110 * local110 >> 12;
				@Pc(126) int local126 = local79 + local92 - local75 - local83;
				@Pc(133) int local133 = local75 - local126 - local79;
				@Pc(137) int local137 = local83 - local75;
				@Pc(149) int local149 = (local110 * local126 >> 12) * local116 >> 12;
				@Pc(155) int local155 = local133 * local116 >> 12;
				@Pc(161) int local161 = local137 * local110 >> 12;
				@Pc(170) int local170 = local79 + local149 + local155 + local161;
				if (local170 <= -32768) {
					local170 = -32767;
				}
				if (local170 >= 32768) {
					local170 = 32767;
				}
				this.aShortArray68[local8] = (short) local170;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; this.anIntArrayArray37.length - 1 > local30 && this.anIntArrayArray37[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray37[local30 - 1];
				local66 = this.anIntArrayArray37[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static81.anIntArray164[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local79 * local66[1] + local83 * local61[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray68[local8] = (short) local92;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray37.length - 1 && this.anIntArrayArray37[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray37[local30 - 1];
				local66 = this.anIntArrayArray37[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local66[1] * local75 + local61[1] * local79 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray68[local8] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(B)V")
	private void method3303() {
		@Pc(16) int[] local16 = this.anIntArrayArray37[0];
		@Pc(21) int[] local21 = this.anIntArrayArray37[1];
		@Pc(30) int[] local30 = this.anIntArrayArray37[this.anIntArrayArray37.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray37[this.anIntArrayArray37.length - 1];
		this.anIntArray408 = new int[] { local16[0] + local16[0] - local21[0], local16[1] + -local21[1] + local16[1] };
		this.anIntArray407 = new int[] { local30[0] + local30[0] - local39[0], local30[1] - local39[1] - -local30[1] };
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3736 = arg0.method2739();
		this.anIntArrayArray37 = new int[arg0.method2739()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray37.length; local26++) {
			this.anIntArrayArray37[local26][0] = arg0.method2767();
			this.anIntArrayArray37[local26][1] = arg0.method2767();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		if (this.anIntArrayArray37 == null) {
			this.anIntArrayArray37 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray37.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3736 == 2) {
			this.method3303();
		}
		Static204.method4476();
		this.method3302();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[I")
	private int[] method3306(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray408;
		} else if (arg0 >= this.anIntArrayArray37.length) {
			return this.anIntArray407;
		} else {
			return this.anIntArrayArray37[arg0];
		}
	}
}
