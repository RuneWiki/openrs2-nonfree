import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class4_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!hj", name = "fb", descriptor = "Lclient!rga;")
	private Class315 aClass315_3;

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "Z")
	private final boolean aBoolean266;

	@OriginalMember(owner = "client!hj", name = "bb", descriptor = "Z")
	private boolean aBoolean265;

	@OriginalMember(owner = "client!hj", name = "gb", descriptor = "S")
	private final short aShort47;

	@OriginalMember(owner = "client!hj", name = "db", descriptor = "Z")
	private boolean aBoolean263;

	@OriginalMember(owner = "client!hj", name = "cb", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!hj", name = "pb", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!hj", name = "mb", descriptor = "Z")
	private final boolean aBoolean264;

	@OriginalMember(owner = "client!hj", name = "ib", descriptor = "Lclient!ka;")
	public Class43 aClass43_2;

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "Lclient!r;")
	private Class5_Sub1_Sub15 aClass5_Sub1_Sub15_2;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!ha;Lclient!tk;IIIIIZIIIIIIZ)V")
	public Class4_Sub1_Sub1_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class354 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt9378 == 1, Static657.method9023(arg13, arg12));
		this.aBoolean266 = arg1.anInt9386 != 0 && !arg7;
		this.aBoolean265 = arg7;
		this.aShort47 = (short) arg1.anInt9392;
		super.aByte138 = (byte) arg3;
		this.aBoolean263 = arg14;
		this.aByte45 = (byte) arg12;
		this.aByte44 = (byte) arg13;
		this.aBoolean264 = arg0.method8624() && arg1.aBoolean643 && !this.aBoolean265 && Static577.aClass5_Sub19_25.aClass17_Sub3_1.method430() != 0;
		@Pc(88) int local88 = 2048;
		if (this.aBoolean263) {
			local88 |= 0x10000;
		}
		@Pc(103) Class377 local103 = this.method3473(this.aBoolean264, arg0, local88);
		if (local103 != null) {
			this.aClass43_2 = local103.aClass43_7;
			this.aClass5_Sub1_Sub15_2 = local103.aClass5_Sub1_Sub15_6;
			if (this.aBoolean263) {
				this.aClass43_2 = this.aClass43_2.method8840((byte) 0, local88, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)I")
	@Override
	public int method8367() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8365() {
		return this.aBoolean264;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	@Override
	public void method8362() {
		if (this.aClass43_2 != null) {
			this.aClass43_2.method8864();
		}
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(B)I")
	public int method3472() {
		return this.aClass43_2 == null ? 15 : this.aClass43_2.na() / 4;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLclient!ha;II)Lclient!vh;")
	private Class377 method3473(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class354 local13 = Static528.aClass243_3.method5556(this.aShort47 & 0xFFFF);
		@Pc(40) Class84 local40;
		@Pc(26) Class84 local26;
		if (this.aBoolean265) {
			local40 = Static77.aClass84Array1[super.aByte138];
			local26 = Static668.aClass84Array4[0];
		} else {
			if (super.aByte138 >= 3) {
				local26 = null;
			} else {
				local26 = Static668.aClass84Array4[super.aByte138 + 1];
			}
			local40 = Static668.aClass84Array4[super.aByte138];
		}
		return local13.method8030((Class87) null, this.aByte45 == 11 ? 10 : this.aByte45, super.anInt9803, arg1, this.aByte45 == 11 ? this.aByte44 + 4 : this.aByte44, local26, local40, super.anInt9805, arg0, arg2, super.anInt9797);
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 >= -112) {
			return 97;
		} else if (this.aClass43_2 == null) {
			return 0;
		} else {
			return this.aClass43_2.ma();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 > -10) {
			this.aClass43_2 = null;
		}
		if (arg4 instanceof Class4_Sub1_Sub2_Sub1) {
			@Pc(13) Class4_Sub1_Sub2_Sub1 local13 = (Class4_Sub1_Sub2_Sub1) arg4;
			if (this.aClass43_2 != null && local13.aClass43_1 != null) {
				this.aClass43_2.method8861(local13.aClass43_1, arg6, arg1, arg3, arg0);
			}
		} else if (arg4 instanceof Class4_Sub1_Sub1_Sub1) {
			@Pc(42) Class4_Sub1_Sub1_Sub1 local42 = (Class4_Sub1_Sub1_Sub1) arg4;
			if (this.aClass43_2 != null && local42.aClass43_2 != null) {
				this.aClass43_2.method8861(local42.aClass43_2, arg6, arg1, arg3, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return this.aClass43_2 == null ? 0 : this.aClass43_2.fa();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)I")
	@Override
	public int method8366() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(9) Class43 local9 = this.method3477(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class10 local14 = arg2.method8610();
			local14.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
			return Static305.aBoolean339 ? local9.method8844(arg1, arg0, local14, false, 0, Static216.anInt1170) : local9.method8852(arg1, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		if (this.aClass43_2 == null) {
			return null;
		}
		@Pc(12) Class10 local12 = arg0.method8610();
		local12.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
		@Pc(32) Class4_Sub6 local32 = Static281.method4512(this.aBoolean266, 1);
		if (Static305.aBoolean339) {
			this.aClass43_2.method8846(local12, local32.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
		} else {
			this.aClass43_2.method8849(local12, local32.aClass4_Sub8Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
	@Override
	public void method8351(@OriginalArg(0) byte arg0) {
		if (arg0 >= -41) {
			this.aBoolean265 = true;
		}
		this.aBoolean263 = false;
		if (this.aClass43_2 != null) {
			this.aClass43_2.s(this.aClass43_2.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8363(@OriginalArg(1) Class100 arg0) {
		@Pc(21) Class5_Sub1_Sub15 local21;
		if (this.aClass5_Sub1_Sub15_2 == null && this.aBoolean264) {
			@Pc(32) Class377 local32 = this.method3473(true, arg0, 262144);
			local21 = local32 == null ? null : local32.aClass5_Sub1_Sub15_6;
		} else {
			local21 = this.aClass5_Sub1_Sub15_2;
			this.aClass5_Sub1_Sub15_2 = null;
		}
		if (local21 != null) {
			Static530.method7245(local21, super.aByte138, super.anInt9805, super.anInt9803, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8339() {
		return this.aBoolean263;
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aClass43_2 == null ? false : this.aClass43_2.F();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		if (this.aClass43_2 == null) {
			return true;
		} else {
			return !this.aClass43_2.r();
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)I")
	@Override
	public int method8364() {
		return this.aShort47 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!ha;Z)Lclient!ka;")
	private Class43 method3477(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1) {
		if (this.aClass43_2 != null && arg1.method8628(this.aClass43_2.ua(), arg0) == 0) {
			return this.aClass43_2;
		} else {
			@Pc(29) Class377 local29 = this.method3473(false, arg1, arg0);
			return local29 == null ? null : local29.aClass43_7;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8361(@OriginalArg(0) Class100 arg0) {
		@Pc(24) Class5_Sub1_Sub15 local24;
		if (this.aClass5_Sub1_Sub15_2 == null && this.aBoolean264) {
			@Pc(35) Class377 local35 = this.method3473(true, arg0, 262144);
			local24 = local35 == null ? null : local35.aClass5_Sub1_Sub15_6;
		} else {
			local24 = this.aClass5_Sub1_Sub15_2;
			this.aClass5_Sub1_Sub15_2 = null;
		}
		if (local24 != null) {
			Static409.method5964(local24, super.aByte138, super.anInt9805, super.anInt9803, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		if (this.aClass315_3 == null) {
			this.aClass315_3 = Static645.method8909(this.method3477(0, arg0), super.anInt9805, super.anInt9803, super.anInt9797);
		}
		return this.aClass315_3;
	}
}
