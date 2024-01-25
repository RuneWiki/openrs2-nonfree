import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class11_Sub1_Sub3_Sub1 extends Class11_Sub1_Sub3 implements Interface15 {

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "Lclient!cr;")
	private Class48 aClass48_2;

	@OriginalMember(owner = "client!ef", name = "rb", descriptor = "B")
	private final byte aByte30;

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "Z")
	private final boolean aBoolean133;

	@OriginalMember(owner = "client!ef", name = "sb", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "client!ef", name = "kb", descriptor = "B")
	private final byte aByte29;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "Z")
	private final boolean aBoolean131;

	@OriginalMember(owner = "client!ef", name = "nb", descriptor = "S")
	private final short aShort27;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "Z")
	private final boolean aBoolean132;

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "Lclient!da;")
	public Class52 aClass52_2;

	@OriginalMember(owner = "client!ef", name = "ob", descriptor = "Lclient!ha;")
	private Class1_Sub8_Sub4 aClass1_Sub8_Sub4_2;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!r;Lclient!js;IIIIIZIIZ)V")
	public Class11_Sub1_Sub3_Sub1(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static378.method5461(arg9, arg8));
		this.aByte30 = (byte) arg9;
		this.aBoolean133 = arg1.anInt4662 != 0 && !arg7;
		this.aBoolean134 = arg10;
		super.anInt8902 = arg4;
		this.aByte29 = (byte) arg8;
		super.anInt8906 = arg6;
		this.aBoolean131 = arg7;
		this.aShort27 = (short) arg1.anInt4643;
		this.aBoolean132 = arg0.method6792() && arg1.aBoolean348 && !this.aBoolean131 && Static86.aClass1_Sub30_Sub1_1.method5023(Static286.anInt5239) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean134) {
			local69 |= 0x10000;
		}
		@Pc(84) Class100 local84 = this.method1615(this.aBoolean132, arg0, local69);
		if (local84 != null) {
			this.aClass52_2 = local84.aClass52_3;
			this.aClass1_Sub8_Sub4_2 = local84.aClass1_Sub8_Sub4_3;
			if (this.aBoolean134) {
				this.aClass52_2 = this.aClass52_2.method7412((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V")
	@Override
	public void method7222() {
		this.aBoolean134 = false;
		if (this.aClass52_2 != null) {
			this.aClass52_2.SA(this.aClass52_2.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!r;)Lclient!da;")
	private Class52 method1611(@OriginalArg(0) int arg0, @OriginalArg(2) Class78 arg1) {
		if (this.aClass52_2 != null && arg1.method6819(this.aClass52_2.PA(), arg0) == 0) {
			return this.aClass52_2;
		} else {
			@Pc(28) Class100 local28 = this.method1615(false, arg1, arg0);
			return local28 == null ? null : local28.aClass52_3;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)I")
	@Override
	public int method7230() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I")
	@Override
	public int method7212() {
		return this.aClass52_2 == null ? 0 : this.aClass52_2.J();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	@Override
	public void method7228() {
		if (this.aClass52_2 != null) {
			this.aClass52_2.method7397();
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7229() {
		return this.aBoolean132;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7226(@OriginalArg(0) Class78 arg0) {
		@Pc(30) Class1_Sub8_Sub4 local30;
		if (this.aClass1_Sub8_Sub4_2 == null && this.aBoolean132) {
			@Pc(23) Class100 local23 = this.method1615(true, arg0, 262144);
			local30 = local23 == null ? null : local23.aClass1_Sub8_Sub4_3;
		} else {
			local30 = this.aClass1_Sub8_Sub4_2;
			this.aClass1_Sub8_Sub4_2 = null;
		}
		if (local30 != null) {
			Static348.method5196(local30, super.aByte112, super.anInt8902, super.anInt8906, null);
		}
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7217() {
		return this.aClass52_2 == null ? false : this.aClass52_2.LA();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7231(@OriginalArg(1) Class78 arg0) {
		@Pc(30) Class1_Sub8_Sub4 local30;
		if (this.aClass1_Sub8_Sub4_2 == null && this.aBoolean132) {
			@Pc(23) Class100 local23 = this.method1615(true, arg0, 262144);
			local30 = local23 == null ? null : local23.aClass1_Sub8_Sub4_3;
		} else {
			local30 = this.aClass1_Sub8_Sub4_2;
			this.aClass1_Sub8_Sub4_2 = null;
		}
		if (local30 != null) {
			Static279.method4034(local30, super.aByte112, super.anInt8902, super.anInt8906, null);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class11_Sub1_Sub3_Sub1) {
			@Pc(5) Class11_Sub1_Sub3_Sub1 local5 = (Class11_Sub1_Sub3_Sub1) arg0;
			if (this.aClass52_2 != null && local5.aClass52_2 != null) {
				this.aClass52_2.method7414(local5.aClass52_2, arg5, arg1, arg2, arg3);
			}
		} else if (arg0 instanceof Class11_Sub1_Sub1_Sub2) {
			@Pc(28) Class11_Sub1_Sub1_Sub2 local28 = (Class11_Sub1_Sub1_Sub2) arg0;
			if (this.aClass52_2 != null && local28.aClass52_1 != null) {
				this.aClass52_2.method7414(local28.aClass52_1, arg5, arg1, arg2, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7209() {
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZILclient!r;I)Lclient!fh;")
	private Class100 method1615(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class78 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class178 local13 = Static347.aClass122_4.method2770(this.aShort27 & 0xFFFF);
		@Pc(21) Class129 local21;
		@Pc(25) Class129 local25;
		if (this.aBoolean131) {
			local21 = Static150.aClass129Array4[super.aByte112];
			local25 = Static36.aClass129Array7[0];
		} else {
			local21 = Static36.aClass129Array7[super.aByte112];
			if (super.aByte112 < 3) {
				local25 = Static36.aClass129Array7[super.aByte112 + 1];
			} else {
				local25 = null;
			}
		}
		return local13.method3706(super.anInt8902, super.anInt8906, local25, arg0, arg2, arg1, local21, this.aByte29, super.anInt8908, this.aByte30);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I")
	@Override
	public int method7232() {
		return this.aShort27 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7214() {
		return this.aBoolean134;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		if (this.aClass52_2 == null) {
			return null;
		}
		@Pc(11) Class34 local11 = arg0.method6848();
		local11.NA(super.anInt8902, super.anInt8908, super.anInt8906);
		@Pc(27) Class11_Sub2 local27 = null;
		if (this.aBoolean133) {
			local27 = Static586.method7842(1);
		}
		if (Static594.aBoolean718) {
			this.aClass52_2.method7405(local11, local27 == null ? null : local27.aClass11_Sub4Array1[0], Static18.anInt503, 0);
		} else {
			this.aClass52_2.method7413(local11, local27 == null ? null : local27.aClass11_Sub4Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)I")
	@Override
	public int method7227() {
		return this.aByte29;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)I")
	@Override
	public int method7208(@OriginalArg(0) int arg0) {
		if (arg0 == 6329) {
			return this.aClass52_2 == null ? 0 : this.aClass52_2.RA();
		} else {
			return 26;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(13) Class52 local13 = this.method1611(131072, arg2);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class34 local18 = arg2.method6848();
			local18.NA(super.anInt8902, super.anInt8908, super.anInt8906);
			return Static594.aBoolean718 ? local13.method7392(arg1, arg0, local18, false, Static18.anInt503) : local13.method7402(arg1, arg0, local18, false);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		if (this.aClass48_2 == null) {
			this.aClass48_2 = Static300.method7775(super.anInt8902, super.anInt8908, this.method1611(0, arg0), super.anInt8906);
		}
		return this.aClass48_2;
	}
}
