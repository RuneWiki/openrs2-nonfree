import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class4_Sub1_Sub5_Sub1 extends Class4_Sub1_Sub5 implements Interface9 {

	@OriginalMember(owner = "client!qga", name = "bb", descriptor = "Lclient!rga;")
	private Class315 aClass315_7;

	@OriginalMember(owner = "client!qga", name = "M", descriptor = "S")
	private final short aShort93;

	@OriginalMember(owner = "client!qga", name = "O", descriptor = "B")
	private final byte aByte112;

	@OriginalMember(owner = "client!qga", name = "fb", descriptor = "B")
	private final byte aByte113;

	@OriginalMember(owner = "client!qga", name = "db", descriptor = "Z")
	private final boolean aBoolean525;

	@OriginalMember(owner = "client!qga", name = "jb", descriptor = "Z")
	private final boolean aBoolean526;

	@OriginalMember(owner = "client!qga", name = "ib", descriptor = "Z")
	private final boolean aBoolean527;

	@OriginalMember(owner = "client!qga", name = "nb", descriptor = "Lclient!r;")
	private Class5_Sub1_Sub15 aClass5_Sub1_Sub15_5;

	@OriginalMember(owner = "client!qga", name = "kb", descriptor = "Lclient!ka;")
	private Class43 aClass43_5;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!ha;Lclient!tk;IIIIIZIIII)V")
	public Class4_Sub1_Sub5_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class354 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aShort93 = (short) arg1.anInt9392;
		this.aByte112 = (byte) arg10;
		this.aByte113 = (byte) arg11;
		this.aBoolean525 = arg1.anInt9386 != 0 && !arg7;
		super.anInt9803 = arg6;
		super.anInt9805 = arg4;
		this.aBoolean526 = arg7;
		this.aBoolean527 = arg0.method8624() && arg1.aBoolean643 && !this.aBoolean526 && Static577.aClass5_Sub19_25.aClass17_Sub3_1.method430() != 0;
		@Pc(81) Class377 local81 = this.method6819(arg0, 2048, this.aBoolean527);
		if (local81 != null) {
			this.aClass5_Sub1_Sub15_5 = local81.aClass5_Sub1_Sub15_6;
			this.aClass43_5 = local81.aClass43_7;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	@Override
	public void method8362() {
		if (this.aClass43_5 != null) {
			this.aClass43_5.method8864();
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		if (this.aClass315_7 == null) {
			this.aClass315_7 = Static645.method8909(this.method6818(0, arg0), super.anInt9805, super.anInt9803, super.anInt9797);
		}
		return this.aClass315_7;
	}

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 >= -112) {
			this.method8347();
		}
		return this.aClass43_5 == null ? 0 : this.aClass43_5.ma();
	}

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		if (this.aClass43_5 == null) {
			return true;
		} else {
			return !this.aClass43_5.r();
		}
	}

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aClass43_5 == null ? false : this.aClass43_5.F();
	}

	@OriginalMember(owner = "client!qga", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return this.aClass43_5 == null ? 0 : this.aClass43_5.fa();
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)I")
	@Override
	public int method8367() {
		return this.aByte113;
	}

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "(B)I")
	@Override
	public int method8364() {
		return this.aShort93 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(9) Class43 local9 = this.method6818(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class10 local14 = arg2.method8610();
			local14.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
			return Static305.aBoolean339 ? local9.method8844(arg1, arg0, local14, false, 0, Static216.anInt1170) : local9.method8852(arg1, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		if (this.aClass43_5 == null) {
			return null;
		}
		@Pc(12) Class10 local12 = arg0.method8610();
		local12.method4214(super.aShort107 + super.anInt9805, super.anInt9797, super.anInt9803 + super.aShort106);
		@Pc(40) Class4_Sub6 local40 = Static281.method4512(this.aBoolean525, 1);
		if (Static305.aBoolean339) {
			this.aClass43_5.method8846(local12, local40.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
		} else {
			this.aClass43_5.method8849(local12, local40.aClass4_Sub8Array1[0], 0);
		}
		return local40;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)I")
	@Override
	public int method8366() {
		return this.aByte112;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8365() {
		return this.aBoolean527;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILclient!ha;B)Lclient!ka;")
	private Class43 method6818(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1) {
		if (this.aClass43_5 != null && arg1.method8628(this.aClass43_5.ua(), arg0) == 0) {
			return this.aClass43_5;
		} else {
			@Pc(38) Class377 local38 = this.method6819(arg1, arg0, false);
			return local38 == null ? null : local38.aClass43_7;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8361(@OriginalArg(0) Class100 arg0) {
		@Pc(36) Class5_Sub1_Sub15 local36;
		if (this.aClass5_Sub1_Sub15_5 == null && this.aBoolean527) {
			@Pc(28) Class377 local28 = this.method6819(arg0, 262144, true);
			local36 = local28 == null ? null : local28.aClass5_Sub1_Sub15_6;
		} else {
			local36 = this.aClass5_Sub1_Sub15_5;
			this.aClass5_Sub1_Sub15_5 = null;
		}
		if (local36 != null) {
			Static409.method5964(local36, super.aByte138, super.anInt9805, super.anInt9803, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILclient!ha;IZ)Lclient!vh;")
	private Class377 method6819(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class354 local13 = Static528.aClass243_3.method5556(this.aShort93 & 0xFFFF);
		@Pc(27) Class84 local27;
		@Pc(35) Class84 local35;
		if (this.aBoolean526) {
			local35 = Static668.aClass84Array4[0];
			local27 = Static77.aClass84Array1[super.aByte138];
		} else {
			local27 = Static668.aClass84Array4[super.aByte138];
			if (super.aByte138 >= 3) {
				local35 = null;
			} else {
				local35 = Static668.aClass84Array4[super.aByte138 + 1];
			}
		}
		return local13.method8030((Class87) null, this.aByte112, super.anInt9803, arg0, this.aByte113, local35, local27, super.anInt9805, arg2, arg1, super.anInt9797);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8363(@OriginalArg(1) Class100 arg0) {
		@Pc(24) Class5_Sub1_Sub15 local24;
		if (this.aClass5_Sub1_Sub15_5 == null && this.aBoolean527) {
			@Pc(35) Class377 local35 = this.method6819(arg0, 262144, true);
			local24 = local35 == null ? null : local35.aClass5_Sub1_Sub15_6;
		} else {
			local24 = this.aClass5_Sub1_Sub15_5;
			this.aClass5_Sub1_Sub15_5 = null;
		}
		if (local24 != null) {
			Static530.method7245(local24, super.aByte138, super.anInt9805, super.anInt9803, (boolean[]) null);
		}
	}
}
