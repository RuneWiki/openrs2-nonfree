import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class3_Sub8_Sub27 extends Class3_Sub8 {

	@OriginalMember(owner = "client!qk", name = "H", descriptor = "[I")
	private int[] anIntArray421;

	@OriginalMember(owner = "client!qk", name = "S", descriptor = "[I")
	private int[] anIntArray423;

	@OriginalMember(owner = "client!qk", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!qk", name = "I", descriptor = "[S")
	private final short[] aShortArray102 = new short[257];

	@OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
	private int anInt7855 = 0;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V")
	private void method6506() {
		@Pc(8) int[] local8 = this.anIntArrayArray46[0];
		@Pc(13) int[] local13 = this.anIntArrayArray46[1];
		@Pc(22) int[] local22 = this.anIntArrayArray46[this.anIntArrayArray46.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray46[this.anIntArrayArray46.length - 1];
		this.anIntArray421 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
		this.anIntArray423 = new int[] { local22[0] + local22[0] - local36[0], local22[1] + -local36[1] + local22[1] };
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		if (this.anIntArrayArray46 == null) {
			this.anIntArrayArray46 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray46.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt7855 == 2) {
			this.method6506();
		}
		Static427.method5897();
		this.method6511();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I")
	private int[] method6509(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray421;
		} else if (arg0 >= this.anIntArrayArray46.length) {
			return this.anIntArray423;
		} else {
			return this.anIntArrayArray46[arg0];
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt7855 = arg1.method7954();
		this.anIntArrayArray46 = new int[arg1.method7954()][2];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray46.length; local27++) {
			this.anIntArrayArray46[local27][0] = arg1.method7951();
			this.anIntArrayArray46[local27][1] = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(21) int[] local21 = this.method8776(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static91.anInt1849; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray102[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "(I)V")
	private void method6511() {
		@Pc(10) int local10 = this.anInt7855;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(65) int[] local65;
		@Pc(70) int[] local70;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(96) int local96;
		if (local10 == 2) {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray46.length - 1 && local28 >= this.anIntArrayArray46[local30][0]; local30++) {
				}
				local65 = this.anIntArrayArray46[local30 - 1];
				local70 = this.anIntArrayArray46[local30];
				local79 = this.method6509(local30 - 2)[1];
				local83 = local65[1];
				local87 = local70[1];
				local96 = this.method6509(local30 + 1)[1];
				@Pc(114) int local114 = (local28 - local65[0] << 12) / (local70[0] - local65[0]);
				@Pc(120) int local120 = local114 * local114 >> 12;
				@Pc(131) int local131 = local96 + local83 - local79 - local87;
				@Pc(139) int local139 = local79 - local131 - local83;
				@Pc(144) int local144 = local87 - local79;
				@Pc(156) int local156 = (local114 * local131 >> 12) * local120 >> 12;
				@Pc(162) int local162 = local120 * local139 >> 12;
				@Pc(168) int local168 = local114 * local144 >> 12;
				@Pc(178) int local178 = local156 + local162 + local168 + local83;
				if (local178 <= -32768) {
					local178 = -32767;
				}
				if (local178 >= 32768) {
					local178 = 32767;
				}
				this.aShortArray102[local10] = (short) local178;
			}
		} else if (local10 == 1) {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray46.length - 1 && local28 >= this.anIntArrayArray46[local30][0]; local30++) {
				}
				local65 = this.anIntArrayArray46[local30 - 1];
				local70 = this.anIntArrayArray46[local30];
				local79 = (local28 - local65[0] << 12) / (local70[0] - local65[0]);
				local83 = 4096 - Static217.anIntArray548[local79 >> 5 & 0xFF] >> 1;
				local87 = 4096 - local83;
				local96 = local83 * local70[1] + local87 * local65[1] >> 12;
				if (local96 <= -32768) {
					local96 = -32767;
				}
				if (local96 >= 32768) {
					local96 = 32767;
				}
				this.aShortArray102[local10] = (short) local96;
			}
		} else {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; this.anIntArrayArray46.length - 1 > local30 && this.anIntArrayArray46[local30][0] <= local28; local30++) {
				}
				local65 = this.anIntArrayArray46[local30 - 1];
				local70 = this.anIntArrayArray46[local30];
				local79 = (local28 - local65[0] << 12) / (local70[0] - local65[0]);
				local83 = 4096 - local79;
				local87 = local79 * local70[1] + local65[1] * local83 >> 12;
				if (local87 <= -32768) {
					local87 = -32767;
				}
				if (local87 >= 32768) {
					local87 = 32767;
				}
				this.aShortArray102[local10] = (short) local87;
			}
		}
	}
}
