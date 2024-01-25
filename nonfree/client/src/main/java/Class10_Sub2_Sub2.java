import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class10_Sub2_Sub2 extends Class10_Sub2 implements Interface17 {

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "Lclient!dd;")
	private Class68 aClass68_5;

	@OriginalMember(owner = "client!lp", name = "K", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Z")
	private final boolean aBoolean419;

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "S")
	private final short aShort83;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "Z")
	private final boolean aBoolean422;

	@OriginalMember(owner = "client!lp", name = "J", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Z")
	private boolean aBoolean420;

	@OriginalMember(owner = "client!lp", name = "C", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!lp", name = "A", descriptor = "Lclient!ba;")
	public Class9 aClass9_4;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "Lclient!w;")
	private Class4_Sub7_Sub3 aClass4_Sub7_Sub3_4;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!oa;Lclient!bd;IIIIZIIZ)V")
	public Class10_Sub2_Sub2(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static7.method104(arg8, arg7));
		this.aByte72 = (byte) arg2;
		super.anInt8057 = arg5;
		this.aBoolean419 = arg6;
		super.anInt8055 = arg3;
		this.aShort83 = (short) arg1.anInt605;
		this.aByte70 = (byte) arg7;
		this.aBoolean422 = arg1.anInt599 != 0 && !arg6;
		this.aByte71 = (byte) arg8;
		this.aBoolean420 = arg9;
		this.aBoolean421 = arg0.method6789() && arg1.aBoolean57 && !this.aBoolean419 && Static189.aClass4_Sub2_Sub1_1.method7643(Static403.anInt6994) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean420) {
			local71 |= 0x10000;
		}
		@Pc(86) Class339 local86 = this.method4760(this.aBoolean421, arg0, local71);
		if (local86 != null) {
			this.aClass9_4 = local86.aClass9_6;
			this.aClass4_Sub7_Sub3_4 = local86.aClass4_Sub7_Sub3_5;
			if (this.aBoolean420) {
				this.aClass9_4 = this.aClass9_4.method4006((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
		if (this.aClass9_4 != null) {
			this.aClass9_4.method4016();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!oa;B)Lclient!ba;")
	private Class9 method4756(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		if (this.aClass9_4 != null && arg1.method6831(this.aClass9_4.h(), arg0) == 0) {
			return this.aClass9_4;
		} else {
			@Pc(29) Class339 local29 = this.method4760(false, arg1, arg0);
			return local29 == null ? null : local29.aClass9_6;
		}
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
		this.aBoolean420 = false;
		if (this.aClass9_4 != null) {
			this.aClass9_4.ia(this.aClass9_4.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class10_Sub2_Sub2) {
			@Pc(5) Class10_Sub2_Sub2 local5 = (Class10_Sub2_Sub2) arg3;
			if (this.aClass9_4 != null && local5.aClass9_4 != null) {
				this.aClass9_4.method4010(local5.aClass9_4, arg0, arg2, arg5, arg4);
			}
		} else if (arg3 instanceof Class10_Sub1_Sub1) {
			@Pc(28) Class10_Sub1_Sub1 local28 = (Class10_Sub1_Sub1) arg3;
			if (this.aClass9_4 != null && local28.aClass9_1 != null) {
				this.aClass9_4.method4010(local28.aClass9_1, arg0, arg2, arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return this.aBoolean421;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return this.aShort83 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return this.aByte71;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		if (this.aClass68_5 == null) {
			this.aClass68_5 = Static56.method848(super.anInt8052, this.method4756(0, arg0), super.anInt8055, super.anInt8057);
		}
		return this.aClass68_5;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
		@Pc(18) Class4_Sub7_Sub3 local18;
		if (this.aClass4_Sub7_Sub3_4 == null && this.aBoolean421) {
			@Pc(29) Class339 local29 = this.method4760(true, arg0, 262144);
			local18 = local29 == null ? null : local29.aClass4_Sub7_Sub3_5;
		} else {
			local18 = this.aClass4_Sub7_Sub3_4;
			this.aClass4_Sub7_Sub3_4 = null;
		}
		if (local18 != null) {
			Static159.method3156(local18, this.aByte72, super.anInt8055, super.anInt8057, null);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class9 local17 = this.method4756(131072, arg1);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class134 local22 = arg1.method6842();
			local22.GA(super.anInt8055, super.anInt8052, super.anInt8057);
			return local17.method4007(arg2, arg0, local22, false);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
		@Pc(22) Class4_Sub7_Sub3 local22;
		if (this.aClass4_Sub7_Sub3_4 == null && this.aBoolean421) {
			@Pc(33) Class339 local33 = this.method4760(true, arg0, 262144);
			local22 = local33 == null ? null : local33.aClass4_Sub7_Sub3_5;
		} else {
			local22 = this.aClass4_Sub7_Sub3_4;
			this.aClass4_Sub7_Sub3_4 = null;
		}
		if (local22 != null) {
			Static55.method846(local22, this.aByte72, super.anInt8055, super.anInt8057, null);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return this.method4756(arg1, arg0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return this.aBoolean420;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		if (this.aClass9_4 == null) {
			return null;
		}
		@Pc(11) Class134 local11 = arg0.method6842();
		local11.GA(super.anInt8055, super.anInt8052, super.anInt8057);
		@Pc(26) Class26_Sub6 local26 = null;
		if (this.aBoolean422) {
			local26 = Static292.method4579(1);
		}
		this.aClass9_4.method4023(local11, local26 == null ? null : local26.aClass26_Sub5Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZLclient!oa;I)Lclient!un;")
	private Class339 method4760(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class25 local21 = Static553.aClass288_4.method6419(this.aShort83 & 0xFFFF);
		@Pc(29) Class16 local29;
		@Pc(33) Class16 local33;
		if (this.aBoolean419) {
			local29 = Static109.aClass16Array2[this.aByte72];
			local33 = Static45.aClass16Array1[0];
		} else {
			if (this.aByte72 >= 3) {
				local33 = null;
			} else {
				local33 = Static45.aClass16Array1[this.aByte72 + 1];
			}
			local29 = Static45.aClass16Array1[this.aByte72];
		}
		return local21.method564(local33, super.anInt8055, super.anInt8057, arg2, super.anInt8052, arg1, arg0, this.aByte70, local29, this.aByte71);
	}
}
