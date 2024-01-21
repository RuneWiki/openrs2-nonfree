import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class1_Sub1_Sub4_Sub2_Sub1 extends Class1_Sub1_Sub4_Sub2 {

	@OriginalMember(owner = "client!dg", name = "oc", descriptor = "I")
	public int anInt1295;

	@OriginalMember(owner = "client!dg", name = "rc", descriptor = "Lclient!rf;")
	public Class70 aClass70_408;

	@OriginalMember(owner = "client!dg", name = "sc", descriptor = "I")
	public int anInt1296;

	@OriginalMember(owner = "client!dg", name = "tc", descriptor = "I")
	public int anInt1297;

	@OriginalMember(owner = "client!dg", name = "Bc", descriptor = "I")
	public int anInt1303;

	@OriginalMember(owner = "client!dg", name = "Fc", descriptor = "I")
	public int anInt1305;

	@OriginalMember(owner = "client!dg", name = "Jc", descriptor = "I")
	public int anInt1306;

	@OriginalMember(owner = "client!dg", name = "Pc", descriptor = "Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!dg", name = "Uc", descriptor = "I")
	public int anInt1311;

	@OriginalMember(owner = "client!dg", name = "cd", descriptor = "Lclient!ma;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!dg", name = "uc", descriptor = "I")
	public int anInt1298 = 0;

	@OriginalMember(owner = "client!dg", name = "mc", descriptor = "I")
	public int anInt1293 = 0;

	@OriginalMember(owner = "client!dg", name = "zc", descriptor = "S")
	private short aShort20 = 0;

	@OriginalMember(owner = "client!dg", name = "Hc", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!dg", name = "Dc", descriptor = "I")
	public int anInt1304 = 0;

	@OriginalMember(owner = "client!dg", name = "vc", descriptor = "I")
	public int anInt1299 = 0;

	@OriginalMember(owner = "client!dg", name = "Lc", descriptor = "I")
	public int anInt1308 = -1;

	@OriginalMember(owner = "client!dg", name = "yc", descriptor = "I")
	public int anInt1301 = -1;

	@OriginalMember(owner = "client!dg", name = "Sc", descriptor = "S")
	private short aShort21 = 0;

	@OriginalMember(owner = "client!dg", name = "Xc", descriptor = "I")
	public int anInt1312 = 0;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method1517() {
		return this.aClass49_1 != null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass49_1 == null) {
			return;
		}
		@Pc(27) Class1_Sub1_Sub17 local27 = super.anInt2041 != -1 && super.anInt2029 == 0 ? Static90.method1962(super.anInt2041) : null;
		@Pc(49) Class1_Sub1_Sub17 local49 = super.anInt2020 == -1 || this.aBoolean52 || super.anInt2034 == super.anInt2020 && local27 != null ? null : Static90.method1962(super.anInt2020);
		@Pc(60) Class1_Sub1_Sub4_Sub1 local60 = this.aClass49_1.method2218(local27, local49, super.anInt1999, super.anInt2009);
		if (local60 == null) {
			return;
		}
		local60.method723();
		super.aShort36 = local60.aShort36;
		if (this.aShort21 != 0 && this.aShort20 != 0) {
			@Pc(82) int local82 = Class1_Sub1_Sub1_Sub1.anIntArray11[arg0];
			@Pc(86) int local86 = Class1_Sub1_Sub1_Sub1.anIntArray8[arg0];
			@Pc(89) short local89 = this.aShort21;
			@Pc(92) short local92 = this.aShort20;
			@Pc(97) int local97 = -local89 / 2;
			@Pc(102) int local102 = -local92 / 2;
			@Pc(112) int local112 = local86 * local102 - local97 * local82 >> 16;
			@Pc(122) int local122 = local102 * local82 + local86 * local97 >> 16;
			@Pc(134) int local134 = Static156.method3142(local122 + super.anInt2030, Static56.anInt1784, super.anInt2001 + local112);
			@Pc(138) int local138 = local89 / 2;
			@Pc(143) int local143 = -local92 / 2;
			@Pc(153) int local153 = local138 * local86 + local82 * local143 >> 16;
			@Pc(164) int local164 = local86 * local143 - local82 * local138 >> 16;
			@Pc(169) int local169 = -local89 / 2;
			@Pc(173) int local173 = local92 / 2;
			@Pc(183) int local183 = local86 * local169 + local82 * local173 >> 16;
			@Pc(196) int local196 = Static156.method3142(local153 + super.anInt2030, Static56.anInt1784, super.anInt2001 + local164);
			@Pc(207) int local207 = local173 * local86 - local169 * local82 >> 16;
			@Pc(221) int local221 = Static156.method3142(super.anInt2030 + local183, Static56.anInt1784, super.anInt2001 + local207);
			@Pc(225) int local225 = local92 / 2;
			@Pc(229) int local229 = local89 / 2;
			@Pc(239) int local239 = local86 * local229 + local225 * local82 >> 16;
			@Pc(250) int local250 = local225 * local86 - local82 * local229 >> 16;
			@Pc(263) int local263 = Static156.method3142(local239 + super.anInt2030, Static56.anInt1784, super.anInt2001 + local250);
			@Pc(270) int local270 = local134 < local196 ? local134 : local196;
			@Pc(277) int local277 = local263 > local196 ? local196 : local263;
			@Pc(284) int local284 = local263 <= local221 ? local263 : local221;
			@Pc(298) int local298 = (int) (Math.atan2((double) (local270 - local284), (double) local92) * 320.0D) & 0x7FF;
			local60.method720(local298);
			@Pc(312) int local312 = local134 >= local221 ? local221 : local134;
			@Pc(326) int local326 = (int) (Math.atan2((double) (local312 - local277), (double) local89) * 320.0D) & 0x7FF;
			@Pc(336) int local336 = (local312 + local277 + local284 + local270) / 4;
			local60.method729(local326);
			local60.method728(0, local336 - super.anInt2049, 0);
		}
		@Pc(349) Class1_Sub1_Sub4_Sub1 local349 = null;
		if (!this.aBoolean52 && super.anInt2051 != -1 && super.anInt2018 != -1) {
			local349 = Static86.method1911(super.anInt2051).method3510(super.anInt2018);
			if (local349 != null) {
				local349.method728(0, -super.anInt2035, 0);
			}
		}
		@Pc(381) Class1_Sub1_Sub4_Sub1 local381 = null;
		if (!this.aBoolean52 && this.aClass1_Sub1_Sub4_Sub1_1 != null) {
			if (this.anInt1312 <= Static47.anInt1654) {
				this.aClass1_Sub1_Sub4_Sub1_1 = null;
			}
			if (Static47.anInt1654 >= this.anInt1299 && Static47.anInt1654 < this.anInt1312) {
				local381 = this.aClass1_Sub1_Sub4_Sub1_1;
				local381.method728(this.anInt1306 - super.anInt2030, this.anInt1297 + -super.anInt2049, this.anInt1305 - super.anInt2001);
				if (super.anInt2047 == 512) {
					local381.method726();
					local381.method726();
					local381.method726();
				} else if (super.anInt2047 == 1024) {
					local381.method726();
					local381.method726();
				} else if (super.anInt2047 == 1536) {
					local381.method726();
				}
			}
		}
		if (local349 != null) {
			local60 = ((Class1_Sub1_Sub4_Sub1_Sub1) local60).method741(local349);
		}
		if (local381 != null) {
			local60 = ((Class1_Sub1_Sub4_Sub1_Sub1) local60).method741(local381);
		}
		local60.aBoolean35 = true;
		local60.method3063(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local381 == null) {
			return;
		}
		if (super.anInt2047 == 512) {
			local381.method726();
		} else if (super.anInt2047 == 1024) {
			local381.method726();
			local381.method726();
		} else if (super.anInt2047 == 1536) {
			local381.method726();
			local381.method726();
			local381.method726();
		}
		local381.method728(super.anInt2030 - this.anInt1306, -this.anInt1297 + super.anInt2049, super.anInt2001 - this.anInt1305);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!fa;I)V")
	public void method959(@OriginalArg(0) Class1_Sub9 arg0) {
		arg0.anInt1592 = 0;
		@Pc(12) int local12 = arg0.method1234();
		if ((local12 & 0x2) == 2) {
			this.aShort21 = (short) (arg0.method1234() << 2);
			this.aShort20 = (short) (arg0.method1234() << 2);
		} else {
			this.aShort20 = 0;
			this.aShort21 = 0;
		}
		@Pc(45) int local45 = -1;
		super.anInt2004 = (local12 >> 3) + 1;
		@Pc(60) boolean local60 = (local12 & 0x4) != 0;
		this.anInt1308 = arg0.method1243();
		this.anInt1301 = arg0.method1243();
		@Pc(76) int local76 = local12 & 0x1;
		@Pc(79) int[] local79 = new int[12];
		this.anInt1304 = 0;
		@Pc(104) int local104;
		@Pc(110) int local110;
		for (@Pc(84) int local84 = 0; local84 < 12; local84++) {
			@Pc(90) int local90 = arg0.method1234();
			if (local90 == 0) {
				local79[local84] = 0;
			} else {
				local104 = arg0.method1234();
				local110 = local104 + (local90 << 8);
				if (local84 == 0 && local110 == 65535) {
					local45 = arg0.method1280();
					break;
				}
				if (local110 >= 32768) {
					local110 = Static53.anIntArray174[local110 - 32768];
					local79[local84] = local110 | 0x40000000;
					@Pc(148) int local148 = Static90.method1963(local110).anInt177;
					if (local148 != 0) {
						this.anInt1304 = local148;
					}
				} else {
					local79[local84] = local110 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(172) int[] local172 = new int[5];
		for (local104 = 0; local104 < 5; local104++) {
			local110 = arg0.method1234();
			if (local110 < 0 || Static176.aShortArrayArray6[local104].length <= local110) {
				local110 = 0;
			}
			local172[local104] = local110;
		}
		super.anInt2034 = arg0.method1280();
		if (super.anInt2034 == 65535) {
			super.anInt2034 = -1;
		}
		super.anInt2024 = arg0.method1280();
		if (super.anInt2024 == 65535) {
			super.anInt2024 = -1;
		}
		super.anInt2003 = super.anInt2024;
		super.anInt2043 = arg0.method1280();
		if (super.anInt2043 == 65535) {
			super.anInt2043 = -1;
		}
		super.anInt2038 = arg0.method1280();
		if (super.anInt2038 == 65535) {
			super.anInt2038 = -1;
		}
		super.anInt2032 = arg0.method1280();
		if (super.anInt2032 == 65535) {
			super.anInt2032 = -1;
		}
		super.anInt2022 = arg0.method1280();
		if (super.anInt2022 == 65535) {
			super.anInt2022 = -1;
		}
		super.anInt2042 = arg0.method1280();
		if (super.anInt2042 == 65535) {
			super.anInt2042 = -1;
		}
		this.aClass70_408 = Static108.method2267(arg0.method1269()).method2898();
		this.anInt1293 = arg0.method1234();
		if (local60) {
			this.anInt1298 = arg0.method1280();
		}
		if (this.aClass49_1 == null) {
			this.aClass49_1 = new Class49();
		}
		this.aClass49_1.method2217(local76 == 1, local172, local79, local45);
	}
}
