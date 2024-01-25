import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class11_Sub1_Sub5_Sub2 extends Class11_Sub1_Sub5 implements Interface15 {

	@OriginalMember(owner = "client!ki", name = "Q", descriptor = "Lclient!cr;")
	private Class48 aClass48_5;

	@OriginalMember(owner = "client!ki", name = "ib", descriptor = "Z")
	private final boolean aBoolean375;

	@OriginalMember(owner = "client!ki", name = "kb", descriptor = "B")
	private byte aByte77;

	@OriginalMember(owner = "client!ki", name = "nb", descriptor = "Z")
	private final boolean aBoolean376;

	@OriginalMember(owner = "client!ki", name = "W", descriptor = "B")
	private final byte aByte76;

	@OriginalMember(owner = "client!ki", name = "R", descriptor = "S")
	private final short aShort60;

	@OriginalMember(owner = "client!ki", name = "rb", descriptor = "Z")
	private final boolean aBoolean377;

	@OriginalMember(owner = "client!ki", name = "V", descriptor = "Lclient!ha;")
	private Class1_Sub8_Sub4 aClass1_Sub8_Sub4_4;

	@OriginalMember(owner = "client!ki", name = "X", descriptor = "Lclient!da;")
	private Class52 aClass52_5;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!r;Lclient!js;IIIIIZIIII)V")
	public Class11_Sub1_Sub5_Sub2(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aBoolean375 = arg7;
		super.anInt8902 = arg4;
		this.aByte77 = (byte) arg10;
		this.aBoolean376 = arg1.anInt4662 != 0 && !arg7;
		super.anInt8906 = arg6;
		this.aByte76 = (byte) arg11;
		this.aShort60 = (short) arg1.anInt4643;
		this.aBoolean377 = arg0.method6792() && arg1.aBoolean348 && !this.aBoolean375 && Static86.aClass1_Sub30_Sub1_1.method5023(Static286.anInt5239) != 0;
		@Pc(70) Class100 local70 = this.method3985(this.aBoolean377, 2048, arg0);
		if (local70 != null) {
			this.aClass1_Sub8_Sub4_4 = local70.aClass1_Sub8_Sub4_3;
			this.aClass52_5 = local70.aClass52_3;
		}
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7217() {
		return this.aClass52_5 == null ? false : this.aClass52_5.LA();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		if (this.aClass48_5 == null) {
			this.aClass48_5 = Static300.method7775(super.anInt8902, super.anInt8908, this.method3982(0, arg0), super.anInt8906);
		}
		return this.aClass48_5;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)I")
	@Override
	public int method7227() {
		return this.aByte77;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZLclient!r;)Lclient!da;")
	private Class52 method3982(@OriginalArg(0) int arg0, @OriginalArg(2) Class78 arg1) {
		if (this.aClass52_5 != null && arg1.method6819(this.aClass52_5.PA(), arg0) == 0) {
			return this.aClass52_5;
		} else {
			@Pc(23) Class100 local23 = this.method3985(false, arg0, arg1);
			return local23 == null ? null : local23.aClass52_3;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	@Override
	public void method7228() {
		if (this.aClass52_5 != null) {
			this.aClass52_5.method7397();
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		if (this.aClass52_5 == null) {
			return null;
		}
		@Pc(16) Class34 local16 = arg0.method6848();
		local16.NA(super.aShort59 + super.anInt8902, super.anInt8908, super.anInt8906 + super.aShort58);
		@Pc(32) Class11_Sub2 local32 = null;
		if (this.aBoolean376) {
			local32 = Static586.method7842(1);
		}
		if (Static594.aBoolean718) {
			this.aClass52_5.method7405(local16, local32 == null ? null : local32.aClass11_Sub4Array1[0], Static18.anInt503, 0);
		} else {
			this.aClass52_5.method7413(local16, local32 == null ? null : local32.aClass11_Sub4Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7209() {
		return true;
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)I")
	@Override
	public int method7208(@OriginalArg(0) int arg0) {
		if (arg0 != 6329) {
			this.aByte77 = -79;
		}
		return this.aClass52_5 == null ? 0 : this.aClass52_5.RA();
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7229() {
		return this.aBoolean377;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(9) Class52 local9 = this.method3982(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class34 local20 = arg2.method6848();
			local20.NA(super.anInt8902, super.anInt8908, super.anInt8906);
			return Static594.aBoolean718 ? local9.method7392(arg1, arg0, local20, false, Static18.anInt503) : local9.method7402(arg1, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I")
	@Override
	public int method7232() {
		return this.aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7226(@OriginalArg(0) Class78 arg0) {
		@Pc(30) Class1_Sub8_Sub4 local30;
		if (this.aClass1_Sub8_Sub4_4 == null && this.aBoolean377) {
			@Pc(23) Class100 local23 = this.method3985(true, 262144, arg0);
			local30 = local23 == null ? null : local23.aClass1_Sub8_Sub4_3;
		} else {
			local30 = this.aClass1_Sub8_Sub4_4;
			this.aClass1_Sub8_Sub4_4 = null;
		}
		if (local30 != null) {
			Static348.method5196(local30, super.aByte112, super.anInt8902, super.anInt8906, null);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
	@Override
	public int method7230() {
		return this.aByte76;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7231(@OriginalArg(1) Class78 arg0) {
		@Pc(19) Class1_Sub8_Sub4 local19;
		if (this.aClass1_Sub8_Sub4_4 == null && this.aBoolean377) {
			@Pc(30) Class100 local30 = this.method3985(true, 262144, arg0);
			local19 = local30 == null ? null : local30.aClass1_Sub8_Sub4_3;
		} else {
			local19 = this.aClass1_Sub8_Sub4_4;
			this.aClass1_Sub8_Sub4_4 = null;
		}
		if (local19 != null) {
			Static279.method4034(local19, super.aByte112, super.anInt8902, super.anInt8906, null);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZILclient!r;)Lclient!fh;")
	private Class100 method3985(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(13) Class178 local13 = Static347.aClass122_4.method2770(this.aShort60 & 0xFFFF);
		@Pc(42) Class129 local42;
		@Pc(33) Class129 local33;
		if (this.aBoolean375) {
			local42 = Static150.aClass129Array4[super.aByte112];
			local33 = Static36.aClass129Array7[0];
		} else {
			if (super.aByte112 < 3) {
				local33 = Static36.aClass129Array7[super.aByte112 + 1];
			} else {
				local33 = null;
			}
			local42 = Static36.aClass129Array7[super.aByte112];
		}
		return local13.method3706(super.anInt8902, super.anInt8906, local33, arg0, arg1, arg2, local42, this.aByte77, super.anInt8908, this.aByte76);
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)I")
	@Override
	public int method7212() {
		return this.aClass52_5 == null ? 0 : this.aClass52_5.J();
	}
}
