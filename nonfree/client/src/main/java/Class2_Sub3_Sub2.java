import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "Lclient!cd;")
	private Class44 aClass44_7;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "B")
	private final byte aByte85;

	@OriginalMember(owner = "client!qn", name = "Q", descriptor = "B")
	private final byte aByte87;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "Z")
	private final boolean aBoolean682;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "S")
	private final short aShort101;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "B")
	private final byte aByte86;

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "Z")
	private final boolean aBoolean684;

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "Z")
	private final boolean aBoolean683;

	@OriginalMember(owner = "client!qn", name = "N", descriptor = "Lclient!ba;")
	private Class21 aClass21_7;

	@OriginalMember(owner = "client!qn", name = "I", descriptor = "Lclient!w;")
	private Class3_Sub4_Sub2 aClass3_Sub4_Sub2_6;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!oa;Lclient!sa;IIIIZIIIII)V")
	public Class2_Sub3_Sub2(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static500.method7558(arg10, arg11));
		super.anInt9494 = arg3;
		this.aByte85 = (byte) arg2;
		this.aByte87 = (byte) arg11;
		this.aBoolean682 = arg6;
		super.anInt9486 = arg5;
		this.aShort101 = (short) arg1.anInt8757;
		this.aByte86 = (byte) arg10;
		this.aBoolean684 = arg1.anInt8778 != 0 && !arg6;
		this.aBoolean683 = arg0.method5335() && arg1.aBoolean721 && !this.aBoolean682 && Static455.aClass3_Sub27_Sub1_1.method4035(Static275.anInt5823) != 0;
		@Pc(77) Class155 local77 = this.method6849(this.aBoolean683, arg0, 2048);
		if (local77 != null) {
			this.aClass21_7 = local77.aClass21_3;
			this.aClass3_Sub4_Sub2_6 = local77.aClass3_Sub4_Sub2_2;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		@Pc(17) Class21 local17 = this.method6848(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class255 local22 = arg2.method5343();
			local22.GA(super.anInt9494, super.anInt9487, super.anInt9486);
			return local17.method7148(arg1, arg0, local22, false);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Lclient!oa;II)Lclient!ba;")
	private Class21 method6848(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass21_7 != null && arg0.method5321(this.aClass21_7.h(), arg1) == 0) {
			return this.aClass21_7;
		} else {
			@Pc(28) Class155 local28 = this.method6849(false, arg0, arg1);
			return local28 == null ? null : local28.aClass21_3;
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return this.aShort101 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLclient!oa;II)Lclient!id;")
	private Class155 method6849(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class292 local16 = Static253.aClass146_2.method3356(this.aShort101 & 0xFFFF);
		@Pc(28) Class4 local28;
		@Pc(23) Class4 local23;
		if (this.aBoolean682) {
			local23 = Static381.aClass4Array2[0];
			local28 = Static495.aClass4Array4[this.aByte85];
		} else {
			local28 = Static381.aClass4Array2[this.aByte85];
			if (this.aByte85 < 3) {
				local23 = Static381.aClass4Array2[this.aByte85 + 1];
			} else {
				local23 = null;
			}
		}
		return local16.method7194(arg0, local28, super.anInt9486, super.anInt9487, this.aByte86, this.aByte87, arg1, arg2, local23, super.anInt9494);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
		@Pc(18) Class3_Sub4_Sub2 local18;
		if (this.aClass3_Sub4_Sub2_6 == null && this.aBoolean683) {
			@Pc(29) Class155 local29 = this.method6849(true, arg0, 262144);
			local18 = local29 == null ? null : local29.aClass3_Sub4_Sub2_2;
		} else {
			local18 = this.aClass3_Sub4_Sub2_6;
			this.aClass3_Sub4_Sub2_6 = null;
		}
		if (local18 != null) {
			Static214.method3738(local18, this.aByte85, super.anInt9494, super.anInt9486, null);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
		if (this.aClass21_7 != null) {
			this.aClass21_7.method7142();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return this.aByte87;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return this.method6848(arg0, arg1);
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		if (this.aClass44_7 == null) {
			this.aClass44_7 = Static5.method275(super.anInt9487, this.method6848(arg0, 0), super.anInt9494, super.anInt9486);
		}
		return this.aClass44_7;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		if (this.aClass21_7 == null) {
			return null;
		}
		@Pc(19) Class255 local19 = arg0.method5343();
		local19.GA(super.anInt9489 + super.anInt9494, super.anInt9487, super.anInt9497 + super.anInt9486);
		@Pc(35) Class55_Sub6 local35 = null;
		if (this.aBoolean684) {
			local35 = Static232.method3979(1);
		}
		this.aClass21_7.method7145(local19, local35 == null ? null : local35.aClass55_Sub3Array1[0], 0);
		return local35;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
		@Pc(18) Class3_Sub4_Sub2 local18;
		if (this.aClass3_Sub4_Sub2_6 == null && this.aBoolean683) {
			@Pc(29) Class155 local29 = this.method6849(true, arg0, 262144);
			local18 = local29 == null ? null : local29.aClass3_Sub4_Sub2_2;
		} else {
			local18 = this.aClass3_Sub4_Sub2_6;
			this.aClass3_Sub4_Sub2_6 = null;
		}
		if (local18 != null) {
			Static361.method5982(local18, this.aByte85, super.anInt9494, super.anInt9486, null);
		}
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)I")
	@Override
	public int method7700() {
		return this.aClass21_7 == null ? 0 : this.aClass21_7.DA();
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return this.aByte86;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return this.aBoolean683;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
	}
}
