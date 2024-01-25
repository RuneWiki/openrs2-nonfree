import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class14_Sub1_Sub1_Sub2 extends Class14_Sub1_Sub1 {

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!eg", name = "ab", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!eg", name = "jb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!eg", name = "ob", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!eg", name = "qb", descriptor = "I")
	private int anInt2028;

	@OriginalMember(owner = "client!eg", name = "vb", descriptor = "Lclient!l;")
	private Class14_Sub8 aClass14_Sub8_1;

	@OriginalMember(owner = "client!eg", name = "xb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!eg", name = "Kb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!eg", name = "Qb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!eg", name = "Rb", descriptor = "I")
	private int anInt2047;

	@OriginalMember(owner = "client!eg", name = "Sb", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
	private int anInt2015 = 0;

	@OriginalMember(owner = "client!eg", name = "kb", descriptor = "I")
	private int anInt2024 = 0;

	@OriginalMember(owner = "client!eg", name = "cb", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
	private int anInt2016 = 0;

	@OriginalMember(owner = "client!eg", name = "sb", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!eg", name = "Jb", descriptor = "I")
	private int anInt2041 = 0;

	@OriginalMember(owner = "client!eg", name = "Lb", descriptor = "I")
	private int anInt2042 = -1;

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
	private final int anInt2010;

	@OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
	public final int anInt2017;

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
	private final int anInt2014;

	@OriginalMember(owner = "client!eg", name = "Nb", descriptor = "I")
	public final int anInt2044;

	@OriginalMember(owner = "client!eg", name = "Hb", descriptor = "I")
	private final int anInt2039;

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
	private final int anInt2011;

	@OriginalMember(owner = "client!eg", name = "ub", descriptor = "I")
	public final int anInt2030;

	@OriginalMember(owner = "client!eg", name = "Gb", descriptor = "Z")
	private final boolean aBoolean157;

	@OriginalMember(owner = "client!eg", name = "fb", descriptor = "I")
	public final int anInt2020;

	@OriginalMember(owner = "client!eg", name = "Db", descriptor = "I")
	private final int anInt2036;

	@OriginalMember(owner = "client!eg", name = "Ob", descriptor = "I")
	private final int anInt2045;

	@OriginalMember(owner = "client!eg", name = "tb", descriptor = "Lclient!la;")
	private final Class200 aClass200_1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class14_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static600.method8378(arg4, arg3, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt2010 = arg5;
		this.anInt2017 = arg7;
		this.aBoolean156 = false;
		this.anInt2014 = arg0;
		this.anInt2044 = arg6;
		this.anInt2039 = arg10;
		this.anInt2011 = arg9;
		this.anInt2030 = arg11;
		this.aBoolean157 = arg13;
		this.anInt2020 = arg12;
		this.anInt2036 = arg14;
		this.anInt2045 = arg8;
		@Pc(91) int local91 = Static452.aClass170_4.method4001(this.anInt2014).anInt1416;
		if (local91 == -1) {
			this.aClass200_1 = null;
		} else {
			this.aClass200_1 = Static396.aClass359_2.method8415(local91);
		}
	}

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return this.anInt2024;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		if (arg0 < 81) {
			Static123.method1869((long[]) null, (int[]) null);
		}
		return this.anInt2016;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
		@Pc(9) Class180 local9 = this.method1864(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class117 local15 = arg0.method7018();
		local15.method7246(this.anInt2047);
		local15.method7243(this.anInt2028);
		local15.method7247((int) this.aDouble4, (int) this.aDouble6, (int) this.aDouble8);
		this.anInt2024 = local9.fa();
		this.anInt2016 = local9.ma();
		this.method1868(arg0, local9, local15);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public void method1863() {
		if (this.aClass14_Sub8_1 != null) {
			this.aClass14_Sub8_1.method4450();
		}
	}

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "(B)V")
	@Override
	public void method4226() {
		super.aShort71 = super.aShort72 = (short) (int) (this.aDouble8 / 512.0D);
		super.aShort74 = super.aShort73 = (short) (int) (this.aDouble4 / 512.0D);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ha;IZ)Lclient!ka;")
	private Class180 method1864(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class68 local9 = Static452.aClass170_4.method4001(this.anInt2014);
		return local9.method1357(arg0, arg1, this.anInt2041, this.anInt2015, Static396.aClass359_2, this.anInt2042);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII)V")
	public void method1865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean156) {
			local13 = (double) (arg0 - super.anInt9317);
			@Pc(20) double local20 = (double) (arg1 - super.anInt9315);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble4 = (double) super.anInt9317 + local13 * (double) this.anInt2011 / local29;
			this.aDouble8 = (double) super.anInt9315 + local20 * (double) this.anInt2011 / local29;
			if (this.aBoolean157) {
				this.aDouble6 = (double) (Static600.method8378((int) this.aDouble8, (int) this.aDouble4, super.aByte125) - this.anInt2010);
			} else {
				this.aDouble6 = (double) super.anInt9321;
			}
		}
		local13 = (double) (this.anInt2017 + 1 - arg3);
		this.aDouble5 = ((double) arg1 - this.aDouble8) / local13;
		this.aDouble10 = ((double) arg0 - this.aDouble4) / local13;
		this.aDouble7 = Math.sqrt(this.aDouble10 * this.aDouble10 + this.aDouble5 * this.aDouble5);
		if (this.anInt2045 == -1) {
			this.aDouble3 = ((double) arg2 - this.aDouble6) / local13;
		} else {
			if (!this.aBoolean156) {
				this.aDouble3 = -this.aDouble7 * Math.tan((double) this.anInt2045 * 0.02454369D);
			}
			this.aDouble9 = ((double) arg2 - local13 * this.aDouble3 - this.aDouble6) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
	public void method1866() {
		if (this.aBoolean156 || this.anInt2039 == 0) {
			return;
		}
		@Pc(21) Class14_Sub1_Sub1_Sub3 local21 = null;
		@Pc(32) int local32;
		if (this.anInt2039 >= 0) {
			local32 = this.anInt2039 - 1;
			@Pc(39) Class5_Sub13 local39 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local32);
			if (local39 != null) {
				local21 = local39.aClass14_Sub1_Sub1_Sub3_Sub2_1;
			}
		} else {
			local32 = -this.anInt2039 - 1;
			if (local32 == Static620.anInt10055) {
				local21 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1;
			} else {
				local21 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local32];
			}
		}
		if (local21 == null) {
			return;
		}
		super.anInt9315 = local21.anInt9315;
		super.anInt9317 = local21.anInt9317;
		super.anInt9321 = Static600.method8378(local21.anInt9315, local21.anInt9317, super.aByte125) - this.anInt2010;
		if (this.anInt2036 < 0) {
			return;
		}
		@Pc(92) Class295 local92 = local21.method2519();
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = 0;
		if (local92.anIntArrayArray48 != null && local92.anIntArrayArray48[this.anInt2036] != null) {
			local96 = local92.anIntArrayArray48[this.anInt2036][2];
			local94 = local92.anIntArrayArray48[this.anInt2036][0];
		}
		if (local92.anIntArrayArray49 != null && local92.anIntArrayArray49[this.anInt2036] != null) {
			local96 += local92.anIntArrayArray49[this.anInt2036][2];
			local94 += local92.anIntArrayArray49[this.anInt2036][0];
		}
		if (local94 != 0 || local96 != 0) {
			@Pc(166) int local166 = local21.aClass130_7.method2930();
			@Pc(168) int local168 = local166;
			if (local21.anIntArray244 != null && local21.anIntArray244[this.anInt2036] != -1) {
				local168 = local21.anIntArray244[this.anInt2036];
			}
			@Pc(190) int local190 = local168 - local166 & 0x3FFF;
			@Pc(194) int local194 = Class5_Sub12_Sub1.anIntArray748[local190];
			@Pc(198) int local198 = Class5_Sub12_Sub1.anIntArray749[local190];
			@Pc(208) int local208 = local198 * local94 + local96 * local194 >> 14;
			local96 = local96 * local198 - local194 * local94 >> 14;
			super.anInt9315 += local96;
			super.anInt9317 += local208;
		}
		return;
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7992() {
		return false;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		@Pc(11) Class180 local11 = this.method1864(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class117 local24 = arg0.method7018();
		local24.method7246(this.anInt2047);
		local24.method7243(this.anInt2028);
		local24.method7247((int) this.aDouble4, (int) this.aDouble6, (int) this.aDouble8);
		this.method1868(arg0, local11, local24);
		@Pc(54) Class14_Sub10 local54 = Static443.method6589(false, 1);
		if (Static605.aBoolean812) {
			local11.method7950(local24, local54.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
		} else {
			local11.method7949(local24, local54.aClass14_Sub9Array1[0], 0);
		}
		if (this.aClass14_Sub8_1 != null) {
			@Pc(82) Class345 local82 = this.aClass14_Sub8_1.method4458();
			if (Static605.aBoolean812) {
				arg0.method6986(local82, Static461.anInt7840);
			} else {
				arg0.method7058(local82);
			}
		}
		this.aBoolean155 = local11.F();
		this.anInt2024 = local11.fa();
		this.anInt2016 = local11.ma();
		return local54;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aBoolean155;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ha;ILclient!ka;Lclient!ofa;)V")
	private void method1868(@OriginalArg(0) Class126 arg0, @OriginalArg(2) Class180 arg1, @OriginalArg(3) Class117 arg2) {
		arg1.method7951(arg2);
		@Pc(9) Class57[] local9 = arg1.method7940();
		@Pc(18) Class143[] local18 = arg1.method7935();
		if ((this.aClass14_Sub8_1 == null || this.aClass14_Sub8_1.aBoolean397) && (local9 != null || local18 != null)) {
			this.aClass14_Sub8_1 = Static307.method4460(Static235.anInt3998, true);
		}
		if (this.aClass14_Sub8_1 != null) {
			this.aClass14_Sub8_1.method4456(arg0, (long) Static235.anInt3998, local9, local18);
			this.aClass14_Sub8_1.method4447(super.aByte125, super.aShort74, super.aShort73, super.aShort71, super.aShort72);
		}
	}

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "(I)V")
	@Override
	public void method8001() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
	public void method1870(@OriginalArg(1) int arg0) {
		this.aBoolean156 = true;
		this.aDouble8 += (double) arg0 * this.aDouble5;
		this.aDouble4 += (double) arg0 * this.aDouble10;
		if (this.aBoolean157) {
			this.aDouble6 = (double) (Static600.method8378((int) this.aDouble8, (int) this.aDouble4, super.aByte125) - this.anInt2010);
		} else if (this.anInt2045 == -1) {
			this.aDouble6 += this.aDouble3 * (double) arg0;
		} else {
			this.aDouble6 += this.aDouble3 * (double) arg0 + this.aDouble9 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble3 += (double) arg0 * this.aDouble9;
		}
		this.anInt2028 = (int) (Math.atan2(this.aDouble10, this.aDouble5) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2047 = (int) (Math.atan2(this.aDouble3, this.aDouble7) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass200_1 == null) {
			return;
		}
		this.anInt2041 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2041 <= this.aClass200_1.anIntArray388[this.anInt2015]) {
						return;
					}
					this.anInt2041 -= this.aClass200_1.anIntArray388[this.anInt2015];
					this.anInt2015++;
					if (this.anInt2015 >= this.aClass200_1.anIntArray389.length) {
						this.anInt2015 -= this.aClass200_1.anInt4887;
						if (this.anInt2015 < 0 || this.anInt2015 >= this.aClass200_1.anIntArray389.length) {
							this.anInt2015 = 0;
						}
					}
					this.anInt2042 = this.anInt2015 + 1;
				} while (this.anInt2042 < this.aClass200_1.anIntArray389.length);
				this.anInt2042 -= this.aClass200_1.anInt4887;
			} while (this.anInt2042 >= 0 && this.aClass200_1.anIntArray389.length > this.anInt2042);
			this.anInt2042 = -1;
		}
	}

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		return false;
	}

	@OriginalMember(owner = "client!eg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass14_Sub8_1 != null) {
			this.aClass14_Sub8_1.method4450();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		return null;
	}
}
