import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ada", name = "V", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	@OriginalMember(owner = "client!ada", name = "N", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!ada", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ada", name = "Y", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ada", name = "K", descriptor = "[S")
	private final short[] aShortArray1 = new short[257];

	@OriginalMember(owner = "client!ada", name = "T", descriptor = "I")
	private int anInt113 = 0;

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray1[local6] = (char) (local6 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray1[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray1[local38] = (char) (local38 - 4);
		}
		aCharArray1[63] = '/';
		aCharArray1[62] = '+';
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "(B)V")
	private void method103() {
		@Pc(8) int local8 = this.anInt113;
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
				for (local28 = 1; local28 < this.anIntArrayArray1.length - 1 && local26 >= this.anIntArrayArray1[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray1[local28 - 1];
				local64 = this.anIntArrayArray1[local28];
				local73 = this.method105(local28 - 2)[1];
				local77 = local59[1];
				local81 = local64[1];
				local90 = this.method105(local28 + 1)[1];
				@Pc(108) int local108 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(125) int local125 = local90 + local77 - local73 - local81;
				@Pc(133) int local133 = local73 - local125 - local77;
				@Pc(137) int local137 = local81 - local73;
				@Pc(149) int local149 = local114 * (local125 * local108 >> 12) >> 12;
				@Pc(155) int local155 = local133 * local114 >> 12;
				@Pc(161) int local161 = local108 * local137 >> 12;
				@Pc(171) int local171 = local161 + local149 + local155 + local77;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray1[local8] = (short) local171;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray1.length - 1 && local26 >= this.anIntArrayArray1[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray1[local28 - 1];
				local64 = this.anIntArrayArray1[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - Static378.anIntArray381[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local64[1] * local77 + local81 * local59[1] >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray1[local8] = (short) local90;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray1.length - 1 > local28 && local26 >= this.anIntArrayArray1[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray1[local28 - 1];
				local64 = this.anIntArrayArray1[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - local73;
				local81 = local59[1] * local77 + local64[1] * local73 >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray1[local8] = (short) local81;
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "(I)V")
	private void method104() {
		@Pc(8) int[] local8 = this.anIntArrayArray1[0];
		@Pc(13) int[] local13 = this.anIntArrayArray1[1];
		@Pc(22) int[] local22 = this.anIntArrayArray1[this.anIntArrayArray1.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray1[this.anIntArrayArray1.length - 1];
		this.anIntArray6 = new int[] { local22[0] + local22[0] - local35[0], local22[1] - local35[1] - -local22[1] };
		this.anIntArray5 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + (local8[1] - local13[1]) };
	}

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "(II)[I")
	private int[] method105(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray5;
		} else if (this.anIntArrayArray1.length <= arg0) {
			return this.anIntArray6;
		} else {
			return this.anIntArrayArray1[arg0];
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt113 = arg0.method7816();
		this.anIntArrayArray1 = new int[arg0.method7816()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray1.length; local29++) {
			this.anIntArrayArray1[local29][0] = arg0.method7860();
			this.anIntArrayArray1[local29][1] = arg0.method7860();
		}
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		if (this.anIntArrayArray1 == null) {
			this.anIntArrayArray1 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray1.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt113 == 2) {
			this.method104();
		}
		Static47.method612();
		this.method103();
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(28) int[] local28 = this.method8945(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static195.anInt3759; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local18[local30] = this.aShortArray1[local38];
			}
		}
		return local18;
	}
}
