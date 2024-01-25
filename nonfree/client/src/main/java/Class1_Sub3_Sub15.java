import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
	private int anInt3153 = 0;

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "[S")
	private final short[] aShortArray47 = new short[257];

	static {
		new Class114("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		if (this.anIntArrayArray29 == null) {
			this.anIntArrayArray29 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray29.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3153 == 2) {
			this.method2881();
		}
		Static401.method6051();
		this.method2883();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3153 = arg0.method3043();
		this.anIntArrayArray29 = new int[arg0.method3043()][2];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray29.length; local27++) {
			this.anIntArrayArray29[local27][0] = arg0.method3056();
			this.anIntArrayArray29[local27][1] = arg0.method3056();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	private void method2881() {
		@Pc(8) int[] local8 = this.anIntArrayArray29[0];
		@Pc(13) int[] local13 = this.anIntArrayArray29[1];
		@Pc(22) int[] local22 = this.anIntArrayArray29[this.anIntArrayArray29.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray29[this.anIntArrayArray29.length - 1];
		this.anIntArray256 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
		this.anIntArray255 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + -local31[1] + local22[1] };
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
	private void method2883() {
		@Pc(4) int local4 = this.anInt3153;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray29.length - 1 > local26 && local24 >= this.anIntArrayArray29[local26][0]; local26++) {
				}
				local61 = this.anIntArrayArray29[local26 - 1];
				local66 = this.anIntArrayArray29[local26];
				local75 = this.method2884(local26 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method2884(local26 + 1)[1];
				@Pc(109) int local109 = (local24 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(125) int local125 = local79 + local92 - local75 - local83;
				@Pc(132) int local132 = local75 - local79 - local125;
				@Pc(137) int local137 = local83 - local75;
				@Pc(149) int local149 = (local109 * local125 >> 12) * local115 >> 12;
				@Pc(155) int local155 = local115 * local132 >> 12;
				@Pc(161) int local161 = local109 * local137 >> 12;
				@Pc(172) int local172 = local149 + local155 + local161 + local79;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray47[local4] = (short) local172;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray29.length - 1 > local26 && this.anIntArrayArray29[local26][0] <= local24; local26++) {
				}
				local61 = this.anIntArrayArray29[local26 - 1];
				local66 = this.anIntArrayArray29[local26];
				local75 = (local24 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static82.anIntArray177[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local83 * local61[1] + local79 * local66[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray47[local4] = (short) local92;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray29.length - 1 > local26 && local24 >= this.anIntArrayArray29[local26][0]; local26++) {
				}
				local61 = this.anIntArrayArray29[local26 - 1];
				local66 = this.anIntArrayArray29[local26];
				local75 = (local24 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local66[1] * local75 + local61[1] * local79 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray47[local4] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(26) int[] local26 = this.method7911(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static236.anInt4609; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray47[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)[I")
	private int[] method2884(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray256;
		} else if (this.anIntArrayArray29.length <= arg0) {
			return this.anIntArray255;
		} else {
			return this.anIntArrayArray29[arg0];
		}
	}
}
