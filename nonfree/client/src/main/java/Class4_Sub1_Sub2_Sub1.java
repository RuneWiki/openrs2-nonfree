import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class4_Sub1_Sub2_Sub1 extends Class4_Sub1_Sub2 implements Interface9 {

	@OriginalMember(owner = "client!bba", name = "U", descriptor = "Lclient!rga;")
	private Class315 aClass315_1;

	@OriginalMember(owner = "client!bba", name = "qb", descriptor = "Z")
	private final boolean aBoolean27;

	@OriginalMember(owner = "client!bba", name = "N", descriptor = "Z")
	private final boolean aBoolean26;

	@OriginalMember(owner = "client!bba", name = "O", descriptor = "Z")
	private boolean aBoolean25;

	@OriginalMember(owner = "client!bba", name = "M", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!bba", name = "bb", descriptor = "B")
	private final byte aByte12;

	@OriginalMember(owner = "client!bba", name = "L", descriptor = "S")
	private final short aShort15;

	@OriginalMember(owner = "client!bba", name = "nb", descriptor = "Z")
	private final boolean aBoolean28;

	@OriginalMember(owner = "client!bba", name = "V", descriptor = "Lclient!ka;")
	public Class43 aClass43_1;

	@OriginalMember(owner = "client!bba", name = "P", descriptor = "Lclient!r;")
	private Class5_Sub1_Sub15 aClass5_Sub1_Sub15_1;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!ha;Lclient!tk;IIIIIZIIZ)V")
	public Class4_Sub1_Sub2_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class354 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static604.method8299(arg8, arg9));
		this.aBoolean27 = arg7;
		this.aBoolean26 = arg1.anInt9386 != 0 && !arg7;
		this.aBoolean25 = arg10;
		this.aByte13 = (byte) arg9;
		this.aByte12 = (byte) arg8;
		super.anInt9805 = arg4;
		this.aShort15 = (short) arg1.anInt9392;
		super.anInt9803 = arg6;
		this.aBoolean28 = arg0.method8624() && arg1.aBoolean643 && !this.aBoolean27 && Static577.aClass5_Sub19_25.aClass17_Sub3_1.method430() != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean25) {
			local80 |= 0x10000;
		}
		@Pc(95) Class377 local95 = this.method498(local80, arg0, this.aBoolean28);
		if (local95 != null) {
			this.aClass43_1 = local95.aClass43_7;
			this.aClass5_Sub1_Sub15_1 = local95.aClass5_Sub1_Sub15_6;
			if (this.aBoolean25) {
				this.aClass43_1 = this.aClass43_1.method8840((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8361(@OriginalArg(0) Class100 arg0) {
		@Pc(36) Class5_Sub1_Sub15 local36;
		if (this.aClass5_Sub1_Sub15_1 == null && this.aBoolean28) {
			@Pc(28) Class377 local28 = this.method498(262144, arg0, true);
			local36 = local28 == null ? null : local28.aClass5_Sub1_Sub15_6;
		} else {
			local36 = this.aClass5_Sub1_Sub15_1;
			this.aClass5_Sub1_Sub15_1 = null;
		}
		if (local36 != null) {
			Static409.method5964(local36, super.aByte138, super.anInt9805, super.anInt9803, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(9) Class43 local9 = this.method500(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class10 local14 = arg2.method8610();
			local14.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
			return Static305.aBoolean339 ? local9.method8844(arg1, arg0, local14, false, 0, Static216.anInt1170) : local9.method8852(arg1, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		if (this.aClass43_1 == null) {
			return null;
		}
		@Pc(20) Class10 local20 = arg0.method8610();
		local20.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
		@Pc(34) Class4_Sub6 local34 = Static281.method4512(this.aBoolean26, 1);
		if (Static305.aBoolean339) {
			this.aClass43_1.method8846(local20, local34.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
		} else {
			this.aClass43_1.method8849(local20, local34.aClass4_Sub8Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		if (this.aClass315_1 == null) {
			this.aClass315_1 = Static645.method8909(this.method500(arg0, 0), super.anInt9805, super.anInt9803, super.anInt9797);
		}
		return this.aClass315_1;
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I")
	@Override
	public int method8366() {
		return this.aByte12;
	}

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8339() {
		return this.aBoolean25;
	}

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 > -112) {
			this.method8351((byte) 99);
		}
		return this.aClass43_1 == null ? 0 : this.aClass43_1.ma();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IBLclient!ha;Z)Lclient!vh;")
	private Class377 method498(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class354 local13 = Static528.aClass243_3.method5556(this.aShort15 & 0xFFFF);
		@Pc(48) Class84 local48;
		@Pc(34) Class84 local34;
		if (this.aBoolean27) {
			local48 = Static77.aClass84Array1[super.aByte138];
			local34 = Static668.aClass84Array4[0];
		} else {
			if (super.aByte138 >= 3) {
				local34 = null;
			} else {
				local34 = Static668.aClass84Array4[super.aByte138 + 1];
			}
			local48 = Static668.aClass84Array4[super.aByte138];
		}
		return local13.method8030((Class87) null, this.aByte12, super.anInt9803, arg1, this.aByte13, local34, local48, super.anInt9805, arg2, arg0, super.anInt9797);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8363(@OriginalArg(1) Class100 arg0) {
		@Pc(25) Class5_Sub1_Sub15 local25;
		if (this.aClass5_Sub1_Sub15_1 == null && this.aBoolean28) {
			@Pc(36) Class377 local36 = this.method498(262144, arg0, true);
			local25 = local36 == null ? null : local36.aClass5_Sub1_Sub15_6;
		} else {
			local25 = this.aClass5_Sub1_Sub15_1;
			this.aClass5_Sub1_Sub15_1 = null;
		}
		if (local25 != null) {
			Static530.method7245(local25, super.aByte138, super.anInt9805, super.anInt9803, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(B)I")
	@Override
	public int method8367() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!ha;IB)Lclient!ka;")
	private Class43 method500(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass43_1 != null && arg0.method8628(this.aClass43_1.ua(), arg1) == 0) {
			return this.aClass43_1;
		} else {
			@Pc(26) Class377 local26 = this.method498(arg1, arg0, false);
			return local26 == null ? null : local26.aClass43_7;
		}
	}

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return this.aClass43_1 == null ? 0 : this.aClass43_1.fa();
	}

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aClass43_1 == null ? false : this.aClass43_1.F();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
	@Override
	public void method8362() {
		if (this.aClass43_1 != null) {
			this.aClass43_1.method8864();
		}
	}

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		if (this.aClass43_1 == null) {
			return true;
		} else {
			return !this.aClass43_1.r();
		}
	}

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "(B)I")
	@Override
	public int method8364() {
		return this.aShort15 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 instanceof Class4_Sub1_Sub2_Sub1) {
			@Pc(38) Class4_Sub1_Sub2_Sub1 local38 = (Class4_Sub1_Sub2_Sub1) arg4;
			if (this.aClass43_1 != null && local38.aClass43_1 != null) {
				this.aClass43_1.method8861(local38.aClass43_1, arg6, arg1, arg3, arg0);
			}
		} else if (arg4 instanceof Class4_Sub1_Sub1_Sub1) {
			@Pc(14) Class4_Sub1_Sub1_Sub1 local14 = (Class4_Sub1_Sub1_Sub1) arg4;
			if (this.aClass43_1 != null && local14.aClass43_2 != null) {
				this.aClass43_1.method8861(local14.aClass43_2, arg6, arg1, arg3, arg0);
			}
		}
		if (arg5 > -10) {
			this.method8351((byte) 123);
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8365() {
		return this.aBoolean28;
	}

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "(B)V")
	@Override
	public void method8351(@OriginalArg(0) byte arg0) {
		this.aBoolean25 = false;
		if (arg0 <= -41 && this.aClass43_1 != null) {
			this.aClass43_1.s(this.aClass43_1.ua() & 0xFFFEFFFF);
		}
	}
}
