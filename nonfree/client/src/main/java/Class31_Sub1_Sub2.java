import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class31_Sub1_Sub2 extends Class31_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!ek", name = "P", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!ek", name = "R", descriptor = "S")
	private final short aShort36;

	@OriginalMember(owner = "client!ek", name = "L", descriptor = "Z")
	private final boolean aBoolean126;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!ek", name = "E", descriptor = "Z")
	private final boolean aBoolean125;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "Z")
	private final boolean aBoolean123;

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "Lclient!t;")
	private Class105 aClass105_2;

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "Lclient!ba;")
	private Class1_Sub2_Sub1 aClass1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!ya;Lclient!jt;IIIIZIZ)V")
	public Class31_Sub1_Sub2(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean220, arg1.aBoolean212);
		this.aByte45 = (byte) arg7;
		super.anInt3390 = arg5;
		this.aBoolean124 = arg8;
		this.aShort36 = (short) arg1.anInt3530;
		this.aBoolean126 = arg6;
		this.aByte44 = (byte) arg2;
		this.aBoolean125 = arg1.anInt3504 != 0 && !arg6;
		super.anInt3389 = arg3;
		this.aBoolean123 = arg0.method4568() && arg1.aBoolean214 && !this.aBoolean126 && Static38.aClass135_Sub1_1.method4236(Static143.anInt2766) != 0;
		@Pc(64) int local64 = 2048;
		if (this.aBoolean124) {
			local64 |= 0x10000;
		}
		@Pc(79) Class193 local79 = this.method1722(arg0, this.aBoolean123, local64);
		if (local79 != null) {
			this.aClass105_2 = local79.aClass105_6;
			this.aClass1_Sub2_Sub1_2 = local79.aClass1_Sub2_Sub1_5;
			if (this.aBoolean124) {
				this.aClass105_2 = this.aClass105_2.method3548((byte) 0, local64, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return this.aBoolean123;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return this.aShort36 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return this.aBoolean124;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ya;ZII)Lclient!pm;")
	private Class193 method1722(@OriginalArg(0) Class39 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class129 local18 = Static349.aClass115_4.method2766(this.aShort36 & 0xFFFF);
		@Pc(26) Class149 local26;
		@Pc(30) Class149 local30;
		if (this.aBoolean126) {
			local26 = Static277.aClass149Array3[this.aByte44];
			local30 = Static269.aClass149Array2[0];
		} else {
			local26 = Static269.aClass149Array2[this.aByte44];
			if (this.aByte44 >= 3) {
				local30 = null;
			} else {
				local30 = Static269.aClass149Array2[this.aByte44 + 1];
			}
		}
		return local18.method3022(arg2, local26, arg1, super.anInt3390, arg0, 22, this.aByte45, local30, super.anInt3388, super.anInt3389);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return this.method1725(arg0, arg1);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
		this.aBoolean124 = false;
		if (this.aClass105_2 != null) {
			this.aClass105_2.UA(this.aClass105_2.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (!(arg3 instanceof Class31_Sub1_Sub2)) {
			return;
		}
		@Pc(14) Class31_Sub1_Sub2 local14 = (Class31_Sub1_Sub2) arg3;
		if (this.aClass105_2 != null && local14.aClass105_2 != null) {
			this.aClass105_2.method3532(local14.aClass105_2, arg2, arg4, arg0, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		if (this.aClass105_2 == null) {
			return null;
		}
		@Pc(16) Class33 local16 = arg0.method4516();
		local16.j(super.anInt3389, super.anInt3388, super.anInt3390);
		@Pc(26) Class4_Sub1 local26 = null;
		if (this.aBoolean125) {
			local26 = Static241.method3635(1);
		}
		this.aClass105_2.method3534(local16, local26 == null ? null : local26.aClass4_Sub5Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return 22;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class105 local9 = this.method1725(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class33 local14 = arg0.method4516();
			local14.j(super.anInt3389, super.anInt3388, super.anInt3390);
			return local9.method3526(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
		if (this.aClass105_2 != null) {
			this.aClass105_2.method3542();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	private Class105 method1725(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass105_2 != null && arg0.method4528(this.aClass105_2.P(), arg1) == 0) {
			return this.aClass105_2;
		} else {
			@Pc(32) Class193 local32 = this.method1722(arg0, false, arg1);
			return local32 == null ? null : local32.aClass105_6;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
		@Pc(29) Class1_Sub2_Sub1 local29;
		if (this.aClass1_Sub2_Sub1_2 == null && this.aBoolean123) {
			@Pc(22) Class193 local22 = this.method1722(arg0, true, 262144);
			local29 = local22 == null ? null : local22.aClass1_Sub2_Sub1_5;
		} else {
			local29 = this.aClass1_Sub2_Sub1_2;
			this.aClass1_Sub2_Sub1_2 = null;
		}
		if (local29 != null) {
			Static205.method3297(local29, this.aByte44, super.anInt3389, super.anInt3390, null);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
		@Pc(20) Class1_Sub2_Sub1 local20;
		if (this.aClass1_Sub2_Sub1_2 == null && this.aBoolean123) {
			@Pc(31) Class193 local31 = this.method1722(arg0, true, 262144);
			local20 = local31 == null ? null : local31.aClass1_Sub2_Sub1_5;
		} else {
			local20 = this.aClass1_Sub2_Sub1_2;
			this.aClass1_Sub2_Sub1_2 = null;
		}
		if (local20 != null) {
			Static253.method3786(local20, this.aByte44, super.anInt3389, super.anInt3390, null);
		}
	}
}
