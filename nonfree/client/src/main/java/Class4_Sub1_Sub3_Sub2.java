import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class4_Sub1_Sub3_Sub2 extends Class4_Sub1_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "Lclient!rga;")
	private Class315 aClass315_4;

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "Z")
	private boolean aBoolean281;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "Z")
	private final boolean aBoolean279;

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "S")
	private final short aShort49;

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "Z")
	private final boolean aBoolean280;

	@OriginalMember(owner = "client!ie", name = "eb", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!ie", name = "lb", descriptor = "Z")
	private final boolean lb;

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lclient!ka;")
	private Class43 aClass43_3;

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "Lclient!r;")
	private Class5_Sub1_Sub15 aClass5_Sub1_Sub15_3;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!ha;Lclient!tk;IIIIIZIZ)V")
	public Class4_Sub1_Sub3_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class354 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt9429);
		this.aBoolean281 = arg9;
		this.aBoolean279 = arg1.anInt9386 != 0 && !arg7;
		this.aShort49 = (short) arg1.anInt9392;
		super.anInt9803 = arg6;
		super.anInt9805 = arg4;
		this.aBoolean280 = arg7;
		this.aByte49 = (byte) arg8;
		this.lb = arg0.method8624() && arg1.aBoolean643 && !this.aBoolean280 && Static577.aClass5_Sub19_25.aClass17_Sub3_1.method430() != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean281) {
			local71 |= 0x10000;
		}
		@Pc(86) Class377 local86 = this.method3797(this.lb, arg0, local71);
		if (local86 != null) {
			this.aClass43_3 = local86.aClass43_7;
			this.aClass5_Sub1_Sub15_3 = local86.aClass5_Sub1_Sub15_6;
			if (this.aBoolean281) {
				this.aClass43_3 = this.aClass43_3.method8840((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)I")
	@Override
	public int method8364() {
		return this.aShort49 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		if (this.aClass43_3 == null) {
			return true;
		} else {
			return !this.aClass43_3.r();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8361(@OriginalArg(0) Class100 arg0) {
		@Pc(36) Class5_Sub1_Sub15 local36;
		if (this.aClass5_Sub1_Sub15_3 == null && this.lb) {
			@Pc(28) Class377 local28 = this.method3797(true, arg0, 262144);
			local36 = local28 == null ? null : local28.aClass5_Sub1_Sub15_6;
		} else {
			local36 = this.aClass5_Sub1_Sub15_3;
			this.aClass5_Sub1_Sub15_3 = null;
		}
		if (local36 != null) {
			Static409.method5964(local36, super.aByte138, super.anInt9805, super.anInt9803, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8365() {
		return this.lb;
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return this.aClass43_3 == null ? 0 : this.aClass43_3.fa();
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aClass43_3 == null ? false : this.aClass43_3.F();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(11) Class43 local11 = this.method3798(arg2, 131072);
		if (local11 == null) {
			return false;
		} else {
			@Pc(16) Class10 local16 = arg2.method8610();
			local16.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
			return Static305.aBoolean339 ? local11.method8844(arg1, arg0, local16, false, 0, Static216.anInt1170) : local11.method8852(arg1, arg0, local16, false, 0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8363(@OriginalArg(1) Class100 arg0) {
		@Pc(24) Class5_Sub1_Sub15 local24;
		if (this.aClass5_Sub1_Sub15_3 == null && this.lb) {
			@Pc(35) Class377 local35 = this.method3797(true, arg0, 262144);
			local24 = local35 == null ? null : local35.aClass5_Sub1_Sub15_6;
		} else {
			local24 = this.aClass5_Sub1_Sub15_3;
			this.aClass5_Sub1_Sub15_3 = null;
		}
		if (local24 != null) {
			Static530.method7245(local24, super.aByte138, super.anInt9805, super.anInt9803, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		if (this.aClass315_4 == null) {
			this.aClass315_4 = Static645.method8909(this.method3798(arg0, 0), super.anInt9805, super.anInt9803, super.anInt9797);
		}
		return this.aClass315_4;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 > -10 || !(arg4 instanceof Class4_Sub1_Sub3_Sub2)) {
			return;
		}
		@Pc(14) Class4_Sub1_Sub3_Sub2 local14 = (Class4_Sub1_Sub3_Sub2) arg4;
		if (this.aClass43_3 != null && local14.aClass43_3 != null) {
			this.aClass43_3.method8861(local14.aClass43_3, arg6, arg1, arg3, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
	@Override
	public void method8351(@OriginalArg(0) byte arg0) {
		this.aBoolean281 = false;
		if (arg0 < -41 && this.aClass43_3 != null) {
			this.aClass43_3.s(this.aClass43_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZLclient!ha;I)Lclient!vh;")
	private Class377 method3797(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class354 local18 = Static528.aClass243_3.method5556(this.aShort49 & 0xFFFF);
		@Pc(43) Class84 local43;
		@Pc(34) Class84 local34;
		if (this.aBoolean280) {
			local43 = Static77.aClass84Array1[super.aByte138];
			local34 = Static668.aClass84Array4[0];
		} else {
			if (super.aByte138 < 3) {
				local34 = Static668.aClass84Array4[super.aByte138 + 1];
			} else {
				local34 = null;
			}
			local43 = Static668.aClass84Array4[super.aByte138];
		}
		return local18.method8030((Class87) null, 22, super.anInt9803, arg1, this.aByte49, local34, local43, super.anInt9805, arg0, arg2, super.anInt9797);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)I")
	@Override
	public int method8367() {
		return this.aByte49;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		if (this.aClass43_3 == null) {
			return null;
		}
		@Pc(18) Class10 local18 = arg0.method8610();
		local18.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
		@Pc(32) Class4_Sub6 local32 = Static281.method4512(this.aBoolean279, 1);
		if (Static305.aBoolean339) {
			this.aClass43_3.method8846(local18, local32.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
		} else {
			this.aClass43_3.method8849(local18, local32.aClass4_Sub8Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)I")
	@Override
	public int method8366() {
		return 22;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8339() {
		return this.aBoolean281;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 >= -112) {
			this.aClass43_3 = null;
		}
		return this.aClass43_3 == null ? 0 : this.aClass43_3.ma();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	@Override
	public void method8362() {
		if (this.aClass43_3 != null) {
			this.aClass43_3.method8864();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class43 method3798(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass43_3 != null && arg0.method8628(this.aClass43_3.ua(), arg1) == 0) {
			return this.aClass43_3;
		} else {
			@Pc(38) Class377 local38 = this.method3797(false, arg0, arg1);
			return local38 == null ? null : local38.aClass43_7;
		}
	}
}
