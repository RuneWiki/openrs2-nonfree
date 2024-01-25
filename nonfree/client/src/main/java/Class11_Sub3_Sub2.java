import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class11_Sub3_Sub2 extends Class11_Sub3 implements Interface7 {

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Z")
	private final boolean aBoolean226;

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "Z")
	private boolean aBoolean227;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "S")
	private final short aShort42;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "Z")
	private final boolean aBoolean225;

	@OriginalMember(owner = "client!gi", name = "N", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "Z")
	private final boolean aBoolean224;

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "Lclient!i;")
	private Class1_Sub3_Sub11 aClass1_Sub3_Sub11_2;

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "Lclient!e;")
	public Class8 aClass8_2;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!za;Lclient!fu;IIIIZIIZ)V")
	public Class11_Sub3_Sub2(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static157.method2092(arg8, arg7));
		this.aByte41 = (byte) arg2;
		this.aBoolean226 = arg6;
		this.aBoolean227 = arg9;
		this.aByte42 = (byte) arg7;
		this.aShort42 = (short) arg1.anInt1925;
		super.anInt3996 = arg5;
		this.aBoolean225 = arg1.anInt1928 != 0 && !arg6;
		super.anInt3997 = arg3;
		this.aByte43 = (byte) arg8;
		this.aBoolean224 = arg0.method5691() && arg1.aBoolean207 && !this.aBoolean226 && Static126.aClass19_Sub1_1.method3337(Static214.anInt3968) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean227) {
			local71 |= 0x10000;
		}
		@Pc(86) Class212 local86 = this.method1731(this.aBoolean224, local71, arg0);
		if (local86 != null) {
			this.aClass1_Sub3_Sub11_2 = local86.aClass1_Sub3_Sub11_5;
			this.aClass8_2 = local86.aClass8_6;
			if (this.aBoolean227) {
				this.aClass8_2 = this.aClass8_2.method5983((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)I")
	@Override
	public int method4899() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
		this.aBoolean227 = false;
		if (this.aClass8_2 != null) {
			this.aClass8_2.D(this.aClass8_2.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4898() {
		return this.aBoolean224;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
	@Override
	public void method4900() {
		if (this.aClass8_2 != null) {
			this.aClass8_2.method5991();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		return this.method1733(arg1, arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class11_Sub3_Sub2) {
			@Pc(5) Class11_Sub3_Sub2 local5 = (Class11_Sub3_Sub2) arg2;
			if (this.aClass8_2 != null && local5.aClass8_2 != null) {
				this.aClass8_2.method5996(local5.aClass8_2, arg3, arg1, arg5, arg4);
			}
		} else if (arg2 instanceof Class11_Sub1_Sub2) {
			@Pc(28) Class11_Sub1_Sub2 local28 = (Class11_Sub1_Sub2) arg2;
			if (this.aClass8_2 != null && local28.aClass8_1 != null) {
				this.aClass8_2.method5996(local28.aClass8_1, arg3, arg1, arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZIILclient!za;)Lclient!qr;")
	private Class212 method1731(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class117 arg2) {
		@Pc(15) Class87 local15 = Static86.aClass248_7.method5246(this.aShort42 & 0xFFFF);
		@Pc(23) Class139 local23;
		@Pc(27) Class139 local27;
		if (this.aBoolean226) {
			local23 = Static397.aClass139Array2[this.aByte41];
			local27 = Static157.aClass139Array1[0];
		} else {
			if (this.aByte41 < 3) {
				local27 = Static157.aClass139Array1[this.aByte41 + 1];
			} else {
				local27 = null;
			}
			local23 = Static157.aClass139Array1[this.aByte41];
		}
		return local15.method1564(arg2, this.aByte42, arg1, this.aByte43, super.anInt3996, super.anInt3997, arg0, local23, super.anInt4001, local27);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class8 local15 = this.method1733(131072, arg1);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class34 local20 = arg1.method5685();
			local20.U(super.anInt3997, super.anInt4001, super.anInt3996);
			return local15.method5985(arg0, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZLclient!za;)Lclient!e;")
	private Class8 method1733(@OriginalArg(0) int arg0, @OriginalArg(2) Class117 arg1) {
		if (this.aClass8_2 != null && arg1.method5732(this.aClass8_2.RA(), arg0) == 0) {
			return this.aClass8_2;
		} else {
			@Pc(35) Class212 local35 = this.method1731(false, arg0, arg1);
			return local35 == null ? null : local35.aClass8_6;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)I")
	@Override
	public int method4897() {
		return this.aByte42;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		if (this.aClass8_2 == null) {
			return null;
		}
		@Pc(11) Class34 local11 = arg0.method5685();
		local11.U(super.anInt3997, super.anInt4001, super.anInt3996);
		@Pc(21) Class111_Sub3 local21 = null;
		if (this.aBoolean225) {
			local21 = Static238.method3398(1);
		}
		this.aClass8_2.method5987(local11, local21 == null ? null : local21.aClass111_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4896(@OriginalArg(1) Class117 arg0) {
		@Pc(25) Class1_Sub3_Sub11 local25;
		if (this.aClass1_Sub3_Sub11_2 == null && this.aBoolean224) {
			@Pc(18) Class212 local18 = this.method1731(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass1_Sub3_Sub11_5;
		} else {
			local25 = this.aClass1_Sub3_Sub11_2;
			this.aClass1_Sub3_Sub11_2 = null;
		}
		if (local25 != null) {
			Static413.method5276(local25, this.aByte41, super.anInt3997, super.anInt3996, null);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return this.aBoolean227;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)I")
	@Override
	public int method4895() {
		return this.aShort42 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method4902(@OriginalArg(0) Class117 arg0) {
		@Pc(18) Class1_Sub3_Sub11 local18;
		if (this.aClass1_Sub3_Sub11_2 == null && this.aBoolean224) {
			@Pc(29) Class212 local29 = this.method1731(true, 262144, arg0);
			local18 = local29 == null ? null : local29.aClass1_Sub3_Sub11_5;
		} else {
			local18 = this.aClass1_Sub3_Sub11_2;
			this.aClass1_Sub3_Sub11_2 = null;
		}
		if (local18 != null) {
			Static7.method118(local18, this.aByte41, super.anInt3997, super.anInt3996, null);
		}
	}
}
