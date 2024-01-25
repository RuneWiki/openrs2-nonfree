import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class263 {

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "Lclient!ha;")
	private Class25 aClass25_22;

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
	private int anInt7697;

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
	public int anInt7700;

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
	private int anInt7702;

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
	private int anInt7703;

	@OriginalMember(owner = "client!saa", name = "q", descriptor = "I")
	private int anInt7706;

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
	private final int anInt7698;

	@OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
	private final int anInt7704;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
	private final int anInt7696;

	@OriginalMember(owner = "client!saa", name = "k", descriptor = "Z")
	private final boolean aBoolean547;

	@OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
	private final int anInt7705;

	@OriginalMember(owner = "client!saa", name = "r", descriptor = "I")
	private final int anInt7707;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
	private final int anInt7699;

	@OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
	private final int anInt7701;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt7698 = arg2;
		this.anInt7704 = arg3;
		this.anInt7696 = arg4;
		this.aBoolean547 = arg7;
		this.anInt7705 = arg1;
		this.anInt7707 = arg6;
		this.anInt7699 = arg5;
		this.anInt7701 = arg0;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!qa;Lclient!saa;)V")
	private void method6241(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class263 arg1) {
		Static440.method6249(arg0);
		Static440.method6239(arg0);
		arg0.d(Static440.anIntArray580);
		arg0.N(0, 0, this.anInt7697, this.anInt7697);
		arg0.method6999();
		arg0.f(0, 0, this.anInt7697, this.anInt7697, this.anInt7707 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean547) {
				local31 = -arg1.anInt7698;
				local33 = -arg1.anInt7704;
				local35 = -arg1.anInt7696;
			} else {
				local31 = arg1.anInt7698 - this.anInt7698;
				local33 = arg1.anInt7704 - this.anInt7704;
				local35 = arg1.anInt7696 - this.anInt7696;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt7703 != 0) {
			local79 = Class5_Sub2_Sub16.anIntArray411[this.anInt7703];
			local84 = Class5_Sub2_Sub16.anIntArray410[this.anInt7703];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt7706 != 0) {
			local79 = Class5_Sub2_Sub16.anIntArray411[this.anInt7706];
			local84 = Class5_Sub2_Sub16.anIntArray410[this.anInt7706];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class36 local147 = Static440.aClass36_5.method7356((byte) 0, 51200, true);
		if (arg0.method7028()) {
			local147.L((short) 0, (short) this.anInt7705);
		} else {
			local147.pa((short) 127, Static405.anInterface8_119.method7237(this.anInt7705).aShort100);
			local147.L((short) 0, (short) -1);
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt7697 * 1024 / (local147.va() - local147.wa());
		if (this.anInt7707 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.b(this.anInt7697 / 2, this.anInt7697 / 2, local84, local84);
		arg0.method7068(arg0.method7011());
		@Pc(223) Class78 local223 = arg0.method7011();
		local223.oa(0, 0, arg0.c() - local147.Q());
		local147.method7346(local223, null, 1024);
		@Pc(245) int local245 = this.anInt7697 * 13 / 16;
		@Pc(252) int local252 = (this.anInt7697 - local245) / 2;
		Static440.aClass25_23.ra(local252, local252, local245, local245, 0, this.anInt7707 | 0xFF000000, 1);
		this.aClass25_22 = arg0.method7003(0, 0, this.anInt7697, this.anInt7697, true);
		arg0.method6999();
		arg0.f(0, 0, this.anInt7697, this.anInt7697, 0, 0);
		Static440.aClass25_24.ra(0, 0, this.anInt7697, this.anInt7697, 1, 0, 0);
		this.aClass25_22.BA(0, 0, 0);
		arg0.N(Static440.anIntArray580[0], Static440.anIntArray580[1], Static440.anIntArray580[2], Static440.anIntArray580[3]);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method6242(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass25_22 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt7703 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt7706 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt7702) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt7702) / 2;
		if (local38 < arg4 && local38 + this.anInt7702 > 0 && local51 < arg3 && local51 + this.anInt7702 > 0) {
			this.aClass25_22.method6960(local51 + arg1, local38 + arg2, this.anInt7702, this.anInt7702);
		}
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(Lclient!qa;Lclient!saa;)Z")
	public boolean method6243(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class263 arg1) {
		return this.aClass25_22 != null || this.method6247(arg0, arg1);
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(Lclient!qa;Lclient!saa;)V")
	private void method6244(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class263 arg1) {
		@Pc(6) Class184 local6 = Static287.method4830(this.anInt7705, Static149.aClass117_77);
		if (local6 == null) {
			return;
		}
		arg0.d(Static440.anIntArray580);
		arg0.N(0, 0, this.anInt7697, this.anInt7697);
		arg0.f(0, 0, this.anInt7697, this.anInt7697, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean547) {
				local32 = -arg1.anInt7698;
				local34 = -arg1.anInt7704;
				local36 = -arg1.anInt7696;
			} else {
				local32 = this.anInt7698 - arg1.anInt7698;
				local34 = this.anInt7704 - arg1.anInt7704;
				local36 = this.anInt7696 - arg1.anInt7696;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt7703 != 0) {
			local81 = -this.anInt7703 & 0x3FFF;
			local85 = Class5_Sub2_Sub16.anIntArray411[local81];
			local89 = Class5_Sub2_Sub16.anIntArray410[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt7706 != 0) {
			local81 = -this.anInt7706 & 0x3FFF;
			local85 = Class5_Sub2_Sub16.anIntArray411[local81];
			local89 = Class5_Sub2_Sub16.anIntArray410[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class36 local172 = arg0.method7012(local6, 2048, 0, 64, 768);
		local85 = local172.va() - local172.wa();
		local89 = local172.n() - local172.TA();
		local99 = local172.wa() + local85 / 2;
		@Pc(198) int local198 = local172.TA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.b(local99, local198, local205, local205);
		arg0.method7068(arg0.method7011());
		@Pc(218) Class78 local218 = arg0.method6994();
		local218.oa(0, 0, arg0.c() - local172.Q());
		local172.method7346(local218, null, arg0.c());
		this.aClass25_22 = arg0.method7003(0, 0, this.anInt7697, this.anInt7697, true);
		this.aClass25_22.BA(0, 0, 3);
		arg0.N(Static440.anIntArray580[0], Static440.anIntArray580[1], Static440.anIntArray580[2], Static440.anIntArray580[3]);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIII)Z")
	public boolean method6246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean547) {
			this.anInt7700 = 1073741823;
			local7 = this.anInt7698;
			local12 = this.anInt7704;
			local17 = this.anInt7696;
		} else {
			local7 = this.anInt7698 - arg0;
			local12 = this.anInt7704 - arg1;
			local17 = this.anInt7696 - arg2;
			this.anInt7700 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt7700 == 0) {
				this.anInt7700 = 1;
			}
			local7 = (local7 << 8) / this.anInt7700;
			local12 = (local12 << 8) / this.anInt7700;
			local17 = (local17 << 8) / this.anInt7700;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt7702 = this.anInt7699 * arg3 / (this.aBoolean547 ? 1024 : this.anInt7700);
		} else {
			this.anInt7702 = 0;
		}
		if (this.anInt7702 < 8) {
			this.aClass25_22 = null;
			return false;
		}
		@Pc(143) int local143 = Static179.method3071(this.anInt7702);
		if (local143 > arg3) {
			local143 = Static7.method265(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt7697) {
			this.anInt7697 = local143;
		}
		this.anInt7703 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt7706 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass25_22 = null;
		return true;
	}

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "(Lclient!qa;Lclient!saa;)Z")
	private boolean method6247(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class263 arg1) {
		if (this.aClass25_22 == null) {
			if (this.anInt7701 == 0) {
				if (Static405.anInterface8_119.method7236(this.anInt7705)) {
					@Pc(23) int[] local23 = Static405.anInterface8_119.method7232(0.7F, this.anInt7697, this.anInt7705, this.anInt7697);
					this.aClass25_22 = arg0.method7021(local23, this.anInt7697, this.anInt7697, this.anInt7697);
				}
			} else if (this.anInt7701 == 2) {
				this.method6244(arg0, arg1);
			} else if (this.anInt7701 == 1) {
				this.method6241(arg0, arg1);
			}
		}
		return this.aClass25_22 != null;
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "()V")
	public void method6248() {
		this.aClass25_22 = null;
	}
}
