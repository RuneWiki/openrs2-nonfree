import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "Lclient!ed;")
	private Class68 aClass68_6;

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "S")
	private final short aShort112;

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "B")
	private final byte aByte78;

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "Z")
	private final boolean aBoolean406;

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "Z")
	private boolean aBoolean407;

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "B")
	private final byte aByte77;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "Z")
	private final boolean aBoolean405;

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "B")
	private final byte aByte79;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "Z")
	private final boolean aBoolean408;

	@OriginalMember(owner = "client!mf", name = "L", descriptor = "Lclient!k;")
	private Class2_Sub13_Sub6 aClass2_Sub13_Sub6_4;

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "Lclient!r;")
	public Class63 aClass63_4;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!qa;Lclient!ih;IIIIIZIIIIIIZ)V")
	public Class1_Sub1_Sub5(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3679 == 1, Static12.method408(arg12, arg13));
		this.aShort112 = (short) arg1.anInt3646;
		this.aByte78 = (byte) arg12;
		this.aBoolean406 = arg7;
		this.aBoolean407 = arg14;
		this.aByte77 = (byte) arg3;
		this.aBoolean405 = arg1.anInt3660 != 0 && !arg7;
		this.aByte79 = (byte) arg13;
		this.aBoolean408 = arg0.method6065() && arg1.aBoolean291 && !this.aBoolean406 && Static281.aClass2_Sub19_Sub1_1.method2135(Static266.anInt4923) != 0;
		@Pc(79) int local79 = 2048;
		if (this.aBoolean407) {
			local79 |= 0x10000;
		}
		@Pc(94) Class252 local94 = this.method4688(local79, this.aBoolean408, arg0);
		if (local94 != null) {
			this.aClass2_Sub13_Sub6_4 = local94.aClass2_Sub13_Sub6_5;
			this.aClass63_4 = local94.aClass63_5;
			if (this.aBoolean407) {
				this.aClass63_4 = this.aClass63_4.method7706((byte) 0, local79, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I")
	@Override
	public int method6432() {
		return this.aClass63_4 == null ? 0 : this.aClass63_4.TA();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class63 local14 = this.method4690(131072, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class181 local19 = arg1.method6022();
			local19.oa(super.anInt7660, super.anInt7657, super.anInt7659);
			return local14.method7697(arg0, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return this.aBoolean408;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return this.aByte78;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		if (this.aClass63_4 == null) {
			return null;
		}
		@Pc(18) Class181 local18 = arg0.method6022();
		local18.oa(super.anInt7660, super.anInt7657, super.anInt7659);
		@Pc(28) Class6_Sub5 local28 = null;
		if (this.aBoolean405) {
			local28 = Static356.method2696(1);
		}
		this.aClass63_4.method7700(local18, local28 == null ? null : local28.aClass6_Sub4Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
		@Pc(33) Class2_Sub13_Sub6 local33;
		if (this.aClass2_Sub13_Sub6_4 == null && this.aBoolean408) {
			@Pc(26) Class252 local26 = this.method4688(262144, true, arg0);
			local33 = local26 == null ? null : local26.aClass2_Sub13_Sub6_5;
		} else {
			local33 = this.aClass2_Sub13_Sub6_4;
			this.aClass2_Sub13_Sub6_4 = null;
		}
		if (local33 != null) {
			Static151.method2619(local33, this.aByte77, super.anInt7660, super.anInt7659, null);
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
		this.aBoolean407 = false;
		if (this.aClass63_4 != null) {
			this.aClass63_4.m(this.aClass63_4.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZZLclient!qa;)Lclient!rp;")
	private Class252 method4688(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class39 arg2) {
		@Pc(13) Class129 local13 = Static505.aClass206_4.method5326(this.aShort112 & 0xFFFF);
		@Pc(43) Class75 local43;
		@Pc(29) Class75 local29;
		if (this.aBoolean406) {
			local43 = Static427.aClass75Array2[this.aByte77];
			local29 = Static164.aClass75Array1[0];
		} else {
			if (this.aByte77 >= 3) {
				local29 = null;
			} else {
				local29 = Static164.aClass75Array1[this.aByte77 + 1];
			}
			local43 = Static164.aClass75Array1[this.aByte77];
		}
		return local13.method3271(super.anInt7657, super.anInt7660, local43, super.anInt7659, this.aByte78 == 11 ? 10 : this.aByte78, arg1, arg0, this.aByte78 == 11 ? this.aByte79 + 4 : this.aByte79, local29, arg2);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return this.method4690(arg0, arg1);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		if (this.aClass68_6 == null) {
			this.aClass68_6 = Static51.method920(super.anInt7657, super.anInt7660, super.anInt7659, this.method4690(0, arg0));
		}
		return this.aClass68_6;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return this.aShort112 & 0xFFFF;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return this.aByte79;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZILclient!qa;)Lclient!r;")
	private Class63 method4690(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		if (this.aClass63_4 != null && arg1.method6070(this.aClass63_4.ba(), arg0) == 0) {
			return this.aClass63_4;
		} else {
			@Pc(26) Class252 local26 = this.method4688(arg0, false, arg1);
			return local26 == null ? null : local26.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
		@Pc(33) Class2_Sub13_Sub6 local33;
		if (this.aClass2_Sub13_Sub6_4 == null && this.aBoolean408) {
			@Pc(26) Class252 local26 = this.method4688(262144, true, arg0);
			local33 = local26 == null ? null : local26.aClass2_Sub13_Sub6_5;
		} else {
			local33 = this.aClass2_Sub13_Sub6_4;
			this.aClass2_Sub13_Sub6_4 = null;
		}
		if (local33 != null) {
			Static297.method4693(local33, this.aByte77, super.anInt7660, super.anInt7659, null);
		}
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)I")
	public int method4692() {
		return this.aClass63_4 == null ? 15 : this.aClass63_4.e() / 4;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return this.aBoolean407;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
		if (this.aClass63_4 != null) {
			this.aClass63_4.method7696();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class1_Sub2_Sub2) {
			@Pc(5) Class1_Sub2_Sub2 local5 = (Class1_Sub2_Sub2) arg4;
			if (this.aClass63_4 != null && local5.aClass63_3 != null) {
				this.aClass63_4.method7705(local5.aClass63_3, arg5, arg2, arg0, arg3);
			}
		} else if (arg4 instanceof Class1_Sub1_Sub5) {
			@Pc(28) Class1_Sub1_Sub5 local28 = (Class1_Sub1_Sub5) arg4;
			if (this.aClass63_4 != null && local28.aClass63_4 != null) {
				this.aClass63_4.method7705(local28.aClass63_4, arg5, arg2, arg0, arg3);
			}
		}
	}
}
