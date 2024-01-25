import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class12_Sub2_Sub2_Sub1 extends Class12_Sub2_Sub2 implements Interface14 {

	@OriginalMember(owner = "client!di", name = "S", descriptor = "Lclient!ifa;")
	private Class157 aClass157_1;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "Z")
	private boolean aBoolean109;

	@OriginalMember(owner = "client!di", name = "E", descriptor = "Z")
	private final boolean aBoolean110;

	@OriginalMember(owner = "client!di", name = "gb", descriptor = "Z")
	private final boolean aBoolean112;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!di", name = "H", descriptor = "S")
	private final short aShort22;

	@OriginalMember(owner = "client!di", name = "X", descriptor = "Z")
	private final boolean aBoolean111;

	@OriginalMember(owner = "client!di", name = "G", descriptor = "Lclient!ha;")
	private Class2_Sub2_Sub8 aClass2_Sub2_Sub8_2;

	@OriginalMember(owner = "client!di", name = "bb", descriptor = "Lclient!da;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!r;Lclient!lt;IIIIIZIZ)V")
	public Class12_Sub2_Sub2_Sub1(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt5262);
		super.anInt9375 = arg6;
		this.aBoolean109 = arg9;
		super.anInt9374 = arg4;
		this.aBoolean110 = arg1.anInt5275 != 0 && !arg7;
		this.aBoolean112 = arg7;
		this.aByte22 = (byte) arg8;
		this.aShort22 = (short) arg1.anInt5259;
		this.aBoolean111 = arg0.method6853() && arg1.aBoolean406 && !this.aBoolean112 && Static257.aClass2_Sub35_Sub1_1.method6037(Static226.anInt3318) != 0;
		@Pc(60) int local60 = 2048;
		if (this.aBoolean109) {
			local60 |= 0x10000;
		}
		@Pc(75) Class74 local75 = this.method1450(this.aBoolean111, local60, arg0);
		if (local75 != null) {
			this.aClass2_Sub2_Sub8_2 = local75.aClass2_Sub2_Sub8_1;
			this.aClass33_2 = local75.aClass33_1;
			if (this.aBoolean109) {
				this.aClass33_2 = this.aClass33_2.method7200((byte) 0, local60, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	@Override
	public void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (!(arg3 instanceof Class12_Sub2_Sub2_Sub1)) {
			return;
		}
		@Pc(13) Class12_Sub2_Sub2_Sub1 local13 = (Class12_Sub2_Sub2_Sub1) arg3;
		if (this.aClass33_2 != null && local13.aClass33_2 != null) {
			this.aClass33_2.method7189(local13.aClass33_2, arg2, arg0, arg5, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		if (this.aClass33_2 == null) {
			return null;
		}
		@Pc(17) Class25 local17 = arg0.method6862();
		local17.NA(super.anInt9374, super.anInt9373, super.anInt9375);
		@Pc(27) Class12_Sub3 local27 = null;
		if (this.aBoolean110) {
			local27 = Static443.method5793(1);
		}
		if (Static286.aBoolean372) {
			this.aClass33_2.method7183(local17, local27 == null ? null : local27.aClass12_Sub6Array1[0], Static578.anInt9366, 0);
		} else {
			this.aClass33_2.method7192(local17, local27 == null ? null : local27.aClass12_Sub6Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aBoolean111;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZILclient!r;I)Lclient!dg;")
	private Class74 method1450(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class162 arg2) {
		@Pc(13) Class216 local13 = Static362.aClass290_2.method5799(this.aShort22 & 0xFFFF);
		@Pc(28) Class151 local28;
		@Pc(39) Class151 local39;
		if (this.aBoolean112) {
			local28 = Static320.aClass151Array3[super.aByte127];
			local39 = Static261.aClass151Array2[0];
		} else {
			local28 = Static261.aClass151Array2[super.aByte127];
			if (super.aByte127 < 3) {
				local39 = Static261.aClass151Array2[super.aByte127 + 1];
			} else {
				local39 = null;
			}
		}
		return local13.method4553(this.aByte22, local28, arg1, local39, super.anInt9373, 22, super.anInt9375, arg0, arg2, super.anInt9374);
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!r;II)Lclient!da;")
	private Class33 method1451(@OriginalArg(0) Class162 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass33_2 != null && arg0.method6881(this.aClass33_2.PA(), arg1) == 0) {
			return this.aClass33_2;
		} else {
			@Pc(27) Class74 local27 = this.method1450(false, arg1, arg0);
			return local27 == null ? null : local27.aClass33_1;
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		if (this.aClass157_1 == null) {
			this.aClass157_1 = Static242.method3444(super.anInt9375, super.anInt9373, this.method1451(arg0, 0), super.anInt9374);
		}
		return this.aClass157_1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	@Override
	public void method7088() {
		if (this.aClass33_2 != null) {
			this.aClass33_2.method7182();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7089(@OriginalArg(0) Class162 arg0) {
		@Pc(18) Class2_Sub2_Sub8 local18;
		if (this.aClass2_Sub2_Sub8_2 == null && this.aBoolean111) {
			@Pc(29) Class74 local29 = this.method1450(true, 262144, arg0);
			local18 = local29 == null ? null : local29.aClass2_Sub2_Sub8_1;
		} else {
			local18 = this.aClass2_Sub2_Sub8_2;
			this.aClass2_Sub2_Sub8_2 = null;
		}
		if (local18 != null) {
			Static83.method1257(local18, super.aByte127, super.anInt9374, super.anInt9375, null);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aByte22;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
	@Override
	public void method7511() {
		this.aBoolean109 = false;
		if (this.aClass33_2 != null) {
			this.aClass33_2.SA(this.aClass33_2.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7090(@OriginalArg(1) Class162 arg0) {
		@Pc(14) Class2_Sub2_Sub8 local14;
		if (this.aClass2_Sub2_Sub8_2 == null && this.aBoolean111) {
			@Pc(25) Class74 local25 = this.method1450(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub2_Sub8_1;
		} else {
			local14 = this.aClass2_Sub2_Sub8_2;
			this.aClass2_Sub2_Sub8_2 = null;
		}
		if (local14 != null) {
			Static267.method7375(local14, super.aByte127, super.anInt9374, super.anInt9375, null);
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)I")
	@Override
	public int method7501() {
		return this.aClass33_2 == null ? 0 : this.aClass33_2.J();
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7510() {
		return this.aBoolean109;
	}

	@OriginalMember(owner = "client!di", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7513() {
		return true;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(14) Class33 local14 = this.method1451(arg2, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class25 local19 = arg2.method6862();
			local19.NA(super.anInt9374, super.anInt9373, super.anInt9375);
			return Static286.aBoolean372 ? local14.method7201(arg0, arg1, local19, false, Static578.anInt9366) : local14.method7193(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!di", name = "f", descriptor = "(I)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method7513();
		}
		return this.aClass33_2 == null ? 0 : this.aClass33_2.RA();
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(B)I")
	@Override
	public int method7094() {
		return this.aShort22 & 0xFFFF;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)I")
	@Override
	public int method7091() {
		return 22;
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7503() {
		return this.aClass33_2 == null ? false : this.aClass33_2.LA();
	}
}
