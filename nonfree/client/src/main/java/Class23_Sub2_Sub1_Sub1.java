import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class23_Sub2_Sub1_Sub1 extends Class23_Sub2_Sub1 {

	@OriginalMember(owner = "client!as", name = "M", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!as", name = "R", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!as", name = "U", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!as", name = "V", descriptor = "Lclient!f;")
	private Class23_Sub5 aClass23_Sub5_1;

	@OriginalMember(owner = "client!as", name = "Y", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!as", name = "pb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!as", name = "tb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!as", name = "wb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!as", name = "Ab", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!as", name = "Fb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!as", name = "Kb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!as", name = "P", descriptor = "I")
	private int anInt863 = -1;

	@OriginalMember(owner = "client!as", name = "O", descriptor = "I")
	private int anInt862 = 0;

	@OriginalMember(owner = "client!as", name = "xb", descriptor = "I")
	private int anInt886 = 0;

	@OriginalMember(owner = "client!as", name = "W", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!as", name = "cb", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!as", name = "S", descriptor = "I")
	private int anInt865 = 0;

	@OriginalMember(owner = "client!as", name = "Jb", descriptor = "I")
	private int anInt894 = 0;

	@OriginalMember(owner = "client!as", name = "Bb", descriptor = "I")
	private final int anInt889;

	@OriginalMember(owner = "client!as", name = "Z", descriptor = "I")
	public final int anInt869;

	@OriginalMember(owner = "client!as", name = "hb", descriptor = "I")
	private final int anInt875;

	@OriginalMember(owner = "client!as", name = "eb", descriptor = "I")
	private final int anInt873;

	@OriginalMember(owner = "client!as", name = "L", descriptor = "I")
	private final int anInt860;

	@OriginalMember(owner = "client!as", name = "ib", descriptor = "I")
	public final int anInt876;

	@OriginalMember(owner = "client!as", name = "kb", descriptor = "I")
	public final int anInt878;

	@OriginalMember(owner = "client!as", name = "sb", descriptor = "I")
	public final int anInt884;

	@OriginalMember(owner = "client!as", name = "jb", descriptor = "I")
	private final int anInt877;

	@OriginalMember(owner = "client!as", name = "gb", descriptor = "Z")
	private final boolean aBoolean83;

	@OriginalMember(owner = "client!as", name = "mb", descriptor = "I")
	private final int anInt879;

	@OriginalMember(owner = "client!as", name = "Q", descriptor = "Lclient!c;")
	private final Class48 aClass48_1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class23_Sub2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static194.method5133(arg3, arg4, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt889 = arg8;
		this.aBoolean82 = false;
		this.anInt869 = arg7;
		this.anInt875 = arg5;
		this.anInt873 = arg10;
		this.anInt860 = arg0;
		this.anInt876 = arg11;
		this.anInt878 = arg12;
		this.anInt884 = arg6;
		this.anInt877 = arg14;
		this.aBoolean83 = arg13;
		this.anInt879 = arg9;
		@Pc(91) int local91 = Static196.aClass315_2.method7420(this.anInt860).anInt1217;
		if (local91 == -1) {
			this.aClass48_1 = null;
		} else {
			this.aClass48_1 = Static483.aClass373_2.method8323(local91);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!ha;B)Lclient!ka;")
	private Class28 method919(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1) {
		@Pc(14) Class34 local14 = Static196.aClass315_2.method7420(this.anInt860);
		return local14.method1226(Static483.aClass373_2, this.anInt862, this.anInt894, arg0, arg1, this.anInt863);
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
		@Pc(15) Class28 local15 = this.method919(0, arg0);
		if (local15 == null) {
			return;
		}
		@Pc(21) Class25 local21 = arg0.method8156();
		local21.method4285(this.anInt867);
		local21.method4288(this.anInt864);
		local21.method4301((int) this.aDouble2, (int) this.aDouble4, (int) this.aDouble9);
		this.anInt865 = local15.fa();
		this.anInt886 = local15.ma();
		this.method921(arg0, local21, local15);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ha;BLclient!sk;Lclient!ka;)V")
	private void method921(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class28 arg2) {
		arg2.method6888(arg1);
		@Pc(9) Class261[] local9 = arg2.method6912();
		@Pc(18) Class298[] local18 = arg2.method6911();
		if ((this.aClass23_Sub5_1 == null || this.aClass23_Sub5_1.aBoolean225) && (local9 != null || local18 != null)) {
			this.aClass23_Sub5_1 = Static150.method2583(Static621.anInt9665, true);
		}
		if (this.aClass23_Sub5_1 != null) {
			this.aClass23_Sub5_1.method2593(arg0, (long) Static621.anInt9665, local9, local18);
			this.aClass23_Sub5_1.method2591(super.aByte142, super.aShort123, super.aShort125, super.aShort124, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!as", name = "f", descriptor = "(B)V")
	@Override
	public void method8612() {
		super.aShort124 = super.aShort122 = (short) (int) (this.aDouble9 / 512.0D);
		super.aShort123 = super.aShort125 = (short) (int) (this.aDouble2 / 512.0D);
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8594() {
		return this.aBoolean81;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)V")
	public void method922(@OriginalArg(0) int arg0) {
		this.aDouble9 += (double) arg0 * this.aDouble7;
		this.aBoolean82 = true;
		this.aDouble2 += this.aDouble8 * (double) arg0;
		if (this.aBoolean83) {
			this.aDouble4 = (double) (Static194.method5133((int) this.aDouble2, (int) this.aDouble9, super.aByte142) - this.anInt875);
		} else if (this.anInt889 == -1) {
			this.aDouble4 += (double) arg0 * this.aDouble5;
		} else {
			this.aDouble4 += (double) arg0 * this.aDouble6 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble5;
			this.aDouble5 += (double) arg0 * this.aDouble6;
		}
		this.anInt864 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt867 = (int) (Math.atan2(this.aDouble5, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass48_1 == null) {
			return;
		}
		this.anInt894 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass48_1.anIntArray68[this.anInt862] >= this.anInt894) {
						return;
					}
					this.anInt894 -= this.aClass48_1.anIntArray68[this.anInt862];
					this.anInt862++;
					if (this.aClass48_1.anIntArray72.length <= this.anInt862) {
						this.anInt862 -= this.aClass48_1.anInt1548;
						if (this.anInt862 < 0 || this.anInt862 >= this.aClass48_1.anIntArray72.length) {
							this.anInt862 = 0;
						}
					}
					this.anInt863 = this.anInt862 + 1;
				} while (this.aClass48_1.anIntArray72.length > this.anInt863);
				this.anInt863 -= this.aClass48_1.anInt1548;
			} while (this.anInt863 >= 0 && this.anInt863 < this.aClass48_1.anIntArray72.length);
			this.anInt863 = -1;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIBII)V")
	public void method923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean82) {
			@Pc(12) double local12 = (double) (arg3 - super.anInt10108);
			@Pc(19) double local19 = (double) (arg0 - super.anInt10109);
			@Pc(28) double local28 = Math.sqrt(local12 * local12 + local19 * local19);
			this.aDouble2 = (double) super.anInt10108 + local12 * (double) this.anInt879 / local28;
			this.aDouble9 = (double) super.anInt10109 + local19 * (double) this.anInt879 / local28;
			if (this.aBoolean83) {
				this.aDouble4 = (double) (Static194.method5133((int) this.aDouble2, (int) this.aDouble9, super.aByte142) - this.anInt875);
			} else {
				this.aDouble4 = (double) super.anInt10114;
			}
		}
		@Pc(98) double local98 = (double) (this.anInt869 + 1 - arg1);
		this.aDouble7 = ((double) arg0 - this.aDouble9) / local98;
		this.aDouble8 = ((double) arg3 - this.aDouble2) / local98;
		this.aDouble3 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble8 * this.aDouble8);
		if (this.anInt889 == -1) {
			this.aDouble5 = ((double) arg2 - this.aDouble4) / local98;
		} else {
			if (!this.aBoolean82) {
				this.aDouble5 = -this.aDouble3 * Math.tan((double) this.anInt889 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg2 - this.aDouble5 * local98 - this.aDouble4) * 2.0D / (local98 * local98);
		}
	}

	@OriginalMember(owner = "client!as", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass23_Sub5_1 != null) {
			this.aClass23_Sub5_1.method2579();
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public void method924() {
		if (this.aBoolean82 || this.anInt873 == 0) {
			return;
		}
		@Pc(22) Class23_Sub2_Sub1_Sub2 local22 = null;
		@Pc(31) int local31;
		if (this.anInt873 < 0) {
			local31 = -this.anInt873 - 1;
			if (Static251.anInt4687 == local31) {
				local22 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2;
			} else {
				local22 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local31];
			}
		} else {
			local31 = this.anInt873 - 1;
			@Pc(58) Class3_Sub11 local58 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local31);
			if (local58 != null) {
				local22 = local58.aClass23_Sub2_Sub1_Sub2_Sub2_1;
			}
		}
		if (local22 == null) {
			return;
		}
		super.anInt10108 = local22.anInt10108;
		super.anInt10109 = local22.anInt10109;
		super.anInt10114 = Static194.method5133(local22.anInt10108, local22.anInt10109, super.aByte142) - this.anInt875;
		if (this.anInt877 < 0) {
			return;
		}
		@Pc(96) Class351 local96 = local22.method8630();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		if (local96.anIntArrayArray99 != null && local96.anIntArrayArray99[this.anInt877] != null) {
			local98 = local96.anIntArrayArray99[this.anInt877][0];
			local100 = local96.anIntArrayArray99[this.anInt877][2];
		}
		if (local96.anIntArrayArray98 != null && local96.anIntArrayArray98[this.anInt877] != null) {
			local98 += local96.anIntArrayArray98[this.anInt877][0];
			local100 += local96.anIntArrayArray98[this.anInt877][2];
		}
		if (local98 != 0 || local100 != 0) {
			@Pc(170) int local170 = local22.aClass314_7.method7395();
			@Pc(172) int local172 = local170;
			if (local22.anIntArray656 != null && local22.anIntArray656[this.anInt877] != -1) {
				local172 = local22.anIntArray656[this.anInt877];
			}
			@Pc(196) int local196 = local172 - local170 & 0x3FFF;
			@Pc(200) int local200 = Class3_Sub7_Sub2.anIntArray171[local196];
			@Pc(204) int local204 = Class3_Sub7_Sub2.anIntArray170[local196];
			@Pc(214) int local214 = local98 * local204 + local100 * local200 >> 14;
			local100 = local204 * local100 - local98 * local200 >> 14;
			super.anInt10108 += local214;
			super.anInt10109 += local100;
		}
		return;
	}

	@OriginalMember(owner = "client!as", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8608() {
		return false;
	}

	@OriginalMember(owner = "client!as", name = "h", descriptor = "(I)I")
	@Override
	public int method8606(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.anInt867 = -6;
		}
		return this.anInt886;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!as", name = "g", descriptor = "(I)I")
	@Override
	public int method8601() {
		return this.anInt865;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
	public void method926() {
		if (this.aClass23_Sub5_1 != null) {
			this.aClass23_Sub5_1.method2579();
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		@Pc(11) Class28 local11 = this.method919(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class25 local18 = arg0.method8156();
		local18.method4285(this.anInt867);
		local18.method4288(this.anInt864);
		local18.method4301((int) this.aDouble2, (int) this.aDouble4, (int) this.aDouble9);
		this.method921(arg0, local18, local11);
		@Pc(48) Class23_Sub6 local48 = Static564.method8406(1, false);
		if (Static148.aBoolean221) {
			local11.method6894(local18, local48.aClass23_Sub4Array1[0], Static209.anInt10104, 0);
		} else {
			local11.method6908(local18, local48.aClass23_Sub4Array1[0], 0);
		}
		if (this.aClass23_Sub5_1 != null) {
			@Pc(82) Class237 local82 = this.aClass23_Sub5_1.method2587();
			if (Static148.aBoolean221) {
				arg0.method8115(local82, Static209.anInt10104);
			} else {
				arg0.method8119(local82);
			}
		}
		this.aBoolean81 = local11.F();
		this.anInt865 = local11.fa();
		this.anInt886 = local11.ma();
		return local48;
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V")
	@Override
	public void method8592() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!as", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return false;
	}
}
