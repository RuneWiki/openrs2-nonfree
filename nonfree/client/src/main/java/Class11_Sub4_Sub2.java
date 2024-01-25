import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class11_Sub4_Sub2 extends Class11_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!jh", name = "L", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!jh", name = "E", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!jh", name = "Q", descriptor = "Z")
	private final boolean aBoolean345;

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "S")
	private final short aShort58;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "Z")
	private final boolean aBoolean344;

	@OriginalMember(owner = "client!jh", name = "V", descriptor = "Z")
	private final boolean aBoolean346;

	@OriginalMember(owner = "client!jh", name = "K", descriptor = "Lclient!e;")
	private Class8 aClass8_3;

	@OriginalMember(owner = "client!jh", name = "H", descriptor = "Lclient!i;")
	private Class1_Sub3_Sub11 aClass1_Sub3_Sub11_3;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!za;Lclient!fu;IIIIZIIIII)V")
	public Class11_Sub4_Sub2(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static128.method1584(arg11, arg10));
		this.aByte63 = (byte) arg10;
		this.aByte62 = (byte) arg11;
		this.aByte61 = (byte) arg2;
		this.aBoolean345 = arg6;
		super.anInt6083 = arg3;
		this.aShort58 = (short) arg1.anInt1925;
		super.anInt6086 = arg5;
		this.aBoolean344 = arg1.anInt1928 != 0 && !arg6;
		this.aBoolean346 = arg0.method5691() && arg1.aBoolean207 && !this.aBoolean345 && Static126.aClass19_Sub1_1.method3337(Static214.anInt3968) != 0;
		@Pc(74) Class212 local74 = this.method2804(arg0, this.aBoolean346, 2048);
		if (local74 != null) {
			this.aClass8_3 = local74.aClass8_6;
			this.aClass1_Sub3_Sub11_3 = local74.aClass1_Sub3_Sub11_5;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
	@Override
	public int method4895() {
		return this.aShort58 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		return this.method2805(arg1, arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!za;ZIZ)Lclient!qr;")
	private Class212 method2804(@OriginalArg(0) Class117 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class87 local13 = Static86.aClass248_7.method5246(this.aShort58 & 0xFFFF);
		@Pc(27) Class139 local27;
		@Pc(40) Class139 local40;
		if (this.aBoolean345) {
			local40 = Static157.aClass139Array1[0];
			local27 = Static397.aClass139Array2[this.aByte61];
		} else {
			local27 = Static157.aClass139Array1[this.aByte61];
			if (this.aByte61 < 3) {
				local40 = Static157.aClass139Array1[this.aByte61 + 1];
			} else {
				local40 = null;
			}
		}
		return local13.method1564(arg0, this.aByte63, arg2, this.aByte62, super.anInt6086, super.anInt6083, arg1, local27, super.anInt6089, local40);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4898() {
		return this.aBoolean346;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class8 local14 = this.method2805(131072, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class34 local19 = arg1.method5685();
			local19.U(super.anInt6083, super.anInt6089, super.anInt6086);
			return local14.method5985(arg0, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
	}

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)I")
	@Override
	public int method4889() {
		return this.aClass8_3 == null ? 0 : this.aClass8_3.B();
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I")
	@Override
	public int method4899() {
		return this.aByte62;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		if (this.aClass8_3 == null) {
			return null;
		}
		@Pc(11) Class34 local11 = arg0.method5685();
		local11.U(super.anInt6083 + super.anInt6090, super.anInt6089, super.anInt6086 + super.anInt6085);
		@Pc(32) Class111_Sub3 local32 = null;
		if (this.aBoolean344) {
			local32 = Static238.method3398(1);
		}
		this.aClass8_3.method5987(local11, local32 == null ? null : local32.aClass111_Sub8Array1[0], 0);
		return local32;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!za;)Lclient!e;")
	private Class8 method2805(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1) {
		if (this.aClass8_3 != null && arg1.method5732(this.aClass8_3.RA(), arg0) == 0) {
			return this.aClass8_3;
		} else {
			@Pc(23) Class212 local23 = this.method2804(arg1, false, arg0);
			return local23 == null ? null : local23.aClass8_6;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method4902(@OriginalArg(0) Class117 arg0) {
		@Pc(14) Class1_Sub3_Sub11 local14;
		if (this.aClass1_Sub3_Sub11_3 == null && this.aBoolean346) {
			@Pc(25) Class212 local25 = this.method2804(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass1_Sub3_Sub11_5;
		} else {
			local14 = this.aClass1_Sub3_Sub11_3;
			this.aClass1_Sub3_Sub11_3 = null;
		}
		if (local14 != null) {
			Static7.method118(local14, this.aByte61, super.anInt6083, super.anInt6086, null);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4896(@OriginalArg(1) Class117 arg0) {
		@Pc(31) Class1_Sub3_Sub11 local31;
		if (this.aClass1_Sub3_Sub11_3 == null && this.aBoolean346) {
			@Pc(24) Class212 local24 = this.method2804(arg0, true, 262144);
			local31 = local24 == null ? null : local24.aClass1_Sub3_Sub11_5;
		} else {
			local31 = this.aClass1_Sub3_Sub11_3;
			this.aClass1_Sub3_Sub11_3 = null;
		}
		if (local31 != null) {
			Static413.method5276(local31, this.aByte61, super.anInt6083, super.anInt6086, null);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
	@Override
	public int method4897() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
	@Override
	public void method4900() {
		if (this.aClass8_3 != null) {
			this.aClass8_3.method5991();
		}
	}
}
