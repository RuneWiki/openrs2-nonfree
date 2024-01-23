import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class8 {

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!sc;")
	private Class2_Sub8_Sub1_Sub1 aClass2_Sub8_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	public int anInt125;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
	private int anInt128;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
	private int anInt132;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
	private int anInt126 = -1;

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
	private int anInt135 = -1;

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Z")
	private boolean aBoolean12 = true;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
	private int anInt131;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
	private int anInt136;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
	private int anInt123;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
	private int anInt124;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	private int anInt130;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt131 = arg2;
		this.anInt136 = arg3;
		this.anInt122 = arg4;
		this.aBoolean11 = arg7;
		this.anInt129 = arg1;
		this.anInt123 = arg6;
		this.anInt124 = arg5;
		this.anInt130 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
	private void method123() {
		@Pc(2) int local2 = this.anInt133;
		@Pc(5) int local5 = this.anInt133;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static77.anInt1897 - local2;
		if (local5 > Static77.anInt1893) {
			local5 -= local5 - Static77.anInt1893;
		}
		@Pc(37) int local37;
		if (Static77.anInt1898 > 0) {
			local37 = Static77.anInt1898;
			local5 -= local37;
			local19 = local37 * Static77.anInt1897;
			local17 = local13 * local37;
		}
		if (local2 > Static77.anInt1896) {
			local37 = local2 - Static77.anInt1896;
			local2 -= local37;
			local23 += local37;
		}
		if (Static77.anInt1894 > 0) {
			local37 = Static77.anInt1894;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method127(Static77.anIntArray163, this.anInt123, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "()V")
	private void method126() {
		if (this.anInt135 != -1) {
			Static124.method2212(this.anInt135, 0, this.anInt126);
		}
		this.aBoolean12 = true;
		this.anInt135 = -1;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method127(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static8.aByteArray2[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
				} else {
					arg0[arg4] |= 0xFF000000;
				}
				arg4++;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ah;)V")
	private void method128(@OriginalArg(0) Class8 arg0) {
		Static8.method133();
		Static8.method135();
		this.aClass2_Sub8_Sub1_Sub1_1 = new Class2_Sub8_Sub1_Sub1_Sub1(this.anInt133, this.anInt133);
		Static77.method1452(Static8.anIntArray19);
		this.aClass2_Sub8_Sub1_Sub1_1.method2787();
		Static1.method17();
		Static77.method1447(0, 0, this.anInt133, this.anInt133, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean11) {
				local26 = -arg0.anInt131;
				local28 = -arg0.anInt136;
				local30 = -arg0.anInt122;
			} else {
				local26 = this.anInt131 - arg0.anInt131;
				local28 = this.anInt136 - arg0.anInt136;
				local30 = this.anInt122 - arg0.anInt122;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt132 != 0) {
			local74 = Class1.anIntArray4[this.anInt132];
			local79 = Class1.anIntArray3[this.anInt132];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt128 != 0) {
			local74 = this.anInt128 - 1024 & 0x7FF;
			local79 = Class1.anIntArray4[local74];
			local91 = Class1.anIntArray3[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static323.method3552(Static8.aClass15_Sub7_1.aShortArray77, 0, Static8.aClass15_Sub7_1.anInt5225, (short) Static1.anInterface3_1.method4132(this.anInt129));
		@Pc(172) Class15_Sub5_Sub1 local172 = Static8.aClass15_Sub7_1.method4216(64, 512, -local26, -local28, -local30);
		local79 = local172.method2343() - local172.method2359();
		local91 = local172.method2331() - local172.method4274();
		if (local79 > local91) {
			local135 = this.anInt123 == 0 ? (local79 << 9) / this.anInt133 : (local79 * 16 << 9) / (this.anInt133 * 13);
			local172.method2259(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt123 == 0 ? (local91 << 9) / this.anInt133 : (local91 * 16 << 9) / (this.anInt133 * 13);
			local172.method2259(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt123 == 0) {
			for (local135 = 0; local135 < Static77.anIntArray163.length; local135++) {
				if (Static77.anIntArray163[local135] != 0) {
					Static77.anIntArray163[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method140();
			this.method123();
		}
		Static179.aClass3_1.method4441();
		Static77.method1440(Static8.anIntArray19);
		Static1.method17();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIILclient!ah;)V")
	public void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8 arg6) {
		@Pc(6) int local6 = this.anInt132 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt128 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt134) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt134) / 2;
		if (local42 < arg3 && local42 + this.anInt134 > 0 && local51 < arg2 && local51 + this.anInt134 > 0 && this.method141(arg6)) {
			this.aClass2_Sub8_Sub1_Sub1_1.method4365(local51 + arg0, local42 + arg1, this.anInt134, this.anInt134);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method132(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static8.aByteArray2[(arg2 >> 16) + local12] & 0xFF) + 64;
					if (local37 > 255) {
						local37 = 255;
					}
					@Pc(46) int local46 = 256 - local37;
					arg0[arg4] = ((arg1 & 0xFF00FF) * local46 + (local25 & 0xFF00FF) * local37 & -16711936) + ((arg1 & 0xFF00) * local46 + (local25 & 0xFF00) * local37 & 0xFF0000) >> 8 | 0xFF000000;
				}
				arg4++;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!ah", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method126();
		super.finalize();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)Z")
	public boolean method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean11) {
			this.anInt125 = 1073741823;
			local7 = this.anInt131;
			local12 = this.anInt136;
			local17 = this.anInt122;
		} else {
			local7 = this.anInt131 - arg0;
			local12 = this.anInt136 - arg1;
			local17 = this.anInt122 - arg2;
			this.anInt125 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt125 == 0) {
				this.anInt125 = 1;
			}
			local7 = (local7 << 8) / this.anInt125;
			local12 = (local12 << 8) / this.anInt125;
			local17 = (local17 << 8) / this.anInt125;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt134 = this.anInt124 * arg3 / (this.aBoolean11 ? 1024 : this.anInt125);
		} else {
			this.anInt134 = 0;
		}
		if (this.anInt134 < 8) {
			this.method126();
			this.aClass2_Sub8_Sub1_Sub1_1 = null;
			return false;
		}
		@Pc(145) int local145 = Static295.method4523(this.anInt134);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt133) {
			this.anInt133 = local145;
		}
		this.anInt132 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt128 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean12 = true;
		this.aClass2_Sub8_Sub1_Sub1_1 = null;
		return true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII)V")
	public void method136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt132 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt128 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt134) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt134) / 2;
		if (local42 >= arg3 || local42 + this.anInt134 <= 0 || local51 >= arg2 || local51 + this.anInt134 <= 0) {
			return;
		}
		if (this.anInt130 == 0) {
			Static1.anInterface3_1.method4133(this.anInt129, this.anInt133);
		} else if (this.anInt135 == -1) {
			return;
		} else {
			Static116.method1945(this.anInt135);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt134;
		@Pc(105) int local105 = local27 + this.anInt134;
		@Pc(107) GL local107 = Static116.aGL1;
		local107.glBegin(7);
		local107.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local107.glTexCoord2f(0.0F, 0.0F);
		local107.glVertex2i(local33, local27);
		local107.glTexCoord2f(0.0F, 1.0F);
		local107.glVertex2i(local33, local105);
		local107.glTexCoord2f(1.0F, 1.0F);
		local107.glVertex2i(local100, local105);
		local107.glTexCoord2f(1.0F, 0.0F);
		local107.glVertex2i(local100, local27);
		local107.glEnd();
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lclient!ah;)V")
	private void method137(@OriginalArg(0) Class8 arg0) {
		@Pc(5) Class15_Sub7 local5 = Static267.method4203(Static289.aClass42_104, this.anInt129);
		if (local5 == null) {
			return;
		}
		this.aClass2_Sub8_Sub1_Sub1_1 = new Class2_Sub8_Sub1_Sub1(this.anInt133, this.anInt133);
		Static77.method1452(Static8.anIntArray19);
		this.aClass2_Sub8_Sub1_Sub1_1.method2787();
		Static1.method17();
		Static77.method1447(0, 0, this.anInt133, this.anInt133, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean11) {
				local33 = -arg0.anInt131;
				local35 = -arg0.anInt136;
				local37 = -arg0.anInt122;
			} else {
				local33 = this.anInt131 - arg0.anInt131;
				local35 = this.anInt136 - arg0.anInt136;
				local37 = this.anInt122 - arg0.anInt122;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt132 != 0) {
			local81 = Class1.anIntArray4[this.anInt132];
			local86 = Class1.anIntArray3[this.anInt132];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt128 != 0) {
			local81 = this.anInt128 - 1024 & 0x7FF;
			local86 = Class1.anIntArray4[local81];
			local98 = Class1.anIntArray3[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class15_Sub5_Sub1 local167 = local5.method4216(64, 768, -local33, -local35, -local37);
		local86 = local167.method2343() - local167.method2359();
		local98 = local167.method2331() - local167.method4274();
		local142 = local167.method2359() + local86 / 2;
		@Pc(193) int local193 = local167.method4274() + local98 / 2;
		if (local86 > local98) {
			local167.method2259(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt133);
		} else {
			local167.method2259(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt133);
		}
		Static179.aClass3_1.method4441();
		Static77.method1440(Static8.anIntArray19);
		Static1.method17();
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(Lclient!ah;)Z")
	private boolean method138(@OriginalArg(0) Class8 arg0) {
		@Pc(5) Class15_Sub7 local5 = Static267.method4203(Static289.aClass42_104, this.anInt129);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static116.aGL1;
		Static111.method1889(Static8.anIntArray19);
		Static111.method1884();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean11) {
				local25 = -arg0.anInt131;
				local27 = -arg0.anInt136;
				local29 = -arg0.anInt122;
			} else {
				local25 = this.anInt131 - arg0.anInt131;
				local27 = this.anInt136 - arg0.anInt136;
				local29 = this.anInt122 - arg0.anInt122;
			}
		}
		local5.method4219();
		@Pc(78) Class15_Sub5 local78 = local5.method4225(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method2343() - local78.method2359()) / 2;
		@Pc(94) int local94 = (local78.method2331() - local78.method4274()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static240.method3840((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt133, this.anInt133);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt132 != 0) {
			local126 = Class1.anIntArray4[this.anInt132];
			local131 = Class1.anIntArray3[this.anInt132];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt128 != 0) {
			local126 = this.anInt128 - 1024 & 0x7FF;
			local131 = Class1.anIntArray4[local126];
			local143 = Class1.anIntArray3[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static235.method3802((float) -local25, (float) local27, (float) -local29);
		Static235.method3809(16777215, 0.5F, 0.5F, 0.5F);
		Static235.method3810();
		Static116.method1958();
		Static116.method1963(true);
		Static116.method1974(true);
		local78.method2332(0, 0, 0, -local86 - local78.method2359(), -local94 - local78.method4274(), 0, -1L);
		Static116.method1974(false);
		Static116.method1963(false);
		Static116.method1947();
		Static240.method3844();
		Static116.method1945(this.anInt135);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt133, this.anInt133, 0);
		Static111.method1885(Static8.anIntArray19);
		return true;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(Lclient!ah;)V")
	private void method139(@OriginalArg(0) Class8 arg0) {
		Static8.method125();
		Static8.method124();
		@Pc(3) GL local3 = Static116.aGL1;
		Static111.method1889(Static8.anIntArray19);
		Static111.method1884();
		local3.glClearColor((float) (this.anInt123 >> 16 & 0xFF) / 255.0F, (float) (this.anInt123 >> 8 & 0xFF) / 255.0F, (float) (this.anInt123 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean11) {
				local39 = -arg0.anInt131;
				local41 = -arg0.anInt136;
				local43 = -arg0.anInt122;
			} else {
				local39 = this.anInt131 - arg0.anInt131;
				local41 = this.anInt136 - arg0.anInt136;
				local43 = this.anInt122 - arg0.anInt122;
			}
		}
		Static240.method3845(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt133, this.anInt133);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt132 != 0) {
			local96 = Class1.anIntArray4[this.anInt132];
			local101 = Class1.anIntArray3[this.anInt132];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt128 != 0) {
			local96 = this.anInt128 - 1024 & 0x7FF;
			local101 = Class1.anIntArray4[local96];
			local113 = Class1.anIntArray3[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static235.method3802((float) -local39, (float) -local41, (float) local43);
		Static235.method3809(16777215, 0.5F, 0.5F, 1.0F);
		Static235.method3810();
		if (this.anInt123 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static1.anInterface3_1.method4133(this.anInt129, this.anInt133);
		Static116.method1974(true);
		if (Static116.aBoolean186) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static8.aByteBuffer1.position(0));
		local3.glVertexPointer(2, 5126, 20, Static8.aByteBuffer1.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static8.aByteBuffer1.position(12));
		local3.glDrawElements(5, Static8.aByteBuffer2.limit() / 2, 5123, Static8.aByteBuffer2.position(0));
		local3.glEnableClientState(32886);
		Static116.method1974(false);
		if (this.anInt123 != 0) {
			Static118.method1991(0, 0);
			Static116.method1977(1);
			Static116.method1976(0);
			Static116.method1945(Static8.anInt127);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt123 >> 16), (byte) (this.anInt123 >> 8), (byte) this.anInt123, (byte) 127);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(-1, -1);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, -1);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(-1, 1);
			local3.glEnd();
			local3.glTexEnvi(8960, 34200, 770);
			local3.glLoadIdentity();
			local3.glColorMask(true, true, true, true);
			local3.glBlendFunc(773, 772);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt123 >> 16), (byte) (this.anInt123 >> 8), (byte) this.anInt123, (byte) -1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(-1, -1);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, -1);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(-1, 1);
			local3.glEnd();
			local3.glBlendFunc(770, 771);
			local3.glTexEnvi(8960, 34176, 5890);
		}
		Static240.method3844();
		Static116.method1945(this.anInt135);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt133, this.anInt133, 0);
		Static111.method1885(Static8.anIntArray19);
	}

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "()V")
	private void method140() {
		@Pc(6) int local6 = this.anInt133 * 3 / 32;
		@Pc(15) int local15 = this.anInt133 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static77.anInt1897;
		@Pc(35) int local35 = Static77.anInt1897 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static77.anInt1893) {
			local17 = local15 + Static77.anInt1893 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static77.anInt1898) {
			local59 = Static77.anInt1898 - local6;
			local17 -= local59;
			local31 += local59 * Static77.anInt1897;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static77.anInt1896) {
			local59 = local6 + local15 - Static77.anInt1896;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static77.anInt1894) {
			local59 = Static77.anInt1894 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method132(Static77.anIntArray163, this.anInt123, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(Lclient!ah;)Z")
	private boolean method141(@OriginalArg(0) Class8 arg0) {
		if (this.aClass2_Sub8_Sub1_Sub1_1 == null) {
			if (this.anInt130 == 0) {
				this.aClass2_Sub8_Sub1_Sub1_1 = Static1.anInterface3_1.method4139(this.anInt133, this.anInt129, Static1.aFloat1, true);
			} else if (this.anInt130 == 2) {
				this.method137(arg0);
			} else if (this.anInt130 == 1) {
				this.method128(arg0);
			}
		}
		return this.aClass2_Sub8_Sub1_Sub1_1 != null;
	}

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "(Lclient!ah;)V")
	public void method142(@OriginalArg(0) Class8 arg0) {
		if (this.anInt130 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt135 == -1 || this.anInt126 != Static124.anInt2871;
		if (!this.aBoolean12 && !local14) {
			return;
		}
		if (local14) {
			this.anInt126 = Static124.anInt2871;
			this.anInt135 = Static298.method4551(Static298.anInt5771, this.anInt133, this.anInt133);
		} else {
			Static116.method1945(this.anInt135);
			Static298.method4550(Static298.anInt5771, this.anInt133, this.anInt133);
		}
		if (this.anInt130 == 1) {
			this.method139(arg0);
			this.aBoolean12 = false;
		} else if (this.anInt130 == 2) {
			this.aBoolean12 = !this.method138(arg0);
		}
	}
}
