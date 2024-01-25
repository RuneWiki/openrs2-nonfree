import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class15_Sub1_Sub2_Sub3 extends Class15_Sub1_Sub2 implements Interface27 {

	@OriginalMember(owner = "client!gu", name = "gb", descriptor = "Lclient!lca;")
	private Class191 aClass191_3;

	@OriginalMember(owner = "client!gu", name = "ob", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!gu", name = "wb", descriptor = "S")
	private final short aShort49;

	@OriginalMember(owner = "client!gu", name = "qb", descriptor = "Z")
	private boolean aBoolean318;

	@OriginalMember(owner = "client!gu", name = "Ab", descriptor = "Z")
	private final boolean aBoolean319;

	@OriginalMember(owner = "client!gu", name = "hb", descriptor = "B")
	private final byte aByte51;

	@OriginalMember(owner = "client!gu", name = "U", descriptor = "Z")
	private final boolean aBoolean316;

	@OriginalMember(owner = "client!gu", name = "cb", descriptor = "Z")
	private final boolean aBoolean317;

	@OriginalMember(owner = "client!gu", name = "xb", descriptor = "Lclient!r;")
	private Class8_Sub5_Sub11 aClass8_Sub5_Sub11_2;

	@OriginalMember(owner = "client!gu", name = "mb", descriptor = "Lclient!ka;")
	public Class83 aClass83_4;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ha;Lclient!vc;IIIIIZIIIIIIZ)V")
	public Class15_Sub1_Sub2_Sub3(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt10124 == 1, Static304.method4967(arg13, arg12));
		this.aByte52 = (byte) arg13;
		super.aByte125 = (byte) arg3;
		this.aShort49 = (short) arg1.anInt10077;
		this.aBoolean318 = arg14;
		this.aBoolean319 = arg7;
		this.aByte51 = (byte) arg12;
		this.aBoolean316 = arg1.anInt10102 != 0 && !arg7;
		this.aBoolean317 = arg0.method6091() && arg1.aBoolean725 && !this.aBoolean319 && Static155.aClass8_Sub25_6.aClass36_Sub14_1.method4894() != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean318) {
			local78 |= 0x10000;
		}
		@Pc(93) Class45 local93 = this.method3580(arg0, local78, this.aBoolean317);
		if (local93 != null) {
			this.aClass8_Sub5_Sub11_2 = local93.aClass8_Sub5_Sub11_1;
			this.aClass83_4 = local93.aClass83_1;
			if (this.aBoolean318) {
				this.aClass83_4 = this.aClass83_4.method7993((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8341(@OriginalArg(0) Class16 arg0) {
		@Pc(25) Class8_Sub5_Sub11 local25;
		if (this.aClass8_Sub5_Sub11_2 == null && this.aBoolean317) {
			@Pc(18) Class45 local18 = this.method3580(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass8_Sub5_Sub11_1;
		} else {
			local25 = this.aClass8_Sub5_Sub11_2;
			this.aClass8_Sub5_Sub11_2 = null;
		}
		if (local25 != null) {
			Static213.method4054(local25, super.aByte125, super.anInt10301, super.anInt10298, null);
		}
	}

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "(B)I")
	public int method3576() {
		return this.aClass83_4 == null ? 15 : this.aClass83_4.na() / 4;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V")
	@Override
	public void method8338() {
		if (this.aClass83_4 != null) {
			this.aClass83_4.method8002();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)I")
	@Override
	public int method8337() {
		return this.aByte52;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8339() {
		return this.aBoolean317;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class15_Sub1_Sub4_Sub2) {
			@Pc(28) Class15_Sub1_Sub4_Sub2 local28 = (Class15_Sub1_Sub4_Sub2) arg2;
			if (this.aClass83_4 != null && local28.aClass83_6 != null) {
				this.aClass83_4.method7995(local28.aClass83_6, arg3, arg5, arg4, arg0);
			}
		} else if (arg2 instanceof Class15_Sub1_Sub2_Sub3) {
			@Pc(8) Class15_Sub1_Sub2_Sub3 local8 = (Class15_Sub1_Sub2_Sub3) arg2;
			if (this.aClass83_4 != null && local8.aClass83_4 != null) {
				this.aClass83_4.method7995(local8.aClass83_4, arg3, arg5, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		@Pc(19) Class83 local19 = this.method3579(arg2, 131072);
		if (local19 == null) {
			return false;
		} else {
			@Pc(24) Class54 local24 = arg2.method6124();
			local24.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
			return Static183.aBoolean308 ? local19.method7994(arg0, arg1, local24, false, 0, Static115.anInt3009) : local19.method8007(arg0, arg1, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		if (this.aClass191_3 == null) {
			this.aClass191_3 = Static327.method5365(super.anInt10298, this.method3579(arg0, 0), super.anInt10301, super.anInt10297);
		}
		return this.aClass191_3;
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(Z)I")
	@Override
	public int method8333(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return 46;
		} else if (this.aClass83_4 == null) {
			return 0;
		} else {
			return this.aClass83_4.ma();
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	@Override
	public void method8317() {
		this.aBoolean318 = false;
		if (this.aClass83_4 != null) {
			this.aClass83_4.s(this.aClass83_4.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8340(@OriginalArg(1) Class16 arg0) {
		@Pc(21) Class8_Sub5_Sub11 local21;
		if (this.aClass8_Sub5_Sub11_2 == null && this.aBoolean317) {
			@Pc(32) Class45 local32 = this.method3580(arg0, 262144, true);
			local21 = local32 == null ? null : local32.aClass8_Sub5_Sub11_1;
		} else {
			local21 = this.aClass8_Sub5_Sub11_2;
			this.aClass8_Sub5_Sub11_2 = null;
		}
		if (local21 != null) {
			Static560.method7830(local21, super.aByte125, super.anInt10301, super.anInt10298, null);
		}
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)I")
	@Override
	public int method8326() {
		return this.aClass83_4 == null ? 0 : this.aClass83_4.fa();
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8320() {
		if (this.aClass83_4 == null) {
			return true;
		} else {
			return !this.aClass83_4.r();
		}
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)I")
	@Override
	public int method8343() {
		return this.aByte51;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)I")
	@Override
	public int method8342() {
		return this.aShort49 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZLclient!ha;I)Lclient!ka;")
	private Class83 method3579(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass83_4 != null && arg0.method6121(this.aClass83_4.ua(), arg1) == 0) {
			return this.aClass83_4;
		} else {
			@Pc(26) Class45 local26 = this.method3580(arg0, arg1, false);
			return local26 == null ? null : local26.aClass83_1;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		if (this.aClass83_4 == null) {
			return null;
		}
		@Pc(17) Class54 local17 = arg0.method6124();
		local17.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
		@Pc(31) Class15_Sub7 local31 = Static342.method5465(this.aBoolean316, 1);
		if (Static183.aBoolean308) {
			this.aClass83_4.method8009(local17, local31.aClass15_Sub6Array1[0], Static115.anInt3009, 0);
		} else {
			this.aClass83_4.method8003(local17, local31.aClass15_Sub6Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8332() {
		return this.aBoolean318;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ha;IZB)Lclient!bt;")
	private Class45 method3580(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class352 local13 = Static437.aClass199_3.method5342(this.aShort49 & 0xFFFF);
		@Pc(27) Class86 local27;
		@Pc(31) Class86 local31;
		if (this.aBoolean319) {
			local27 = Static253.aClass86Array4[super.aByte125];
			local31 = Static86.aClass86Array2[0];
		} else {
			local27 = Static86.aClass86Array2[super.aByte125];
			if (super.aByte125 >= 3) {
				local31 = null;
			} else {
				local31 = Static86.aClass86Array2[super.aByte125 + 1];
			}
		}
		return local13.method8172(this.aByte51 == 11 ? this.aByte52 + 4 : this.aByte52, arg1, local31, arg2, super.anInt10298, arg0, super.anInt10297, this.aByte51 == 11 ? 10 : this.aByte51, local27, super.anInt10301);
	}

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8328() {
		return this.aClass83_4 == null ? false : this.aClass83_4.F();
	}
}
