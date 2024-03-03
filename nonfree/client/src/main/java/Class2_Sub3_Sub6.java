import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class2_Sub3_Sub6 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
	public static int anInt1037 = 0;

	@OriginalMember(owner = "client!ch", name = "fb", descriptor = "[I")
	public static final int[] anIntArray85 = new int[32];

	@OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
	public static int anInt1047 = 0;

	@OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
	public static int anInt1045 = -2;

	@OriginalMember(owner = "client!ch", name = "gb", descriptor = "[Lclient!nt;")
	public static final Class2_Sub2_Sub13[] aClass2_Sub2_Sub13Array2 = new Class2_Sub2_Sub13[14];

	@OriginalMember(owner = "client!ch", name = "ib", descriptor = "[I")
	public static final int[] anIntArray86;

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ch", name = "jb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ch", name = "S", descriptor = "[B")
	private byte[] aByteArray12 = new byte[512];

	@OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
	public int anInt1044 = 0;

	@OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
	public int anInt1048 = 1638;

	@OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
	public int anInt1049 = 4;

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "Z")
	public boolean aBoolean85 = true;

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
	public int anInt1042 = 4;

	@OriginalMember(owner = "client!ch", name = "hb", descriptor = "I")
	public int anInt1050 = 4;

	static {
		new Class79("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
		anIntArray86 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 8)
	public Class2_Sub3_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)[I", line = 43)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			this.method1308(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V", line = 66)
	@Override
	public void method6481() {
		this.aByteArray12 = Static109.method2366(this.anInt1044);
		this.method1309();
		for (@Pc(23) int local23 = this.anInt1042 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray17[local23];
			if (local30 > 8 || local30 < -8) {
				return;
			}
			this.anInt1042--;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(IIIIIII)I", line = 109)
	private int method1307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (local13 >= arg1) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg5 & 0xFFF;
		@Pc(30) int local30 = arg0 - 4096;
		local13 &= 0xFF;
		@Pc(38) int local38 = local26 - 4096;
		@Pc(42) int local42 = Class187.anIntArray360[local26];
		@Pc(52) int local52 = this.aByteArray12[local17 + arg3] & 0x3;
		@Pc(69) int local69;
		if (local52 <= 1) {
			local69 = local52 == 0 ? local26 + arg0 : -local26 + arg0;
		} else {
			local69 = local52 == 2 ? local26 - arg0 : -arg0 + -local26;
		}
		local52 = this.aByteArray12[local13 + arg3] & 0x3;
		@Pc(116) int local116;
		if (local52 <= 1) {
			local116 = local52 == 0 ? arg0 + local38 : -local38 + arg0;
		} else {
			local116 = local52 == 2 ? local38 - arg0 : -arg0 + -local38;
		}
		@Pc(145) int local145 = local69 + (local42 * (local116 - local69) >> 12);
		local52 = this.aByteArray12[arg2 + local17] & 0x3;
		if (local52 > 1) {
			local69 = local52 == 2 ? local26 - local30 : -local30 + -local26;
		} else {
			local69 = local52 == 0 ? local26 + local30 : -local26 + local30;
		}
		local52 = this.aByteArray12[local13 + arg2] & 0x3;
		if (local52 > 1) {
			local116 = local52 == 2 ? local38 - local30 : -local38 + -local30;
		} else {
			local116 = local52 == 0 ? local30 + local38 : -local38 + local30;
		}
		@Pc(250) int local250 = (local42 * (local116 - local69) >> 12) + local69;
		return local145 + (arg4 * (local250 - local145) >> 12);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!bt;I)V", line = 185)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.aBoolean85 = arg1.method4816() == 1;
		} else if (arg0 == 1) {
			this.anInt1042 = arg1.method4816();
		} else if (arg0 == 2) {
			this.anInt1048 = arg1.method4824();
			if (this.anInt1048 < 0) {
				this.aShortArray17 = new short[this.anInt1042];
				for (@Pc(80) int local80 = 0; local80 < this.anInt1042; local80++) {
					this.aShortArray17[local80] = (short) arg1.method4824();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt1050 = this.anInt1049 = arg1.method4816();
			return;
		} else if (arg0 == 4) {
			this.anInt1044 = arg1.method4816();
			return;
		} else if (arg0 == 5) {
			this.anInt1050 = arg1.method4816();
			return;
		} else if (arg0 == 6) {
			this.anInt1049 = arg1.method4816();
			return;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([III)V", line = 310)
	public void method1308(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt1049 * Static16.anIntArray322[arg1];
		@Pc(116) int local116;
		@Pc(130) int local130;
		@Pc(46) int local46;
		@Pc(29) short local29;
		@Pc(107) int local107;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(53) int local53;
		@Pc(87) int local87;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(96) int local96;
		@Pc(105) int local105;
		if (this.anInt1042 == 1) {
			local46 = this.aShortArray18[0] << 12;
			local29 = this.aShortArray17[0];
			local59 = local46 * local12 >> 12;
			local53 = local46 * this.anInt1049 >> 12;
			local66 = this.anInt1050 * local46 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			@Pc(379) int local379 = local59 & 0xFFF;
			if (local74 >= local53) {
				local74 = 0;
			}
			local96 = this.aByteArray12[local70 & 0xFF] & 0xFF;
			local87 = Class187.anIntArray360[local379];
			local105 = this.aByteArray12[local74 & 0xFF] & 0xFF;
			if (this.aBoolean85) {
				for (local107 = 0; local107 < Static211.anInt4031; local107++) {
					local116 = this.anInt1050 * Static311.anIntArray424[local107];
					local130 = this.method1307(local379, local66, local105, local96, local87, local116 * local46 >> 12);
					@Pc(478) int local478 = local29 * local130 >> 12;
					arg0[local107] = (local478 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static211.anInt4031; local107++) {
					local116 = this.anInt1050 * Static311.anIntArray424[local107];
					local130 = this.method1307(local379, local66, local105, local96, local87, local46 * local116 >> 12);
					arg0[local107] = local130 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray17[0];
		if (local29 > 8 || local29 < -8) {
			local46 = this.aShortArray18[0] << 12;
			local53 = local46 * this.anInt1049 >> 12;
			local59 = local12 * local46 >> 12;
			local66 = this.anInt1050 * local46 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			if (local74 >= local53) {
				local74 = 0;
			}
			local59 &= 0xFFF;
			local87 = Class187.anIntArray360[local59];
			local96 = this.aByteArray12[local70 & 0xFF] & 0xFF;
			local105 = this.aByteArray12[local74 & 0xFF] & 0xFF;
			for (local107 = 0; local107 < Static211.anInt4031; local107++) {
				local116 = this.anInt1050 * Static311.anIntArray424[local107];
				local130 = this.method1307(local59, local66, local105, local96, local87, local46 * local116 >> 12);
				arg0[local107] = local130 * local29 >> 12;
			}
		}
		for (@Pc(148) int local148 = 1; local148 < this.anInt1042; local148++) {
			local29 = this.aShortArray17[local148];
			if (local29 > 8 || local29 < -8) {
				local46 = this.aShortArray18[local148] << 12;
				local59 = local12 * local46 >> 12;
				local66 = this.anInt1050 * local46 >> 12;
				local53 = local46 * this.anInt1049 >> 12;
				local70 = local59 >> 12;
				local74 = local70 + 1;
				if (local74 >= local53) {
					local74 = 0;
				}
				local59 &= 0xFFF;
				local87 = Class187.anIntArray360[local59];
				local96 = this.aByteArray12[local70 & 0xFF] & 0xFF;
				local105 = this.aByteArray12[local74 & 0xFF] & 0xFF;
				if (this.aBoolean85 && local148 == this.anInt1042 - 1) {
					for (local107 = 0; local107 < Static211.anInt4031; local107++) {
						local116 = this.anInt1050 * Static311.anIntArray424[local107];
						local130 = this.method1307(local59, local66, local105, local96, local87, local116 * local46 >> 12);
						local130 = arg0[local107] + (local29 * local130 >> 12);
						arg0[local107] = (local130 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static211.anInt4031; local107++) {
						local116 = Static311.anIntArray424[local107] * this.anInt1050;
						local130 = this.method1307(local59, local66, local105, local96, local87, local116 * local46 >> 12);
						arg0[local107] += local130 * local29 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V", line = 493)
	private void method1309() {
		@Pc(31) int local31;
		if (this.anInt1048 > 0) {
			this.aShortArray18 = new short[this.anInt1042];
			this.aShortArray17 = new short[this.anInt1042];
			for (local31 = 0; local31 < this.anInt1042; local31++) {
				this.aShortArray17[local31] = (short) (Math.pow((double) ((float) this.anInt1048 / 4096.0F), (double) local31) * 4096.0D);
				this.aShortArray18[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		} else if (this.aShortArray17 != null && this.aShortArray17.length == this.anInt1042) {
			this.aShortArray18 = new short[this.anInt1042];
			for (local31 = 0; local31 < this.anInt1042; local31++) {
				this.aShortArray18[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		}
	}
}
