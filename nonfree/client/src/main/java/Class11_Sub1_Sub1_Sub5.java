import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class11_Sub1_Sub1_Sub5 extends Class11_Sub1_Sub1 {

	@OriginalMember(owner = "client!nfa", name = "X", descriptor = "Lclient!f;")
	private Class11_Sub4 aClass11_Sub4_8;

	@OriginalMember(owner = "client!nfa", name = "Y", descriptor = "D")
	private double aDouble13;

	@OriginalMember(owner = "client!nfa", name = "ab", descriptor = "I")
	private int anInt6683;

	@OriginalMember(owner = "client!nfa", name = "eb", descriptor = "D")
	private double aDouble14;

	@OriginalMember(owner = "client!nfa", name = "fb", descriptor = "D")
	private double aDouble15;

	@OriginalMember(owner = "client!nfa", name = "nb", descriptor = "D")
	private double aDouble16;

	@OriginalMember(owner = "client!nfa", name = "pb", descriptor = "D")
	private double aDouble17;

	@OriginalMember(owner = "client!nfa", name = "tb", descriptor = "D")
	private double aDouble18;

	@OriginalMember(owner = "client!nfa", name = "wb", descriptor = "D")
	private double aDouble19;

	@OriginalMember(owner = "client!nfa", name = "yb", descriptor = "D")
	private double aDouble20;

	@OriginalMember(owner = "client!nfa", name = "Eb", descriptor = "I")
	private int anInt6702;

	@OriginalMember(owner = "client!nfa", name = "O", descriptor = "I")
	private int anInt6675 = 0;

	@OriginalMember(owner = "client!nfa", name = "sb", descriptor = "I")
	private int anInt6695 = -1;

	@OriginalMember(owner = "client!nfa", name = "rb", descriptor = "Z")
	private boolean aBoolean498 = false;

	@OriginalMember(owner = "client!nfa", name = "vb", descriptor = "I")
	private int anInt6697 = 0;

	@OriginalMember(owner = "client!nfa", name = "Ab", descriptor = "I")
	private int anInt6699 = 0;

	@OriginalMember(owner = "client!nfa", name = "Cb", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "client!nfa", name = "Pb", descriptor = "I")
	private int anInt6711 = 0;

	@OriginalMember(owner = "client!nfa", name = "zb", descriptor = "Z")
	private final boolean aBoolean499;

	@OriginalMember(owner = "client!nfa", name = "P", descriptor = "I")
	private final int anInt6676;

	@OriginalMember(owner = "client!nfa", name = "qb", descriptor = "I")
	public final int anInt6694;

	@OriginalMember(owner = "client!nfa", name = "ib", descriptor = "I")
	public final int anInt6689;

	@OriginalMember(owner = "client!nfa", name = "Db", descriptor = "I")
	private int anInt6701;

	@OriginalMember(owner = "client!nfa", name = "xb", descriptor = "I")
	private final int anInt6698;

	@OriginalMember(owner = "client!nfa", name = "Bb", descriptor = "I")
	private final int anInt6700;

	@OriginalMember(owner = "client!nfa", name = "ub", descriptor = "I")
	public final int anInt6696;

	@OriginalMember(owner = "client!nfa", name = "U", descriptor = "I")
	public final int anInt6680;

	@OriginalMember(owner = "client!nfa", name = "R", descriptor = "I")
	private final int anInt6678;

	@OriginalMember(owner = "client!nfa", name = "hb", descriptor = "I")
	private final int anInt6688;

	@OriginalMember(owner = "client!nfa", name = "Z", descriptor = "Lclient!hn;")
	private final Class149 aClass149_3;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class11_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static582.method8038(arg1, arg3, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.aBoolean499 = arg13;
		this.anInt6676 = arg0;
		this.anInt6694 = arg7;
		this.anInt6689 = arg11;
		this.anInt6701 = arg10;
		this.anInt6698 = arg8;
		this.anInt6700 = arg5;
		this.anInt6696 = arg12;
		this.anInt6680 = arg6;
		this.anInt6678 = arg14;
		this.anInt6688 = arg9;
		this.aBoolean498 = false;
		@Pc(91) int local91 = Static414.aClass356_2.method8213(this.anInt6676).anInt1820;
		if (local91 == -1) {
			this.aClass149_3 = null;
		} else {
			this.aClass149_3 = Static185.aClass303_1.method7201(local91);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		return false;
	}

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
		@Pc(9) Class25 local9 = this.method5643(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(19) Class6 local19 = arg0.method7892();
		local19.method6699(this.anInt6683);
		local19.method6708(this.anInt6702);
		local19.method6694((int) this.aDouble14, (int) this.aDouble20, (int) this.aDouble15);
		this.anInt6711 = local9.fa();
		this.anInt6675 = local9.ma();
		this.method5644(arg0, local19, local9);
	}

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aBoolean500;
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(B)V")
	public void method5641() {
		if (this.aBoolean498 || this.anInt6701 == 0) {
			return;
		}
		@Pc(23) Class11_Sub1_Sub1_Sub2 local23 = null;
		@Pc(32) int local32;
		if (this.anInt6701 < 0) {
			local32 = -this.anInt6701 - 1;
			if (local32 == Static182.anInt4021) {
				local23 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2;
			} else {
				local23 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local32];
			}
		} else {
			local32 = this.anInt6701 - 1;
			@Pc(59) Class2_Sub51 local59 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local32);
			if (local59 != null) {
				local23 = local59.aClass11_Sub1_Sub1_Sub2_Sub2_2;
			}
		}
		if (local23 == null) {
			return;
		}
		super.anInt9925 = local23.anInt9925;
		super.anInt9929 = local23.anInt9929;
		super.anInt9930 = Static582.method8038(super.aByte124, local23.anInt9925, local23.anInt9929) - this.anInt6700;
		if (this.anInt6678 < 0) {
			return;
		}
		@Pc(94) Class165 local94 = local23.method2761();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		if (local94.anIntArrayArray39 != null && local94.anIntArrayArray39[this.anInt6678] != null) {
			local96 = local94.anIntArrayArray39[this.anInt6678][0];
			local98 = local94.anIntArrayArray39[this.anInt6678][2];
		}
		if (local94.anIntArrayArray40 != null && local94.anIntArrayArray40[this.anInt6678] != null) {
			local98 += local94.anIntArrayArray40[this.anInt6678][2];
			local96 += local94.anIntArrayArray40[this.anInt6678][0];
		}
		if (local96 != 0 || local98 != 0) {
			@Pc(165) int local165 = local23.aClass82_7.method1815();
			@Pc(167) int local167 = local165;
			if (local23.anIntArray231 != null && local23.anIntArray231[this.anInt6678] != -1) {
				local167 = local23.anIntArray231[this.anInt6678];
			}
			@Pc(191) int local191 = local167 - local165 & 0x3FFF;
			@Pc(195) int local195 = Class353.anIntArray681[local191];
			@Pc(199) int local199 = Class353.anIntArray682[local191];
			@Pc(209) int local209 = local199 * local96 + local195 * local98 >> 14;
			local98 = local199 * local98 - local96 * local195 >> 14;
			super.anInt9925 += local209;
			super.anInt9929 += local98;
		}
		return;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass11_Sub4_8 != null) {
			this.aClass11_Sub4_8.method2632();
		}
	}

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "(B)V")
	public void method5642() {
		if (this.aClass11_Sub4_8 != null) {
			this.aClass11_Sub4_8.method2632();
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class25 method5643(@OriginalArg(0) Class87 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class69 local15 = Static414.aClass356_2.method8213(this.anInt6676);
		return local15.method1581(this.anInt6699, this.anInt6697, arg0, this.anInt6695, arg1, Static185.aClass303_1);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!ha;ILclient!kd;Lclient!ka;)V")
	private void method5644(@OriginalArg(0) Class87 arg0, @OriginalArg(2) Class6 arg1, @OriginalArg(3) Class25 arg2) {
		arg2.method7723(arg1);
		@Pc(17) Class130[] local17 = arg2.method7731();
		@Pc(20) Class337[] local20 = arg2.method7724();
		if ((this.aClass11_Sub4_8 == null || this.aClass11_Sub4_8.aBoolean260) && (local17 != null || local20 != null)) {
			this.aClass11_Sub4_8 = Static138.method2640(Static325.anInt5888, true);
		}
		if (this.aClass11_Sub4_8 != null) {
			this.aClass11_Sub4_8.method2636(arg0, (long) Static325.anInt5888, local17, local20);
			this.aClass11_Sub4_8.method2629(super.aByte124, super.aShort95, super.aShort96, super.aShort97, super.aShort94);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		@Pc(11) Class25 local11 = this.method5643(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class6 local18 = arg0.method7892();
		local18.method6699(this.anInt6683);
		local18.method6708(this.anInt6702);
		local18.method6694((int) this.aDouble14, (int) this.aDouble20, (int) this.aDouble15);
		this.method5644(arg0, local18, local11);
		@Pc(56) Class11_Sub10 local56 = Static600.method8238(1, false);
		if (Static172.aBoolean322) {
			local11.method7725(local18, local56.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
		} else {
			local11.method7735(local18, local56.aClass11_Sub7Array1[0], 0);
		}
		if (this.aClass11_Sub4_8 != null) {
			@Pc(84) Class247 local84 = this.aClass11_Sub4_8.method2638();
			if (Static172.aBoolean322) {
				arg0.method7972(local84, Static388.anInt6979);
			} else {
				arg0.method7939(local84);
			}
		}
		this.aBoolean500 = local11.F();
		this.anInt6711 = local11.fa();
		this.anInt6675 = local11.ma();
		return local56;
	}

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method8313() {
		return false;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIII)V")
	public void method5645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) double local19;
		if (!this.aBoolean498) {
			local19 = arg0 - super.anInt9925;
			@Pc(26) double local26 = (double) (arg2 - super.anInt9929);
			@Pc(35) double local35 = Math.sqrt(local26 * local26 + local19 * local19);
			this.aDouble14 = (double) super.anInt9925 + local19 * (double) this.anInt6688 / local35;
			this.aDouble15 = local26 * (double) this.anInt6688 / local35 + (double) super.anInt9929;
			if (this.aBoolean499) {
				this.aDouble20 = Static582.method8038(super.aByte124, (int) this.aDouble14, (int) this.aDouble15) - this.anInt6700;
			} else {
				this.aDouble20 = super.anInt9930;
			}
		}
		local19 = this.anInt6694 + 1 - arg3;
		this.aDouble19 = ((double) arg2 - this.aDouble15) / local19;
		this.aDouble18 = ((double) arg0 - this.aDouble14) / local19;
		this.aDouble17 = Math.sqrt(this.aDouble19 * this.aDouble19 + this.aDouble18 * this.aDouble18);
		if (this.anInt6698 == -1) {
			this.aDouble16 = ((double) arg1 - this.aDouble20) / local19;
		} else {
			if (!this.aBoolean498) {
				this.aDouble16 = -this.aDouble17 * Math.tan((double) this.anInt6698 * 0.02454369D);
			}
			this.aDouble13 = ((double) arg1 - this.aDouble20 - this.aDouble16 * local19) * 2.0D / (local19 * local19);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		if (arg0 != -83) {
			this.anInt6701 = -53;
		}
		return this.anInt6675;
	}

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return this.anInt6711;
	}

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "(I)V")
	@Override
	public void method8311() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZI)V")
	public void method5646(@OriginalArg(1) int arg0) {
		this.aDouble15 += this.aDouble19 * (double) arg0;
		this.aDouble14 += this.aDouble18 * (double) arg0;
		this.aBoolean498 = true;
		if (this.aBoolean499) {
			this.aDouble20 = Static582.method8038(super.aByte124, (int) this.aDouble14, (int) this.aDouble15) - this.anInt6700;
		} else if (this.anInt6698 == -1) {
			this.aDouble20 += this.aDouble16 * (double) arg0;
		} else {
			this.aDouble20 += (double) arg0 * 0.5D * this.aDouble13 * (double) arg0 + this.aDouble16 * (double) arg0;
			this.aDouble16 += this.aDouble13 * (double) arg0;
		}
		this.anInt6702 = (int) (Math.atan2(this.aDouble18, this.aDouble19) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt6683 = (int) (Math.atan2(this.aDouble16, this.aDouble17) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass149_3 == null) {
			return;
		}
		this.anInt6699 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass149_3.anIntArray306[this.anInt6697] >= this.anInt6699) {
						return;
					}
					this.anInt6699 -= this.aClass149_3.anIntArray306[this.anInt6697];
					this.anInt6697++;
					if (this.aClass149_3.anIntArray308.length <= this.anInt6697) {
						this.anInt6697 -= this.aClass149_3.anInt4505;
						if (this.anInt6697 < 0 || this.aClass149_3.anIntArray308.length <= this.anInt6697) {
							this.anInt6697 = 0;
						}
					}
					this.anInt6695 = this.anInt6697 + 1;
				} while (this.anInt6695 < this.aClass149_3.anIntArray308.length);
				this.anInt6695 -= this.aClass149_3.anInt4505;
			} while (this.anInt6695 >= 0 && this.anInt6695 < this.aClass149_3.anIntArray308.length);
			this.anInt6695 = -1;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "(I)V")
	@Override
	public void method5637() {
		super.aShort97 = super.aShort94 = (short) (this.aDouble15 / 512.0D);
		super.aShort95 = super.aShort96 = (short) (this.aDouble14 / 512.0D);
	}
}
