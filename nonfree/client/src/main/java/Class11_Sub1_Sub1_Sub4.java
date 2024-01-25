import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class11_Sub1_Sub1_Sub4 extends Class11_Sub1_Sub1 {

	@OriginalMember(owner = "client!gda", name = "db", descriptor = "Lclient!f;")
	private Class11_Sub4 aClass11_Sub4_6;

	@OriginalMember(owner = "client!gda", name = "O", descriptor = "I")
	private int anInt3847 = 0;

	@OriginalMember(owner = "client!gda", name = "R", descriptor = "I")
	private final int anInt3850 = -1;

	@OriginalMember(owner = "client!gda", name = "W", descriptor = "I")
	private int anInt3855 = 0;

	@OriginalMember(owner = "client!gda", name = "ib", descriptor = "Z")
	private boolean aBoolean328 = true;

	@OriginalMember(owner = "client!gda", name = "kb", descriptor = "I")
	private int anInt3865 = 0;

	@OriginalMember(owner = "client!gda", name = "pb", descriptor = "I")
	private int anInt3869 = 0;

	@OriginalMember(owner = "client!gda", name = "cb", descriptor = "I")
	private int anInt3860 = 0;

	@OriginalMember(owner = "client!gda", name = "fb", descriptor = "Z")
	public boolean aBoolean327 = false;

	@OriginalMember(owner = "client!gda", name = "jb", descriptor = "I")
	public final int anInt3864;

	@OriginalMember(owner = "client!gda", name = "Q", descriptor = "I")
	private final int anInt3849;

	@OriginalMember(owner = "client!gda", name = "X", descriptor = "Lclient!hn;")
	private Class149 aClass149_2;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class11_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt3855 = arg12;
		this.anInt3864 = arg1 + arg2;
		this.anInt3849 = arg0;
		@Pc(53) Class69 local53 = Static414.aClass356_2.method8213(this.anInt3849);
		@Pc(56) int local56 = local53.anInt1820;
		if (local56 == -1) {
			this.aBoolean327 = true;
		} else {
			this.aClass149_2 = Static185.aClass303_1.method7201(local56);
			this.aBoolean327 = false;
		}
		if (this.anInt3864 == arg2) {
			Static330.method3630(this.anInt3865, this.aClass149_2, this);
		}
	}

	@OriginalMember(owner = "client!gda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass11_Sub4_6 != null) {
			this.aClass11_Sub4_6.method2632();
		}
	}

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)V")
	@Override
	public void method8311() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aBoolean328;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!kd;Lclient!ka;Lclient!ha;I)V")
	private void method3215(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) Class87 arg2) {
		arg1.method7723(arg0);
		@Pc(17) Class130[] local17 = arg1.method7731();
		@Pc(20) Class337[] local20 = arg1.method7724();
		if ((this.aClass11_Sub4_6 == null || this.aClass11_Sub4_6.aBoolean260) && (local17 != null || local20 != null)) {
			this.aClass11_Sub4_6 = Static138.method2640(Static325.anInt5888, true);
		}
		if (this.aClass11_Sub4_6 != null) {
			this.aClass11_Sub4_6.method2636(arg2, (long) Static325.anInt5888, local17, local20);
			this.aClass11_Sub4_6.method2629(super.aByte124, super.aShort95, super.aShort96, super.aShort97, super.aShort94);
		}
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
		@Pc(17) Class25 local17 = this.method3219(this.anInt3849, arg0, 0);
		if (local17 != null) {
			@Pc(22) Class6 local22 = arg0.method7892();
			local22.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
			this.method3215(local22, local17, arg0);
		}
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(II)V")
	public void method3216(@OriginalArg(1) int arg0) {
		if (this.aBoolean327) {
			return;
		}
		this.anInt3869 += arg0;
		while (this.aClass149_2.anIntArray306[this.anInt3865] < this.anInt3869) {
			this.anInt3869 -= this.aClass149_2.anIntArray306[this.anInt3865];
			this.anInt3865++;
			if (this.anInt3865 >= this.aClass149_2.anIntArray308.length) {
				this.aBoolean327 = true;
				break;
			}
		}
		if (!this.aBoolean327) {
			Static330.method3630(this.anInt3865, this.aClass149_2, this);
		}
	}

	@OriginalMember(owner = "client!gda", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return this.anInt3860;
	}

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		return false;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gda", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method8313() {
		return false;
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		@Pc(20) Class25 local20 = this.method3219(this.anInt3849, arg0, (this.anInt3855 == 0 ? 0 : 5) | 0x800);
		if (local20 == null) {
			return null;
		}
		if (this.anInt3855 != 0) {
			local20.a(this.anInt3855 * 2048);
		}
		@Pc(36) Class6 local36 = arg0.method7892();
		local36.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
		this.method3215(local36, local20, arg0);
		@Pc(55) Class11_Sub10 local55 = Static600.method8238(1, false);
		if (Static172.aBoolean322) {
			local20.method7725(local36, local55.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
		} else {
			local20.method7735(local36, local55.aClass11_Sub7Array1[0], 0);
		}
		if (this.aClass11_Sub4_6 != null) {
			@Pc(83) Class247 local83 = this.aClass11_Sub4_6.method2638();
			if (Static172.aBoolean322) {
				arg0.method7972(local83, Static388.anInt6979);
			} else {
				arg0.method7939(local83);
			}
		}
		this.aBoolean328 = local20.F();
		this.anInt3860 = local20.fa();
		this.anInt3847 = local20.ma();
		return local55;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	public void method3218() {
		if (this.aClass11_Sub4_6 != null) {
			this.aClass11_Sub4_6.method2632();
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BILclient!ha;I)Lclient!ka;")
	private Class25 method3219(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class69 local15 = Static414.aClass356_2.method8213(arg0);
		@Pc(20) Class112 local20 = Static178.aClass112Array2[super.aByte124];
		@Pc(35) Class112 local35 = super.aByte125 >= 3 ? null : Static178.aClass112Array2[super.aByte125 + 1];
		return this.aBoolean327 ? local15.method1583(0, -1, -1, super.anInt9925, arg2, super.anInt9930, super.anInt9929, Static185.aClass303_1, local35, arg1, local20) : local15.method1583(this.anInt3869, this.anInt3865, this.anInt3850, super.anInt9925, arg2, super.anInt9930, super.anInt9929, Static185.aClass303_1, local35, arg1, local20);
	}

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		return arg0 == -83 ? this.anInt3847 : 127;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
