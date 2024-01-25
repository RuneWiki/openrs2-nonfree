import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class25_Sub5_Sub2 extends Class25_Sub5 implements Interface8 {

	@OriginalMember(owner = "client!kq", name = "lb", descriptor = "Lclient!ho;")
	public static final Class103 lb = new Class103(61, 2);

	@OriginalMember(owner = "client!kq", name = "fb", descriptor = "S")
	private final short aShort56;

	@OriginalMember(owner = "client!kq", name = "S", descriptor = "Z")
	private final boolean aBoolean451;

	@OriginalMember(owner = "client!kq", name = "eb", descriptor = "B")
	private final byte aByte54;

	@OriginalMember(owner = "client!kq", name = "G", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!kq", name = "X", descriptor = "Z")
	private boolean aBoolean453;

	@OriginalMember(owner = "client!kq", name = "jb", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!kq", name = "ab", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!kq", name = "W", descriptor = "Z")
	private final boolean aBoolean452;

	@OriginalMember(owner = "client!kq", name = "P", descriptor = "Lclient!i;")
	private Class1_Sub5_Sub10 aClass1_Sub5_Sub10_2;

	@OriginalMember(owner = "client!kq", name = "Y", descriptor = "Lclient!e;")
	public Class57 aClass57_3;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!za;Lclient!er;IIIIIZIIIIIIZ)V")
	public Class25_Sub5_Sub2(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1788 == 1, Static147.method5932(arg12, arg13));
		this.aShort56 = (short) arg1.anInt1787;
		this.aBoolean451 = arg1.anInt1821 != 0 && !arg7;
		this.aByte54 = (byte) arg13;
		this.aBoolean450 = arg7;
		this.aBoolean453 = arg14;
		this.aByte55 = (byte) arg12;
		this.aByte53 = (byte) arg3;
		this.aBoolean452 = arg0.method5758() && arg1.aBoolean205 && !this.aBoolean450 && Static453.aClass136_Sub1_1.method3516(Static14.anInt293) != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean453) {
			local80 |= 0x10000;
		}
		@Pc(95) Class247 local95 = this.method3180(arg0, this.aBoolean452, local80);
		if (local95 != null) {
			this.aClass1_Sub5_Sub10_2 = local95.aClass1_Sub5_Sub10_6;
			this.aClass57_3 = local95.aClass57_7;
			if (this.aBoolean453) {
				this.aClass57_3 = this.aClass57_3.method5966((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		if (this.aClass57_3 == null) {
			return null;
		}
		@Pc(17) Class32 local17 = arg0.method5747();
		local17.U(super.anInt5518, super.anInt5517, super.anInt5514);
		@Pc(27) Class4_Sub7 local27 = null;
		if (this.aBoolean451) {
			local27 = Static142.method2157(1);
		}
		this.aClass57_3.method5953(local17, local27 == null ? null : local27.aClass4_Sub8Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
		@Pc(31) Class1_Sub5_Sub10 local31;
		if (this.aClass1_Sub5_Sub10_2 == null && this.aBoolean452) {
			@Pc(24) Class247 local24 = this.method3180(arg0, true, 262144);
			local31 = local24 == null ? null : local24.aClass1_Sub5_Sub10_6;
		} else {
			local31 = this.aClass1_Sub5_Sub10_2;
			this.aClass1_Sub5_Sub10_2 = null;
		}
		if (local31 != null) {
			Static195.method2810(local31, this.aByte53, super.anInt5518, super.anInt5514, null);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return this.method3182(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
		if (this.aClass57_3 != null) {
			this.aClass57_3.method5963();
		}
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)I")
	public int method3179() {
		return this.aClass57_3 == null ? 15 : this.aClass57_3.k() / 4;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class57 local9 = this.method3182(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(21) Class32 local21 = arg1.method5747();
			local21.U(super.anInt5518, super.anInt5517, super.anInt5514);
			return local9.method5957(arg2, arg0, local21, false);
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return this.aBoolean452;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!za;ZII)Lclient!uu;")
	private Class247 method3180(@OriginalArg(0) Class34 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class68 local13 = Static341.aClass75_4.method1616(this.aShort56 & 0xFFFF);
		@Pc(21) Class157 local21;
		@Pc(25) Class157 local25;
		if (this.aBoolean450) {
			local21 = Static343.aClass157Array3[this.aByte53];
			local25 = Static330.aClass157Array2[0];
		} else {
			local21 = Static330.aClass157Array2[this.aByte53];
			if (this.aByte53 >= 3) {
				local25 = null;
			} else {
				local25 = Static330.aClass157Array2[this.aByte53 + 1];
			}
		}
		return local13.method1548(local21, arg2, arg1, this.aByte55 == 11 ? 10 : this.aByte55, super.anInt5514, local25, super.anInt5517, arg0, super.anInt5518, this.aByte55 == 11 ? this.aByte54 + 4 : this.aByte54);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		if (arg4 instanceof Class25_Sub4_Sub2) {
			@Pc(39) Class25_Sub4_Sub2 local39 = (Class25_Sub4_Sub2) arg4;
			if (this.aClass57_3 == null || local39.aClass57_4 == null) {
				return;
			}
			this.aClass57_3.method5956(local39.aClass57_4, arg3, arg1, arg0, arg2);
		} else if (arg4 instanceof Class25_Sub5_Sub2) {
			@Pc(20) Class25_Sub5_Sub2 local20 = (Class25_Sub5_Sub2) arg4;
			if (this.aClass57_3 != null && local20.aClass57_3 != null) {
				this.aClass57_3.method5956(local20.aClass57_3, arg3, arg1, arg0, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
		this.aBoolean453 = false;
		if (this.aClass57_3 != null) {
			this.aClass57_3.D(this.aClass57_3.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return this.aBoolean453;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	private Class57 method3182(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1) {
		if (this.aClass57_3 != null && arg1.method5783(this.aClass57_3.RA(), arg0) == 0) {
			return this.aClass57_3;
		} else {
			@Pc(28) Class247 local28 = this.method3180(arg1, false, arg0);
			return local28 == null ? null : local28.aClass57_7;
		}
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)I")
	@Override
	public int method4341() {
		return this.aClass57_3 == null ? 0 : this.aClass57_3.B();
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return this.aShort56 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
		@Pc(18) Class1_Sub5_Sub10 local18;
		if (this.aClass1_Sub5_Sub10_2 == null && this.aBoolean452) {
			@Pc(29) Class247 local29 = this.method3180(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass1_Sub5_Sub10_6;
		} else {
			local18 = this.aClass1_Sub5_Sub10_2;
			this.aClass1_Sub5_Sub10_2 = null;
		}
		if (local18 != null) {
			Static343.method4626(local18, this.aByte53, super.anInt5518, super.anInt5514, null);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return this.aByte55;
	}
}
