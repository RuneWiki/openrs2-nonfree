import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class86 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	private int anInt2064;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	private int anInt2065;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	public int anInt2067;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	private int anInt2070;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "Lclient!xa;")
	private Class4 aClass4_5;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	private int anInt2074;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	private final int anInt2068;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	private final int anInt2072;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "I")
	private final int anInt2073;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "Z")
	private final boolean aBoolean136;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	private final int anInt2066;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	private final int anInt2069;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "I")
	private final int anInt2071;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	private final int anInt2075;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2068 = arg2;
		this.anInt2072 = arg3;
		this.anInt2073 = arg4;
		this.aBoolean136 = arg7;
		this.anInt2066 = arg1;
		this.anInt2069 = arg6;
		this.anInt2071 = arg5;
		this.anInt2075 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "()V")
	public void method1791() {
		this.aClass4_5 = null;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!oa;Lclient!el;)Z")
	public boolean method1792(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class86 arg1) {
		return this.aClass4_5 != null || this.method1796(arg0, arg1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)Z")
	public boolean method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean136) {
			this.anInt2067 = 1073741823;
			local7 = this.anInt2068;
			local12 = this.anInt2072;
			local17 = this.anInt2073;
		} else {
			local7 = this.anInt2068 - arg0;
			local12 = this.anInt2072 - arg1;
			local17 = this.anInt2073 - arg2;
			this.anInt2067 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2067 == 0) {
				this.anInt2067 = 1;
			}
			local7 = (local7 << 8) / this.anInt2067;
			local12 = (local12 << 8) / this.anInt2067;
			local17 = (local17 << 8) / this.anInt2067;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2074 = this.anInt2071 * arg3 / (this.aBoolean136 ? 1024 : this.anInt2067);
		} else {
			this.anInt2074 = 0;
		}
		if (this.anInt2074 < 8) {
			this.aClass4_5 = null;
			return false;
		}
		@Pc(143) int local143 = Static516.method7313(this.anInt2074);
		if (local143 > arg3) {
			local143 = Static21.method292(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2064) {
			this.anInt2064 = local143;
		}
		this.anInt2065 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt2070 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass4_5 = null;
		return true;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(Lclient!oa;Lclient!el;)V")
	private void method1794(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class86 arg1) {
		@Pc(6) Class274 local6 = Static250.method3550(Static60.aClass251_22, this.anInt2066);
		if (local6 == null) {
			return;
		}
		arg0.A(Static117.anIntArray278);
		arg0.ca(0, 0, this.anInt2064, this.anInt2064);
		arg0.C(0, 0, this.anInt2064, this.anInt2064, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean136) {
				local32 = -arg1.anInt2068;
				local34 = -arg1.anInt2072;
				local36 = -arg1.anInt2073;
			} else {
				local32 = this.anInt2068 - arg1.anInt2068;
				local34 = this.anInt2072 - arg1.anInt2072;
				local36 = this.anInt2073 - arg1.anInt2073;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2065 != 0) {
			local81 = -this.anInt2065 & 0x3FFF;
			local85 = Class138.anIntArray392[local81];
			local89 = Class138.anIntArray393[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt2070 != 0) {
			local81 = -this.anInt2070 & 0x3FFF;
			local85 = Class138.anIntArray392[local81];
			local89 = Class138.anIntArray393[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class22 local172 = arg0.method7088(local6, 2048, 0, 64, 768);
		local85 = local172.M() - local172.ha();
		local89 = local172.EA() - local172.DA();
		local99 = local172.ha() + local85 / 2;
		@Pc(198) int local198 = local172.DA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.m(local99, local198, local205, local205);
		arg0.method7112(arg0.method7146());
		@Pc(218) Class34 local218 = arg0.method7096();
		local218.GA(0, 0, arg0.U() - local172.LA());
		local172.method4702(local218, null, arg0.U());
		this.aClass4_5 = arg0.method7091(0, 0, this.anInt2064, this.anInt2064, true);
		this.aClass4_5.t(0, 0, 3);
		arg0.ca(Static117.anIntArray278[0], Static117.anIntArray278[1], Static117.anIntArray278[2], Static117.anIntArray278[3]);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!oa;IIIIII)V")
	public void method1795(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass4_5 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2065 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2070 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2074) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2074) / 2;
		if (local38 < arg4 && local38 + this.anInt2074 > 0 && local51 < arg3 && local51 + this.anInt2074 > 0) {
			this.aClass4_5.method6509(local51 + arg1, local38 + arg2, this.anInt2074, this.anInt2074);
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(Lclient!oa;Lclient!el;)Z")
	private boolean method1796(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class86 arg1) {
		if (this.aClass4_5 == null) {
			if (this.anInt2075 == 0) {
				if (Static155.anInterface7_4.method5207(this.anInt2066)) {
					@Pc(23) int[] local23 = Static155.anInterface7_4.method5206(this.anInt2064, 0.7F, this.anInt2064, this.anInt2066);
					this.aClass4_5 = arg0.method7110(local23, this.anInt2064, this.anInt2064, this.anInt2064);
				}
			} else if (this.anInt2075 == 2) {
				this.method1794(arg0, arg1);
			} else if (this.anInt2075 == 1) {
				this.method1798(arg0, arg1);
			}
		}
		return this.aClass4_5 != null;
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(Lclient!oa;Lclient!el;)V")
	private void method1798(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class86 arg1) {
		Static117.method1797(arg0);
		Static117.method1799(arg0);
		arg0.A(Static117.anIntArray278);
		arg0.ca(0, 0, this.anInt2064, this.anInt2064);
		arg0.method7084();
		arg0.C(0, 0, this.anInt2064, this.anInt2064, this.anInt2069 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean136) {
				local31 = -arg1.anInt2068;
				local33 = -arg1.anInt2072;
				local35 = -arg1.anInt2073;
			} else {
				local31 = arg1.anInt2068 - this.anInt2068;
				local33 = arg1.anInt2072 - this.anInt2072;
				local35 = arg1.anInt2073 - this.anInt2073;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2065 != 0) {
			local79 = Class138.anIntArray392[this.anInt2065];
			local84 = Class138.anIntArray393[this.anInt2065];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt2070 != 0) {
			local79 = Class138.anIntArray392[this.anInt2070];
			local84 = Class138.anIntArray393[this.anInt2070];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class22 local147 = Static117.aClass22_2.method4699((byte) 0, 51200, true);
		if (arg0.method7143()) {
			local147.ka((short) 0, (short) this.anInt2066);
		} else {
			local147.UA((short) 127, Static155.anInterface7_4.method5209(this.anInt2066).aShort30);
			local147.ka((short) 0, (short) -1);
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2064 * 1024 / (local147.M() - local147.ha());
		if (this.anInt2069 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.m(this.anInt2064 / 2, this.anInt2064 / 2, local84, local84);
		arg0.method7112(arg0.method7146());
		@Pc(223) Class34 local223 = arg0.method7146();
		local223.GA(0, 0, arg0.U() - local147.LA());
		local147.method4702(local223, null, 1024);
		@Pc(245) int local245 = this.anInt2064 * 13 / 16;
		@Pc(252) int local252 = (this.anInt2064 - local245) / 2;
		Static117.aClass4_4.KA(local252, local252, local245, local245, 0, this.anInt2069 | 0xFF000000, 1);
		this.aClass4_5 = arg0.method7091(0, 0, this.anInt2064, this.anInt2064, true);
		arg0.method7084();
		arg0.C(0, 0, this.anInt2064, this.anInt2064, 0, 0);
		Static117.aClass4_3.KA(0, 0, this.anInt2064, this.anInt2064, 1, 0, 0);
		this.aClass4_5.t(0, 0, 0);
		arg0.ca(Static117.anIntArray278[0], Static117.anIntArray278[1], Static117.anIntArray278[2], Static117.anIntArray278[3]);
	}
}
