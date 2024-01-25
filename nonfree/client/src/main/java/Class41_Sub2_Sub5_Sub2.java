import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class41_Sub2_Sub5_Sub2 extends Class41_Sub2_Sub5 implements Interface4 {

	@OriginalMember(owner = "client!jca", name = "ib", descriptor = "Lclient!lf;")
	private Class189 aClass189_5;

	@OriginalMember(owner = "client!jca", name = "L", descriptor = "S")
	private final short aShort65;

	@OriginalMember(owner = "client!jca", name = "E", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!jca", name = "X", descriptor = "Z")
	private boolean aBoolean323;

	@OriginalMember(owner = "client!jca", name = "Y", descriptor = "Z")
	private final boolean aBoolean324;

	@OriginalMember(owner = "client!jca", name = "eb", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!jca", name = "S", descriptor = "Z")
	private final boolean aBoolean322;

	@OriginalMember(owner = "client!jca", name = "O", descriptor = "Lclient!ha;")
	private Class3_Sub7_Sub13 aClass3_Sub7_Sub13_4;

	@OriginalMember(owner = "client!jca", name = "gb", descriptor = "Lclient!da;")
	private Class60 aClass60_4;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!r;Lclient!qp;IIIIIZIZ)V")
	public Class41_Sub2_Sub5_Sub2(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.lb);
		this.aShort65 = (short) arg1.anInt7369;
		this.aBoolean321 = arg7;
		super.anInt9442 = arg6;
		this.aBoolean323 = arg9;
		this.aBoolean324 = arg1.anInt7380 != 0 && !arg7;
		this.aByte55 = (byte) arg8;
		super.anInt9444 = arg4;
		this.aBoolean322 = arg0.method7404() && arg1.aBoolean561 && !this.aBoolean321 && Static405.aClass3_Sub3_Sub1_1.method6299(Static60.anInt1312) != 0;
		@Pc(60) int local60 = 2048;
		if (this.aBoolean323) {
			local60 |= 0x10000;
		}
		@Pc(75) Class131 local75 = this.method3772(arg0, local60, this.aBoolean322);
		if (local75 != null) {
			this.aClass3_Sub7_Sub13_4 = local75.aClass3_Sub7_Sub13_3;
			this.aClass60_4 = local75.aClass60_3;
			if (this.aBoolean323) {
				this.aClass60_4 = this.aClass60_4.method7229((byte) 0, local60, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aClass60_4 == null ? false : this.aClass60_4.LA();
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7560(@OriginalArg(0) Class45 arg0) {
		@Pc(27) Class3_Sub7_Sub13 local27;
		if (this.aClass3_Sub7_Sub13_4 == null && this.aBoolean322) {
			@Pc(20) Class131 local20 = this.method3772(arg0, 262144, true);
			local27 = local20 == null ? null : local20.aClass3_Sub7_Sub13_3;
		} else {
			local27 = this.aClass3_Sub7_Sub13_4;
			this.aClass3_Sub7_Sub13_4 = null;
		}
		if (local27 != null) {
			Static58.method1201(local27, super.aByte118, super.anInt9444, super.anInt9442, null);
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		if (!(arg3 instanceof Class41_Sub2_Sub5_Sub2)) {
			return;
		}
		@Pc(16) Class41_Sub2_Sub5_Sub2 local16 = (Class41_Sub2_Sub5_Sub2) arg3;
		if (this.aClass60_4 != null && local16.aClass60_4 != null) {
			this.aClass60_4.method7233(local16.aClass60_4, arg1, arg0, arg2, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7557(@OriginalArg(0) Class45 arg0) {
		@Pc(14) Class3_Sub7_Sub13 local14;
		if (this.aClass3_Sub7_Sub13_4 == null && this.aBoolean322) {
			@Pc(25) Class131 local25 = this.method3772(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass3_Sub7_Sub13_3;
		} else {
			local14 = this.aClass3_Sub7_Sub13_4;
			this.aClass3_Sub7_Sub13_4 = null;
		}
		if (local14 != null) {
			Static546.method7274(local14, super.aByte118, super.anInt9444, super.anInt9442, null);
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class60 local9 = this.method3769(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class11 local14 = arg0.method7397();
			local14.NA(super.anInt9444, super.anInt9443, super.anInt9442);
			return Static453.aBoolean599 ? local9.method7237(arg1, arg2, local14, false, Static340.anInt5962) : local9.method7246(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		if (this.aClass60_4 == null) {
			return null;
		}
		@Pc(11) Class11 local11 = arg0.method7397();
		local11.NA(super.anInt9444, super.anInt9443, super.anInt9442);
		@Pc(21) Class41_Sub10 local21 = null;
		if (this.aBoolean324) {
			local21 = Static458.method6411(1);
		}
		if (Static453.aBoolean599) {
			this.aClass60_4.method7224(local11, local21 == null ? null : local21.aClass41_Sub8Array1[0], Static340.anInt5962, 0);
		} else {
			this.aClass60_4.method7230(local11, local21 == null ? null : local21.aClass41_Sub8Array1[0], 0);
		}
		return local21;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!r;I)Lclient!da;")
	private Class60 method3769(@OriginalArg(1) Class45 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass60_4 != null && arg0.method7393(this.aClass60_4.PA(), arg1) == 0) {
			return this.aClass60_4;
		} else {
			@Pc(28) Class131 local28 = this.method3772(arg0, arg1, false);
			return local28 == null ? null : local28.aClass60_3;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
	@Override
	public void method7559() {
		if (this.aClass60_4 != null) {
			this.aClass60_4.method7231();
		}
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7839() {
		return this.aBoolean323;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7558() {
		return this.aBoolean322;
	}

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return this.aClass60_4 == null ? 0 : this.aClass60_4.J();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)I")
	@Override
	public int method7562() {
		return this.aByte55;
	}

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		if (arg0 <= 119) {
			this.method7560(null);
		}
		return this.aClass60_4 == null ? 0 : this.aClass60_4.RA();
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.aShort65 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "(I)V")
	@Override
	public void method7852() {
		this.aBoolean323 = false;
		if (this.aClass60_4 != null) {
			this.aClass60_4.SA(this.aClass60_4.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!r;IIZ)Lclient!hi;")
	private Class131 method3772(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class280 local19 = Static478.aClass212_3.method4793(this.aShort65 & 0xFFFF);
		@Pc(31) Class34 local31;
		@Pc(26) Class34 local26;
		if (this.aBoolean321) {
			local26 = Static108.aClass34Array6[0];
			local31 = Static426.aClass34Array5[super.aByte118];
		} else {
			if (super.aByte118 >= 3) {
				local26 = null;
			} else {
				local26 = Static108.aClass34Array6[super.aByte118 + 1];
			}
			local31 = Static108.aClass34Array6[super.aByte118];
		}
		return local19.method6168(super.anInt9444, super.anInt9443, arg0, super.anInt9442, local31, arg1, 22, arg2, this.aByte55, local26);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)I")
	@Override
	public int method7556() {
		return 22;
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		if (this.aClass189_5 == null) {
			this.aClass189_5 = Static36.method588(super.anInt9442, this.method3769(arg0, 0), super.anInt9443, super.anInt9444);
		}
		return this.aClass189_5;
	}
}
