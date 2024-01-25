import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class57 {

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	private int anInt1565;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
	private int anInt1568;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	private int anInt1569;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	public int anInt1570;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
	private int anInt1573;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "Lclient!fd;")
	private Class103 aClass103_7;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	private final int anInt1572;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
	private final int anInt1567;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	private final int anInt1564;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "Z")
	private final boolean aBoolean115;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
	private final int anInt1566;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
	private final int anInt1575;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
	private final int anInt1571;

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
	private final int anInt1574;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt1572 = arg2;
		this.anInt1567 = arg3;
		this.anInt1564 = arg4;
		this.aBoolean115 = arg7;
		this.anInt1566 = arg1;
		this.anInt1575 = arg6;
		this.anInt1571 = arg5;
		this.anInt1574 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!ha;Lclient!cm;)Z")
	private boolean method1328(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class57 arg1) {
		if (this.aClass103_7 == null) {
			if (this.anInt1574 == 0) {
				if (Static549.anInterface5_11.method4130(this.anInt1566)) {
					@Pc(23) int[] local23 = Static549.anInterface5_11.method4131(this.anInt1573, this.anInt1573, this.anInt1566, 0.7F);
					this.aClass103_7 = arg0.method6112(this.anInt1573, local23, this.anInt1573, this.anInt1573);
				}
			} else if (this.anInt1574 == 2) {
				this.method1330(arg0, arg1);
			} else if (this.anInt1574 == 1) {
				this.method1337(arg0, arg1);
			}
		}
		return this.aClass103_7 != null;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Lclient!ha;Lclient!cm;)V")
	private void method1330(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(6) Class359 local6 = Static11.method201(Static82.aClass343_46, this.anInt1566);
		if (local6 == null) {
			return;
		}
		arg0.K(Static77.anIntArray108);
		arg0.KA(0, 0, this.anInt1573, this.anInt1573);
		arg0.aa(0, 0, this.anInt1573, this.anInt1573, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean115) {
				local32 = -arg1.anInt1572;
				local34 = -arg1.anInt1567;
				local36 = -arg1.anInt1564;
			} else {
				local32 = this.anInt1572 - arg1.anInt1572;
				local34 = this.anInt1567 - arg1.anInt1567;
				local36 = this.anInt1564 - arg1.anInt1564;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt1569 != 0) {
			local81 = -this.anInt1569 & 0x3FFF;
			local85 = Class3_Sub13.anIntArray147[local81];
			local89 = Class3_Sub13.anIntArray146[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt1565 != 0) {
			local81 = -this.anInt1565 & 0x3FFF;
			local85 = Class3_Sub13.anIntArray147[local81];
			local89 = Class3_Sub13.anIntArray146[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class75 local172 = arg0.method6176(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method6160(arg0.method6170());
		@Pc(218) Class31 local218 = arg0.method6125();
		local218.method7921(0, 0, arg0.i() - local172.HA());
		local172.method6788(local218, (Class9_Sub5) null, arg0.i(), 1);
		this.aClass103_7 = arg0.method6144(0, 0, this.anInt1573, this.anInt1573, true);
		this.aClass103_7.method7458(3);
		arg0.KA(Static77.anIntArray108[0], Static77.anIntArray108[1], Static77.anIntArray108[2], Static77.anIntArray108[3]);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)Z")
	public boolean method1332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean115) {
			this.anInt1570 = 1073741823;
			local7 = this.anInt1572;
			local12 = this.anInt1567;
			local17 = this.anInt1564;
		} else {
			local7 = this.anInt1572 - arg0;
			local12 = this.anInt1567 - arg1;
			local17 = this.anInt1564 - arg2;
			this.anInt1570 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt1570 == 0) {
				this.anInt1570 = 1;
			}
			local7 = (local7 << 8) / this.anInt1570;
			local12 = (local12 << 8) / this.anInt1570;
			local17 = (local17 << 8) / this.anInt1570;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt1568 = this.anInt1571 * arg3 / (this.aBoolean115 ? 1024 : this.anInt1570);
		} else {
			this.anInt1568 = 0;
		}
		if (this.anInt1568 < 8) {
			this.aClass103_7 = null;
			return false;
		}
		@Pc(143) int local143 = Static533.method1203(this.anInt1568);
		if (local143 > arg3) {
			local143 = Static107.method1798(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt1573) {
			this.anInt1573 = local143;
		}
		this.anInt1569 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt1565 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass103_7 = null;
		return true;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "()V")
	public void method1333() {
		this.aClass103_7 = null;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(Lclient!ha;Lclient!cm;)Z")
	public boolean method1336(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class57 arg1) {
		return this.aClass103_7 != null || this.method1328(arg0, arg1);
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(Lclient!ha;Lclient!cm;)V")
	private void method1337(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class57 arg1) {
		Static77.method1334(arg0);
		Static77.method1331(arg0);
		arg0.K(Static77.anIntArray108);
		arg0.KA(0, 0, this.anInt1573, this.anInt1573);
		arg0.ya();
		arg0.aa(0, 0, this.anInt1573, this.anInt1573, this.anInt1575 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean115) {
				local31 = -arg1.anInt1572;
				local33 = -arg1.anInt1567;
				local35 = -arg1.anInt1564;
			} else {
				local31 = arg1.anInt1572 - this.anInt1572;
				local33 = arg1.anInt1567 - this.anInt1567;
				local35 = arg1.anInt1564 - this.anInt1564;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt1569 != 0) {
			local79 = Class3_Sub13.anIntArray147[this.anInt1569];
			local84 = Class3_Sub13.anIntArray146[this.anInt1569];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt1565 != 0) {
			local79 = Class3_Sub13.anIntArray147[this.anInt1565];
			local84 = Class3_Sub13.anIntArray146[this.anInt1565];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class75 local147 = Static77.aClass75_1.method6805((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt1566);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt1573 * 1024 / (local147.RA() - local147.V());
		if (this.anInt1575 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt1573 / 2, this.anInt1573 / 2, local84, local84);
		arg0.method6160(arg0.method6170());
		@Pc(206) Class31 local206 = arg0.method6170();
		local206.method7921(0, 0, arg0.i() - local147.HA());
		local147.method6788(local206, (Class9_Sub5) null, 1024, 1);
		@Pc(228) int local228 = this.anInt1573 * 13 / 16;
		@Pc(235) int local235 = (this.anInt1573 - local228) / 2;
		Static77.aClass103_8.method7461(local235, local235, local228, local228, 0, this.anInt1575 | 0xFF000000, 1);
		this.aClass103_7 = arg0.method6144(0, 0, this.anInt1573, this.anInt1573, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt1573, this.anInt1573, 0, 0);
		Static77.aClass103_6.method7461(0, 0, this.anInt1573, this.anInt1573, 1, 0, 0);
		this.aClass103_7.method7458(0);
		arg0.KA(Static77.anIntArray108[0], Static77.anIntArray108[1], Static77.anIntArray108[2], Static77.anIntArray108[3]);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method1338(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass103_7 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt1569 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt1565 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt1568) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt1568) / 2;
		if (local38 < arg4 && local38 + this.anInt1568 > 0 && local51 < arg3 && local51 + this.anInt1568 > 0) {
			this.aClass103_7.method7449(local51 + arg1, local38 + arg2, this.anInt1568, this.anInt1568);
		}
	}
}
