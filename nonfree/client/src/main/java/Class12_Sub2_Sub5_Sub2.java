import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class12_Sub2_Sub5_Sub2 extends Class12_Sub2_Sub5 implements Interface14 {

	@OriginalMember(owner = "client!uk", name = "lb", descriptor = "Lclient!kk;")
	public static final Class195 lb = new Class195();

	@OriginalMember(owner = "client!uk", name = "W", descriptor = "Lclient!ifa;")
	private Class157 aClass157_8;

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "Z")
	private final boolean aBoolean755;

	@OriginalMember(owner = "client!uk", name = "R", descriptor = "Z")
	private boolean aBoolean756;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "B")
	private final byte aByte126;

	@OriginalMember(owner = "client!uk", name = "ab", descriptor = "S")
	private final short aShort117;

	@OriginalMember(owner = "client!uk", name = "N", descriptor = "B")
	private final byte aByte125;

	@OriginalMember(owner = "client!uk", name = "mb", descriptor = "Z")
	private final boolean aBoolean758;

	@OriginalMember(owner = "client!uk", name = "fb", descriptor = "Z")
	private final boolean aBoolean757;

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "Lclient!da;")
	public Class33 aClass33_7;

	@OriginalMember(owner = "client!uk", name = "S", descriptor = "Lclient!ha;")
	private Class2_Sub2_Sub8 aClass2_Sub2_Sub8_6;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!r;Lclient!lt;IIIIIZIIZ)V")
	public Class12_Sub2_Sub5_Sub2(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static159.method2133(arg9, arg8));
		this.aBoolean755 = arg7;
		super.anInt9375 = arg6;
		super.anInt9374 = arg4;
		this.aBoolean756 = arg10;
		this.aByte126 = (byte) arg8;
		this.aShort117 = (short) arg1.anInt5259;
		this.aByte125 = (byte) arg9;
		this.aBoolean758 = arg1.anInt5275 != 0 && !arg7;
		this.aBoolean757 = arg0.method6853() && arg1.aBoolean406 && !this.aBoolean755 && Static257.aClass2_Sub35_Sub1_1.method6037(Static226.anInt3318) != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean756) {
			local72 |= 0x10000;
		}
		@Pc(87) Class74 local87 = this.method7098(local72, this.aBoolean757, arg0);
		if (local87 != null) {
			this.aClass33_7 = local87.aClass33_1;
			this.aClass2_Sub2_Sub8_6 = local87.aClass2_Sub2_Sub8_1;
			if (this.aBoolean756) {
				this.aClass33_7 = this.aClass33_7.method7200((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7513() {
		return true;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7089(@OriginalArg(0) Class162 arg0) {
		@Pc(18) Class2_Sub2_Sub8 local18;
		if (this.aClass2_Sub2_Sub8_6 == null && this.aBoolean757) {
			@Pc(29) Class74 local29 = this.method7098(262144, true, arg0);
			local18 = local29 == null ? null : local29.aClass2_Sub2_Sub8_1;
		} else {
			local18 = this.aClass2_Sub2_Sub8_6;
			this.aClass2_Sub2_Sub8_6 = null;
		}
		if (local18 != null) {
			Static83.method1257(local18, super.aByte127, super.anInt9374, super.anInt9375, null);
		}
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(B)V")
	@Override
	public void method7511() {
		this.aBoolean756 = false;
		if (this.aClass33_7 != null) {
			this.aClass33_7.SA(this.aClass33_7.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(9) Class33 local9 = this.method7099(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class25 local14 = arg2.method6862();
			local14.NA(super.anInt9374, super.anInt9373, super.anInt9375);
			return Static286.aBoolean372 ? local9.method7201(arg0, arg1, local14, false, Static578.anInt9366) : local9.method7193(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)I")
	@Override
	public int method7501() {
		return this.aClass33_7 == null ? 0 : this.aClass33_7.J();
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.aBoolean756 = true;
		}
		return this.aClass33_7 == null ? 0 : this.aClass33_7.RA();
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7503() {
		return this.aClass33_7 == null ? false : this.aClass33_7.LA();
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)I")
	@Override
	public int method7094() {
		return this.aShort117 & 0xFFFF;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7090(@OriginalArg(1) Class162 arg0) {
		@Pc(25) Class2_Sub2_Sub8 local25;
		if (this.aClass2_Sub2_Sub8_6 == null && this.aBoolean757) {
			@Pc(18) Class74 local18 = this.method7098(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass2_Sub2_Sub8_1;
		} else {
			local25 = this.aClass2_Sub2_Sub8_6;
			this.aClass2_Sub2_Sub8_6 = null;
		}
		if (local25 != null) {
			Static267.method7375(local25, super.aByte127, super.anInt9374, super.anInt9375, null);
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
	@Override
	public int method7091() {
		return this.aByte126;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aBoolean757;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	@Override
	public void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class12_Sub2_Sub5_Sub2) {
			@Pc(32) Class12_Sub2_Sub5_Sub2 local32 = (Class12_Sub2_Sub5_Sub2) arg3;
			if (this.aClass33_7 != null && local32.aClass33_7 != null) {
				this.aClass33_7.method7189(local32.aClass33_7, arg2, arg0, arg5, arg4);
			}
		} else if (arg3 instanceof Class12_Sub2_Sub1_Sub3) {
			@Pc(12) Class12_Sub2_Sub1_Sub3 local12 = (Class12_Sub2_Sub1_Sub3) arg3;
			if (this.aClass33_7 != null && local12.aClass33_5 != null) {
				this.aClass33_7.method7189(local12.aClass33_5, arg2, arg0, arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	@Override
	public void method7088() {
		if (this.aClass33_7 != null) {
			this.aClass33_7.method7182();
		}
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7510() {
		return this.aBoolean756;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZILclient!r;)Lclient!dg;")
	private Class74 method7098(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(18) Class216 local18 = Static362.aClass290_2.method5799(this.aShort117 & 0xFFFF);
		@Pc(26) Class151 local26;
		@Pc(34) Class151 local34;
		if (this.aBoolean755) {
			local26 = Static320.aClass151Array3[super.aByte127];
			local34 = Static261.aClass151Array2[0];
		} else {
			local26 = Static261.aClass151Array2[super.aByte127];
			if (super.aByte127 >= 3) {
				local34 = null;
			} else {
				local34 = Static261.aClass151Array2[super.aByte127 + 1];
			}
		}
		return local18.method4553(this.aByte125, local26, arg0, local34, super.anInt9373, this.aByte126, super.anInt9375, arg1, arg2, super.anInt9374);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		if (this.aClass33_7 == null) {
			return null;
		}
		@Pc(16) Class25 local16 = arg0.method6862();
		local16.NA(super.anInt9374, super.anInt9373, super.anInt9375);
		@Pc(26) Class12_Sub3 local26 = null;
		if (this.aBoolean758) {
			local26 = Static443.method5793(1);
		}
		if (Static286.aBoolean372) {
			this.aClass33_7.method7183(local16, local26 == null ? null : local26.aClass12_Sub6Array1[0], Static578.anInt9366, 0);
		} else {
			this.aClass33_7.method7192(local16, local26 == null ? null : local26.aClass12_Sub6Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		if (this.aClass157_8 == null) {
			this.aClass157_8 = Static242.method3444(super.anInt9375, super.anInt9373, this.method7099(0, arg0), super.anInt9374);
		}
		return this.aClass157_8;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aByte125;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!r;I)Lclient!da;")
	private Class33 method7099(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1) {
		if (this.aClass33_7 != null && arg1.method6881(this.aClass33_7.PA(), arg0) == 0) {
			return this.aClass33_7;
		} else {
			@Pc(27) Class74 local27 = this.method7098(arg0, false, arg1);
			return local27 == null ? null : local27.aClass33_1;
		}
	}
}
