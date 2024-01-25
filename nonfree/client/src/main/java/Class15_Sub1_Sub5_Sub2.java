import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class15_Sub1_Sub5_Sub2 extends Class15_Sub1_Sub5 implements Interface27 {

	@OriginalMember(owner = "client!vu", name = "O", descriptor = "Lclient!lca;")
	private Class191 aClass191_8;

	@OriginalMember(owner = "client!vu", name = "jb", descriptor = "Z")
	private final boolean aBoolean745;

	@OriginalMember(owner = "client!vu", name = "db", descriptor = "B")
	private final byte aByte126;

	@OriginalMember(owner = "client!vu", name = "N", descriptor = "S")
	private final short aShort121;

	@OriginalMember(owner = "client!vu", name = "fb", descriptor = "Z")
	private final boolean aBoolean744;

	@OriginalMember(owner = "client!vu", name = "hb", descriptor = "B")
	private final byte aByte127;

	@OriginalMember(owner = "client!vu", name = "ab", descriptor = "Z")
	private final boolean aBoolean743;

	@OriginalMember(owner = "client!vu", name = "ob", descriptor = "Lclient!r;")
	private Class8_Sub5_Sub11 aClass8_Sub5_Sub11_5;

	@OriginalMember(owner = "client!vu", name = "X", descriptor = "Lclient!ka;")
	private Class83 aClass83_7;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!ha;Lclient!vc;IIIIIZIIII)V")
	public Class15_Sub1_Sub5_Sub2(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt10301 = arg4;
		this.aBoolean745 = arg1.anInt10102 != 0 && !arg7;
		this.aByte126 = (byte) arg11;
		this.aShort121 = (short) arg1.anInt10077;
		super.anInt10298 = arg6;
		this.aBoolean744 = arg7;
		this.aByte127 = (byte) arg10;
		this.aBoolean743 = arg0.method6091() && arg1.aBoolean725 && !this.aBoolean744 && Static155.aClass8_Sub25_6.aClass36_Sub14_1.method4894() != 0;
		@Pc(67) Class45 local67 = this.method8345(arg0, 2048, this.aBoolean743);
		if (local67 != null) {
			this.aClass8_Sub5_Sub11_5 = local67.aClass8_Sub5_Sub11_1;
			this.aClass83_7 = local67.aClass83_1;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8340(@OriginalArg(1) Class16 arg0) {
		@Pc(24) Class8_Sub5_Sub11 local24;
		if (this.aClass8_Sub5_Sub11_5 == null && this.aBoolean743) {
			@Pc(35) Class45 local35 = this.method8345(arg0, 262144, true);
			local24 = local35 == null ? null : local35.aClass8_Sub5_Sub11_1;
		} else {
			local24 = this.aClass8_Sub5_Sub11_5;
			this.aClass8_Sub5_Sub11_5 = null;
		}
		if (local24 != null) {
			Static560.method7830(local24, super.aByte125, super.anInt10301, super.anInt10298, null);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8339() {
		return this.aBoolean743;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		if (this.aClass83_7 == null) {
			return null;
		}
		@Pc(17) Class54 local17 = arg0.method6124();
		local17.method5128(super.aShort120 + super.anInt10301, super.anInt10297, super.aShort119 + super.anInt10298);
		@Pc(37) Class15_Sub7 local37 = Static342.method5465(this.aBoolean745, 1);
		if (Static183.aBoolean308) {
			this.aClass83_7.method8009(local17, local37.aClass15_Sub6Array1[0], Static115.anInt3009, 0);
		} else {
			this.aClass83_7.method8003(local17, local37.aClass15_Sub6Array1[0], 0);
		}
		return local37;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)I")
	@Override
	public int method8337() {
		return this.aByte126;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V")
	@Override
	public void method8338() {
		if (this.aClass83_7 != null) {
			this.aClass83_7.method8002();
		}
	}

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "(I)I")
	@Override
	public int method8326() {
		return this.aClass83_7 == null ? 0 : this.aClass83_7.fa();
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!ha;IZ)Lclient!bt;")
	private Class45 method8345(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class352 local13 = Static437.aClass199_3.method5342(this.aShort121 & 0xFFFF);
		@Pc(30) Class86 local30;
		@Pc(25) Class86 local25;
		if (this.aBoolean744) {
			local25 = Static86.aClass86Array2[0];
			local30 = Static253.aClass86Array4[super.aByte125];
		} else {
			if (super.aByte125 >= 3) {
				local25 = null;
			} else {
				local25 = Static86.aClass86Array2[super.aByte125 + 1];
			}
			local30 = Static86.aClass86Array2[super.aByte125];
		}
		return local13.method8172(this.aByte126, arg1, local25, arg2, super.anInt10298, arg0, super.anInt10297, this.aByte127, local30, super.anInt10301);
	}

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "(Z)I")
	@Override
	public int method8333(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static612.method8344();
		}
		return this.aClass83_7 == null ? 0 : this.aClass83_7.ma();
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8320() {
		if (this.aClass83_7 == null) {
			return true;
		} else {
			return !this.aClass83_7.r();
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		@Pc(11) Class83 local11 = this.method8347(131072, arg2);
		if (local11 == null) {
			return false;
		} else {
			@Pc(16) Class54 local16 = arg2.method6124();
			local16.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
			return Static183.aBoolean308 ? local11.method7994(arg0, arg1, local16, false, 0, Static115.anInt3009) : local11.method8007(arg0, arg1, local16, false, 0);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8341(@OriginalArg(0) Class16 arg0) {
		@Pc(25) Class8_Sub5_Sub11 local25;
		if (this.aClass8_Sub5_Sub11_5 == null && this.aBoolean743) {
			@Pc(18) Class45 local18 = this.method8345(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass8_Sub5_Sub11_1;
		} else {
			local25 = this.aClass8_Sub5_Sub11_5;
			this.aClass8_Sub5_Sub11_5 = null;
		}
		if (local25 != null) {
			Static213.method4054(local25, super.aByte125, super.anInt10301, super.anInt10298, null);
		}
	}

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8328() {
		return this.aClass83_7 == null ? false : this.aClass83_7.F();
	}

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "(B)I")
	@Override
	public int method8343() {
		return this.aByte127;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		if (this.aClass191_8 == null) {
			this.aClass191_8 = Static327.method5365(super.anInt10298, this.method8347(0, arg0), super.anInt10301, super.anInt10297);
		}
		return this.aClass191_8;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(B)I")
	@Override
	public int method8342() {
		return this.aShort121 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class83 method8347(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1) {
		if (this.aClass83_7 != null && arg1.method6121(this.aClass83_7.ua(), arg0) == 0) {
			return this.aClass83_7;
		} else {
			@Pc(26) Class45 local26 = this.method8345(arg1, arg0, false);
			return local26 == null ? null : local26.aClass83_1;
		}
	}
}
