import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!or", name = "bb", descriptor = "Lclient!cd;")
	private Class44 aClass44_6;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "B")
	private final byte aByte74;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "Z")
	private final boolean aBoolean631;

	@OriginalMember(owner = "client!or", name = "J", descriptor = "Z")
	private final boolean aBoolean633;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!or", name = "S", descriptor = "S")
	private final short aShort88;

	@OriginalMember(owner = "client!or", name = "T", descriptor = "Z")
	private boolean aBoolean635;

	@OriginalMember(owner = "client!or", name = "F", descriptor = "B")
	private final byte aByte75;

	@OriginalMember(owner = "client!or", name = "O", descriptor = "Z")
	private final boolean aBoolean634;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "Lclient!w;")
	private Class3_Sub4_Sub2 aClass3_Sub4_Sub2_5;

	@OriginalMember(owner = "client!or", name = "K", descriptor = "Lclient!ba;")
	public Class21 aClass21_6;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!oa;Lclient!sa;IIIIIZIIIIIIZ)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8760 == 1, Static415.method6702(arg13, arg12));
		this.aByte74 = (byte) arg3;
		this.aBoolean631 = arg1.anInt8778 != 0 && !arg7;
		this.aBoolean633 = arg7;
		this.aByte73 = (byte) arg12;
		this.aShort88 = (short) arg1.anInt8757;
		this.aBoolean635 = arg14;
		this.aByte75 = (byte) arg13;
		this.aBoolean634 = arg0.method5335() && arg1.aBoolean721 && !this.aBoolean633 && Static455.aClass3_Sub27_Sub1_1.method4035(Static275.anInt5823) != 0;
		@Pc(79) int local79 = 2048;
		if (this.aBoolean635) {
			local79 |= 0x10000;
		}
		@Pc(94) Class155 local94 = this.method6186(arg0, this.aBoolean634, local79);
		if (local94 != null) {
			this.aClass3_Sub4_Sub2_5 = local94.aClass3_Sub4_Sub2_2;
			this.aClass21_6 = local94.aClass21_3;
			if (this.aBoolean635) {
				this.aClass21_6 = this.aClass21_6.method7131((byte) 0, local79, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return this.aShort88 & 0xFFFF;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return this.aBoolean635;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		if (this.aClass44_6 == null) {
			this.aClass44_6 = Static5.method275(super.anInt9400, this.method6188(0, arg0), super.anInt9398, super.anInt9396);
		}
		return this.aClass44_6;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
		this.aBoolean635 = false;
		if (this.aClass21_6 != null) {
			this.aClass21_6.ia(this.aClass21_6.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		@Pc(15) Class21 local15 = this.method6188(131072, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class255 local20 = arg2.method5343();
			local20.GA(super.anInt9398, super.anInt9400, super.anInt9396);
			return local15.method7148(arg1, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!oa;ZII)Lclient!id;")
	private Class155 method6186(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(19) Class292 local19 = Static253.aClass146_2.method3356(this.aShort88 & 0xFFFF);
		@Pc(27) Class4 local27;
		@Pc(35) Class4 local35;
		if (this.aBoolean633) {
			local35 = Static381.aClass4Array2[0];
			local27 = Static495.aClass4Array4[this.aByte74];
		} else {
			local27 = Static381.aClass4Array2[this.aByte74];
			if (this.aByte74 >= 3) {
				local35 = null;
			} else {
				local35 = Static381.aClass4Array2[this.aByte74 + 1];
			}
		}
		return local19.method7194(arg1, local27, super.anInt9396, super.anInt9400, this.aByte73 == 11 ? 10 : this.aByte73, this.aByte73 == 11 ? this.aByte75 + 4 : this.aByte75, arg0, arg2, local35, super.anInt9398);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return this.aByte73;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return this.aBoolean634;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)I")
	@Override
	public int method7629() {
		return this.aClass21_6 == null ? 0 : this.aClass21_6.DA();
	}

	@OriginalMember(owner = "client!or", name = "g", descriptor = "(I)I")
	public int method6187() {
		return this.aClass21_6 == null ? 15 : this.aClass21_6.ZA() / 4;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		if (this.aClass21_6 == null) {
			return null;
		}
		@Pc(11) Class255 local11 = arg0.method5343();
		local11.GA(super.anInt9398, super.anInt9400, super.anInt9396);
		@Pc(21) Class55_Sub6 local21 = null;
		if (this.aBoolean631) {
			local21 = Static232.method3979(1);
		}
		this.aClass21_6.method7145(local11, local21 == null ? null : local21.aClass55_Sub3Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!oa;I)Lclient!ba;")
	private Class21 method6188(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1) {
		if (this.aClass21_6 != null && arg1.method5321(this.aClass21_6.h(), arg0) == 0) {
			return this.aClass21_6;
		} else {
			@Pc(29) Class155 local29 = this.method6186(arg1, false, arg0);
			return local29 == null ? null : local29.aClass21_3;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
		@Pc(14) Class3_Sub4_Sub2 local14;
		if (this.aClass3_Sub4_Sub2_5 == null && this.aBoolean634) {
			@Pc(27) Class155 local27 = this.method6186(arg0, true, 262144);
			local14 = local27 == null ? null : local27.aClass3_Sub4_Sub2_2;
		} else {
			local14 = this.aClass3_Sub4_Sub2_5;
			this.aClass3_Sub4_Sub2_5 = null;
		}
		if (local14 != null) {
			Static361.method5982(local14, this.aByte74, super.anInt9398, super.anInt9396, null);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		if (arg4 instanceof Class2_Sub4_Sub2) {
			@Pc(32) Class2_Sub4_Sub2 local32 = (Class2_Sub4_Sub2) arg4;
			if (this.aClass21_6 != null && local32.aClass21_4 != null) {
				this.aClass21_6.method7147(local32.aClass21_4, arg3, arg1, arg0, arg5);
			}
		} else if (arg4 instanceof Class2_Sub2_Sub4) {
			@Pc(12) Class2_Sub2_Sub4 local12 = (Class2_Sub2_Sub4) arg4;
			if (this.aClass21_6 != null && local12.aClass21_6 != null) {
				this.aClass21_6.method7147(local12.aClass21_6, arg3, arg1, arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
		if (this.aClass21_6 != null) {
			this.aClass21_6.method7142();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return this.aByte75;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return this.method6188(arg1, arg0);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
		@Pc(18) Class3_Sub4_Sub2 local18;
		if (this.aClass3_Sub4_Sub2_5 == null && this.aBoolean634) {
			@Pc(29) Class155 local29 = this.method6186(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass3_Sub4_Sub2_2;
		} else {
			local18 = this.aClass3_Sub4_Sub2_5;
			this.aClass3_Sub4_Sub2_5 = null;
		}
		if (local18 != null) {
			Static214.method3738(local18, this.aByte74, super.anInt9398, super.anInt9396, null);
		}
	}
}
