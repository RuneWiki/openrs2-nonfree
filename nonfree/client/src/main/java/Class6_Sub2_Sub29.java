import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class6_Sub2_Sub29 extends Class6_Sub2 {

	@OriginalMember(owner = "client!oj", name = "Y", descriptor = "[Lclient!ba;")
	private static final Class20[] aClass20Array1 = new Class20[32];

	@OriginalMember(owner = "client!oj", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!oj", name = "J", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!oj", name = "P", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
	private int anInt4860 = 0;

	@OriginalMember(owner = "client!oj", name = "N", descriptor = "[S")
	private final short[] aShortArray66 = new short[257];

	static {
		@Pc(67) Class20[] local67 = Static330.method3988();
		for (@Pc(69) int local69 = 0; local69 < local67.length; local69++) {
			aClass20Array1[local67[local69].anInt414] = local67[local69];
		}
		new Class231("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)[I")
	private int[] method4308(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray437;
		} else if (arg0 >= this.anIntArrayArray42.length) {
			return this.anIntArray436;
		} else {
			return this.anIntArrayArray42[arg0];
		}
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		if (this.anIntArrayArray42 == null) {
			this.anIntArrayArray42 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray42.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4860 == 2) {
			this.method4311();
		}
		Static172.method2738();
		this.method4313();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt4860 = arg0.method3111();
		this.anIntArrayArray42 = new int[arg0.method3111()][2];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArrayArray42.length; local18++) {
			this.anIntArrayArray42[local18][0] = arg0.method3108();
			this.anIntArrayArray42[local18][1] = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(26) int[] local26 = this.method5858(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static185.anInt4925; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local11[local28] = this.aShortArray66[local36];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V")
	private void method4311() {
		@Pc(16) int[] local16 = this.anIntArrayArray42[0];
		@Pc(21) int[] local21 = this.anIntArrayArray42[1];
		@Pc(30) int[] local30 = this.anIntArrayArray42[this.anIntArrayArray42.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray42[this.anIntArrayArray42.length - 1];
		this.anIntArray436 = new int[] { local30[0] + local30[0] - local39[0], -local39[1] + local30[1] + local30[1] };
		this.anIntArray437 = new int[] { local16[0] + local16[0] - local21[0], local16[1] - -local16[1] + -local21[1] };
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
	private void method4313() {
		@Pc(8) int local8 = this.anInt4860;
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
				for (local30 = 1; this.anIntArrayArray42.length - 1 > local30 && local28 >= this.anIntArrayArray42[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray42[local30 - 1];
				local66 = this.anIntArrayArray42[local30];
				local75 = this.method4308(local30 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method4308(local30 + 1)[1];
				@Pc(109) int local109 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(125) int local125 = local79 + local92 - local83 - local75;
				@Pc(132) int local132 = local75 - local79 - local125;
				@Pc(137) int local137 = local83 - local75;
				@Pc(149) int local149 = local115 * (local125 * local109 >> 12) >> 12;
				@Pc(155) int local155 = local115 * local132 >> 12;
				@Pc(161) int local161 = local137 * local109 >> 12;
				@Pc(170) int local170 = local155 + local149 + local161 + local79;
				if (local170 <= -32768) {
					local170 = -32767;
				}
				if (local170 >= 32768) {
					local170 = 32767;
				}
				this.aShortArray66[local8] = (short) local170;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray42.length - 1 && this.anIntArrayArray42[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray42[local30 - 1];
				local66 = this.anIntArrayArray42[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static37.anIntArray640[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local83 * local61[1] + local79 * local66[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray66[local8] = (short) local92;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray42.length - 1 && local28 >= this.anIntArrayArray42[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray42[local30 - 1];
				local66 = this.anIntArrayArray42[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local75 * local66[1] + local61[1] * local79 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray66[local8] = (short) local83;
			}
		}
	}
}
