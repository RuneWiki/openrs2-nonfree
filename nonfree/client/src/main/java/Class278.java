import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class278 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
	private int anInt7810;

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
	private int anInt7812;

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
	public int anInt7814;

	@OriginalMember(owner = "client!raa", name = "k", descriptor = "Lclient!f;")
	private Class39 aClass39_32;

	@OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
	private int anInt7819;

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
	private int anInt7821;

	@OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
	private final int anInt7815;

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
	private final int anInt7811;

	@OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
	private final int anInt7820;

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "Z")
	private final boolean aBoolean618;

	@OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
	private final int anInt7818;

	@OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
	private final int anInt7817;

	@OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
	private final int anInt7816;

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
	private final int anInt7813;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt7815 = arg2;
		this.anInt7811 = arg3;
		this.anInt7820 = arg4;
		this.aBoolean618 = arg7;
		this.anInt7818 = arg1;
		this.anInt7817 = arg6;
		this.anInt7816 = arg5;
		this.anInt7813 = arg0;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public void method6421(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass39_32 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt7812 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt7819 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt7810) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt7810) / 2;
		if (local38 < arg4 && local38 + this.anInt7810 > 0 && local51 < arg3 && local51 + this.anInt7810 > 0) {
			this.aClass39_32.method7848(local51 + arg1, local38 + arg2, this.anInt7810, this.anInt7810);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!r;Lclient!raa;)Z")
	private boolean method6424(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class278 arg1) {
		if (this.aClass39_32 == null) {
			if (this.anInt7813 == 0) {
				if (Static64.anInterface5_1.method914(this.anInt7818)) {
					@Pc(23) int[] local23 = Static64.anInterface5_1.method915(0.7F, this.anInt7821, this.anInt7821, this.anInt7818);
					this.aClass39_32 = arg0.method6226(local23, this.anInt7821, this.anInt7821, this.anInt7821);
				}
			} else if (this.anInt7813 == 2) {
				this.method6427(arg0, arg1);
			} else if (this.anInt7813 == 1) {
				this.method6430(arg0, arg1);
			}
		}
		return this.aClass39_32 != null;
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(Lclient!r;Lclient!raa;)Z")
	public boolean method6426(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class278 arg1) {
		return this.aClass39_32 != null || this.method6424(arg0, arg1);
	}

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(Lclient!r;Lclient!raa;)V")
	private void method6427(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class278 arg1) {
		@Pc(6) Class93 local6 = Static117.method1747(this.anInt7818, Static262.aClass259_82);
		if (local6 == null) {
			return;
		}
		arg0.oa(Static449.anIntArray517);
		arg0.da(0, 0, this.anInt7821, this.anInt7821);
		arg0.J(0, 0, this.anInt7821, this.anInt7821, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean618) {
				local32 = -arg1.anInt7815;
				local34 = -arg1.anInt7811;
				local36 = -arg1.anInt7820;
			} else {
				local32 = this.anInt7815 - arg1.anInt7815;
				local34 = this.anInt7811 - arg1.anInt7811;
				local36 = this.anInt7820 - arg1.anInt7820;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt7812 != 0) {
			local81 = -this.anInt7812 & 0x3FFF;
			local85 = Class363.anIntArray697[local81];
			local89 = Class363.anIntArray698[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt7819 != 0) {
			local81 = -this.anInt7819 & 0x3FFF;
			local85 = Class363.anIntArray697[local81];
			local89 = Class363.anIntArray698[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class66 local172 = arg0.method6191(local6, 2048, 0, 64, 768);
		local85 = local172.l() - local172.KA();
		local89 = local172.H() - local172.J();
		local99 = local172.KA() + local85 / 2;
		@Pc(198) int local198 = local172.J() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.la(local99, local198, local205, local205);
		arg0.method6217(arg0.method6258());
		@Pc(218) Class68 local218 = arg0.method6222();
		local218.NA(0, 0, arg0.BA() - local172.OA());
		local172.method7556(local218, null, arg0.BA(), 1);
		this.aClass39_32 = arg0.method6236(0, 0, this.anInt7821, this.anInt7821, true);
		this.aClass39_32.xa(0, 0, 3);
		arg0.da(Static449.anIntArray517[0], Static449.anIntArray517[1], Static449.anIntArray517[2], Static449.anIntArray517[3]);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIII)Z")
	public boolean method6429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean618) {
			this.anInt7814 = 1073741823;
			local7 = this.anInt7815;
			local12 = this.anInt7811;
			local17 = this.anInt7820;
		} else {
			local7 = this.anInt7815 - arg0;
			local12 = this.anInt7811 - arg1;
			local17 = this.anInt7820 - arg2;
			this.anInt7814 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt7814 == 0) {
				this.anInt7814 = 1;
			}
			local7 = (local7 << 8) / this.anInt7814;
			local12 = (local12 << 8) / this.anInt7814;
			local17 = (local17 << 8) / this.anInt7814;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt7810 = this.anInt7816 * arg3 / (this.aBoolean618 ? 1024 : this.anInt7814);
		} else {
			this.anInt7810 = 0;
		}
		if (this.anInt7810 < 8) {
			this.aClass39_32 = null;
			return false;
		}
		@Pc(143) int local143 = Static89.method7259(this.anInt7810);
		if (local143 > arg3) {
			local143 = Static285.method5287(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt7821) {
			this.anInt7821 = local143;
		}
		this.anInt7812 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt7819 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass39_32 = null;
		return true;
	}

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "(Lclient!r;Lclient!raa;)V")
	private void method6430(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class278 arg1) {
		Static449.method6423(arg0);
		Static449.method6422(arg0);
		arg0.oa(Static449.anIntArray517);
		arg0.da(0, 0, this.anInt7821, this.anInt7821);
		arg0.ya();
		arg0.J(0, 0, this.anInt7821, this.anInt7821, this.anInt7817 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean618) {
				local31 = -arg1.anInt7815;
				local33 = -arg1.anInt7811;
				local35 = -arg1.anInt7820;
			} else {
				local31 = arg1.anInt7815 - this.anInt7815;
				local33 = arg1.anInt7811 - this.anInt7811;
				local35 = arg1.anInt7820 - this.anInt7820;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt7812 != 0) {
			local79 = Class363.anIntArray697[this.anInt7812];
			local84 = Class363.anIntArray698[this.anInt7812];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt7819 != 0) {
			local79 = Class363.anIntArray697[this.anInt7819];
			local84 = Class363.anIntArray698[this.anInt7819];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class66 local147 = Static449.aClass66_5.method7551((byte) 0, 51200, true);
		if (arg0.method6194()) {
			local147.DA((short) 0, (short) this.anInt7818);
		} else {
			local147.d((short) 127, Static64.anInterface5_1.method917(this.anInt7818).aShort109);
			local147.DA((short) 0, (short) -1);
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt7821 * 1024 / (local147.l() - local147.KA());
		if (this.anInt7817 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.la(this.anInt7821 / 2, this.anInt7821 / 2, local84, local84);
		arg0.method6217(arg0.method6258());
		@Pc(223) Class68 local223 = arg0.method6258();
		local223.NA(0, 0, arg0.BA() - local147.OA());
		local147.method7556(local223, null, 1024, 1);
		@Pc(245) int local245 = this.anInt7821 * 13 / 16;
		@Pc(252) int local252 = (this.anInt7821 - local245) / 2;
		Static449.aClass39_33.method7850(local252, local252, local245, local245, 0, this.anInt7817 | 0xFF000000, 1);
		this.aClass39_32 = arg0.method6236(0, 0, this.anInt7821, this.anInt7821, true);
		arg0.ya();
		arg0.J(0, 0, this.anInt7821, this.anInt7821, 0, 0);
		Static449.aClass39_31.method7850(0, 0, this.anInt7821, this.anInt7821, 1, 0, 0);
		this.aClass39_32.xa(0, 0, 0);
		arg0.da(Static449.anIntArray517[0], Static449.anIntArray517[1], Static449.anIntArray517[2], Static449.anIntArray517[3]);
	}

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "()V")
	public void method6431() {
		this.aClass39_32 = null;
	}
}
