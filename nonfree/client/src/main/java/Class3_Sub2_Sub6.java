import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!ou", name = "J", descriptor = "Z")
	private final boolean aBoolean386;

	@OriginalMember(owner = "client!ou", name = "L", descriptor = "S")
	private final short aShort79;

	@OriginalMember(owner = "client!ou", name = "T", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!ou", name = "H", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "B")
	private final byte aByte81;

	@OriginalMember(owner = "client!ou", name = "N", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!ou", name = "F", descriptor = "Z")
	private boolean aBoolean384;

	@OriginalMember(owner = "client!ou", name = "K", descriptor = "Z")
	private final boolean aBoolean387;

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "Lclient!ba;")
	private Class2_Sub5_Sub1 aClass2_Sub5_Sub1_5;

	@OriginalMember(owner = "client!ou", name = "D", descriptor = "Lclient!t;")
	public Class91 aClass91_5;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!ya;Lclient!jo;IIIIIZIIIIIIZ)V")
	public Class3_Sub2_Sub6(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3633 == 1, Static169.method2744(arg12, arg13));
		this.aBoolean386 = arg7;
		this.aShort79 = (short) arg1.anInt3648;
		this.aByte83 = (byte) arg13;
		this.aBoolean385 = arg1.anInt3653 != 0 && !arg7;
		this.aByte81 = (byte) arg12;
		this.aByte82 = (byte) arg3;
		this.aBoolean384 = arg14;
		this.aBoolean387 = arg0.method4469() && arg1.aBoolean268 && !this.aBoolean386 && Static12.aClass79_Sub1_1.method3960(Static399.anInt6653) != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean384) {
			local77 |= 0x10000;
		}
		@Pc(92) Class225 local92 = this.method4236(local77, arg0, this.aBoolean387);
		if (local92 != null) {
			this.aClass2_Sub5_Sub1_5 = local92.aClass2_Sub5_Sub1_6;
			this.aClass91_5 = local92.aClass91_6;
			if (this.aBoolean384) {
				this.aClass91_5 = this.aClass91_5.method3285((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		if (this.aClass91_5 == null) {
			return null;
		}
		@Pc(16) Class35 local16 = arg0.method4445();
		local16.j(super.anInt6119, super.anInt6120, super.anInt6121);
		@Pc(26) Class8_Sub5 local26 = null;
		if (this.aBoolean385) {
			local26 = Static367.method4998(1);
		}
		this.aClass91_5.method3276(local16, local26 == null ? null : local26.aClass8_Sub4Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	private Class91 method4234(@OriginalArg(0) Class49 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass91_5 != null && arg0.method4429(this.aClass91_5.P(), arg1) == 0) {
			return this.aClass91_5;
		} else {
			@Pc(28) Class225 local28 = this.method4236(arg1, arg0, false);
			return local28 == null ? null : local28.aClass91_6;
		}
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
	@Override
	public int method5149() {
		return this.aByte81;
	}

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "(I)I")
	public int method4235() {
		return this.aClass91_5 == null ? 15 : this.aClass91_5.U() / 4;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class91 local15 = this.method4234(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class35 local20 = arg1.method4445();
			local20.j(super.anInt6119, super.anInt6120, super.anInt6121);
			return local15.method3288(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5152() {
		return this.aBoolean387;
	}

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
		this.aBoolean384 = false;
		if (this.aClass91_5 != null) {
			this.aClass91_5.UA(this.aClass91_5.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!ya;BZ)Lclient!so;")
	private Class225 method4236(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class134 local19 = Static118.aClass165_2.method3799(this.aShort79 & 0xFFFF);
		@Pc(42) Class64 local42;
		@Pc(33) Class64 local33;
		if (this.aBoolean386) {
			local42 = Static440.aClass64Array3[this.aByte82];
			local33 = Static263.aClass64Array2[0];
		} else {
			if (this.aByte82 < 3) {
				local33 = Static263.aClass64Array2[this.aByte82 + 1];
			} else {
				local33 = null;
			}
			local42 = Static263.aClass64Array2[this.aByte82];
		}
		return local19.method2984(arg1, local42, this.aByte81 == 11 ? this.aByte83 + 4 : this.aByte83, super.anInt6119, arg2, local33, super.anInt6120, super.anInt6121, arg0, this.aByte81 == 11 ? 10 : this.aByte81);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5156(@OriginalArg(1) Class49 arg0) {
		@Pc(29) Class2_Sub5_Sub1 local29;
		if (this.aClass2_Sub5_Sub1_5 == null && this.aBoolean387) {
			@Pc(22) Class225 local22 = this.method4236(262144, arg0, true);
			local29 = local22 == null ? null : local22.aClass2_Sub5_Sub1_6;
		} else {
			local29 = this.aClass2_Sub5_Sub1_5;
			this.aClass2_Sub5_Sub1_5 = null;
		}
		if (local29 != null) {
			Static434.method5668(local29, this.aByte82, super.anInt6119, super.anInt6121, null);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5151(@OriginalArg(1) Class49 arg0) {
		@Pc(31) Class2_Sub5_Sub1 local31;
		if (this.aClass2_Sub5_Sub1_5 == null && this.aBoolean387) {
			@Pc(24) Class225 local24 = this.method4236(262144, arg0, true);
			local31 = local24 == null ? null : local24.aClass2_Sub5_Sub1_6;
		} else {
			local31 = this.aClass2_Sub5_Sub1_5;
			this.aClass2_Sub5_Sub1_5 = null;
		}
		if (local31 != null) {
			Static221.method3470(local31, this.aByte82, super.anInt6119, super.anInt6121, null);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 instanceof Class3_Sub5_Sub1) {
			@Pc(9) Class3_Sub5_Sub1 local9 = (Class3_Sub5_Sub1) arg3;
			if (this.aClass91_5 != null && local9.aClass91_3 != null) {
				this.aClass91_5.method3289(local9.aClass91_3, arg1, arg5, arg4, arg2);
			}
		} else if (arg3 instanceof Class3_Sub2_Sub6) {
			@Pc(32) Class3_Sub2_Sub6 local32 = (Class3_Sub2_Sub6) arg3;
			if (this.aClass91_5 != null && local32.aClass91_5 != null) {
				this.aClass91_5.method3289(local32.aClass91_5, arg1, arg5, arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	@Override
	public void method5150() {
		if (this.aClass91_5 != null) {
			this.aClass91_5.method3292();
		}
	}

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return this.aBoolean384;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(Z)I")
	@Override
	public int method4916() {
		return this.aClass91_5 == null ? 0 : this.aClass91_5.MA();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	@Override
	public Class91 method5154(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		return this.method4234(arg0, arg1);
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)I")
	@Override
	public int method5155() {
		return this.aByte83;
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)I")
	@Override
	public int method5153() {
		return this.aShort79 & 0xFFFF;
	}
}
