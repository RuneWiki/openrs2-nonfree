import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class1_Sub4_Sub10 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
	private int anInt1574 = 0;

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "[S")
	private final short[] aShortArray34 = new short[257];

	static {
		new Class119("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		if (this.anIntArrayArray23 == null) {
			this.anIntArrayArray23 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray23.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1574 == 2) {
			this.method1383();
		}
		Static431.method5702();
		this.method1379();
	}

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "(I)V")
	private void method1379() {
		@Pc(4) int local4 = this.anInt1574;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(94) int local94;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray23.length - 1 > local26 && local24 >= this.anIntArrayArray23[local26][0]; local26++) {
				}
				local61 = this.anIntArrayArray23[local26 - 1];
				local66 = this.anIntArrayArray23[local26];
				local75 = this.method1381(local26 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local94 = this.method1381(local26 + 1)[1];
				@Pc(111) int local111 = (local24 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(117) int local117 = local111 * local111 >> 12;
				@Pc(127) int local127 = local79 + local94 - local75 - local83;
				@Pc(133) int local133 = local75 - local79 - local127;
				@Pc(138) int local138 = local83 - local75;
				@Pc(150) int local150 = local117 * (local111 * local127 >> 12) >> 12;
				@Pc(156) int local156 = local117 * local133 >> 12;
				@Pc(162) int local162 = local111 * local138 >> 12;
				@Pc(172) int local172 = local79 + local150 + local156 + local162;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray34[local4] = (short) local172;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray23.length - 1 && local24 >= this.anIntArrayArray23[local26][0]; local26++) {
				}
				local61 = this.anIntArrayArray23[local26 - 1];
				local66 = this.anIntArrayArray23[local26];
				local75 = (local24 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static98.anIntArray123[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local94 = local79 * local66[1] + local83 * local61[1] >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray34[local4] = (short) local94;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray23.length - 1 > local26 && local24 >= this.anIntArrayArray23[local26][0]; local26++) {
				}
				local61 = this.anIntArrayArray23[local26 - 1];
				local66 = this.anIntArrayArray23[local26];
				local75 = (local24 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local66[1] * local75 + local61[1] * local79 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray34[local4] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)[I")
	private int[] method1381(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray114;
		} else if (arg0 >= this.anIntArrayArray23.length) {
			return this.anIntArray115;
		} else {
			return this.anIntArrayArray23[arg0];
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt1574 = arg0.method5337();
		this.anIntArrayArray23 = new int[arg0.method5337()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray23.length; local29++) {
			this.anIntArrayArray23[local29][0] = arg0.method5335();
			this.anIntArrayArray23[local29][1] = arg0.method5335();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	private void method1383() {
		@Pc(8) int[] local8 = this.anIntArrayArray23[0];
		@Pc(13) int[] local13 = this.anIntArrayArray23[1];
		@Pc(22) int[] local22 = this.anIntArrayArray23[this.anIntArrayArray23.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray23[this.anIntArrayArray23.length - 1];
		this.anIntArray115 = new int[] { local22[0] + local22[0] - local39[0], -local39[1] - (-local22[1] - local22[1]) };
		this.anIntArray114 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] + local8[1] + local8[1] };
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(27) int[] local27 = this.method5695(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static395.anInt6592; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray34[local37];
			}
		}
		return local17;
	}
}
