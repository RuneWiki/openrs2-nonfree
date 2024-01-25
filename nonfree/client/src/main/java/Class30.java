import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class30 {

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!f;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
	public int anInt1006;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
	private final int anInt1005;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	private final int anInt1004;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
	private final int anInt1010;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Z")
	private final boolean aBoolean86;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
	private final int anInt1000;

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
	private final int anInt1011;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
	private final int anInt1001;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
	private final int anInt1007;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt1005 = arg2;
		this.anInt1004 = arg3;
		this.anInt1010 = arg4;
		this.aBoolean86 = arg7;
		this.anInt1000 = arg1;
		this.anInt1011 = arg6;
		this.anInt1001 = arg5;
		this.anInt1007 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!r;Lclient!bn;)Z")
	private boolean method775(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class30 arg1) {
		if (this.aClass46_1 == null) {
			if (this.anInt1007 == 0) {
				if (Static1.anInterface8_1.method6559(this.anInt1000)) {
					@Pc(23) int[] local23 = Static1.anInterface8_1.method6556(this.anInt1000, this.anInt1009, 0.7F, this.anInt1009);
					this.aClass46_1 = arg0.method7198(local23, this.anInt1009, this.anInt1009, this.anInt1009);
				}
			} else if (this.anInt1007 == 2) {
				this.method784(arg0, arg1);
			} else if (this.anInt1007 == 1) {
				this.method783(arg0, arg1);
			}
		}
		return this.aClass46_1 != null;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public void method777(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass46_1 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt1008 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt1003 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt1002) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt1002) / 2;
		if (local38 < arg4 && local38 + this.anInt1002 > 0 && local51 < arg3 && local51 + this.anInt1002 > 0) {
			this.aClass46_1.method7616(local51 + arg1, local38 + arg2, this.anInt1002, this.anInt1002);
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Lclient!r;Lclient!bn;)Z")
	public boolean method778(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class30 arg1) {
		return this.aClass46_1 != null || this.method775(arg0, arg1);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)Z")
	public boolean method781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean86) {
			this.anInt1006 = 1073741823;
			local7 = this.anInt1005;
			local12 = this.anInt1004;
			local17 = this.anInt1010;
		} else {
			local7 = this.anInt1005 - arg0;
			local12 = this.anInt1004 - arg1;
			local17 = this.anInt1010 - arg2;
			this.anInt1006 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt1006 == 0) {
				this.anInt1006 = 1;
			}
			local7 = (local7 << 8) / this.anInt1006;
			local12 = (local12 << 8) / this.anInt1006;
			local17 = (local17 << 8) / this.anInt1006;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt1002 = this.anInt1001 * arg3 / (this.aBoolean86 ? 1024 : this.anInt1006);
		} else {
			this.anInt1002 = 0;
		}
		if (this.anInt1002 < 8) {
			this.aClass46_1 = null;
			return false;
		}
		@Pc(143) int local143 = Static114.method2375(this.anInt1002);
		if (local143 > arg3) {
			local143 = Static247.method4032(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt1009) {
			this.anInt1009 = local143;
		}
		this.anInt1008 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt1003 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass46_1 = null;
		return true;
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(Lclient!r;Lclient!bn;)V")
	private void method783(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class30 arg1) {
		Static46.method780(arg0);
		Static46.method779(arg0);
		arg0.oa(Static46.anIntArray91);
		arg0.da(0, 0, this.anInt1009, this.anInt1009);
		arg0.ya();
		arg0.J(0, 0, this.anInt1009, this.anInt1009, this.anInt1011 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean86) {
				local31 = -arg1.anInt1005;
				local33 = -arg1.anInt1004;
				local35 = -arg1.anInt1010;
			} else {
				local31 = arg1.anInt1005 - this.anInt1005;
				local33 = arg1.anInt1004 - this.anInt1004;
				local35 = arg1.anInt1010 - this.anInt1010;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt1008 != 0) {
			local79 = Class3_Sub17.anIntArray175[this.anInt1008];
			local84 = Class3_Sub17.anIntArray177[this.anInt1008];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt1003 != 0) {
			local79 = Class3_Sub17.anIntArray175[this.anInt1003];
			local84 = Class3_Sub17.anIntArray177[this.anInt1003];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class57 local147 = Static46.aClass57_2.method7522((byte) 0, 51200, true);
		if (arg0.method7166()) {
			local147.DA((short) 0, (short) this.anInt1000);
		} else {
			local147.d((short) 127, Static1.anInterface8_1.method6560(this.anInt1000).aShort76);
			local147.DA((short) 0, (short) -1);
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt1009 * 1024 / (local147.l() - local147.KA());
		if (this.anInt1011 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.la(this.anInt1009 / 2, this.anInt1009 / 2, local84, local84);
		arg0.method7187(arg0.method7160());
		@Pc(223) Class109 local223 = arg0.method7160();
		local223.NA(0, 0, arg0.BA() - local147.OA());
		local147.method7521(local223, null, 1024, 1);
		@Pc(245) int local245 = this.anInt1009 * 13 / 16;
		@Pc(252) int local252 = (this.anInt1009 - local245) / 2;
		Static46.aClass46_3.method7613(local252, local252, local245, local245, 0, this.anInt1011 | 0xFF000000, 1);
		this.aClass46_1 = arg0.method7184(0, 0, this.anInt1009, this.anInt1009, true);
		arg0.ya();
		arg0.J(0, 0, this.anInt1009, this.anInt1009, 0, 0);
		Static46.aClass46_2.method7613(0, 0, this.anInt1009, this.anInt1009, 1, 0, 0);
		this.aClass46_1.xa(0, 0, 0);
		arg0.da(Static46.anIntArray91[0], Static46.anIntArray91[1], Static46.anIntArray91[2], Static46.anIntArray91[3]);
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(Lclient!r;Lclient!bn;)V")
	private void method784(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class30 arg1) {
		@Pc(6) Class226 local6 = Static519.method6916(this.anInt1000, Static167.aClass246_83);
		if (local6 == null) {
			return;
		}
		arg0.oa(Static46.anIntArray91);
		arg0.da(0, 0, this.anInt1009, this.anInt1009);
		arg0.J(0, 0, this.anInt1009, this.anInt1009, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean86) {
				local32 = -arg1.anInt1005;
				local34 = -arg1.anInt1004;
				local36 = -arg1.anInt1010;
			} else {
				local32 = this.anInt1005 - arg1.anInt1005;
				local34 = this.anInt1004 - arg1.anInt1004;
				local36 = this.anInt1010 - arg1.anInt1010;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt1008 != 0) {
			local81 = -this.anInt1008 & 0x3FFF;
			local85 = Class3_Sub17.anIntArray175[local81];
			local89 = Class3_Sub17.anIntArray177[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt1003 != 0) {
			local81 = -this.anInt1003 & 0x3FFF;
			local85 = Class3_Sub17.anIntArray175[local81];
			local89 = Class3_Sub17.anIntArray177[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class57 local172 = arg0.method7178(local6, 2048, 0, 64, 768);
		local85 = local172.l() - local172.KA();
		local89 = local172.H() - local172.J();
		local99 = local172.KA() + local85 / 2;
		@Pc(198) int local198 = local172.J() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.la(local99, local198, local205, local205);
		arg0.method7187(arg0.method7160());
		@Pc(218) Class109 local218 = arg0.method7142();
		local218.NA(0, 0, arg0.BA() - local172.OA());
		local172.method7521(local218, null, arg0.BA(), 1);
		this.aClass46_1 = arg0.method7184(0, 0, this.anInt1009, this.anInt1009, true);
		this.aClass46_1.xa(0, 0, 3);
		arg0.da(Static46.anIntArray91[0], Static46.anIntArray91[1], Static46.anIntArray91[2], Static46.anIntArray91[3]);
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "()V")
	public void method785() {
		this.aClass46_1 = null;
	}
}
