import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class5_Sub6_Sub1 extends Class5_Sub6 {

	@OriginalMember(owner = "client!am", name = "D", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	@OriginalMember(owner = "client!am", name = "C", descriptor = "I")
	private int anInt326 = 0;

	@OriginalMember(owner = "client!am", name = "F", descriptor = "I")
	private int anInt328 = 4096;

	@OriginalMember(owner = "client!am", name = "A", descriptor = "I")
	private int anInt324 = 12288;

	@OriginalMember(owner = "client!am", name = "E", descriptor = "I")
	private int anInt327 = 2048;

	@OriginalMember(owner = "client!am", name = "I", descriptor = "I")
	private int anInt331 = 8192;

	@OriginalMember(owner = "client!am", name = "J", descriptor = "I")
	private int anInt332 = 0;

	@OriginalMember(owner = "client!am", name = "M", descriptor = "I")
	private int anInt335 = 2048;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray1[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray1[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray1[local38] = (char) (local38 - 4);
		}
		aCharArray1[62] = '*';
		aCharArray1[63] = '-';
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		Static648.method8531();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)Z")
	private boolean method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = (arg0 - arg1) * this.anInt324 >> 12;
		@Pc(28) int local28 = Static24.anIntArray30[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt324;
		@Pc(42) int local42 = (local35 << 12) / this.anInt331;
		@Pc(49) int local49 = this.anInt328 * local42 >> 12;
		return arg1 + arg0 < local49 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(27) int local27 = Static508.anIntArray471[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static421.anInt7443; local29++) {
				@Pc(37) int local37 = Static207.anIntArray185[local29] - 2048;
				@Pc(42) int local42 = local37 + this.anInt335;
				@Pc(53) int local53 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(64) int local64 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(69) int local69 = this.anInt332 + local27;
				@Pc(78) int local78 = local69 >= -2048 ? local69 : local69 + 4096;
				@Pc(87) int local87 = local78 > 2048 ? local78 - 4096 : local78;
				@Pc(92) int local92 = this.anInt326 + local37;
				@Pc(103) int local103 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(112) int local112 = local103 > 2048 ? local103 - 4096 : local103;
				@Pc(117) int local117 = this.anInt327 + local27;
				@Pc(128) int local128 = local117 < -2048 ? local117 + 4096 : local117;
				@Pc(139) int local139 = local128 > 2048 ? local128 - 4096 : local128;
				local17[local29] = this.method329(local87, local64) || this.method330(local139, local112) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt335 = arg0.method3698();
		} else if (arg1 == 1) {
			this.anInt332 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anInt326 = arg0.method3698();
		} else if (arg1 == 3) {
			this.anInt327 = arg0.method3698();
		} else if (arg1 == 4) {
			this.anInt324 = arg0.method3698();
		} else if (arg1 == 5) {
			this.anInt328 = arg0.method3698();
		} else if (arg1 == 6) {
			this.anInt331 = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(III)Z")
	private boolean method330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = this.anInt324 * (arg1 + arg0) >> 12;
		@Pc(32) int local32 = Static24.anIntArray30[local22 * 255 >> 12 & 0xFF];
		@Pc(39) int local39 = (local32 << 12) / this.anInt324;
		@Pc(46) int local46 = (local39 << 12) / this.anInt331;
		@Pc(53) int local53 = local46 * this.anInt328 >> 12;
		return arg0 - arg1 < local53 && arg0 - arg1 > -local53;
	}
}
