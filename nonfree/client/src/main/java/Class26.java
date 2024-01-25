import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class26 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "I")
	public int anInt917;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "Lclient!nf;")
	private Class102 aClass102_2;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!av", name = "i", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!av", name = "r", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!av", name = "m", descriptor = "I")
	private final int anInt925;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "I")
	private final int anInt919;

	@OriginalMember(owner = "client!av", name = "l", descriptor = "I")
	private final int anInt924;

	@OriginalMember(owner = "client!av", name = "q", descriptor = "Z")
	private final boolean aBoolean87;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "I")
	private final int anInt920;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "I")
	private final int anInt918;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "I")
	private final int anInt923;

	@OriginalMember(owner = "client!av", name = "p", descriptor = "I")
	private final int anInt926;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt925 = arg2;
		this.anInt919 = arg3;
		this.anInt924 = arg4;
		this.aBoolean87 = arg7;
		this.anInt920 = arg1;
		this.anInt918 = arg6;
		this.anInt923 = arg5;
		this.anInt926 = arg0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIII)Z")
	public boolean method945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean87) {
			this.anInt917 = 1073741823;
			local7 = this.anInt925;
			local12 = this.anInt919;
			local17 = this.anInt924;
		} else {
			local7 = this.anInt925 - arg0;
			local12 = this.anInt919 - arg1;
			local17 = this.anInt924 - arg2;
			this.anInt917 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt917 == 0) {
				this.anInt917 = 1;
			}
			local7 = (local7 << 8) / this.anInt917;
			local12 = (local12 << 8) / this.anInt917;
			local17 = (local17 << 8) / this.anInt917;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt927 = this.anInt923 * arg3 / (this.aBoolean87 ? 1024 : this.anInt917);
		} else {
			this.anInt927 = 0;
		}
		if (this.anInt927 < 8) {
			this.aClass102_2 = null;
			return false;
		}
		@Pc(143) int local143 = Static527.method7377(this.anInt927);
		if (local143 > arg3) {
			local143 = Static675.method8723(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt922) {
			this.anInt922 = local143;
		}
		this.anInt921 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt916 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass102_2 = null;
		return true;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!ha;Lclient!av;)V")
	private void method946(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class26 arg1) {
		@Pc(6) Class73 local6 = Static573.method7744(this.anInt920, Static603.aClass143_132);
		if (local6 == null) {
			return;
		}
		arg0.K(Static31.anIntArray23);
		arg0.KA(0, 0, this.anInt922, this.anInt922);
		arg0.aa(0, 0, this.anInt922, this.anInt922, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean87) {
				local32 = -arg1.anInt925;
				local34 = -arg1.anInt919;
				local36 = -arg1.anInt924;
			} else {
				local32 = this.anInt925 - arg1.anInt925;
				local34 = this.anInt919 - arg1.anInt919;
				local36 = this.anInt924 - arg1.anInt924;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt921 != 0) {
			local81 = -this.anInt921 & 0x3FFF;
			local85 = Class3_Sub7_Sub2.anIntArray171[local81];
			local89 = Class3_Sub7_Sub2.anIntArray170[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt916 != 0) {
			local81 = -this.anInt916 & 0x3FFF;
			local85 = Class3_Sub7_Sub2.anIntArray171[local81];
			local89 = Class3_Sub7_Sub2.anIntArray170[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class28 local172 = arg0.method8137(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method8135(arg0.method8178());
		@Pc(218) Class25 local218 = arg0.method8156();
		local218.method4303(0, 0, arg0.i() - local172.HA());
		local172.method6894(local218, (Class23_Sub4) null, arg0.i(), 1);
		this.aClass102_2 = arg0.method8148(0, 0, this.anInt922, this.anInt922, true);
		this.aClass102_2.method6967(3);
		arg0.KA(Static31.anIntArray23[0], Static31.anIntArray23[1], Static31.anIntArray23[2], Static31.anIntArray23[3]);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "()V")
	public void method948() {
		this.aClass102_2 = null;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Lclient!ha;Lclient!av;)V")
	private void method952(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class26 arg1) {
		Static31.method951(arg0);
		Static31.method947(arg0);
		arg0.K(Static31.anIntArray23);
		arg0.KA(0, 0, this.anInt922, this.anInt922);
		arg0.ya();
		arg0.aa(0, 0, this.anInt922, this.anInt922, this.anInt918 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean87) {
				local31 = -arg1.anInt925;
				local33 = -arg1.anInt919;
				local35 = -arg1.anInt924;
			} else {
				local31 = arg1.anInt925 - this.anInt925;
				local33 = arg1.anInt919 - this.anInt919;
				local35 = arg1.anInt924 - this.anInt924;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt921 != 0) {
			local79 = Class3_Sub7_Sub2.anIntArray171[this.anInt921];
			local84 = Class3_Sub7_Sub2.anIntArray170[this.anInt921];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt916 != 0) {
			local79 = Class3_Sub7_Sub2.anIntArray171[this.anInt916];
			local84 = Class3_Sub7_Sub2.anIntArray170[this.anInt916];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class28 local147 = Static31.aClass28_1.method6900((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt920);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt922 * 1024 / (local147.RA() - local147.V());
		if (this.anInt918 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt922 / 2, this.anInt922 / 2, local84, local84);
		arg0.method8135(arg0.method8178());
		@Pc(206) Class25 local206 = arg0.method8178();
		local206.method4303(0, 0, arg0.i() - local147.HA());
		local147.method6894(local206, (Class23_Sub4) null, 1024, 1);
		@Pc(228) int local228 = this.anInt922 * 13 / 16;
		@Pc(235) int local235 = (this.anInt922 - local228) / 2;
		Static31.aClass102_4.method6970(local235, local235, local228, local228, 0, this.anInt918 | 0xFF000000, 1);
		this.aClass102_2 = arg0.method8148(0, 0, this.anInt922, this.anInt922, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt922, this.anInt922, 0, 0);
		Static31.aClass102_3.method6970(0, 0, this.anInt922, this.anInt922, 1, 0, 0);
		this.aClass102_2.method6967(0);
		arg0.KA(Static31.anIntArray23[0], Static31.anIntArray23[1], Static31.anIntArray23[2], Static31.anIntArray23[3]);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method953(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass102_2 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt921 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt916 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt927) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt927) / 2;
		if (local38 < arg4 && local38 + this.anInt927 > 0 && local51 < arg3 && local51 + this.anInt927 > 0) {
			this.aClass102_2.method6947(local51 + arg1, local38 + arg2, this.anInt927, this.anInt927);
		}
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(Lclient!ha;Lclient!av;)Z")
	private boolean method954(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class26 arg1) {
		if (this.aClass102_2 == null) {
			if (this.anInt926 == 0) {
				if (Static449.anInterface5_10.method5197(this.anInt920)) {
					@Pc(23) int[] local23 = Static449.anInterface5_10.method5195(this.anInt922, this.anInt920, 0.7F, this.anInt922);
					this.aClass102_2 = arg0.method8131(this.anInt922, local23, this.anInt922, this.anInt922);
				}
			} else if (this.anInt926 == 2) {
				this.method946(arg0, arg1);
			} else if (this.anInt926 == 1) {
				this.method952(arg0, arg1);
			}
		}
		return this.aClass102_2 != null;
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(Lclient!ha;Lclient!av;)Z")
	public boolean method955(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class26 arg1) {
		return this.aClass102_2 != null || this.method954(arg0, arg1);
	}
}
