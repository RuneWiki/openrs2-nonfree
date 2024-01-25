import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class7_Sub4_Sub11 extends Class7_Sub4 {

	@OriginalMember(owner = "client!h", name = "F", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!h", name = "I", descriptor = "[S")
	private final short[] aShortArray46 = new short[257];

	@OriginalMember(owner = "client!h", name = "S", descriptor = "I")
	private int anInt2550 = 0;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(B)V")
	private void method2155() {
		@Pc(8) int[] local8 = this.anIntArrayArray22[0];
		@Pc(17) int[] local17 = this.anIntArrayArray22[1];
		@Pc(26) int[] local26 = this.anIntArrayArray22[this.anIntArrayArray22.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray22[this.anIntArrayArray22.length - 1];
		this.anIntArray345 = new int[] { local26[0] + local26[0] - local35[0], local26[1] - local35[1] + local26[1] };
		this.anIntArray346 = new int[] { local8[0] + local8[0] - local17[0], -local17[1] - (-local8[1] - local8[1]) };
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2550 = arg0.method2772();
		this.anIntArrayArray22 = new int[arg0.method2772()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray22.length; local20++) {
			this.anIntArrayArray22[local20][0] = arg0.method2764();
			this.anIntArrayArray22[local20][1] = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	private void method2157() {
		@Pc(8) int local8 = this.anInt2550;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(59) int[] local59;
		@Pc(64) int[] local64;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray22.length - 1 > local28 && this.anIntArrayArray22[local28][0] <= local26; local28++) {
				}
				local59 = this.anIntArrayArray22[local28 - 1];
				local64 = this.anIntArrayArray22[local28];
				local73 = this.method2160(local28 - 2)[1];
				local77 = local59[1];
				local81 = local64[1];
				local90 = this.method2160(local28 + 1)[1];
				@Pc(108) int local108 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(124) int local124 = local77 + local90 - local73 - local81;
				@Pc(132) int local132 = local73 - local124 - local77;
				@Pc(137) int local137 = local81 - local73;
				@Pc(149) int local149 = (local108 * local124 >> 12) * local114 >> 12;
				@Pc(155) int local155 = local132 * local114 >> 12;
				@Pc(161) int local161 = local137 * local108 >> 12;
				@Pc(169) int local169 = local149 + local155 + local161 + local77;
				if (local169 <= -32768) {
					local169 = -32767;
				}
				if (local169 >= 32768) {
					local169 = 32767;
				}
				this.aShortArray46[local8] = (short) local169;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray22.length - 1 && local26 >= this.anIntArrayArray22[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray22[local28 - 1];
				local64 = this.anIntArrayArray22[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - Static279.anIntArray848[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local81 * local59[1] + local77 * local64[1] >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray46[local8] = (short) local90;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray22.length - 1 && this.anIntArrayArray22[local28][0] <= local26; local28++) {
				}
				local59 = this.anIntArrayArray22[local28 - 1];
				local64 = this.anIntArrayArray22[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - local73;
				local81 = local59[1] * local77 + local73 * local64[1] >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray46[local8] = (short) local81;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		if (this.anIntArrayArray22 == null) {
			this.anIntArrayArray22 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray22.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2550 == 2) {
			this.method2155();
		}
		Static14.method201();
		this.method2157();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(21) int[] local21 = this.method5634(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static201.anInt4174; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray46[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(II)[I")
	private int[] method2160(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray346;
		} else if (arg0 >= this.anIntArrayArray22.length) {
			return this.anIntArray345;
		} else {
			return this.anIntArrayArray22[arg0];
		}
	}
}
