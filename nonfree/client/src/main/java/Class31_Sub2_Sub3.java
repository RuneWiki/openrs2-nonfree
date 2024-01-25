import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class31_Sub2_Sub3 extends Class31_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!dr", name = "S", descriptor = "Z")
	private final boolean aBoolean107;

	@OriginalMember(owner = "client!dr", name = "D", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!dr", name = "W", descriptor = "Z")
	private boolean aBoolean108;

	@OriginalMember(owner = "client!dr", name = "N", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!dr", name = "T", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!dr", name = "B", descriptor = "S")
	private final short aShort29;

	@OriginalMember(owner = "client!dr", name = "O", descriptor = "Z")
	private final boolean aBoolean106;

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "Z")
	private final boolean aBoolean105;

	@OriginalMember(owner = "client!dr", name = "M", descriptor = "Lclient!ba;")
	private Class1_Sub2_Sub1 aClass1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!dr", name = "z", descriptor = "Lclient!t;")
	public Class105 aClass105_1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!ya;Lclient!jt;IIIIIZIIIIIIZ)V")
	public Class31_Sub2_Sub3(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3524 == 1, Static178.method2845(arg12, arg13));
		this.aBoolean107 = arg7;
		this.aByte40 = (byte) arg12;
		this.aBoolean108 = arg14;
		this.aByte41 = (byte) arg13;
		this.aByte42 = (byte) arg3;
		this.aShort29 = (short) arg1.anInt3530;
		this.aBoolean106 = arg1.anInt3504 != 0 && !arg7;
		this.aBoolean105 = arg0.method4568() && arg1.aBoolean214 && !this.aBoolean107 && Static38.aClass135_Sub1_1.method4236(Static143.anInt2766) != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean108) {
			local74 |= 0x10000;
		}
		@Pc(89) Class193 local89 = this.method1564(this.aBoolean105, local74, arg0);
		if (local89 != null) {
			this.aClass1_Sub2_Sub1_1 = local89.aClass1_Sub2_Sub1_5;
			this.aClass105_1 = local89.aClass105_6;
			if (this.aBoolean108) {
				this.aClass105_1 = this.aClass105_1.method3548((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
		this.aBoolean108 = false;
		if (this.aClass105_1 != null) {
			this.aClass105_1.UA(this.aClass105_1.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return this.aBoolean105;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class105 local15 = this.method1565(arg0, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class33 local20 = arg0.method4516();
			local20.j(super.anInt7300, super.anInt7296, super.anInt7298);
			return local15.method3526(arg2, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(B)I")
	public int method1562() {
		return this.aClass105_1 == null ? 15 : this.aClass105_1.U() / 4;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		if (this.aClass105_1 == null) {
			return null;
		}
		@Pc(11) Class33 local11 = arg0.method4516();
		local11.j(super.anInt7300, super.anInt7296, super.anInt7298);
		@Pc(21) Class4_Sub1 local21 = null;
		if (this.aBoolean106) {
			local21 = Static241.method3635(1);
		}
		this.aClass105_1.method3534(local11, local21 == null ? null : local21.aClass4_Sub5Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return this.aByte40;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
		@Pc(14) Class1_Sub2_Sub1 local14;
		if (this.aClass1_Sub2_Sub1_1 == null && this.aBoolean105) {
			@Pc(25) Class193 local25 = this.method1564(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass1_Sub2_Sub1_5;
		} else {
			local14 = this.aClass1_Sub2_Sub1_1;
			this.aClass1_Sub2_Sub1_1 = null;
		}
		if (local14 != null) {
			Static253.method3786(local14, this.aByte42, super.anInt7300, super.anInt7298, null);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
		@Pc(33) Class1_Sub2_Sub1 local33;
		if (this.aClass1_Sub2_Sub1_1 == null && this.aBoolean105) {
			@Pc(26) Class193 local26 = this.method1564(true, 262144, arg0);
			local33 = local26 == null ? null : local26.aClass1_Sub2_Sub1_5;
		} else {
			local33 = this.aClass1_Sub2_Sub1_1;
			this.aClass1_Sub2_Sub1_1 = null;
		}
		if (local33 != null) {
			Static205.method3297(local33, this.aByte42, super.anInt7300, super.anInt7298, null);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return this.aShort29 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZILclient!ya;)Lclient!pm;")
	private Class193 method1564(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class39 arg2) {
		@Pc(18) Class129 local18 = Static349.aClass115_4.method2766(this.aShort29 & 0xFFFF);
		@Pc(26) Class149 local26;
		@Pc(30) Class149 local30;
		if (this.aBoolean107) {
			local26 = Static277.aClass149Array3[this.aByte42];
			local30 = Static269.aClass149Array2[0];
		} else {
			local26 = Static269.aClass149Array2[this.aByte42];
			if (this.aByte42 < 3) {
				local30 = Static269.aClass149Array2[this.aByte42 + 1];
			} else {
				local30 = null;
			}
		}
		return local18.method3022(arg1, local26, arg0, super.anInt7298, arg2, this.aByte40 == 11 ? 10 : this.aByte40, this.aByte40 == 11 ? this.aByte41 + 4 : this.aByte41, local30, super.anInt7296, super.anInt7300);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	private Class105 method1565(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass105_1 != null && arg0.method4528(this.aClass105_1.P(), arg1) == 0) {
			return this.aClass105_1;
		} else {
			@Pc(34) Class193 local34 = this.method1564(false, arg1, arg0);
			return local34 == null ? null : local34.aClass105_6;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return this.aBoolean108;
	}

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)I")
	@Override
	public int method5976() {
		return this.aClass105_1 == null ? 0 : this.aClass105_1.MA();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return this.method1565(arg0, arg1);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
		if (this.aClass105_1 != null) {
			this.aClass105_1.method3542();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class31_Sub3_Sub3) {
			@Pc(5) Class31_Sub3_Sub3 local5 = (Class31_Sub3_Sub3) arg3;
			if (this.aClass105_1 != null && local5.aClass105_4 != null) {
				this.aClass105_1.method3532(local5.aClass105_4, arg2, arg4, arg0, arg5);
			}
		} else if (arg3 instanceof Class31_Sub2_Sub3) {
			@Pc(28) Class31_Sub2_Sub3 local28 = (Class31_Sub2_Sub3) arg3;
			if (this.aClass105_1 != null && local28.aClass105_1 != null) {
				this.aClass105_1.method3532(local28.aClass105_1, arg2, arg4, arg0, arg5);
			}
		}
	}
}
