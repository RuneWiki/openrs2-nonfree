import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 implements Interface22 {

	@OriginalMember(owner = "client!lw", name = "Q", descriptor = "Lclient!cd;")
	private Class44 aClass44_5;

	@OriginalMember(owner = "client!lw", name = "R", descriptor = "Z")
	private final boolean aBoolean538;

	@OriginalMember(owner = "client!lw", name = "M", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!lw", name = "H", descriptor = "Z")
	private final boolean aBoolean536;

	@OriginalMember(owner = "client!lw", name = "Y", descriptor = "S")
	private final short aShort73;

	@OriginalMember(owner = "client!lw", name = "x", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!lw", name = "C", descriptor = "Z")
	private boolean aBoolean535;

	@OriginalMember(owner = "client!lw", name = "P", descriptor = "B")
	private final byte aByte66;

	@OriginalMember(owner = "client!lw", name = "N", descriptor = "Z")
	private final boolean aBoolean537;

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "Lclient!ba;")
	public Class21 aClass21_4;

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "Lclient!w;")
	private Class3_Sub4_Sub2 aClass3_Sub4_Sub2_3;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!oa;Lclient!sa;IIIIZIIZ)V")
	public Class2_Sub4_Sub2(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static314.method5267(arg8, arg7));
		this.aBoolean538 = arg6;
		this.aByte65 = (byte) arg7;
		this.aBoolean536 = arg1.anInt8778 != 0 && !arg6;
		super.anInt7256 = arg5;
		this.aShort73 = (short) arg1.anInt8757;
		this.aByte64 = (byte) arg8;
		this.aBoolean535 = arg9;
		this.aByte66 = (byte) arg2;
		super.anInt7258 = arg3;
		this.aBoolean537 = arg0.method5335() && arg1.aBoolean721 && !this.aBoolean538 && Static455.aClass3_Sub27_Sub1_1.method4035(Static275.anInt5823) != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean535) {
			local74 |= 0x10000;
		}
		@Pc(89) Class155 local89 = this.method5220(this.aBoolean537, arg0, local74);
		if (local89 != null) {
			this.aClass21_4 = local89.aClass21_3;
			this.aClass3_Sub4_Sub2_3 = local89.aClass3_Sub4_Sub2_2;
			if (this.aBoolean535) {
				this.aClass21_4 = this.aClass21_4.method7131((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return this.aBoolean537;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		if (arg4 instanceof Class2_Sub4_Sub2) {
			@Pc(32) Class2_Sub4_Sub2 local32 = (Class2_Sub4_Sub2) arg4;
			if (this.aClass21_4 != null && local32.aClass21_4 != null) {
				this.aClass21_4.method7147(local32.aClass21_4, arg3, arg1, arg0, arg5);
			}
		} else if (arg4 instanceof Class2_Sub2_Sub4) {
			@Pc(12) Class2_Sub2_Sub4 local12 = (Class2_Sub2_Sub4) arg4;
			if (this.aClass21_4 != null && local12.aClass21_6 != null) {
				this.aClass21_4.method7147(local12.aClass21_6, arg3, arg1, arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return this.aBoolean535;
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return this.aByte65;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZILclient!oa;I)Lclient!id;")
	private Class155 method5220(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class292 local11 = Static253.aClass146_2.method3356(this.aShort73 & 0xFFFF);
		@Pc(19) Class4 local19;
		@Pc(23) Class4 local23;
		if (this.aBoolean538) {
			local19 = Static495.aClass4Array4[this.aByte66];
			local23 = Static381.aClass4Array2[0];
		} else {
			local19 = Static381.aClass4Array2[this.aByte66];
			if (this.aByte66 >= 3) {
				local23 = null;
			} else {
				local23 = Static381.aClass4Array2[this.aByte66 + 1];
			}
		}
		return local11.method7194(arg0, local19, super.anInt7256, super.anInt7257, this.aByte65, this.aByte64, arg1, arg2, local23, super.anInt7258);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		if (this.aClass21_4 == null) {
			return null;
		}
		@Pc(19) Class255 local19 = arg0.method5343();
		local19.GA(super.anInt7258, super.anInt7257, super.anInt7256);
		@Pc(29) Class55_Sub6 local29 = null;
		if (this.aBoolean536) {
			local29 = Static232.method3979(1);
		}
		this.aClass21_4.method7145(local19, local29 == null ? null : local29.aClass55_Sub3Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return this.aByte64;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		@Pc(9) Class21 local9 = this.method5222(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class255 local20 = arg2.method5343();
			local20.GA(super.anInt7258, super.anInt7257, super.anInt7256);
			return local9.method7148(arg1, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
		@Pc(19) Class3_Sub4_Sub2 local19;
		if (this.aClass3_Sub4_Sub2_3 == null && this.aBoolean537) {
			@Pc(30) Class155 local30 = this.method5220(true, arg0, 262144);
			local19 = local30 == null ? null : local30.aClass3_Sub4_Sub2_2;
		} else {
			local19 = this.aClass3_Sub4_Sub2_3;
			this.aClass3_Sub4_Sub2_3 = null;
		}
		if (local19 != null) {
			Static361.method5982(local19, this.aByte66, super.anInt7258, super.anInt7256, null);
		}
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
		@Pc(31) Class3_Sub4_Sub2 local31;
		if (this.aClass3_Sub4_Sub2_3 == null && this.aBoolean537) {
			@Pc(24) Class155 local24 = this.method5220(true, arg0, 262144);
			local31 = local24 == null ? null : local24.aClass3_Sub4_Sub2_2;
		} else {
			local31 = this.aClass3_Sub4_Sub2_3;
			this.aClass3_Sub4_Sub2_3 = null;
		}
		if (local31 != null) {
			Static214.method3738(local31, this.aByte66, super.anInt7258, super.anInt7256, null);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return this.method5222(arg0, arg1);
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return this.aShort73 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
		this.aBoolean535 = false;
		if (this.aClass21_4 != null) {
			this.aClass21_4.ia(this.aClass21_4.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		if (this.aClass44_5 == null) {
			this.aClass44_5 = Static5.method275(super.anInt7257, this.method5222(arg0, 0), super.anInt7258, super.anInt7256);
		}
		return this.aClass44_5;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!oa;ZI)Lclient!ba;")
	private Class21 method5222(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass21_4 != null && arg0.method5321(this.aClass21_4.h(), arg1) == 0) {
			return this.aClass21_4;
		} else {
			@Pc(28) Class155 local28 = this.method5220(false, arg0, arg1);
			return local28 == null ? null : local28.aClass21_3;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
		if (this.aClass21_4 != null) {
			this.aClass21_4.method7142();
		}
	}
}
