import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!a", name = "D", descriptor = "S")
	private final short aShort1;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "B")
	private final byte aByte1;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "Z")
	private final boolean aBoolean3;

	@OriginalMember(owner = "client!a", name = "M", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "Z")
	private final boolean aBoolean2;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "Z")
	private final boolean aBoolean1;

	@OriginalMember(owner = "client!a", name = "R", descriptor = "Lclient!c;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!a", name = "W", descriptor = "Lclient!j;")
	private Class3_Sub3_Sub4 aClass3_Sub3_Sub4_1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!qa;Lclient!jt;IIIIZIIIII)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static118.method2152(arg10, arg11));
		this.aShort1 = (short) arg1.anInt4027;
		this.aByte1 = (byte) arg11;
		super.anInt5368 = arg3;
		this.aBoolean3 = arg6;
		this.aByte3 = (byte) arg10;
		this.aBoolean2 = arg1.anInt4009 != 0 && !arg6;
		super.anInt5370 = arg5;
		this.aByte2 = (byte) arg2;
		this.aBoolean1 = arg0.method2626() && arg1.aBoolean324 && !this.aBoolean3 && Static123.aClass21_Sub1_1.method775(Static347.anInt6318) != 0;
		@Pc(80) Class48 local80 = this.method58(this.aBoolean1, 2048, arg0);
		if (local80 != null) {
			this.aClass31_1 = local80.aClass31_2;
			this.aClass3_Sub3_Sub4_1 = local80.aClass3_Sub3_Sub4_2;
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	@Override
	public void method5849() {
		if (this.aClass31_1 != null) {
			this.aClass31_1.method5716();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5853(@OriginalArg(0) Class75 arg0) {
		@Pc(18) Class3_Sub3_Sub4 local18;
		if (this.aClass3_Sub3_Sub4_1 == null && this.aBoolean1) {
			@Pc(29) Class48 local29 = this.method58(true, 262144, arg0);
			local18 = local29 == null ? null : local29.aClass3_Sub3_Sub4_2;
		} else {
			local18 = this.aClass3_Sub3_Sub4_1;
			this.aClass3_Sub3_Sub4_1 = null;
		}
		if (local18 != null) {
			Static259.method3926(local18, this.aByte2, super.anInt5368, super.anInt5370, null);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(13) Class31 local13 = this.method56(arg2, 131072);
		if (local13 == null) {
			return false;
		} else {
			@Pc(23) Class106 local23 = arg2.method2587();
			local23.R(super.anInt5368, super.anInt5363, super.anInt5370);
			return local13.method5702(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLclient!qa;I)Lclient!c;")
	private Class31 method56(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass31_1 != null && arg0.method2610(this.aClass31_1.n(), arg1) == 0) {
			return this.aClass31_1;
		} else {
			@Pc(23) Class48 local23 = this.method58(false, arg1, arg0);
			return local23 == null ? null : local23.aClass31_2;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5854(@OriginalArg(0) Class75 arg0) {
		@Pc(32) Class3_Sub3_Sub4 local32;
		if (this.aClass3_Sub3_Sub4_1 == null && this.aBoolean1) {
			@Pc(25) Class48 local25 = this.method58(true, 262144, arg0);
			local32 = local25 == null ? null : local25.aClass3_Sub3_Sub4_2;
		} else {
			local32 = this.aClass3_Sub3_Sub4_1;
			this.aClass3_Sub3_Sub4_1 = null;
		}
		if (local32 != null) {
			Static229.method3575(local32, this.aByte2, super.anInt5368, super.anInt5370, null);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZIILclient!qa;)Lclient!df;")
	private Class48 method58(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(11) Class128 local11 = Static55.aClass25_1.method855(this.aShort1 & 0xFFFF);
		@Pc(33) Class64 local33;
		@Pc(25) Class64 local25;
		if (this.aBoolean3) {
			local33 = Static401.aClass64Array3[this.aByte2];
			local25 = Static205.aClass64Array2[0];
		} else {
			if (this.aByte2 < 3) {
				local25 = Static205.aClass64Array2[this.aByte2 + 1];
			} else {
				local25 = null;
			}
			local33 = Static205.aClass64Array2[this.aByte2];
		}
		return local11.method3297(super.anInt5368, arg0, arg1, local25, this.aByte3, super.anInt5363, super.anInt5370, local33, this.aByte1, arg2);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
	@Override
	public int method5848() {
		return this.aByte3;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5852() {
		return this.aBoolean1;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		if (this.aClass31_1 == null) {
			return null;
		}
		@Pc(19) Class106 local19 = arg0.method2587();
		local19.R(super.anInt5368 + super.anInt5372, super.anInt5363, super.anInt5370 + super.anInt5367);
		@Pc(36) Class13_Sub7 local36 = null;
		if (this.aBoolean2) {
			local36 = Static120.method2160(1);
		}
		this.aClass31_1.method5704(local19, local36 == null ? null : local36.aClass13_Sub1Array1[0], 0);
		return local36;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)I")
	@Override
	public int method5851() {
		return this.aByte1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class31 method5850(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		return this.method56(arg1, arg0);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)I")
	@Override
	public int method4302() {
		return this.aClass31_1 == null ? 0 : this.aClass31_1.b();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
	@Override
	public int method5847() {
		return this.aShort1 & 0xFFFF;
	}
}
