import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class36 {

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
	private int anInt1512;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
	public int anInt1514;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
	private int anInt1515;

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "Lclient!c;")
	private Class5 aClass5_8;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
	private int anInt1520;

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
	private int anInt1523;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
	private final int anInt1513;

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
	private final int anInt1517;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
	private final int anInt1516;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "Z")
	private final boolean aBoolean147;

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
	private final int anInt1521;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
	private final int anInt1518;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
	private final int anInt1519;

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
	private final int anInt1522;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt1513 = arg2;
		this.anInt1517 = arg3;
		this.anInt1516 = arg4;
		this.aBoolean147 = arg7;
		this.anInt1521 = arg1;
		this.anInt1518 = arg6;
		this.anInt1519 = arg5;
		this.anInt1522 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!uo;IIIIII)V")
	public void method1290(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass5_8 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt1512 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt1520 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt1523) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt1523) / 2;
		if (local38 < arg4 && local38 + this.anInt1523 > 0 && local51 < arg3 && local51 + this.anInt1523 > 0) {
			this.aClass5_8.method3633(local51 + arg1, local38 + arg2, this.anInt1523, this.anInt1523);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!uo;Lclient!cs;)Z")
	public boolean method1292(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class36 arg1) {
		return this.aClass5_8 != null || this.method1297(arg0, arg1);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Lclient!uo;Lclient!cs;)V")
	private void method1293(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class36 arg1) {
		Static48.method1294(arg0);
		Static48.method1298(arg0);
		arg0.method2174(Static48.anIntArray119);
		arg0.method2226(0, 0, this.anInt1515, this.anInt1515);
		arg0.method2177();
		arg0.method2241(0, 0, this.anInt1515, this.anInt1515, this.anInt1518 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean147) {
				local31 = -arg1.anInt1513;
				local33 = -arg1.anInt1517;
				local35 = -arg1.anInt1516;
			} else {
				local31 = arg1.anInt1513 - this.anInt1513;
				local33 = arg1.anInt1517 - this.anInt1517;
				local35 = arg1.anInt1516 - this.anInt1516;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt1512 != 0) {
			local79 = Class1_Sub3_Sub8.anIntArray159[this.anInt1512];
			local84 = Class1_Sub3_Sub8.anIntArray156[this.anInt1512];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt1520 != 0) {
			local79 = Class1_Sub3_Sub8.anIntArray159[this.anInt1520];
			local84 = Class1_Sub3_Sub8.anIntArray156[this.anInt1520];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class73 local147 = Static48.aClass73_2.method3306((byte) 0, 25600, true);
		if (arg0.method2175()) {
			local147.method3292((short) 0, (short) this.anInt1521);
		} else {
			local147.method3300((short) 127, Static68.anInterface2_3.method4244(this.anInt1521).aShort54);
			local147.method3292((short) 0, (short) -1);
		}
		arg0.method2140(1.0F);
		arg0.method2189(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt1515 * 1024 / (local147.method3291() - local147.method3323());
		if (this.anInt1518 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method2242(this.anInt1515 / 2, this.anInt1515 / 2, local84, local84);
		arg0.method2201(arg0.method2221());
		@Pc(223) Class109 local223 = arg0.method2221();
		local223.method3873(0, 0, arg0.method2223() - local147.method3328());
		local147.method3310(local223, null, 1024);
		@Pc(245) int local245 = this.anInt1515 * 13 / 16;
		@Pc(252) int local252 = (this.anInt1515 - local245) / 2;
		Static48.aClass5_9.method3634(local252, local252, local245, local245, 1, this.anInt1518 | 0xFF000000, 1);
		this.aClass5_8 = arg0.method2219(0, 0, this.anInt1515, this.anInt1515, true);
		arg0.method2177();
		arg0.method2241(0, 0, this.anInt1515, this.anInt1515, 0, 0);
		Static48.aClass5_7.method3634(0, 0, this.anInt1515, this.anInt1515, 0, 0, 0);
		this.aClass5_8.method3628(0);
		arg0.method2226(Static48.anIntArray119[0], Static48.anIntArray119[1], Static48.anIntArray119[2], Static48.anIntArray119[3]);
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "()V")
	public void method1295() {
		this.aClass5_8 = null;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(Lclient!uo;Lclient!cs;)V")
	private void method1296(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class36 arg1) {
		@Pc(6) Class82 local6 = Static221.method4154(this.anInt1521, Static269.aClass216_85);
		if (local6 == null) {
			return;
		}
		arg0.method2174(Static48.anIntArray119);
		arg0.method2226(0, 0, this.anInt1515, this.anInt1515);
		arg0.method2241(0, 0, this.anInt1515, this.anInt1515, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean147) {
				local32 = -arg1.anInt1513;
				local34 = -arg1.anInt1517;
				local36 = -arg1.anInt1516;
			} else {
				local32 = this.anInt1513 - arg1.anInt1513;
				local34 = this.anInt1517 - arg1.anInt1517;
				local36 = this.anInt1516 - arg1.anInt1516;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt1512 != 0) {
			local81 = -this.anInt1512 & 0x3FFF;
			local85 = Class1_Sub3_Sub8.anIntArray159[local81];
			local89 = Class1_Sub3_Sub8.anIntArray156[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt1520 != 0) {
			local81 = -this.anInt1520 & 0x3FFF;
			local85 = Class1_Sub3_Sub8.anIntArray159[local81];
			local89 = Class1_Sub3_Sub8.anIntArray156[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method2140(1.0F);
		arg0.method2189(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class73 local172 = arg0.method2153(local6, 1024, 0, 64, 768);
		local85 = local172.method3291() - local172.method3323();
		local89 = local172.method3297() - local172.method3327();
		local99 = local172.method3323() + local85 / 2;
		@Pc(198) int local198 = local172.method3327() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method2242(local99, local198, local205, local205);
		arg0.method2201(arg0.method2221());
		@Pc(218) Class109 local218 = arg0.method2194();
		local218.method3873(0, 0, arg0.method2223() - local172.method3328());
		local172.method3310(local218, null, arg0.method2223());
		this.aClass5_8 = arg0.method2219(0, 0, this.anInt1515, this.anInt1515, true);
		this.aClass5_8.method3628(3);
		arg0.method2226(Static48.anIntArray119[0], Static48.anIntArray119[1], Static48.anIntArray119[2], Static48.anIntArray119[3]);
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(Lclient!uo;Lclient!cs;)Z")
	private boolean method1297(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class36 arg1) {
		if (this.aClass5_8 == null) {
			if (this.anInt1522 == 0) {
				if (Static68.anInterface2_3.method4241(this.anInt1521)) {
					@Pc(23) int[] local23 = Static68.anInterface2_3.method4242(this.anInt1521, this.anInt1515, 0.7F, this.anInt1515);
					this.aClass5_8 = arg0.method2155(local23, this.anInt1515, this.anInt1515, this.anInt1515);
				}
			} else if (this.anInt1522 == 2) {
				this.method1296(arg0, arg1);
			} else if (this.anInt1522 == 1) {
				this.method1293(arg0, arg1);
			}
		}
		return this.aClass5_8 != null;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII)Z")
	public boolean method1299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean147) {
			this.anInt1514 = 1073741823;
			local7 = this.anInt1513;
			local12 = this.anInt1517;
			local17 = this.anInt1516;
		} else {
			local7 = this.anInt1513 - arg0;
			local12 = this.anInt1517 - arg1;
			local17 = this.anInt1516 - arg2;
			this.anInt1514 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt1514 == 0) {
				this.anInt1514 = 1;
			}
			local7 = (local7 << 8) / this.anInt1514;
			local12 = (local12 << 8) / this.anInt1514;
			local17 = (local17 << 8) / this.anInt1514;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt1523 = this.anInt1519 * arg3 / (this.aBoolean147 ? 1024 : this.anInt1514);
		} else {
			this.anInt1523 = 0;
		}
		if (this.anInt1523 < 8) {
			this.aClass5_8 = null;
			return false;
		}
		@Pc(143) int local143 = Static194.method3745(this.anInt1523);
		if (local143 > arg3) {
			local143 = Static258.method4650(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt1515) {
			this.anInt1515 = local143;
		}
		this.anInt1512 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt1520 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass5_8 = null;
		return true;
	}
}
