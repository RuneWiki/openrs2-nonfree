import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class76 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	private int anInt2081;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	private int anInt2082;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!ha;")
	private Class104 aClass104_10;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	private int anInt2086;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	private int anInt2087;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	public int anInt2089;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	private final int anInt2084;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	private final int anInt2083;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	private final int anInt2091;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Z")
	private final boolean aBoolean174;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	private final int anInt2088;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
	private final int anInt2090;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
	private final int anInt2080;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	private final int anInt2085;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2084 = arg2;
		this.anInt2083 = arg3;
		this.anInt2091 = arg4;
		this.aBoolean174 = arg7;
		this.anInt2088 = arg1;
		this.anInt2090 = arg6;
		this.anInt2080 = arg5;
		this.anInt2085 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!qa;Lclient!ea;)V")
	private void method2002(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class76 arg1) {
		Static96.method2003(arg0);
		Static96.method2005(arg0);
		arg0.d(Static96.anIntArray154);
		arg0.N(0, 0, this.anInt2087, this.anInt2087);
		arg0.method7202();
		arg0.f(0, 0, this.anInt2087, this.anInt2087, this.anInt2090 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean174) {
				local31 = -arg1.anInt2084;
				local33 = -arg1.anInt2083;
				local35 = -arg1.anInt2091;
			} else {
				local31 = arg1.anInt2084 - this.anInt2084;
				local33 = arg1.anInt2083 - this.anInt2083;
				local35 = arg1.anInt2091 - this.anInt2091;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2086 != 0) {
			local79 = Class200_Sub1.lb[this.anInt2086];
			local84 = Class200_Sub1.anIntArray576[this.anInt2086];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt2081 != 0) {
			local79 = Class200_Sub1.lb[this.anInt2081];
			local84 = Class200_Sub1.anIntArray576[this.anInt2081];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class97 local147 = Static96.aClass97_1.method6770((byte) 0, 51200, true);
		if (arg0.method7148()) {
			local147.L((short) 0, (short) this.anInt2088);
		} else {
			local147.pa((short) 127, Static342.anInterface13_11.method5789(this.anInt2088).aShort116);
			local147.L((short) 0, (short) -1);
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2087 * 1024 / (local147.va() - local147.wa());
		if (this.anInt2090 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.b(this.anInt2087 / 2, this.anInt2087 / 2, local84, local84);
		arg0.method7198(arg0.method7189());
		@Pc(223) Class128 local223 = arg0.method7189();
		local223.oa(0, 0, arg0.c() - local147.Q());
		local147.method6778(local223, null, 1024);
		@Pc(245) int local245 = this.anInt2087 * 13 / 16;
		@Pc(252) int local252 = (this.anInt2087 - local245) / 2;
		Static96.aClass104_9.ra(local252, local252, local245, local245, 0, this.anInt2090 | 0xFF000000, 1);
		this.aClass104_10 = arg0.method7199(0, 0, this.anInt2087, this.anInt2087, true);
		arg0.method7202();
		arg0.f(0, 0, this.anInt2087, this.anInt2087, 0, 0);
		Static96.aClass104_11.ra(0, 0, this.anInt2087, this.anInt2087, 1, 0, 0);
		this.aClass104_10.BA(0, 0, 0);
		arg0.N(Static96.anIntArray154[0], Static96.anIntArray154[1], Static96.anIntArray154[2], Static96.anIntArray154[3]);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lclient!qa;Lclient!ea;)Z")
	public boolean method2006(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class76 arg1) {
		return this.aClass104_10 != null || this.method2009(arg0, arg1);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method2007(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass104_10 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2086 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2081 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2082) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2082) / 2;
		if (local38 < arg4 && local38 + this.anInt2082 > 0 && local51 < arg3 && local51 + this.anInt2082 > 0) {
			this.aClass104_10.method7707(local51 + arg1, local38 + arg2, this.anInt2082, this.anInt2082);
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "()V")
	public void method2008() {
		this.aClass104_10 = null;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Lclient!qa;Lclient!ea;)Z")
	private boolean method2009(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class76 arg1) {
		if (this.aClass104_10 == null) {
			if (this.anInt2085 == 0) {
				if (Static342.anInterface13_11.method5788(this.anInt2088)) {
					@Pc(23) int[] local23 = Static342.anInterface13_11.method5786(0.7F, this.anInt2087, this.anInt2087, this.anInt2088);
					this.aClass104_10 = arg0.method7156(local23, this.anInt2087, this.anInt2087, this.anInt2087);
				}
			} else if (this.anInt2085 == 2) {
				this.method2011(arg0, arg1);
			} else if (this.anInt2085 == 1) {
				this.method2002(arg0, arg1);
			}
		}
		return this.aClass104_10 != null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z")
	public boolean method2010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean174) {
			this.anInt2089 = 1073741823;
			local7 = this.anInt2084;
			local12 = this.anInt2083;
			local17 = this.anInt2091;
		} else {
			local7 = this.anInt2084 - arg0;
			local12 = this.anInt2083 - arg1;
			local17 = this.anInt2091 - arg2;
			this.anInt2089 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2089 == 0) {
				this.anInt2089 = 1;
			}
			local7 = (local7 << 8) / this.anInt2089;
			local12 = (local12 << 8) / this.anInt2089;
			local17 = (local17 << 8) / this.anInt2089;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2082 = this.anInt2080 * arg3 / (this.aBoolean174 ? 1024 : this.anInt2089);
		} else {
			this.anInt2082 = 0;
		}
		if (this.anInt2082 < 8) {
			this.aClass104_10 = null;
			return false;
		}
		@Pc(143) int local143 = Static184.method3549(this.anInt2082);
		if (local143 > arg3) {
			local143 = Static513.method7859(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2087) {
			this.anInt2087 = local143;
		}
		this.anInt2086 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt2081 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass104_10 = null;
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(Lclient!qa;Lclient!ea;)V")
	private void method2011(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class76 arg1) {
		@Pc(6) Class81 local6 = Static274.method4851(this.anInt2088, Static299.aClass69_60);
		if (local6 == null) {
			return;
		}
		arg0.d(Static96.anIntArray154);
		arg0.N(0, 0, this.anInt2087, this.anInt2087);
		arg0.f(0, 0, this.anInt2087, this.anInt2087, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean174) {
				local32 = -arg1.anInt2084;
				local34 = -arg1.anInt2083;
				local36 = -arg1.anInt2091;
			} else {
				local32 = this.anInt2084 - arg1.anInt2084;
				local34 = this.anInt2083 - arg1.anInt2083;
				local36 = this.anInt2091 - arg1.anInt2091;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2086 != 0) {
			local81 = -this.anInt2086 & 0x3FFF;
			local85 = Class200_Sub1.lb[local81];
			local89 = Class200_Sub1.anIntArray576[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt2081 != 0) {
			local81 = -this.anInt2081 & 0x3FFF;
			local85 = Class200_Sub1.lb[local81];
			local89 = Class200_Sub1.anIntArray576[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class97 local172 = arg0.method7192(local6, 2048, 0, 64, 768);
		local85 = local172.va() - local172.wa();
		local89 = local172.n() - local172.TA();
		local99 = local172.wa() + local85 / 2;
		@Pc(198) int local198 = local172.TA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.b(local99, local198, local205, local205);
		arg0.method7198(arg0.method7189());
		@Pc(218) Class128 local218 = arg0.method7165();
		local218.oa(0, 0, arg0.c() - local172.Q());
		local172.method6778(local218, null, arg0.c());
		this.aClass104_10 = arg0.method7199(0, 0, this.anInt2087, this.anInt2087, true);
		this.aClass104_10.BA(0, 0, 3);
		arg0.N(Static96.anIntArray154[0], Static96.anIntArray154[1], Static96.anIntArray154[2], Static96.anIntArray154[3]);
	}
}
