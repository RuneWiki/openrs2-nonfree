import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class12_Sub2_Sub4_Sub2 extends Class12_Sub2_Sub4 implements Interface14 {

	@OriginalMember(owner = "client!lu", name = "Z", descriptor = "Lclient!ifa;")
	private Class157 aClass157_5;

	@OriginalMember(owner = "client!lu", name = "ab", descriptor = "S")
	private final short aShort62;

	@OriginalMember(owner = "client!lu", name = "bb", descriptor = "Z")
	private final boolean aBoolean420;

	@OriginalMember(owner = "client!lu", name = "fb", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!lu", name = "L", descriptor = "Z")
	private final boolean aBoolean419;

	@OriginalMember(owner = "client!lu", name = "W", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!lu", name = "A", descriptor = "Z")
	private final boolean aBoolean418;

	@OriginalMember(owner = "client!lu", name = "cb", descriptor = "Lclient!da;")
	private Class33 aClass33_4;

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "Lclient!ha;")
	private Class2_Sub2_Sub8 aClass2_Sub2_Sub8_3;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!r;Lclient!lt;IIIIIZIIII)V")
	public Class12_Sub2_Sub4_Sub2(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aShort62 = (short) arg1.anInt5259;
		this.aBoolean420 = arg7;
		this.aByte56 = (byte) arg10;
		this.aBoolean419 = arg1.anInt5275 != 0 && !arg7;
		this.aByte55 = (byte) arg11;
		super.anInt9374 = arg4;
		super.anInt9375 = arg6;
		this.aBoolean418 = arg0.method6853() && arg1.aBoolean406 && !this.aBoolean420 && Static257.aClass2_Sub35_Sub1_1.method6037(Static226.anInt3318) != 0;
		@Pc(70) Class74 local70 = this.method4594(arg0, this.aBoolean418, 2048);
		if (local70 != null) {
			this.aClass33_4 = local70.aClass33_1;
			this.aClass2_Sub2_Sub8_3 = local70.aClass2_Sub2_Sub8_1;
		}
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method7089(null);
		}
		return this.aClass33_4 == null ? 0 : this.aClass33_4.RA();
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(14) Class33 local14 = this.method4595(131072, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class25 local19 = arg2.method6862();
			local19.NA(super.anInt9374, super.anInt9373, super.anInt9375);
			return Static286.aBoolean372 ? local14.method7201(arg0, arg1, local19, false, Static578.anInt9366) : local14.method7193(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aByte55;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)I")
	@Override
	public int method7091() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7089(@OriginalArg(0) Class162 arg0) {
		@Pc(29) Class2_Sub2_Sub8 local29;
		if (this.aClass2_Sub2_Sub8_3 == null && this.aBoolean418) {
			@Pc(22) Class74 local22 = this.method4594(arg0, true, 262144);
			local29 = local22 == null ? null : local22.aClass2_Sub2_Sub8_1;
		} else {
			local29 = this.aClass2_Sub2_Sub8_3;
			this.aClass2_Sub2_Sub8_3 = null;
		}
		if (local29 != null) {
			Static83.method1257(local29, super.aByte127, super.anInt9374, super.anInt9375, null);
		}
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aBoolean418;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!r;IZI)Lclient!dg;")
	private Class74 method4594(@OriginalArg(0) Class162 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class216 local15 = Static362.aClass290_2.method5799(this.aShort62 & 0xFFFF);
		@Pc(43) Class151 local43;
		@Pc(29) Class151 local29;
		if (this.aBoolean420) {
			local29 = Static261.aClass151Array2[0];
			local43 = Static320.aClass151Array3[super.aByte127];
		} else {
			if (super.aByte127 >= 3) {
				local29 = null;
			} else {
				local29 = Static261.aClass151Array2[super.aByte127 + 1];
			}
			local43 = Static261.aClass151Array2[super.aByte127];
		}
		return local15.method4553(this.aByte55, local43, arg2, local29, super.anInt9373, this.aByte56, super.anInt9375, arg1, arg0, super.anInt9374);
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		if (this.aClass157_5 == null) {
			this.aClass157_5 = Static242.method3444(super.anInt9375, super.anInt9373, this.method4595(0, arg0), super.anInt9374);
		}
		return this.aClass157_5;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!r;)Lclient!da;")
	private Class33 method4595(@OriginalArg(1) int arg0, @OriginalArg(2) Class162 arg1) {
		if (this.aClass33_4 != null && arg1.method6881(this.aClass33_4.PA(), arg0) == 0) {
			return this.aClass33_4;
		} else {
			@Pc(23) Class74 local23 = this.method4594(arg1, false, arg0);
			return local23 == null ? null : local23.aClass33_1;
		}
	}

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7513() {
		return true;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)I")
	@Override
	public int method7501() {
		return this.aClass33_4 == null ? 0 : this.aClass33_4.J();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		if (this.aClass33_4 == null) {
			return null;
		}
		@Pc(11) Class25 local11 = arg0.method6862();
		local11.NA(super.anInt9374 + super.aShort61, super.anInt9373, super.aShort60 + super.anInt9375);
		@Pc(32) Class12_Sub3 local32 = null;
		if (this.aBoolean419) {
			local32 = Static443.method5793(1);
		}
		if (Static286.aBoolean372) {
			this.aClass33_4.method7183(local11, local32 == null ? null : local32.aClass12_Sub6Array1[0], Static578.anInt9366, 0);
		} else {
			this.aClass33_4.method7192(local11, local32 == null ? null : local32.aClass12_Sub6Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7090(@OriginalArg(1) Class162 arg0) {
		@Pc(14) Class2_Sub2_Sub8 local14;
		if (this.aClass2_Sub2_Sub8_3 == null && this.aBoolean418) {
			@Pc(25) Class74 local25 = this.method4594(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass2_Sub2_Sub8_1;
		} else {
			local14 = this.aClass2_Sub2_Sub8_3;
			this.aClass2_Sub2_Sub8_3 = null;
		}
		if (local14 != null) {
			Static267.method7375(local14, super.aByte127, super.anInt9374, super.anInt9375, null);
		}
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7503() {
		return this.aClass33_4 == null ? false : this.aClass33_4.LA();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	@Override
	public void method7088() {
		if (this.aClass33_4 != null) {
			this.aClass33_4.method7182();
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)I")
	@Override
	public int method7094() {
		return this.aShort62 & 0xFFFF;
	}
}
