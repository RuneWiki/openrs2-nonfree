import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class30_Sub4_Sub3 extends Class30_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "Z")
	private final boolean aBoolean329;

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "Z")
	private boolean aBoolean328;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "S")
	private final short aShort76;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "Z")
	private final boolean aBoolean327;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "B")
	private final byte aByte67;

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "Z")
	private final boolean aBoolean326;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "Lclient!e;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "Lclient!i;")
	private Class1_Sub1_Sub10 aClass1_Sub1_Sub10_3;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!za;Lclient!p;IIIIZIZ)V")
	public Class30_Sub4_Sub3(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt5681, arg1.aBoolean362, arg1.aBoolean351);
		super.anInt5194 = arg3;
		this.aBoolean329 = arg1.anInt5666 != 0 && !arg6;
		this.aBoolean328 = arg8;
		this.aShort76 = (short) arg1.anInt5642;
		super.anInt5193 = arg5;
		this.aByte68 = (byte) arg7;
		this.aBoolean327 = arg6;
		this.aByte67 = (byte) arg2;
		this.aBoolean326 = arg0.method5930() && arg1.aBoolean359 && !this.aBoolean327 && Static12.aClass34_Sub1_1.method5462(Static262.anInt2805) != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean328) {
			local72 |= 0x10000;
		}
		@Pc(87) Class132 local87 = this.method4002(arg0, local72, this.aBoolean326);
		if (local87 != null) {
			this.aClass17_3 = local87.aClass17_1;
			this.aClass1_Sub1_Sub10_3 = local87.aClass1_Sub1_Sub10_1;
			if (this.aBoolean328) {
				this.aClass17_3 = this.aClass17_3.method6202((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aByte68;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return 22;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!za;IZI)Lclient!jl;")
	private Class132 method4002(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(15) Class192 local15 = Static455.aClass161_4.method3628(this.aShort76 & 0xFFFF);
		@Pc(37) Class96 local37;
		@Pc(29) Class96 local29;
		if (this.aBoolean327) {
			local37 = Static221.aClass96Array4[this.aByte67];
			local29 = Static262.aClass96Array3[0];
		} else {
			if (this.aByte67 < 3) {
				local29 = Static262.aClass96Array3[this.aByte67 + 1];
			} else {
				local29 = null;
			}
			local37 = Static262.aClass96Array3[this.aByte67];
		}
		return local15.method4371(arg0, super.anInt5194, local37, super.anInt5193, arg2, arg1, 22, super.anInt5199, local29, this.aByte68);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
		this.aBoolean328 = false;
		if (this.aClass17_3 != null) {
			this.aClass17_3.D(this.aClass17_3.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return this.method4004(arg0, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
		if (this.aClass17_3 != null) {
			this.aClass17_3.method6198();
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return this.aBoolean326;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!za;)Lclient!e;")
	private Class17 method4004(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1) {
		if (this.aClass17_3 != null && arg1.method5913(this.aClass17_3.RA(), arg0) == 0) {
			return this.aClass17_3;
		} else {
			@Pc(23) Class132 local23 = this.method4002(arg1, arg0, false);
			return local23 == null ? null : local23.aClass17_1;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class30_Sub4_Sub3) {
			@Pc(8) Class30_Sub4_Sub3 local8 = (Class30_Sub4_Sub3) arg4;
			if (this.aClass17_3 != null && local8.aClass17_3 != null) {
				this.aClass17_3.method6199(local8.aClass17_3, arg0, arg3, arg2, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return this.aShort76 & 0xFFFF;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return this.aBoolean328;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
		@Pc(25) Class1_Sub1_Sub10 local25;
		if (this.aClass1_Sub1_Sub10_3 == null && this.aBoolean326) {
			@Pc(18) Class132 local18 = this.method4002(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub10_1;
		} else {
			local25 = this.aClass1_Sub1_Sub10_3;
			this.aClass1_Sub1_Sub10_3 = null;
		}
		if (local25 != null) {
			Static17.method329(local25, this.aByte67, super.anInt5194, super.anInt5193, null);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		if (this.aClass17_3 == null) {
			return null;
		}
		@Pc(11) Class40 local11 = arg0.method5918();
		local11.U(super.anInt5194, super.anInt5199, super.anInt5193);
		@Pc(21) Class41_Sub7 local21 = null;
		if (this.aBoolean329) {
			local21 = Static306.method4409(1);
		}
		this.aClass17_3.method6189(local11, local21 == null ? null : local21.aClass41_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class17 local14 = this.method4004(131072, arg0);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class40 local19 = arg0.method5918();
			local19.U(super.anInt5194, super.anInt5199, super.anInt5193);
			return local14.method6203(arg2, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
		@Pc(14) Class1_Sub1_Sub10 local14;
		if (this.aClass1_Sub1_Sub10_3 == null && this.aBoolean326) {
			@Pc(25) Class132 local25 = this.method4002(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass1_Sub1_Sub10_1;
		} else {
			local14 = this.aClass1_Sub1_Sub10_3;
			this.aClass1_Sub1_Sub10_3 = null;
		}
		if (local14 != null) {
			Static124.method2026(local14, this.aByte67, super.anInt5194, super.anInt5193, null);
		}
	}
}
