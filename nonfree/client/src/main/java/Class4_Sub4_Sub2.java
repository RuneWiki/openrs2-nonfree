import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class4_Sub4_Sub2 extends Class4_Sub4 implements Interface9 {

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "S")
	private final short aShort61;

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!oi", name = "J", descriptor = "Z")
	private final boolean aBoolean444;

	@OriginalMember(owner = "client!oi", name = "O", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!oi", name = "T", descriptor = "Z")
	private boolean aBoolean447;

	@OriginalMember(owner = "client!oi", name = "M", descriptor = "Z")
	private final boolean aBoolean445;

	@OriginalMember(owner = "client!oi", name = "Q", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!oi", name = "P", descriptor = "Z")
	private final boolean aBoolean446;

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "Lclient!c;")
	public Class32 aClass32_6;

	@OriginalMember(owner = "client!oi", name = "L", descriptor = "Lclient!j;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_6;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!qa;Lclient!us;IIIIZIIZ)V")
	public Class4_Sub4_Sub2(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static448.method6049(arg7, arg8));
		this.aShort61 = (short) arg1.anInt7160;
		this.aByte60 = (byte) arg8;
		this.aBoolean444 = arg1.anInt7186 != 0 && !arg6;
		this.aByte61 = (byte) arg2;
		this.aBoolean447 = arg9;
		this.aBoolean445 = arg6;
		this.aByte62 = (byte) arg7;
		super.anInt7604 = arg5;
		super.anInt7607 = arg3;
		this.aBoolean446 = arg0.method2273() && arg1.aBoolean617 && !this.aBoolean445 && Static399.aClass167_Sub1_1.method4517(Static281.anInt5126) != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean447) {
			local74 |= 0x10000;
		}
		@Pc(89) Class69 local89 = this.method4125(arg0, this.aBoolean446, local74);
		if (local89 != null) {
			this.aClass32_6 = local89.aClass32_2;
			this.aClass2_Sub2_Sub9_6 = local89.aClass2_Sub2_Sub9_2;
			if (this.aBoolean447) {
				this.aClass32_6 = this.aClass32_6.method5678((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I")
	@Override
	public int method5904() {
		return this.aByte62;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
		if (this.aClass32_6 != null) {
			this.aClass32_6.method5666();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	@Override
	public Class32 method5906(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		return this.method4126(arg1, arg0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class32 local9 = this.method4126(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class102 local14 = arg1.method2223();
			local14.R(super.anInt7607, super.anInt7603, super.anInt7604);
			return local9.method5671(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5903(@OriginalArg(1) Class26 arg0) {
		@Pc(14) Class2_Sub2_Sub9 local14;
		if (this.aClass2_Sub2_Sub9_6 == null && this.aBoolean446) {
			@Pc(25) Class69 local25 = this.method4125(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass2_Sub2_Sub9_2;
		} else {
			local14 = this.aClass2_Sub2_Sub9_6;
			this.aClass2_Sub2_Sub9_6 = null;
		}
		if (local14 != null) {
			Static95.method1600(local14, this.aByte61, super.anInt7607, super.anInt7604, null);
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		if (this.aClass32_6 == null) {
			return null;
		}
		@Pc(16) Class102 local16 = arg0.method2223();
		local16.R(super.anInt7607, super.anInt7603, super.anInt7604);
		@Pc(26) Class38_Sub3 local26 = null;
		if (this.aBoolean444) {
			local26 = Static313.method4433(1);
		}
		this.aClass32_6.method5675(local16, local26 == null ? null : local26.aClass38_Sub4Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 instanceof Class4_Sub4_Sub2) {
			@Pc(15) Class4_Sub4_Sub2 local15 = (Class4_Sub4_Sub2) arg2;
			if (this.aClass32_6 != null && local15.aClass32_6 != null) {
				this.aClass32_6.method5672(local15.aClass32_6, arg3, arg0, arg4, arg5);
			}
		} else if (arg2 instanceof Class4_Sub2_Sub1) {
			@Pc(37) Class4_Sub2_Sub1 local37 = (Class4_Sub2_Sub1) arg2;
			if (this.aClass32_6 != null && local37.aClass32_3 != null) {
				this.aClass32_6.method5672(local37.aClass32_3, arg3, arg0, arg4, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!qa;ZII)Lclient!en;")
	private Class69 method4125(@OriginalArg(0) Class26 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class250 local13 = Static406.aClass150_3.method3508(this.aShort61 & 0xFFFF);
		@Pc(38) Class106 local38;
		@Pc(24) Class106 local24;
		if (this.aBoolean445) {
			local38 = Static77.aClass106Array12[this.aByte61];
			local24 = Static72.aClass106Array4[0];
		} else {
			if (this.aByte61 >= 3) {
				local24 = null;
			} else {
				local24 = Static72.aClass106Array4[this.aByte61 + 1];
			}
			local38 = Static72.aClass106Array4[this.aByte61];
		}
		return local13.method5593(arg1, this.aByte62, arg0, super.anInt7604, local38, arg2, local24, super.anInt7607, this.aByte60, super.anInt7603);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	private Class32 method4126(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1) {
		if (this.aClass32_6 != null && arg1.method2259(this.aClass32_6.n(), arg0) == 0) {
			return this.aClass32_6;
		} else {
			@Pc(32) Class69 local32 = this.method4125(arg1, false, arg0);
			return local32 == null ? null : local32.aClass32_2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
		this.aBoolean447 = false;
		if (this.aClass32_6 != null) {
			this.aClass32_6.u(this.aClass32_6.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)I")
	@Override
	public int method5901() {
		return this.aShort61 & 0xFFFF;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5900(@OriginalArg(0) Class26 arg0) {
		@Pc(19) Class2_Sub2_Sub9 local19;
		if (this.aClass2_Sub2_Sub9_6 == null && this.aBoolean446) {
			@Pc(30) Class69 local30 = this.method4125(arg0, true, 262144);
			local19 = local30 == null ? null : local30.aClass2_Sub2_Sub9_2;
		} else {
			local19 = this.aClass2_Sub2_Sub9_6;
			this.aClass2_Sub2_Sub9_6 = null;
		}
		if (local19 != null) {
			Static450.method6081(local19, this.aByte61, super.anInt7607, super.anInt7604, null);
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return this.aBoolean447;
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5905() {
		return this.aBoolean446;
	}
}
