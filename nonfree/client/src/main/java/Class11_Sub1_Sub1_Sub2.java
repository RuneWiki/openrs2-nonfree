import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class11_Sub1_Sub1_Sub2 extends Class11_Sub1_Sub1 implements Interface15 {

	@OriginalMember(owner = "client!an", name = "ib", descriptor = "Lclient!cr;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!an", name = "hb", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!an", name = "S", descriptor = "S")
	private final short aShort18;

	@OriginalMember(owner = "client!an", name = "ub", descriptor = "Z")
	private final boolean aBoolean21;

	@OriginalMember(owner = "client!an", name = "wb", descriptor = "Z")
	private boolean aBoolean22;

	@OriginalMember(owner = "client!an", name = "R", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!an", name = "tb", descriptor = "Z")
	private final boolean aBoolean20;

	@OriginalMember(owner = "client!an", name = "lb", descriptor = "Z")
	private final boolean lb;

	@OriginalMember(owner = "client!an", name = "sb", descriptor = "Lclient!da;")
	public Class52 aClass52_1;

	@OriginalMember(owner = "client!an", name = "bb", descriptor = "Lclient!ha;")
	private Class1_Sub8_Sub4 aClass1_Sub8_Sub4_1;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!r;Lclient!js;IIIIIZIIIIIIZ)V")
	public Class11_Sub1_Sub1_Sub2(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4628 == 1, Static433.method3810(arg12, arg13));
		this.aByte15 = (byte) arg13;
		this.aShort18 = (short) arg1.anInt4643;
		this.aBoolean21 = arg1.anInt4662 != 0 && !arg7;
		this.aBoolean22 = arg14;
		this.aByte14 = (byte) arg12;
		super.aByte112 = (byte) arg3;
		this.aBoolean20 = arg7;
		this.lb = arg0.method6792() && arg1.aBoolean348 && !this.aBoolean20 && Static86.aClass1_Sub30_Sub1_1.method5023(Static286.anInt5239) != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean22) {
			local80 |= 0x10000;
		}
		@Pc(95) Class100 local95 = this.method443(this.lb, arg0, local80);
		if (local95 != null) {
			this.aClass52_1 = local95.aClass52_3;
			this.aClass1_Sub8_Sub4_1 = local95.aClass1_Sub8_Sub4_3;
			if (this.aBoolean22) {
				this.aClass52_1 = this.aClass52_1.method7412((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)I")
	@Override
	public int method7230() {
		return this.aByte15;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7231(@OriginalArg(1) Class78 arg0) {
		@Pc(25) Class1_Sub8_Sub4 local25;
		if (this.aClass1_Sub8_Sub4_1 == null && this.lb) {
			@Pc(18) Class100 local18 = this.method443(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass1_Sub8_Sub4_3;
		} else {
			local25 = this.aClass1_Sub8_Sub4_1;
			this.aClass1_Sub8_Sub4_1 = null;
		}
		if (local25 != null) {
			Static279.method4034(local25, super.aByte112, super.anInt8902, super.anInt8906, null);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
	}

	@OriginalMember(owner = "client!an", name = "f", descriptor = "(I)I")
	@Override
	public int method7212() {
		return this.aClass52_1 == null ? 0 : this.aClass52_1.J();
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(Z)I")
	public int method439() {
		return this.aClass52_1 == null ? 15 : this.aClass52_1.K() / 4;
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)I")
	@Override
	public int method7208(@OriginalArg(0) int arg0) {
		if (arg0 == 6329) {
			return this.aClass52_1 == null ? 0 : this.aClass52_1.RA();
		} else {
			return 119;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		if (this.aClass48_1 == null) {
			this.aClass48_1 = Static300.method7775(super.anInt8902, super.anInt8908, this.method440(arg0, 0), super.anInt8906);
		}
		return this.aClass48_1;
	}

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7217() {
		return this.aClass52_1 == null ? false : this.aClass52_1.LA();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!r;I)Lclient!da;")
	private Class52 method440(@OriginalArg(1) Class78 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass52_1 != null && arg0.method6819(this.aClass52_1.PA(), arg1) == 0) {
			return this.aClass52_1;
		} else {
			@Pc(28) Class100 local28 = this.method443(false, arg0, arg1);
			return local28 == null ? null : local28.aClass52_3;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(9) Class52 local9 = this.method440(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class34 local14 = arg2.method6848();
			local14.NA(super.anInt8902, super.anInt8908, super.anInt8906);
			return Static594.aBoolean718 ? local9.method7392(arg1, arg0, local14, false, Static18.anInt503) : local9.method7402(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7226(@OriginalArg(0) Class78 arg0) {
		@Pc(29) Class1_Sub8_Sub4 local29;
		if (this.aClass1_Sub8_Sub4_1 == null && this.lb) {
			@Pc(22) Class100 local22 = this.method443(true, arg0, 262144);
			local29 = local22 == null ? null : local22.aClass1_Sub8_Sub4_3;
		} else {
			local29 = this.aClass1_Sub8_Sub4_1;
			this.aClass1_Sub8_Sub4_1 = null;
		}
		if (local29 != null) {
			Static348.method5196(local29, super.aByte112, super.anInt8902, super.anInt8906, null);
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7209() {
		return true;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	@Override
	public void method7228() {
		if (this.aClass52_1 != null) {
			this.aClass52_1.method7397();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)I")
	@Override
	public int method7227() {
		return this.aByte14;
	}

	@OriginalMember(owner = "client!an", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7214() {
		return this.aBoolean22;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLclient!r;II)Lclient!fh;")
	private Class100 method443(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class178 local21 = Static347.aClass122_4.method2770(this.aShort18 & 0xFFFF);
		@Pc(29) Class129 local29;
		@Pc(33) Class129 local33;
		if (this.aBoolean20) {
			local29 = Static150.aClass129Array4[super.aByte112];
			local33 = Static36.aClass129Array7[0];
		} else {
			local29 = Static36.aClass129Array7[super.aByte112];
			if (super.aByte112 >= 3) {
				local33 = null;
			} else {
				local33 = Static36.aClass129Array7[super.aByte112 + 1];
			}
		}
		return local21.method3706(super.anInt8902, super.anInt8906, local33, arg0, arg2, arg1, local29, this.aByte14 == 11 ? 10 : this.aByte14, super.anInt8908, this.aByte14 == 11 ? this.aByte15 + 4 : this.aByte15);
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)I")
	@Override
	public int method7232() {
		return this.aShort18 & 0xFFFF;
	}

	@OriginalMember(owner = "client!an", name = "i", descriptor = "(I)V")
	@Override
	public void method7222() {
		this.aBoolean22 = false;
		if (this.aClass52_1 != null) {
			this.aClass52_1.SA(this.aClass52_1.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		if (this.aClass52_1 == null) {
			return null;
		}
		@Pc(17) Class34 local17 = arg0.method6848();
		local17.NA(super.anInt8902, super.anInt8908, super.anInt8906);
		@Pc(27) Class11_Sub2 local27 = null;
		if (this.aBoolean21) {
			local27 = Static586.method7842(1);
		}
		if (Static594.aBoolean718) {
			this.aClass52_1.method7405(local17, local27 == null ? null : local27.aClass11_Sub4Array1[0], Static18.anInt503, 0);
		} else {
			this.aClass52_1.method7413(local17, local27 == null ? null : local27.aClass11_Sub4Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class11_Sub1_Sub3_Sub1) {
			@Pc(14) Class11_Sub1_Sub3_Sub1 local14 = (Class11_Sub1_Sub3_Sub1) arg0;
			if (this.aClass52_1 != null && local14.aClass52_2 != null) {
				this.aClass52_1.method7414(local14.aClass52_2, arg5, arg1, arg2, arg3);
			}
		} else if (arg0 instanceof Class11_Sub1_Sub1_Sub2) {
			@Pc(36) Class11_Sub1_Sub1_Sub2 local36 = (Class11_Sub1_Sub1_Sub2) arg0;
			if (this.aClass52_1 != null && local36.aClass52_1 != null) {
				this.aClass52_1.method7414(local36.aClass52_1, arg5, arg1, arg2, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7229() {
		return this.lb;
	}
}
