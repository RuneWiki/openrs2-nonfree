import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class31_Sub4_Sub3 extends Class31_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "B")
	private final byte aByte90;

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "S")
	private final short aShort84;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "Z")
	private final boolean aBoolean433;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "Z")
	private final boolean aBoolean432;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "B")
	private final byte aByte88;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "Z")
	private final boolean aBoolean434;

	@OriginalMember(owner = "client!tg", name = "Q", descriptor = "Lclient!ba;")
	private Class1_Sub2_Sub1 aClass1_Sub2_Sub1_6;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "Lclient!t;")
	private Class105 aClass105_7;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!ya;Lclient!jt;IIIIZIIIII)V")
	public Class31_Sub4_Sub3(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static124.method5865(arg11, arg10));
		super.anInt6195 = arg5;
		this.aByte90 = (byte) arg2;
		this.aShort84 = (short) arg1.anInt3530;
		this.aBoolean433 = arg1.anInt3504 != 0 && !arg6;
		this.aByte89 = (byte) arg10;
		this.aBoolean432 = arg6;
		super.anInt6193 = arg3;
		this.aByte88 = (byte) arg11;
		this.aBoolean434 = arg0.method4568() && arg1.aBoolean214 && !this.aBoolean432 && Static38.aClass135_Sub1_1.method4236(Static143.anInt2766) != 0;
		@Pc(77) Class193 local77 = this.method5179(2048, arg0, this.aBoolean434);
		if (local77 != null) {
			this.aClass1_Sub2_Sub1_6 = local77.aClass1_Sub2_Sub1_5;
			this.aClass105_7 = local77.aClass105_6;
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return this.aByte89;
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return this.aBoolean434;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	private Class105 method5178(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass105_7 != null && arg0.method4528(this.aClass105_7.P(), arg1) == 0) {
			return this.aClass105_7;
		} else {
			@Pc(33) Class193 local33 = this.method5179(arg1, arg0, false);
			return local33 == null ? null : local33.aClass105_6;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILclient!ya;Z)Lclient!pm;")
	private Class193 method5179(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class129 local13 = Static349.aClass115_4.method2766(this.aShort84 & 0xFFFF);
		@Pc(34) Class149 local34;
		@Pc(29) Class149 local29;
		if (this.aBoolean432) {
			local29 = Static269.aClass149Array2[0];
			local34 = Static277.aClass149Array3[this.aByte90];
		} else {
			if (this.aByte90 < 3) {
				local29 = Static269.aClass149Array2[this.aByte90 + 1];
			} else {
				local29 = null;
			}
			local34 = Static269.aClass149Array2[this.aByte90];
		}
		return local13.method3022(arg0, local34, arg2, super.anInt6195, arg1, this.aByte89, this.aByte88, local29, super.anInt6192, super.anInt6193);
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)I")
	@Override
	public int method5164() {
		return this.aClass105_7 == null ? 0 : this.aClass105_7.MA();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return this.aByte88;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return this.method5178(arg0, arg1);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		if (this.aClass105_7 == null) {
			return null;
		}
		@Pc(17) Class33 local17 = arg0.method4516();
		local17.j(super.anInt6193 + super.anInt6198, super.anInt6192, super.anInt6195 + super.anInt6200);
		@Pc(34) Class4_Sub1 local34 = null;
		if (this.aBoolean433) {
			local34 = Static241.method3635(1);
		}
		this.aClass105_7.method3534(local17, local34 == null ? null : local34.aClass4_Sub5Array1[0], 0);
		return local34;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class105 local9 = this.method5178(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class33 local19 = arg0.method4516();
			local19.j(super.anInt6193, super.anInt6192, super.anInt6195);
			return local9.method3526(arg2, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
		@Pc(20) Class1_Sub2_Sub1 local20;
		if (this.aClass1_Sub2_Sub1_6 == null && this.aBoolean434) {
			@Pc(31) Class193 local31 = this.method5179(262144, arg0, true);
			local20 = local31 == null ? null : local31.aClass1_Sub2_Sub1_5;
		} else {
			local20 = this.aClass1_Sub2_Sub1_6;
			this.aClass1_Sub2_Sub1_6 = null;
		}
		if (local20 != null) {
			Static205.method3297(local20, this.aByte90, super.anInt6193, super.anInt6195, null);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return this.aShort84 & 0xFFFF;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
		@Pc(14) Class1_Sub2_Sub1 local14;
		if (this.aClass1_Sub2_Sub1_6 == null && this.aBoolean434) {
			@Pc(25) Class193 local25 = this.method5179(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass1_Sub2_Sub1_5;
		} else {
			local14 = this.aClass1_Sub2_Sub1_6;
			this.aClass1_Sub2_Sub1_6 = null;
		}
		if (local14 != null) {
			Static253.method3786(local14, this.aByte90, super.anInt6193, super.anInt6195, null);
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
		if (this.aClass105_7 != null) {
			this.aClass105_7.method3542();
		}
	}
}
