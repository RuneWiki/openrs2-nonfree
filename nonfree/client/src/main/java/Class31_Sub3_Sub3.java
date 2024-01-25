import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class31_Sub3_Sub3 extends Class31_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!hi", name = "P", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!hi", name = "M", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "Z")
	private final boolean aBoolean168;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "Z")
	private final boolean aBoolean169;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "S")
	private final short aShort48;

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "Z")
	private final boolean aBoolean170;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "Lclient!t;")
	public Class105 aClass105_4;

	@OriginalMember(owner = "client!hi", name = "H", descriptor = "Lclient!ba;")
	private Class1_Sub2_Sub1 aClass1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!ya;Lclient!jt;IIIIZIIZ)V")
	public Class31_Sub3_Sub3(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static270.method3990(arg8, arg7));
		this.aBoolean171 = arg9;
		super.anInt2833 = arg5;
		this.aByte62 = (byte) arg8;
		this.aByte64 = (byte) arg7;
		this.aBoolean168 = arg6;
		this.aBoolean169 = arg1.anInt3504 != 0 && !arg6;
		this.aShort48 = (short) arg1.anInt3530;
		this.aByte63 = (byte) arg2;
		super.anInt2832 = arg3;
		this.aBoolean170 = arg0.method4568() && arg1.aBoolean214 && !this.aBoolean168 && Static38.aClass135_Sub1_1.method4236(Static143.anInt2766) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean171) {
			local71 |= 0x10000;
		}
		@Pc(86) Class193 local86 = this.method2442(arg0, this.aBoolean170, local71);
		if (local86 != null) {
			this.aClass105_4 = local86.aClass105_6;
			this.aClass1_Sub2_Sub1_4 = local86.aClass1_Sub2_Sub1_5;
			if (this.aBoolean171) {
				this.aClass105_4 = this.aClass105_4.method3548((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ya;B)Lclient!t;")
	private Class105 method2438(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1) {
		if (this.aClass105_4 != null && arg1.method4528(this.aClass105_4.P(), arg0) == 0) {
			return this.aClass105_4;
		} else {
			@Pc(31) Class193 local31 = this.method2442(arg1, false, arg0);
			return local31 == null ? null : local31.aClass105_6;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
		if (this.aClass105_4 != null) {
			this.aClass105_4.method3542();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return this.aBoolean170;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return this.method2438(arg1, arg0);
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return this.aBoolean171;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return this.aShort48 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		if (this.aClass105_4 == null) {
			return null;
		}
		@Pc(16) Class33 local16 = arg0.method4516();
		local16.j(super.anInt2832, super.anInt2835, super.anInt2833);
		@Pc(26) Class4_Sub1 local26 = null;
		if (this.aBoolean169) {
			local26 = Static241.method3635(1);
		}
		this.aClass105_4.method3534(local16, local26 == null ? null : local26.aClass4_Sub5Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return this.aByte64;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class105 local9 = this.method2438(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class33 local14 = arg0.method4516();
			local14.j(super.anInt2832, super.anInt2835, super.anInt2833);
			return local9.method3526(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return this.aByte62;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class31_Sub3_Sub3) {
			@Pc(9) Class31_Sub3_Sub3 local9 = (Class31_Sub3_Sub3) arg3;
			if (this.aClass105_4 != null && local9.aClass105_4 != null) {
				this.aClass105_4.method3532(local9.aClass105_4, arg2, arg4, arg0, arg5);
			}
		} else if (arg3 instanceof Class31_Sub2_Sub3) {
			@Pc(32) Class31_Sub2_Sub3 local32 = (Class31_Sub2_Sub3) arg3;
			if (this.aClass105_4 != null && local32.aClass105_1 != null) {
				this.aClass105_4.method3532(local32.aClass105_1, arg2, arg4, arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
		@Pc(30) Class1_Sub2_Sub1 local30;
		if (this.aClass1_Sub2_Sub1_4 == null && this.aBoolean170) {
			@Pc(23) Class193 local23 = this.method2442(arg0, true, 262144);
			local30 = local23 == null ? null : local23.aClass1_Sub2_Sub1_5;
		} else {
			local30 = this.aClass1_Sub2_Sub1_4;
			this.aClass1_Sub2_Sub1_4 = null;
		}
		if (local30 != null) {
			Static253.method3786(local30, this.aByte63, super.anInt2832, super.anInt2833, null);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
		this.aBoolean171 = false;
		if (this.aClass105_4 != null) {
			this.aClass105_4.UA(this.aClass105_4.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ya;ZII)Lclient!pm;")
	private Class193 method2442(@OriginalArg(0) Class39 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class129 local13 = Static349.aClass115_4.method2766(this.aShort48 & 0xFFFF);
		@Pc(47) Class149 local47;
		@Pc(33) Class149 local33;
		if (this.aBoolean168) {
			local33 = Static269.aClass149Array2[0];
			local47 = Static277.aClass149Array3[this.aByte63];
		} else {
			if (this.aByte63 >= 3) {
				local33 = null;
			} else {
				local33 = Static269.aClass149Array2[this.aByte63 + 1];
			}
			local47 = Static269.aClass149Array2[this.aByte63];
		}
		return local13.method3022(arg2, local47, arg1, super.anInt2833, arg0, this.aByte64, this.aByte62, local33, super.anInt2835, super.anInt2832);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
		@Pc(31) Class1_Sub2_Sub1 local31;
		if (this.aClass1_Sub2_Sub1_4 == null && this.aBoolean170) {
			@Pc(24) Class193 local24 = this.method2442(arg0, true, 262144);
			local31 = local24 == null ? null : local24.aClass1_Sub2_Sub1_5;
		} else {
			local31 = this.aClass1_Sub2_Sub1_4;
			this.aClass1_Sub2_Sub1_4 = null;
		}
		if (local31 != null) {
			Static205.method3297(local31, this.aByte63, super.anInt2832, super.anInt2833, null);
		}
	}
}
