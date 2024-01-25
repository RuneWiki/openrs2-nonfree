import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class174 {

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
	private int anInt5043;

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
	private int anInt5044;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "Lclient!ha;")
	private Class2 aClass2_29;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
	private int anInt5046;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
	public int anInt5050;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
	private int anInt5053;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	private final int anInt5051;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
	private final int anInt5052;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
	private final int anInt5045;

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "Z")
	private final boolean aBoolean355;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
	private final int anInt5047;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	private final int anInt5049;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	private final int anInt5048;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
	private final int anInt5054;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5051 = arg2;
		this.anInt5052 = arg3;
		this.anInt5045 = arg4;
		this.aBoolean355 = arg7;
		this.anInt5047 = arg1;
		this.anInt5049 = arg6;
		this.anInt5048 = arg5;
		this.anInt5054 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!qa;Lclient!kv;)V")
	private void method4370(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class174 arg1) {
		@Pc(6) Class97 local6 = Static321.method4995(this.anInt5047, Static469.aClass171_151);
		if (local6 == null) {
			return;
		}
		arg0.d(Static262.anIntArray519);
		arg0.N(0, 0, this.anInt5046, this.anInt5046);
		arg0.f(0, 0, this.anInt5046, this.anInt5046, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean355) {
				local32 = -arg1.anInt5051;
				local34 = -arg1.anInt5052;
				local36 = -arg1.anInt5045;
			} else {
				local32 = this.anInt5051 - arg1.anInt5051;
				local34 = this.anInt5052 - arg1.anInt5052;
				local36 = this.anInt5045 - arg1.anInt5045;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt5044 != 0) {
			local81 = -this.anInt5044 & 0x3FFF;
			local85 = Class310.anIntArray827[local81];
			local89 = Class310.anIntArray826[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt5043 != 0) {
			local81 = -this.anInt5043 & 0x3FFF;
			local85 = Class310.anIntArray827[local81];
			local89 = Class310.anIntArray826[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class145 local172 = arg0.method7280(local6, 2048, 0, 64, 768);
		local85 = local172.va() - local172.wa();
		local89 = local172.n() - local172.TA();
		local99 = local172.wa() + local85 / 2;
		@Pc(198) int local198 = local172.TA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.b(local99, local198, local205, local205);
		arg0.method7250(arg0.method7275());
		@Pc(218) Class118 local218 = arg0.method7256();
		local218.oa(0, 0, arg0.c() - local172.Q());
		local172.method6676(local218, null, arg0.c());
		this.aClass2_29 = arg0.method7261(0, 0, this.anInt5046, this.anInt5046, true);
		this.aClass2_29.BA(0, 0, 3);
		arg0.N(Static262.anIntArray519[0], Static262.anIntArray519[1], Static262.anIntArray519[2], Static262.anIntArray519[3]);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(Lclient!qa;Lclient!kv;)Z")
	public boolean method4371(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class174 arg1) {
		return this.aClass2_29 != null || this.method4379(arg0, arg1);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIII)Z")
	public boolean method4373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean355) {
			this.anInt5050 = 1073741823;
			local7 = this.anInt5051;
			local12 = this.anInt5052;
			local17 = this.anInt5045;
		} else {
			local7 = this.anInt5051 - arg0;
			local12 = this.anInt5052 - arg1;
			local17 = this.anInt5045 - arg2;
			this.anInt5050 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5050 == 0) {
				this.anInt5050 = 1;
			}
			local7 = (local7 << 8) / this.anInt5050;
			local12 = (local12 << 8) / this.anInt5050;
			local17 = (local17 << 8) / this.anInt5050;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5053 = this.anInt5048 * arg3 / (this.aBoolean355 ? 1024 : this.anInt5050);
		} else {
			this.anInt5053 = 0;
		}
		if (this.anInt5053 < 8) {
			this.aClass2_29 = null;
			return false;
		}
		@Pc(143) int local143 = Static352.method5306(this.anInt5053);
		if (local143 > arg3) {
			local143 = Static59.method1111(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5046) {
			this.anInt5046 = local143;
		}
		this.anInt5044 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt5043 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass2_29 = null;
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(Lclient!qa;Lclient!kv;)V")
	private void method4375(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class174 arg1) {
		Static262.method4378(arg0);
		Static262.method4372(arg0);
		arg0.d(Static262.anIntArray519);
		arg0.N(0, 0, this.anInt5046, this.anInt5046);
		arg0.method7284();
		arg0.f(0, 0, this.anInt5046, this.anInt5046, this.anInt5049 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean355) {
				local31 = -arg1.anInt5051;
				local33 = -arg1.anInt5052;
				local35 = -arg1.anInt5045;
			} else {
				local31 = arg1.anInt5051 - this.anInt5051;
				local33 = arg1.anInt5052 - this.anInt5052;
				local35 = arg1.anInt5045 - this.anInt5045;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt5044 != 0) {
			local79 = Class310.anIntArray827[this.anInt5044];
			local84 = Class310.anIntArray826[this.anInt5044];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt5043 != 0) {
			local79 = Class310.anIntArray827[this.anInt5043];
			local84 = Class310.anIntArray826[this.anInt5043];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class145 local147 = Static262.aClass145_4.method6672((byte) 0, 51200, true);
		if (arg0.method7228()) {
			local147.L((short) 0, (short) this.anInt5047);
		} else {
			local147.pa((short) 127, Static13.anInterface8_3.method878(this.anInt5047).aShort100);
			local147.L((short) 0, (short) -1);
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt5046 * 1024 / (local147.va() - local147.wa());
		if (this.anInt5049 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.b(this.anInt5046 / 2, this.anInt5046 / 2, local84, local84);
		arg0.method7250(arg0.method7275());
		@Pc(223) Class118 local223 = arg0.method7275();
		local223.oa(0, 0, arg0.c() - local147.Q());
		local147.method6676(local223, null, 1024);
		@Pc(245) int local245 = this.anInt5046 * 13 / 16;
		@Pc(252) int local252 = (this.anInt5046 - local245) / 2;
		Static262.aClass2_31.ra(local252, local252, local245, local245, 0, this.anInt5049 | 0xFF000000, 1);
		this.aClass2_29 = arg0.method7261(0, 0, this.anInt5046, this.anInt5046, true);
		arg0.method7284();
		arg0.f(0, 0, this.anInt5046, this.anInt5046, 0, 0);
		Static262.aClass2_30.ra(0, 0, this.anInt5046, this.anInt5046, 1, 0, 0);
		this.aClass2_29.BA(0, 0, 0);
		arg0.N(Static262.anIntArray519[0], Static262.anIntArray519[1], Static262.anIntArray519[2], Static262.anIntArray519[3]);
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "()V")
	public void method4377() {
		this.aClass2_29 = null;
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(Lclient!qa;Lclient!kv;)Z")
	private boolean method4379(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class174 arg1) {
		if (this.aClass2_29 == null) {
			if (this.anInt5054 == 0) {
				if (Static13.anInterface8_3.method879(this.anInt5047)) {
					@Pc(23) int[] local23 = Static13.anInterface8_3.method880(this.anInt5046, this.anInt5047, this.anInt5046, 0.7F);
					this.aClass2_29 = arg0.method7268(local23, this.anInt5046, this.anInt5046, this.anInt5046);
				}
			} else if (this.anInt5054 == 2) {
				this.method4370(arg0, arg1);
			} else if (this.anInt5054 == 1) {
				this.method4375(arg0, arg1);
			}
		}
		return this.aClass2_29 != null;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method4380(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass2_29 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt5044 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt5043 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt5053) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt5053) / 2;
		if (local38 < arg4 && local38 + this.anInt5053 > 0 && local51 < arg3 && local51 + this.anInt5053 > 0) {
			this.aClass2_29.method7367(local51 + arg1, local38 + arg2, this.anInt5053, this.anInt5053);
		}
	}
}
