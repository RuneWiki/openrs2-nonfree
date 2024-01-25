import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class11_Sub1_Sub4_Sub1 extends Class11_Sub1_Sub4 implements Interface15 {

	@OriginalMember(owner = "client!ku", name = "N", descriptor = "Lclient!cr;")
	private Class48 aClass48_6;

	@OriginalMember(owner = "client!ku", name = "X", descriptor = "Z")
	private final boolean aBoolean393;

	@OriginalMember(owner = "client!ku", name = "M", descriptor = "B")
	private final byte aByte80;

	@OriginalMember(owner = "client!ku", name = "W", descriptor = "S")
	private final short aShort62;

	@OriginalMember(owner = "client!ku", name = "U", descriptor = "Z")
	private boolean aBoolean392;

	@OriginalMember(owner = "client!ku", name = "kb", descriptor = "Z")
	private final boolean aBoolean394;

	@OriginalMember(owner = "client!ku", name = "pb", descriptor = "Z")
	private final boolean aBoolean395;

	@OriginalMember(owner = "client!ku", name = "nb", descriptor = "Lclient!ha;")
	private Class1_Sub8_Sub4 aClass1_Sub8_Sub4_5;

	@OriginalMember(owner = "client!ku", name = "Y", descriptor = "Lclient!da;")
	private Class52 aClass52_6;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!r;Lclient!js;IIIIIZIZ)V")
	public Class11_Sub1_Sub4_Sub1(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt4675);
		this.aBoolean393 = arg1.anInt4662 != 0 && !arg7;
		this.aByte80 = (byte) arg8;
		super.anInt8902 = arg4;
		this.aShort62 = (short) arg1.anInt4643;
		this.aBoolean392 = arg9;
		super.anInt8906 = arg6;
		this.aBoolean394 = arg7;
		this.aBoolean395 = arg0.method6792() && arg1.aBoolean348 && !this.aBoolean394 && Static86.aClass1_Sub30_Sub1_1.method5023(Static286.anInt5239) != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean392) {
			local63 |= 0x10000;
		}
		@Pc(78) Class100 local78 = this.method4172(this.aBoolean395, local63, arg0);
		if (local78 != null) {
			this.aClass1_Sub8_Sub4_5 = local78.aClass1_Sub8_Sub4_3;
			this.aClass52_6 = local78.aClass52_3;
			if (this.aBoolean392) {
				this.aClass52_6 = this.aClass52_6.method7412((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		if (this.aClass48_6 == null) {
			this.aClass48_6 = Static300.method7775(super.anInt8902, super.anInt8908, this.method4169(0, arg0), super.anInt8906);
		}
		return this.aClass48_6;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		if (this.aClass52_6 == null) {
			return null;
		}
		@Pc(11) Class34 local11 = arg0.method6848();
		local11.NA(super.anInt8902, super.anInt8908, super.anInt8906);
		@Pc(28) Class11_Sub2 local28 = null;
		if (this.aBoolean393) {
			local28 = Static586.method7842(1);
		}
		if (Static594.aBoolean718) {
			this.aClass52_6.method7405(local11, local28 == null ? null : local28.aClass11_Sub4Array1[0], Static18.anInt503, 0);
		} else {
			this.aClass52_6.method7413(local11, local28 == null ? null : local28.aClass11_Sub4Array1[0], 0);
		}
		return local28;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class11_Sub1_Sub4_Sub1) {
			@Pc(5) Class11_Sub1_Sub4_Sub1 local5 = (Class11_Sub1_Sub4_Sub1) arg0;
			if (this.aClass52_6 != null && local5.aClass52_6 != null) {
				this.aClass52_6.method7414(local5.aClass52_6, arg5, arg1, arg2, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)I")
	@Override
	public int method7232() {
		return this.aShort62 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7217() {
		return this.aClass52_6 == null ? false : this.aClass52_6.LA();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(9) Class52 local9 = this.method4169(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class34 local14 = arg2.method6848();
			local14.NA(super.anInt8902, super.anInt8908, super.anInt8906);
			return Static594.aBoolean718 ? local9.method7392(arg1, arg0, local14, false, Static18.anInt503) : local9.method7402(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)I")
	@Override
	public int method7212() {
		return this.aClass52_6 == null ? 0 : this.aClass52_6.J();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
	@Override
	public int method7230() {
		return this.aByte80;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7229() {
		return this.aBoolean395;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBLclient!r;)Lclient!da;")
	private Class52 method4169(@OriginalArg(0) int arg0, @OriginalArg(2) Class78 arg1) {
		if (this.aClass52_6 != null && arg1.method6819(this.aClass52_6.PA(), arg0) == 0) {
			return this.aClass52_6;
		} else {
			@Pc(31) Class100 local31 = this.method4172(false, arg0, arg1);
			return local31 == null ? null : local31.aClass52_3;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7231(@OriginalArg(1) Class78 arg0) {
		@Pc(20) Class1_Sub8_Sub4 local20;
		if (this.aClass1_Sub8_Sub4_5 == null && this.aBoolean395) {
			@Pc(31) Class100 local31 = this.method4172(true, 262144, arg0);
			local20 = local31 == null ? null : local31.aClass1_Sub8_Sub4_3;
		} else {
			local20 = this.aClass1_Sub8_Sub4_5;
			this.aClass1_Sub8_Sub4_5 = null;
		}
		if (local20 != null) {
			Static279.method4034(local20, super.aByte112, super.anInt8902, super.anInt8906, null);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7209() {
		return true;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)I")
	@Override
	public int method7227() {
		return 22;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7226(@OriginalArg(0) Class78 arg0) {
		@Pc(25) Class1_Sub8_Sub4 local25;
		if (this.aClass1_Sub8_Sub4_5 == null && this.aBoolean395) {
			@Pc(18) Class100 local18 = this.method4172(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass1_Sub8_Sub4_3;
		} else {
			local25 = this.aClass1_Sub8_Sub4_5;
			this.aClass1_Sub8_Sub4_5 = null;
		}
		if (local25 != null) {
			Static348.method5196(local25, super.aByte112, super.anInt8902, super.anInt8906, null);
		}
	}

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)I")
	@Override
	public int method7208(@OriginalArg(0) int arg0) {
		if (arg0 == 6329) {
			return this.aClass52_6 == null ? 0 : this.aClass52_6.RA();
		} else {
			return 43;
		}
	}

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7214() {
		return this.aBoolean392;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZIBLclient!r;)Lclient!fh;")
	private Class100 method4172(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(20) Class178 local20 = Static347.aClass122_4.method2770(this.aShort62 & 0xFFFF);
		@Pc(43) Class129 local43;
		@Pc(29) Class129 local29;
		if (this.aBoolean394) {
			local43 = Static150.aClass129Array4[super.aByte112];
			local29 = Static36.aClass129Array7[0];
		} else {
			if (super.aByte112 >= 3) {
				local29 = null;
			} else {
				local29 = Static36.aClass129Array7[super.aByte112 + 1];
			}
			local43 = Static36.aClass129Array7[super.aByte112];
		}
		return local20.method3706(super.anInt8902, super.anInt8906, local29, arg0, arg1, arg2, local43, 22, super.anInt8908, this.aByte80);
	}

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "(I)V")
	@Override
	public void method7222() {
		this.aBoolean392 = false;
		if (this.aClass52_6 != null) {
			this.aClass52_6.SA(this.aClass52_6.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	@Override
	public void method7228() {
		if (this.aClass52_6 != null) {
			this.aClass52_6.method7397();
		}
	}
}
