import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class16_Sub1_Sub1_Sub2 extends Class16_Sub1_Sub1 {

	@OriginalMember(owner = "client!aq", name = "lb", descriptor = "Lclient!nd;")
	public static Class238 lb;

	@OriginalMember(owner = "client!aq", name = "gb", descriptor = "Lclient!od;")
	private Class16_Sub7 aClass16_Sub7_1;

	@OriginalMember(owner = "client!aq", name = "Y", descriptor = "I")
	private int anInt500 = 0;

	@OriginalMember(owner = "client!aq", name = "T", descriptor = "I")
	private int anInt495 = 0;

	@OriginalMember(owner = "client!aq", name = "rb", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!aq", name = "ib", descriptor = "I")
	private int anInt507 = 0;

	@OriginalMember(owner = "client!aq", name = "R", descriptor = "Z")
	private boolean aBoolean53 = true;

	@OriginalMember(owner = "client!aq", name = "ub", descriptor = "I")
	private int anInt517 = 0;

	@OriginalMember(owner = "client!aq", name = "ab", descriptor = "I")
	private int anInt501 = 0;

	@OriginalMember(owner = "client!aq", name = "xb", descriptor = "I")
	private final int anInt520 = -1;

	@OriginalMember(owner = "client!aq", name = "V", descriptor = "I")
	private final int anInt497;

	@OriginalMember(owner = "client!aq", name = "eb", descriptor = "I")
	public final int anInt504;

	@OriginalMember(owner = "client!aq", name = "Z", descriptor = "Lclient!mk;")
	private Class228 aClass228_1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class16_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt500 = arg12;
		this.anInt497 = arg0;
		this.anInt504 = arg2 + arg1;
		@Pc(54) Class354 local54 = Static546.aClass263_1.method6113(this.anInt497);
		@Pc(57) int local57 = local54.anInt9829;
		if (local57 == -1) {
			this.aBoolean54 = true;
		} else {
			this.aClass228_1 = Static479.aClass308_2.method7075(local57);
			this.aBoolean54 = false;
		}
		if (arg2 == this.anInt504) {
			Static145.method2602(this.anInt495, this, this.aClass228_1);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ha;Lclient!ka;ILclient!pda;)V")
	private void method600(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(3) Class51 arg2) {
		arg1.method6608(arg2);
		@Pc(14) Class287[] local14 = arg1.method6621();
		@Pc(17) Class156[] local17 = arg1.method6625();
		if ((this.aClass16_Sub7_1 == null || this.aClass16_Sub7_1.aBoolean488) && (local14 != null || local17 != null)) {
			this.aClass16_Sub7_1 = Static401.method5991(Static389.anInt6694, true);
		}
		if (this.aClass16_Sub7_1 != null) {
			this.aClass16_Sub7_1.method5981(arg0, (long) Static389.anInt6694, local14, local17);
			this.aClass16_Sub7_1.method5985(super.aByte109, super.aShort103, super.aShort104, super.aShort106, super.aShort105);
		}
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(B)V")
	@Override
	public void method6987() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ha;III)Lclient!ka;")
	private Class193 method601(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class354 local8 = Static546.aClass263_1.method6113(arg2);
		@Pc(19) Class91 local19 = Static124.aClass91Array1[super.aByte109];
		@Pc(32) Class91 local32 = super.aByte108 >= 3 ? null : Static124.aClass91Array1[super.aByte108 + 1];
		return this.aBoolean54 ? local8.method8353(super.anInt8036, super.anInt8037, local19, arg1, 0, Static479.aClass308_2, -1, super.anInt8034, local32, -1, arg0) : local8.method8353(super.anInt8036, super.anInt8037, local19, arg1, this.anInt507, Static479.aClass308_2, this.anInt495, super.anInt8034, local32, this.anInt520, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method6990() {
		return false;
	}

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "(I)I")
	@Override
	public int method6988(@OriginalArg(0) int arg0) {
		if (arg0 != 1027) {
			this.aClass228_1 = null;
		}
		return this.anInt501;
	}

	@OriginalMember(owner = "client!aq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass16_Sub7_1 != null) {
			this.aClass16_Sub7_1.method5990();
		}
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(II)V")
	public void method602(@OriginalArg(1) int arg0) {
		if (this.aBoolean54) {
			return;
		}
		this.anInt507 += arg0;
		while (this.aClass228_1.anIntArray404[this.anInt495] < this.anInt507) {
			this.anInt507 -= this.aClass228_1.anIntArray404[this.anInt495];
			this.anInt495++;
			if (this.aClass228_1.anIntArray403.length <= this.anInt495) {
				this.aBoolean54 = true;
				break;
			}
		}
		if (!this.aBoolean54) {
			Static145.method2602(this.anInt495, this, this.aClass228_1);
		}
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6974() {
		return this.aBoolean53;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
		@Pc(11) Class193 local11 = this.method601(arg0, 0, this.anInt497);
		if (local11 != null) {
			@Pc(16) Class51 local16 = arg0.method8154();
			local16.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
			this.method600(arg0, local11, local16);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	@Override
	public void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(B)I")
	@Override
	public int method6980() {
		return this.anInt517;
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6976() {
		return false;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
	public void method605() {
		if (this.aClass16_Sub7_1 != null) {
			this.aClass16_Sub7_1.method5990();
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		@Pc(20) Class193 local20 = this.method601(arg0, (this.anInt500 == 0 ? 0 : 5) | 0x800, this.anInt497);
		if (local20 == null) {
			return null;
		}
		if (this.anInt500 != 0) {
			local20.a(this.anInt500 * 2048);
		}
		@Pc(47) Class51 local47 = arg0.method8154();
		local47.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
		this.method600(arg0, local20, local47);
		@Pc(66) Class16_Sub5 local66 = Static134.method8011(false, 1);
		if (Static582.aBoolean678) {
			local20.method6622(local47, local66.aClass16_Sub10Array1[0], Static529.anInt8509, 0);
		} else {
			local20.method6612(local47, local66.aClass16_Sub10Array1[0], 0);
		}
		if (this.aClass16_Sub7_1 != null) {
			@Pc(94) Class119 local94 = this.aClass16_Sub7_1.method5982();
			if (Static582.aBoolean678) {
				arg0.method8165(local94, Static529.anInt8509);
			} else {
				arg0.method8101(local94);
			}
		}
		this.aBoolean53 = local20.F();
		this.anInt517 = local20.fa();
		this.anInt501 = local20.ma();
		return local66;
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		return null;
	}
}
