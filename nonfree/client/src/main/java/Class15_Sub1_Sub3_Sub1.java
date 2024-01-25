import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class15_Sub1_Sub3_Sub1 extends Class15_Sub1_Sub3 implements Interface27 {

	@OriginalMember(owner = "client!cq", name = "T", descriptor = "Lclient!lca;")
	private Class191 aClass191_1;

	@OriginalMember(owner = "client!cq", name = "db", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "client!cq", name = "X", descriptor = "B")
	private final byte aByte27;

	@OriginalMember(owner = "client!cq", name = "mb", descriptor = "Z")
	private final boolean aBoolean181;

	@OriginalMember(owner = "client!cq", name = "nb", descriptor = "Z")
	private final boolean aBoolean182;

	@OriginalMember(owner = "client!cq", name = "W", descriptor = "S")
	private final short aShort26;

	@OriginalMember(owner = "client!cq", name = "L", descriptor = "Z")
	private final boolean aBoolean178;

	@OriginalMember(owner = "client!cq", name = "kb", descriptor = "Lclient!ka;")
	private Class83 aClass83_2;

	@OriginalMember(owner = "client!cq", name = "lb", descriptor = "Lclient!r;")
	private Class8_Sub5_Sub11 lb;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ha;Lclient!vc;IIIIIZIZ)V")
	public Class15_Sub1_Sub3_Sub1(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt10117);
		super.anInt10301 = arg4;
		super.anInt10298 = arg6;
		this.aBoolean180 = arg9;
		this.aByte27 = (byte) arg8;
		this.aBoolean181 = arg7;
		this.aBoolean182 = arg1.anInt10102 != 0 && !arg7;
		this.aShort26 = (short) arg1.anInt10077;
		this.aBoolean178 = arg0.method6091() && arg1.aBoolean725 && !this.aBoolean181 && Static155.aClass8_Sub25_6.aClass36_Sub14_1.method4894() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean180) {
			local63 |= 0x10000;
		}
		@Pc(78) Class45 local78 = this.method2057(local63, this.aBoolean178, arg0);
		if (local78 != null) {
			this.aClass83_2 = local78.aClass83_1;
			this.lb = local78.aClass8_Sub5_Sub11_1;
			if (this.aBoolean180) {
				this.aClass83_2 = this.aClass83_2.method7993((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8332() {
		return this.aBoolean180;
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)I")
	@Override
	public int method8342() {
		return this.aShort26 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8339() {
		return this.aBoolean178;
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(B)I")
	@Override
	public int method8343() {
		return 22;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V")
	@Override
	public void method8338() {
		if (this.aClass83_2 != null) {
			this.aClass83_2.method8002();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZBLclient!ha;)Lclient!bt;")
	private Class45 method2057(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(18) Class352 local18 = Static437.aClass199_3.method5342(this.aShort26 & 0xFFFF);
		@Pc(26) Class86 local26;
		@Pc(30) Class86 local30;
		if (this.aBoolean181) {
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
		return local18.method8172(this.aByte27, arg0, local30, arg1, super.anInt10298, arg2, super.anInt10297, 22, local26, super.anInt10301);
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)I")
	@Override
	public int method8326() {
		return this.aClass83_2 == null ? 0 : this.aClass83_2.fa();
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		if (this.aClass191_1 == null) {
			this.aClass191_1 = Static327.method5365(super.anInt10298, this.method2058(arg0, 0), super.anInt10301, super.anInt10297);
		}
		return this.aClass191_1;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	@Override
	public void method8317() {
		this.aBoolean180 = false;
		if (this.aClass83_2 != null) {
			this.aClass83_2.s(this.aClass83_2.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class83 method2058(@OriginalArg(0) Class16 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass83_2 != null && arg0.method6121(this.aClass83_2.ua(), arg1) == 0) {
			return this.aClass83_2;
		} else {
			@Pc(34) Class45 local34 = this.method2057(arg1, false, arg0);
			return local34 == null ? null : local34.aClass83_1;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8341(@OriginalArg(0) Class16 arg0) {
		@Pc(25) Class8_Sub5_Sub11 local25;
		if (this.lb == null && this.aBoolean178) {
			@Pc(18) Class45 local18 = this.method2057(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass8_Sub5_Sub11_1;
		} else {
			local25 = this.lb;
			this.lb = null;
		}
		if (local25 != null) {
			Static213.method4054(local25, super.aByte125, super.anInt10301, super.anInt10298, null);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)I")
	@Override
	public int method8337() {
		return this.aByte27;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		if (this.aClass83_2 == null) {
			return null;
		}
		@Pc(17) Class54 local17 = arg0.method6124();
		local17.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
		@Pc(31) Class15_Sub7 local31 = Static342.method5465(this.aBoolean182, 1);
		if (Static183.aBoolean308) {
			this.aClass83_2.method8009(local17, local31.aClass15_Sub6Array1[0], Static115.anInt3009, 0);
		} else {
			this.aClass83_2.method8003(local17, local31.aClass15_Sub6Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class15_Sub1_Sub3_Sub1) {
			@Pc(10) Class15_Sub1_Sub3_Sub1 local10 = (Class15_Sub1_Sub3_Sub1) arg2;
			if (this.aClass83_2 != null && local10.aClass83_2 != null) {
				this.aClass83_2.method7995(local10.aClass83_2, arg3, arg5, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8320() {
		if (this.aClass83_2 == null) {
			return true;
		} else {
			return !this.aClass83_2.r();
		}
	}

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "(Z)I")
	@Override
	public int method8333(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass191_1 = null;
		}
		return this.aClass83_2 == null ? 0 : this.aClass83_2.ma();
	}

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8328() {
		return this.aClass83_2 == null ? false : this.aClass83_2.F();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		@Pc(9) Class83 local9 = this.method2058(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class54 local14 = arg2.method6124();
			local14.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
			return Static183.aBoolean308 ? local9.method7994(arg0, arg1, local14, false, 0, Static115.anInt3009) : local9.method8007(arg0, arg1, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8340(@OriginalArg(1) Class16 arg0) {
		@Pc(25) Class8_Sub5_Sub11 local25;
		if (this.lb == null && this.aBoolean178) {
			@Pc(18) Class45 local18 = this.method2057(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass8_Sub5_Sub11_1;
		} else {
			local25 = this.lb;
			this.lb = null;
		}
		if (local25 != null) {
			Static560.method7830(local25, super.aByte125, super.anInt10301, super.anInt10298, null);
		}
	}
}
