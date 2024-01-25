import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class12_Sub2_Sub1_Sub3 extends Class12_Sub2_Sub1 implements Interface14 {

	@OriginalMember(owner = "client!lw", name = "lb", descriptor = "Lclient!ps;")
	public static Class273 lb = null;

	@OriginalMember(owner = "client!lw", name = "kb", descriptor = "Lclient!ifa;")
	private Class157 aClass157_6;

	@OriginalMember(owner = "client!lw", name = "Z", descriptor = "Z")
	private boolean aBoolean426;

	@OriginalMember(owner = "client!lw", name = "mb", descriptor = "Z")
	private final boolean aBoolean427;

	@OriginalMember(owner = "client!lw", name = "qb", descriptor = "S")
	private final short aShort67;

	@OriginalMember(owner = "client!lw", name = "O", descriptor = "Z")
	private final boolean aBoolean424;

	@OriginalMember(owner = "client!lw", name = "jb", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!lw", name = "nb", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!lw", name = "V", descriptor = "Z")
	private final boolean aBoolean425;

	@OriginalMember(owner = "client!lw", name = "K", descriptor = "Lclient!da;")
	public Class33 aClass33_5;

	@OriginalMember(owner = "client!lw", name = "U", descriptor = "Lclient!ha;")
	private Class2_Sub2_Sub8 aClass2_Sub2_Sub8_4;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!r;Lclient!lt;IIIIIZIIIIIIZ)V")
	public Class12_Sub2_Sub1_Sub3(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5237 == 1, Static29.method388(arg13, arg12));
		this.aBoolean426 = arg14;
		this.aBoolean427 = arg1.anInt5275 != 0 && !arg7;
		this.aShort67 = (short) arg1.anInt5259;
		this.aBoolean424 = arg7;
		this.aByte60 = (byte) arg12;
		this.aByte61 = (byte) arg13;
		super.aByte127 = (byte) arg3;
		this.aBoolean425 = arg0.method6853() && arg1.aBoolean406 && !this.aBoolean424 && Static257.aClass2_Sub35_Sub1_1.method6037(Static226.anInt3318) != 0;
		@Pc(83) int local83 = 2048;
		if (this.aBoolean426) {
			local83 |= 0x10000;
		}
		@Pc(98) Class74 local98 = this.method4636(local83, arg0, this.aBoolean425);
		if (local98 != null) {
			this.aClass33_5 = local98.aClass33_1;
			this.aClass2_Sub2_Sub8_4 = local98.aClass2_Sub2_Sub8_1;
			if (this.aBoolean426) {
				this.aClass33_5 = this.aClass33_5.method7200((byte) 0, local83, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aBoolean425;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aByte61;
	}

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7503() {
		return this.aClass33_5 == null ? false : this.aClass33_5.LA();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	@Override
	public void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class12_Sub2_Sub5_Sub2) {
			@Pc(13) Class12_Sub2_Sub5_Sub2 local13 = (Class12_Sub2_Sub5_Sub2) arg3;
			if (this.aClass33_5 != null && local13.aClass33_7 != null) {
				this.aClass33_5.method7189(local13.aClass33_7, arg2, arg0, arg5, arg4);
			}
		} else if (arg3 instanceof Class12_Sub2_Sub1_Sub3) {
			@Pc(35) Class12_Sub2_Sub1_Sub3 local35 = (Class12_Sub2_Sub1_Sub3) arg3;
			if (this.aClass33_5 != null && local35.aClass33_5 != null) {
				this.aClass33_5.method7189(local35.aClass33_5, arg2, arg0, arg5, arg4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)I")
	@Override
	public int method7091() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		if (this.aClass33_5 == null) {
			return null;
		}
		@Pc(16) Class25 local16 = arg0.method6862();
		local16.NA(super.anInt9374, super.anInt9373, super.anInt9375);
		@Pc(26) Class12_Sub3 local26 = null;
		if (this.aBoolean427) {
			local26 = Static443.method5793(1);
		}
		if (Static286.aBoolean372) {
			this.aClass33_5.method7183(local16, local26 == null ? null : local26.aClass12_Sub6Array1[0], Static578.anInt9366, 0);
		} else {
			this.aClass33_5.method7192(local16, local26 == null ? null : local26.aClass12_Sub6Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBLclient!r;)Lclient!da;")
	private Class33 method4633(@OriginalArg(0) int arg0, @OriginalArg(2) Class162 arg1) {
		if (this.aClass33_5 != null && arg1.method6881(this.aClass33_5.PA(), arg0) == 0) {
			return this.aClass33_5;
		} else {
			@Pc(31) Class74 local31 = this.method4636(arg0, arg1, false);
			return local31 == null ? null : local31.aClass33_1;
		}
	}

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7513() {
		return true;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7089(@OriginalArg(0) Class162 arg0) {
		@Pc(18) Class2_Sub2_Sub8 local18;
		if (this.aClass2_Sub2_Sub8_4 == null && this.aBoolean425) {
			@Pc(29) Class74 local29 = this.method4636(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass2_Sub2_Sub8_1;
		} else {
			local18 = this.aClass2_Sub2_Sub8_4;
			this.aClass2_Sub2_Sub8_4 = null;
		}
		if (local18 != null) {
			Static83.method1257(local18, super.aByte127, super.anInt9374, super.anInt9375, null);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7090(@OriginalArg(1) Class162 arg0) {
		@Pc(14) Class2_Sub2_Sub8 local14;
		if (this.aClass2_Sub2_Sub8_4 == null && this.aBoolean425) {
			@Pc(25) Class74 local25 = this.method4636(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass2_Sub2_Sub8_1;
		} else {
			local14 = this.aClass2_Sub2_Sub8_4;
			this.aClass2_Sub2_Sub8_4 = null;
		}
		if (local14 != null) {
			Static267.method7375(local14, super.aByte127, super.anInt9374, super.anInt9375, null);
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(Z)I")
	@Override
	public int method7501() {
		return this.aClass33_5 == null ? 0 : this.aClass33_5.J();
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7510() {
		return this.aBoolean426;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)I")
	@Override
	public int method7094() {
		return this.aShort67 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(9) Class33 local9 = this.method4633(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(21) Class25 local21 = arg2.method6862();
			local21.NA(super.anInt9374, super.anInt9373, super.anInt9375);
			return Static286.aBoolean372 ? local9.method7201(arg0, arg1, local21, false, Static578.anInt9366) : local9.method7193(arg0, arg1, local21, false);
		}
	}

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "(I)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return this.aClass33_5 == null ? 0 : this.aClass33_5.RA();
		} else {
			return -100;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
	@Override
	public void method7088() {
		if (this.aClass33_5 != null) {
			this.aClass33_5.method7182();
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILclient!r;Z)Lclient!dg;")
	private Class74 method4636(@OriginalArg(1) int arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class216 local19 = Static362.aClass290_2.method5799(this.aShort67 & 0xFFFF);
		@Pc(27) Class151 local27;
		@Pc(40) Class151 local40;
		if (this.aBoolean424) {
			local27 = Static320.aClass151Array3[super.aByte127];
			local40 = Static261.aClass151Array2[0];
		} else {
			local27 = Static261.aClass151Array2[super.aByte127];
			if (super.aByte127 < 3) {
				local40 = Static261.aClass151Array2[super.aByte127 + 1];
			} else {
				local40 = null;
			}
		}
		return local19.method4553(this.aByte60 == 11 ? this.aByte61 + 4 : this.aByte61, local27, arg0, local40, super.anInt9373, this.aByte60 == 11 ? 10 : this.aByte60, super.anInt9375, arg2, arg1, super.anInt9374);
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		if (this.aClass157_6 == null) {
			this.aClass157_6 = Static242.method3444(super.anInt9375, super.anInt9373, this.method4633(0, arg0), super.anInt9374);
		}
		return this.aClass157_6;
	}

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "(I)I")
	public int method4637() {
		return this.aClass33_5 == null ? 15 : this.aClass33_5.K() / 4;
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V")
	@Override
	public void method7511() {
		this.aBoolean426 = false;
		if (this.aClass33_5 != null) {
			this.aClass33_5.SA(this.aClass33_5.PA() & 0xFFFEFFFF);
		}
	}
}
