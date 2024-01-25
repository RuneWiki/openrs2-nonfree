import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 implements Interface2 {

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "S")
	private final short aShort36;

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "Z")
	private final boolean aBoolean236;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "Z")
	private final boolean aBoolean234;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "Z")
	private boolean aBoolean237;

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "Z")
	private final boolean aBoolean235;

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "Lclient!i;")
	private Class5_Sub2_Sub1 aClass5_Sub2_Sub1_5;

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "Lclient!e;")
	public Class57 aClass57_6;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!za;Lclient!ii;IIIIZIIZ)V")
	public Class2_Sub4_Sub2(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static239.method4848(arg8, arg7));
		super.anInt6416 = arg5;
		this.aShort36 = (short) arg1.anInt2994;
		this.aByte44 = (byte) arg8;
		this.aByte43 = (byte) arg7;
		this.aBoolean236 = arg1.anInt3001 != 0 && !arg6;
		this.aByte42 = (byte) arg2;
		this.aBoolean234 = arg6;
		this.aBoolean237 = arg9;
		super.anInt6418 = arg3;
		this.aBoolean235 = arg0.method5821() && arg1.aBoolean192 && !this.aBoolean234 && Static216.aClass1_Sub1_1.method3580(Static146.anInt2644) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean237) {
			local71 |= 0x10000;
		}
		@Pc(86) Class108 local86 = this.method2884(local71, arg0, this.aBoolean235);
		if (local86 != null) {
			this.aClass5_Sub2_Sub1_5 = local86.aClass5_Sub2_Sub1_4;
			this.aClass57_6 = local86.aClass57_5;
			if (this.aBoolean237) {
				this.aClass57_6 = this.aClass57_6.method6066((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return this.aBoolean235;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
		@Pc(19) Class5_Sub2_Sub1 local19;
		if (this.aClass5_Sub2_Sub1_5 == null && this.aBoolean235) {
			@Pc(30) Class108 local30 = this.method2884(262144, arg0, true);
			local19 = local30 == null ? null : local30.aClass5_Sub2_Sub1_4;
		} else {
			local19 = this.aClass5_Sub2_Sub1_5;
			this.aClass5_Sub2_Sub1_5 = null;
		}
		if (local19 != null) {
			Static79.method1162(local19, this.aByte42, super.anInt6418, super.anInt6416, null);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class2_Sub4_Sub2) {
			@Pc(5) Class2_Sub4_Sub2 local5 = (Class2_Sub4_Sub2) arg3;
			if (this.aClass57_6 != null && local5.aClass57_6 != null) {
				this.aClass57_6.method6063(local5.aClass57_6, arg2, arg1, arg4, arg5);
			}
		} else if (arg3 instanceof Class2_Sub1_Sub4) {
			@Pc(28) Class2_Sub1_Sub4 local28 = (Class2_Sub1_Sub4) arg3;
			if (this.aClass57_6 != null && local28.aClass57_7 != null) {
				this.aClass57_6.method6063(local28.aClass57_7, arg2, arg1, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return this.method2887(arg0, arg1);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!za;IZ)Lclient!hw;")
	private Class108 method2884(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(20) Class114 local20 = Static398.aClass256_4.method5782(this.aShort36 & 0xFFFF);
		@Pc(28) Class125 local28;
		@Pc(34) Class125 local34;
		if (this.aBoolean234) {
			local28 = Static408.aClass125Array2[this.aByte42];
			local34 = Static110.aClass125Array1[0];
		} else {
			local28 = Static110.aClass125Array1[this.aByte42];
			if (this.aByte42 >= 3) {
				local34 = null;
			} else {
				local34 = Static110.aClass125Array1[this.aByte42 + 1];
			}
		}
		return local20.method2407(local28, arg0, this.aByte43, super.anInt6419, super.anInt6416, arg1, this.aByte44, arg2, super.anInt6418, local34);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		if (this.aClass57_6 == null) {
			return null;
		}
		@Pc(11) Class29 local11 = arg0.method5866();
		local11.U(super.anInt6418, super.anInt6419, super.anInt6416);
		@Pc(21) Class88_Sub2 local21 = null;
		if (this.aBoolean236) {
			local21 = Static232.method3033(1);
		}
		this.aClass57_6.method6060(local11, local21 == null ? null : local21.aClass88_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class57 local9 = this.method2887(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class29 local19 = arg0.method5866();
			local19.U(super.anInt6418, super.anInt6419, super.anInt6416);
			return local9.method6071(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return this.aBoolean237;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
		@Pc(27) Class5_Sub2_Sub1 local27;
		if (this.aClass5_Sub2_Sub1_5 == null && this.aBoolean235) {
			@Pc(20) Class108 local20 = this.method2884(262144, arg0, true);
			local27 = local20 == null ? null : local20.aClass5_Sub2_Sub1_4;
		} else {
			local27 = this.aClass5_Sub2_Sub1_5;
			this.aClass5_Sub2_Sub1_5 = null;
		}
		if (local27 != null) {
			Static107.method1478(local27, this.aByte42, super.anInt6418, super.anInt6416, null);
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
		this.aBoolean237 = false;
		if (this.aClass57_6 != null) {
			this.aClass57_6.D(this.aClass57_6.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	private Class57 method2887(@OriginalArg(1) Class200 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass57_6 != null && arg0.method5860(this.aClass57_6.RA(), arg1) == 0) {
			return this.aClass57_6;
		} else {
			@Pc(26) Class108 local26 = this.method2884(arg1, arg0, false);
			return local26 == null ? null : local26.aClass57_5;
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
		if (this.aClass57_6 != null) {
			this.aClass57_6.method6069();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return this.aShort36 & 0xFFFF;
	}
}
