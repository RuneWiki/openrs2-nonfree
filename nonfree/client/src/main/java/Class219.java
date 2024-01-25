import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class219 {

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	private int anInt6211;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	private int anInt6212;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public int anInt6213;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	private int anInt6214;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	private int anInt6216;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!f;")
	private Class76 aClass76_19;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	private final int anInt6207;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	private final int anInt6208;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	private final int anInt6217;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Z")
	private final boolean aBoolean546;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	private final int anInt6209;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	private final int anInt6206;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
	private final int anInt6215;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	private final int anInt6210;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6207 = arg2;
		this.anInt6208 = arg3;
		this.anInt6217 = arg4;
		this.aBoolean546 = arg7;
		this.anInt6209 = arg1;
		this.anInt6206 = arg6;
		this.anInt6215 = arg5;
		this.anInt6210 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!qa;Lclient!sb;)V")
	private void method4932(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class219 arg1) {
		Static353.method4936(arg0);
		Static353.method4941(arg0);
		arg0.u(Static353.anIntArray419);
		arg0.pa(0, 0, this.anInt6216, this.anInt6216);
		arg0.method2284();
		arg0.NA(0, 0, this.anInt6216, this.anInt6216, this.anInt6206 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean546) {
				local31 = -arg1.anInt6207;
				local33 = -arg1.anInt6208;
				local35 = -arg1.anInt6217;
			} else {
				local31 = arg1.anInt6207 - this.anInt6207;
				local33 = arg1.anInt6208 - this.anInt6208;
				local35 = arg1.anInt6217 - this.anInt6217;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6212 != 0) {
			local79 = Class184.anIntArray349[this.anInt6212];
			local84 = Class184.anIntArray350[this.anInt6212];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt6211 != 0) {
			local79 = Class184.anIntArray349[this.anInt6211];
			local84 = Class184.anIntArray350[this.anInt6211];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class32 local147 = Static353.aClass32_7.method5678((byte) 0, 51200, true);
		if (arg0.method2225()) {
			local147.YA((short) 0, (short) this.anInt6209);
		} else {
			local147.N((short) 127, Static107.anInterface8_3.method3836(this.anInt6209).aShort60);
			local147.YA((short) 0, (short) -1);
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6216 * 1024 / (local147.VA() - local147.la());
		if (this.anInt6206 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt6216 / 2, this.anInt6216 / 2, local84, local84);
		arg0.m(arg0.method2286());
		@Pc(223) Class102 local223 = arg0.method2286();
		local223.R(0, 0, arg0.d() - local147.X());
		local147.method5677(local223, null, 1024);
		@Pc(245) int local245 = this.anInt6216 * 13 / 16;
		@Pc(252) int local252 = (this.anInt6216 - local245) / 2;
		Static353.aClass76_17.M(local252, local252, local245, local245, 0, this.anInt6206 | 0xFF000000, 1);
		this.aClass76_19 = arg0.method2244(0, 0, this.anInt6216, this.anInt6216, true);
		arg0.method2284();
		arg0.NA(0, 0, this.anInt6216, this.anInt6216, 0, 0);
		Static353.aClass76_18.M(0, 0, this.anInt6216, this.anInt6216, 1, 0, 0);
		this.aClass76_19.V(0, 0, 0);
		arg0.pa(Static353.anIntArray419[0], Static353.anIntArray419[1], Static353.anIntArray419[2], Static353.anIntArray419[3]);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
	public void method4933() {
		this.aClass76_19 = null;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lclient!qa;Lclient!sb;)V")
	private void method4934(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class219 arg1) {
		@Pc(6) Class266 local6 = Static92.method1558(Static403.aClass188_117, this.anInt6209);
		if (local6 == null) {
			return;
		}
		arg0.u(Static353.anIntArray419);
		arg0.pa(0, 0, this.anInt6216, this.anInt6216);
		arg0.NA(0, 0, this.anInt6216, this.anInt6216, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean546) {
				local32 = -arg1.anInt6207;
				local34 = -arg1.anInt6208;
				local36 = -arg1.anInt6217;
			} else {
				local32 = this.anInt6207 - arg1.anInt6207;
				local34 = this.anInt6208 - arg1.anInt6208;
				local36 = this.anInt6217 - arg1.anInt6217;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6212 != 0) {
			local81 = -this.anInt6212 & 0x3FFF;
			local85 = Class184.anIntArray349[local81];
			local89 = Class184.anIntArray350[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt6211 != 0) {
			local81 = -this.anInt6211 & 0x3FFF;
			local85 = Class184.anIntArray349[local81];
			local89 = Class184.anIntArray350[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class32 local172 = arg0.method2227(local6, 2048, 0, 64, 768);
		local85 = local172.VA() - local172.la();
		local89 = local172.E() - local172.b();
		local99 = local172.la() + local85 / 2;
		@Pc(198) int local198 = local172.b() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.m(arg0.method2286());
		@Pc(218) Class102 local218 = arg0.method2223();
		local218.R(0, 0, arg0.d() - local172.X());
		local172.method5677(local218, null, arg0.d());
		this.aClass76_19 = arg0.method2244(0, 0, this.anInt6216, this.anInt6216, true);
		this.aClass76_19.V(0, 0, 3);
		arg0.pa(Static353.anIntArray419[0], Static353.anIntArray419[1], Static353.anIntArray419[2], Static353.anIntArray419[3]);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)Z")
	public boolean method4935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean546) {
			this.anInt6213 = 1073741823;
			local7 = this.anInt6207;
			local12 = this.anInt6208;
			local17 = this.anInt6217;
		} else {
			local7 = this.anInt6207 - arg0;
			local12 = this.anInt6208 - arg1;
			local17 = this.anInt6217 - arg2;
			this.anInt6213 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6213 == 0) {
				this.anInt6213 = 1;
			}
			local7 = (local7 << 8) / this.anInt6213;
			local12 = (local12 << 8) / this.anInt6213;
			local17 = (local17 << 8) / this.anInt6213;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6214 = this.anInt6215 * arg3 / (this.aBoolean546 ? 1024 : this.anInt6213);
		} else {
			this.anInt6214 = 0;
		}
		if (this.anInt6214 < 8) {
			this.aClass76_19 = null;
			return false;
		}
		@Pc(143) int local143 = Static316.method4530(this.anInt6214);
		if (local143 > arg3) {
			local143 = Static288.method4219(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6216) {
			this.anInt6216 = local143;
		}
		this.anInt6212 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt6211 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass76_19 = null;
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(Lclient!qa;Lclient!sb;)Z")
	public boolean method4938(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class219 arg1) {
		return this.aClass76_19 != null || this.method4940(arg0, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method4939(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass76_19 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6212 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6211 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6214) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6214) / 2;
		if (local38 < arg4 && local38 + this.anInt6214 > 0 && local51 < arg3 && local51 + this.anInt6214 > 0) {
			this.aClass76_19.method6093(local51 + arg1, local38 + arg2, this.anInt6214, this.anInt6214);
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(Lclient!qa;Lclient!sb;)Z")
	private boolean method4940(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class219 arg1) {
		if (this.aClass76_19 == null) {
			if (this.anInt6210 == 0) {
				if (Static107.anInterface8_3.method3835(this.anInt6209)) {
					@Pc(23) int[] local23 = Static107.anInterface8_3.method3834(0.7F, this.anInt6216, this.anInt6216, this.anInt6209);
					this.aClass76_19 = arg0.method2257(local23, this.anInt6216, this.anInt6216, this.anInt6216);
				}
			} else if (this.anInt6210 == 2) {
				this.method4934(arg0, arg1);
			} else if (this.anInt6210 == 1) {
				this.method4932(arg0, arg1);
			}
		}
		return this.aClass76_19 != null;
	}
}
