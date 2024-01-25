import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class6 {

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "Lclient!f;")
	private Class78 aClass78_1;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
	public int anInt209;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	private final int anInt199;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
	private final int anInt200;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
	private final int anInt203;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "Z")
	private final boolean aBoolean13;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	private final int anInt207;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
	private final int anInt201;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
	private final int anInt210;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
	private final int anInt204;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt199 = arg2;
		this.anInt200 = arg3;
		this.anInt203 = arg4;
		this.aBoolean13 = arg7;
		this.anInt207 = arg1;
		this.anInt201 = arg6;
		this.anInt210 = arg5;
		this.anInt204 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
	public void method167() {
		this.aClass78_1 = null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!qa;Lclient!ah;)Z")
	public boolean method168(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class6 arg1) {
		return this.aClass78_1 != null || this.method174(arg0, arg1);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method169(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass78_1 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt202 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt208 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt206) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt206) / 2;
		if (local38 < arg4 && local38 + this.anInt206 > 0 && local51 < arg3 && local51 + this.anInt206 > 0) {
			this.aClass78_1.method6001(local51 + arg1, local38 + arg2, this.anInt206, this.anInt206);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)Z")
	public boolean method172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean13) {
			this.anInt209 = 1073741823;
			local7 = this.anInt199;
			local12 = this.anInt200;
			local17 = this.anInt203;
		} else {
			local7 = this.anInt199 - arg0;
			local12 = this.anInt200 - arg1;
			local17 = this.anInt203 - arg2;
			this.anInt209 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt209 == 0) {
				this.anInt209 = 1;
			}
			local7 = (local7 << 8) / this.anInt209;
			local12 = (local12 << 8) / this.anInt209;
			local17 = (local17 << 8) / this.anInt209;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt206 = this.anInt210 * arg3 / (this.aBoolean13 ? 1024 : this.anInt209);
		} else {
			this.anInt206 = 0;
		}
		if (this.anInt206 < 8) {
			this.aClass78_1 = null;
			return false;
		}
		@Pc(143) int local143 = Static30.method427(this.anInt206);
		if (local143 > arg3) {
			local143 = Static81.method1178(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt205) {
			this.anInt205 = local143;
		}
		this.anInt202 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt208 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass78_1 = null;
		return true;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lclient!qa;Lclient!ah;)Z")
	private boolean method174(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class6 arg1) {
		if (this.aClass78_1 == null) {
			if (this.anInt204 == 0) {
				if (Static264.anInterface5_14.method3922(this.anInt207)) {
					@Pc(23) int[] local23 = Static264.anInterface5_14.method3921(this.anInt207, this.anInt205, this.anInt205, 0.7F);
					this.aClass78_1 = arg0.method4575(local23, this.anInt205, this.anInt205, this.anInt205);
				}
			} else if (this.anInt204 == 2) {
				this.method176(arg0, arg1);
			} else if (this.anInt204 == 1) {
				this.method175(arg0, arg1);
			}
		}
		return this.aClass78_1 != null;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(Lclient!qa;Lclient!ah;)V")
	private void method175(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class6 arg1) {
		Static8.method173(arg0);
		Static8.method170(arg0);
		arg0.u(Static8.anIntArray11);
		arg0.pa(0, 0, this.anInt205, this.anInt205);
		arg0.method4621();
		arg0.NA(0, 0, this.anInt205, this.anInt205, this.anInt201 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean13) {
				local31 = -arg1.anInt199;
				local33 = -arg1.anInt200;
				local35 = -arg1.anInt203;
			} else {
				local31 = arg1.anInt199 - this.anInt199;
				local33 = arg1.anInt200 - this.anInt200;
				local35 = arg1.anInt203 - this.anInt203;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt202 != 0) {
			local79 = Class262.anIntArray575[this.anInt202];
			local84 = Class262.anIntArray576[this.anInt202];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt208 != 0) {
			local79 = Class262.anIntArray575[this.anInt208];
			local84 = Class262.anIntArray576[this.anInt208];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class37 local147 = Static8.aClass37_1.method4155((byte) 0, 51200, true);
		if (arg0.method4645()) {
			local147.YA((short) 0, (short) this.anInt207);
		} else {
			local147.N((short) 127, Static264.anInterface5_14.method3920(this.anInt207).aShort63);
			local147.YA((short) 0, (short) -1);
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt205 * 1024 / (local147.VA() - local147.la());
		if (this.anInt201 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt205 / 2, this.anInt205 / 2, local84, local84);
		arg0.m(arg0.method4592());
		@Pc(223) Class43 local223 = arg0.method4592();
		local223.R(0, 0, arg0.d() - local147.X());
		local147.method4163(local223, null, 1024);
		@Pc(245) int local245 = this.anInt205 * 13 / 16;
		@Pc(252) int local252 = (this.anInt205 - local245) / 2;
		Static8.aClass78_2.M(local252, local252, local245, local245, 0, this.anInt201 | 0xFF000000, 1);
		this.aClass78_1 = arg0.method4627(0, 0, this.anInt205, this.anInt205, true);
		arg0.method4621();
		arg0.NA(0, 0, this.anInt205, this.anInt205, 0, 0);
		Static8.aClass78_3.M(0, 0, this.anInt205, this.anInt205, 1, 0, 0);
		this.aClass78_1.V(0, 0, 0);
		arg0.pa(Static8.anIntArray11[0], Static8.anIntArray11[1], Static8.anIntArray11[2], Static8.anIntArray11[3]);
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(Lclient!qa;Lclient!ah;)V")
	private void method176(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class6 arg1) {
		@Pc(6) Class155 local6 = Static106.method1704(this.anInt207, Static62.aClass109_23);
		if (local6 == null) {
			return;
		}
		arg0.u(Static8.anIntArray11);
		arg0.pa(0, 0, this.anInt205, this.anInt205);
		arg0.NA(0, 0, this.anInt205, this.anInt205, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean13) {
				local32 = -arg1.anInt199;
				local34 = -arg1.anInt200;
				local36 = -arg1.anInt203;
			} else {
				local32 = this.anInt199 - arg1.anInt199;
				local34 = this.anInt200 - arg1.anInt200;
				local36 = this.anInt203 - arg1.anInt203;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt202 != 0) {
			local81 = -this.anInt202 & 0x3FFF;
			local85 = Class262.anIntArray575[local81];
			local89 = Class262.anIntArray576[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt208 != 0) {
			local81 = -this.anInt208 & 0x3FFF;
			local85 = Class262.anIntArray575[local81];
			local89 = Class262.anIntArray576[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class37 local172 = arg0.method4617(local6, 2048, 0, 64, 768);
		local85 = local172.VA() - local172.la();
		local89 = local172.E() - local172.b();
		local99 = local172.la() + local85 / 2;
		@Pc(198) int local198 = local172.b() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.m(arg0.method4592());
		@Pc(218) Class43 local218 = arg0.method4588();
		local218.R(0, 0, arg0.d() - local172.X());
		local172.method4163(local218, null, arg0.d());
		this.aClass78_1 = arg0.method4627(0, 0, this.anInt205, this.anInt205, true);
		this.aClass78_1.V(0, 0, 3);
		arg0.pa(Static8.anIntArray11[0], Static8.anIntArray11[1], Static8.anIntArray11[2], Static8.anIntArray11[3]);
	}
}
