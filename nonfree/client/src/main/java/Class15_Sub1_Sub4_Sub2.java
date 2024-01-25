import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class15_Sub1_Sub4_Sub2 extends Class15_Sub1_Sub4 implements Interface27 {

	@OriginalMember(owner = "client!ki", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!ki", name = "hb", descriptor = "Lclient!lca;")
	private Class191 aClass191_4;

	@OriginalMember(owner = "client!ki", name = "mb", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!ki", name = "fb", descriptor = "Z")
	private final boolean aBoolean420;

	@OriginalMember(owner = "client!ki", name = "Y", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "Z")
	private final boolean aBoolean419;

	@OriginalMember(owner = "client!ki", name = "ib", descriptor = "Z")
	private boolean aBoolean421;

	@OriginalMember(owner = "client!ki", name = "T", descriptor = "S")
	private final short aShort62;

	@OriginalMember(owner = "client!ki", name = "ob", descriptor = "Z")
	private final boolean aBoolean422;

	@OriginalMember(owner = "client!ki", name = "kb", descriptor = "Lclient!r;")
	private Class8_Sub5_Sub11 aClass8_Sub5_Sub11_4;

	@OriginalMember(owner = "client!ki", name = "W", descriptor = "Lclient!ka;")
	public Class83 aClass83_6;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!ha;Lclient!vc;IIIIIZIIZ)V")
	public Class15_Sub1_Sub4_Sub2(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static59.method1635(arg8, arg9));
		super.anInt10298 = arg6;
		this.aByte60 = (byte) arg8;
		this.aBoolean420 = arg7;
		this.aByte59 = (byte) arg9;
		super.anInt10301 = arg4;
		this.aBoolean419 = arg1.anInt10102 != 0 && !arg7;
		this.aBoolean421 = arg10;
		this.aShort62 = (short) arg1.anInt10077;
		this.aBoolean422 = arg0.method6091() && arg1.aBoolean725 && !this.aBoolean420 && Static155.aClass8_Sub25_6.aClass36_Sub14_1.method4894() != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean421) {
			local69 |= 0x10000;
		}
		@Pc(84) Class45 local84 = this.method4800(arg0, this.aBoolean422, local69);
		if (local84 != null) {
			this.aClass8_Sub5_Sub11_4 = local84.aClass8_Sub5_Sub11_1;
			this.aClass83_6 = local84.aClass83_1;
			if (this.aBoolean421) {
				this.aClass83_6 = this.aClass83_6.method7993((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8332() {
		return this.aBoolean421;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		if (this.aClass191_4 == null) {
			this.aClass191_4 = Static327.method5365(super.anInt10298, this.method4797(0, arg0), super.anInt10301, super.anInt10297);
		}
		return this.aClass191_4;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class83 method4797(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		if (this.aClass83_6 != null && arg1.method6121(this.aClass83_6.ua(), arg0) == 0) {
			return this.aClass83_6;
		} else {
			@Pc(32) Class45 local32 = this.method4800(arg1, false, arg0);
			return local32 == null ? null : local32.aClass83_1;
		}
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(Z)I")
	@Override
	public int method8333(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return -70;
		} else if (this.aClass83_6 == null) {
			return 0;
		} else {
			return this.aClass83_6.ma();
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	@Override
	public void method8317() {
		this.aBoolean421 = false;
		if (this.aClass83_6 != null) {
			this.aClass83_6.s(this.aClass83_6.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8340(@OriginalArg(1) Class16 arg0) {
		@Pc(24) Class8_Sub5_Sub11 local24;
		if (this.aClass8_Sub5_Sub11_4 == null && this.aBoolean422) {
			@Pc(35) Class45 local35 = this.method4800(arg0, true, 262144);
			local24 = local35 == null ? null : local35.aClass8_Sub5_Sub11_1;
		} else {
			local24 = this.aClass8_Sub5_Sub11_4;
			this.aClass8_Sub5_Sub11_4 = null;
		}
		if (local24 != null) {
			Static560.method7830(local24, super.aByte125, super.anInt10301, super.anInt10298, null);
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)I")
	@Override
	public int method8342() {
		return this.aShort62 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8341(@OriginalArg(0) Class16 arg0) {
		@Pc(14) Class8_Sub5_Sub11 local14;
		if (this.aClass8_Sub5_Sub11_4 == null && this.aBoolean422) {
			@Pc(25) Class45 local25 = this.method4800(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass8_Sub5_Sub11_1;
		} else {
			local14 = this.aClass8_Sub5_Sub11_4;
			this.aClass8_Sub5_Sub11_4 = null;
		}
		if (local14 != null) {
			Static213.method4054(local14, super.aByte125, super.anInt10301, super.anInt10298, null);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class15_Sub1_Sub4_Sub2) {
			@Pc(28) Class15_Sub1_Sub4_Sub2 local28 = (Class15_Sub1_Sub4_Sub2) arg2;
			if (this.aClass83_6 != null && local28.aClass83_6 != null) {
				this.aClass83_6.method7995(local28.aClass83_6, arg3, arg5, arg4, arg0);
			}
		} else if (arg2 instanceof Class15_Sub1_Sub2_Sub3) {
			@Pc(8) Class15_Sub1_Sub2_Sub3 local8 = (Class15_Sub1_Sub2_Sub3) arg2;
			if (this.aClass83_6 != null && local8.aClass83_4 != null) {
				this.aClass83_6.method7995(local8.aClass83_4, arg3, arg5, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8339() {
		return this.aBoolean422;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		if (this.aClass83_6 == null) {
			return null;
		}
		@Pc(17) Class54 local17 = arg0.method6124();
		local17.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
		@Pc(31) Class15_Sub7 local31 = Static342.method5465(this.aBoolean419, 1);
		if (Static183.aBoolean308) {
			this.aClass83_6.method8009(local17, local31.aClass15_Sub6Array1[0], Static115.anInt3009, 0);
		} else {
			this.aClass83_6.method8003(local17, local31.aClass15_Sub6Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
	@Override
	public void method8338() {
		if (this.aClass83_6 != null) {
			this.aClass83_6.method8002();
		}
	}

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8328() {
		return this.aClass83_6 == null ? false : this.aClass83_6.F();
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)I")
	@Override
	public int method8343() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8320() {
		if (this.aClass83_6 == null) {
			return true;
		} else {
			return !this.aClass83_6.r();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ha;ZZI)Lclient!bt;")
	private Class45 method4800(@OriginalArg(0) Class16 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class352 local18 = Static437.aClass199_3.method5342(this.aShort62 & 0xFFFF);
		@Pc(26) Class86 local26;
		@Pc(30) Class86 local30;
		if (this.aBoolean420) {
			local26 = Static253.aClass86Array4[super.aByte125];
			local30 = Static86.aClass86Array2[0];
		} else {
			if (super.aByte125 < 3) {
				local30 = Static86.aClass86Array2[super.aByte125 + 1];
			} else {
				local30 = null;
			}
			local26 = Static86.aClass86Array2[super.aByte125];
		}
		return local18.method8172(this.aByte59, arg2, local30, arg1, super.anInt10298, arg0, super.anInt10297, this.aByte60, local26, super.anInt10301);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
	@Override
	public int method8337() {
		return this.aByte59;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		@Pc(9) Class83 local9 = this.method4797(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class54 local14 = arg2.method6124();
			local14.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
			return Static183.aBoolean308 ? local9.method7994(arg0, arg1, local14, false, 0, Static115.anInt3009) : local9.method8007(arg0, arg1, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)I")
	@Override
	public int method8326() {
		return this.aClass83_6 == null ? 0 : this.aClass83_6.fa();
	}
}
