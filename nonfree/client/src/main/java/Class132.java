import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class132 {

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
	private int anInt4204;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	private int anInt4205;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Lclient!aa;")
	private Class2 aClass2_21;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	public int anInt4208;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	private int anInt4210;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
	private int anInt4213;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	private final int anInt4206;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
	private final int anInt4211;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	private final int anInt4203;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "Z")
	private final boolean aBoolean265;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
	private final int anInt4209;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
	private final int anInt4212;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
	private final int anInt4207;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	private final int anInt4214;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4206 = arg2;
		this.anInt4211 = arg3;
		this.anInt4203 = arg4;
		this.aBoolean265 = arg7;
		this.anInt4209 = arg1;
		this.anInt4212 = arg6;
		this.anInt4207 = arg5;
		this.anInt4214 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)Z")
	public boolean method3635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean265) {
			this.anInt4208 = 1073741823;
			local7 = this.anInt4206;
			local12 = this.anInt4211;
			local17 = this.anInt4203;
		} else {
			local7 = this.anInt4206 - arg0;
			local12 = this.anInt4211 - arg1;
			local17 = this.anInt4203 - arg2;
			this.anInt4208 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4208 == 0) {
				this.anInt4208 = 1;
			}
			local7 = (local7 << 8) / this.anInt4208;
			local12 = (local12 << 8) / this.anInt4208;
			local17 = (local17 << 8) / this.anInt4208;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4204 = this.anInt4207 * arg3 / (this.aBoolean265 ? 1024 : this.anInt4208);
		} else {
			this.anInt4204 = 0;
		}
		if (this.anInt4204 < 8) {
			this.aClass2_21 = null;
			return false;
		}
		@Pc(143) int local143 = Static84.method6309(this.anInt4204);
		if (local143 > arg3) {
			local143 = Static284.method4425(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4205) {
			this.anInt4205 = local143;
		}
		this.anInt4213 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt4210 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass2_21 = null;
		return true;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!qa;Lclient!kk;)Z")
	public boolean method3636(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class132 arg1) {
		return this.aClass2_21 != null || this.method3638(arg0, arg1);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Lclient!qa;Lclient!kk;)Z")
	private boolean method3638(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class132 arg1) {
		if (this.aClass2_21 == null) {
			if (this.anInt4214 == 0) {
				if (Static2.anInterface4_1.method5684(this.anInt4209)) {
					@Pc(23) int[] local23 = Static2.anInterface4_1.method5683(this.anInt4205, this.anInt4205, this.anInt4209, 0.7F);
					this.aClass2_21 = arg0.method2055(local23, this.anInt4205, this.anInt4205, this.anInt4205);
				}
			} else if (this.anInt4214 == 2) {
				this.method3644(arg0, arg1);
			} else if (this.anInt4214 == 1) {
				this.method3641(arg0, arg1);
			}
		}
		return this.aClass2_21 != null;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "()V")
	public void method3639() {
		this.aClass2_21 = null;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(Lclient!qa;Lclient!kk;)V")
	private void method3641(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class132 arg1) {
		Static205.method3634(arg0);
		Static205.method3640(arg0);
		arg0.p(Static205.anIntArray319);
		arg0.w(0, 0, this.anInt4205, this.anInt4205);
		arg0.method2083();
		arg0.M(0, 0, this.anInt4205, this.anInt4205, this.anInt4212 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean265) {
				local31 = -arg1.anInt4206;
				local33 = -arg1.anInt4211;
				local35 = -arg1.anInt4203;
			} else {
				local31 = arg1.anInt4206 - this.anInt4206;
				local33 = arg1.anInt4211 - this.anInt4211;
				local35 = arg1.anInt4203 - this.anInt4203;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4213 != 0) {
			local79 = Class4_Sub13.anIntArray497[this.anInt4213];
			local84 = Class4_Sub13.anIntArray496[this.anInt4213];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt4210 != 0) {
			local79 = Class4_Sub13.anIntArray497[this.anInt4210];
			local84 = Class4_Sub13.anIntArray496[this.anInt4210];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class57 local147 = Static205.aClass57_4.method6075((byte) 0, 51200, true);
		if (arg0.method2090()) {
			local147.G((short) 0, (short) this.anInt4209);
		} else {
			local147.i((short) 127, Static2.anInterface4_1.method5685(this.anInt4209).aShort51);
			local147.G((short) 0, (short) -1);
		}
		arg0.MA(1.0F);
		arg0.la(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4205 * 1024 / (local147.J() - local147.da());
		if (this.anInt4212 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.b(this.anInt4205 / 2, this.anInt4205 / 2, local84, local84);
		arg0.method2064(arg0.method2103());
		@Pc(223) Class72 local223 = arg0.method2103();
		local223.C(0, 0, arg0.na() - local147.K());
		local147.method6087(local223, null, 1024);
		@Pc(245) int local245 = this.anInt4205 * 13 / 16;
		@Pc(252) int local252 = (this.anInt4205 - local245) / 2;
		Static205.aClass2_20.XA(local252, local252, local245, local245, 0, this.anInt4212 | 0xFF000000, 1);
		this.aClass2_21 = arg0.method2058(0, 0, this.anInt4205, this.anInt4205, true);
		arg0.method2083();
		arg0.M(0, 0, this.anInt4205, this.anInt4205, 0, 0);
		Static205.aClass2_22.XA(0, 0, this.anInt4205, this.anInt4205, 1, 0, 0);
		this.aClass2_21.J(0, 0, 0);
		arg0.w(Static205.anIntArray319[0], Static205.anIntArray319[1], Static205.anIntArray319[2], Static205.anIntArray319[3]);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method3642(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass2_21 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4213 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4210 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4204) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4204) / 2;
		if (local38 < arg4 && local38 + this.anInt4204 > 0 && local51 < arg3 && local51 + this.anInt4204 > 0) {
			this.aClass2_21.method5914(local51 + arg1, local38 + arg2, this.anInt4204, this.anInt4204);
		}
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(Lclient!qa;Lclient!kk;)V")
	private void method3644(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class132 arg1) {
		@Pc(6) Class37 local6 = Static39.method813(Static194.aClass38_43, this.anInt4209);
		if (local6 == null) {
			return;
		}
		arg0.p(Static205.anIntArray319);
		arg0.w(0, 0, this.anInt4205, this.anInt4205);
		arg0.M(0, 0, this.anInt4205, this.anInt4205, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean265) {
				local32 = -arg1.anInt4206;
				local34 = -arg1.anInt4211;
				local36 = -arg1.anInt4203;
			} else {
				local32 = this.anInt4206 - arg1.anInt4206;
				local34 = this.anInt4211 - arg1.anInt4211;
				local36 = this.anInt4203 - arg1.anInt4203;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4213 != 0) {
			local81 = -this.anInt4213 & 0x3FFF;
			local85 = Class4_Sub13.anIntArray497[local81];
			local89 = Class4_Sub13.anIntArray496[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt4210 != 0) {
			local81 = -this.anInt4210 & 0x3FFF;
			local85 = Class4_Sub13.anIntArray497[local81];
			local89 = Class4_Sub13.anIntArray496[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.MA(1.0F);
		arg0.la(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class57 local172 = arg0.method2036(local6, 2048, 0, 64, 768);
		local85 = local172.J() - local172.da();
		local89 = local172.F() - local172.ja();
		local99 = local172.da() + local85 / 2;
		@Pc(198) int local198 = local172.ja() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.b(local99, local198, local205, local205);
		arg0.method2064(arg0.method2103());
		@Pc(218) Class72 local218 = arg0.method2092();
		local218.C(0, 0, arg0.na() - local172.K());
		local172.method6087(local218, null, arg0.na());
		this.aClass2_21 = arg0.method2058(0, 0, this.anInt4205, this.anInt4205, true);
		this.aClass2_21.J(0, 0, 3);
		arg0.w(Static205.anIntArray319[0], Static205.anIntArray319[1], Static205.anIntArray319[2], Static205.anIntArray319[3]);
	}
}
