import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class9_Sub4_Sub1_Sub1 extends Class9_Sub4_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "Lclient!oia;")
	private Class243 aClass243_1;

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!ce", name = "N", descriptor = "Lclient!vo;")
	public final Class363 aClass363_1;

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "Z")
	private final boolean aBoolean160;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!ha;Lclient!vha;IIIIIZIIIII)V")
	public Class9_Sub4_Sub1_Sub1(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass363_1 = new Class363(arg0, arg1, arg10, arg11, super.aByte135, arg3, this, arg7, arg12);
		this.aBoolean160 = arg1.anInt10253 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		@Pc(14) Class92 local14 = this.aClass363_1.method8376(false, 2048, arg0, true);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class115 local21 = arg0.method6156();
		local21.method6290(super.aShort119 + super.anInt10360, super.anInt10365, super.anInt10357 + super.aShort118);
		@Pc(47) Class9_Sub2 local47 = Static167.method3172(1, this.aBoolean160);
		@Pc(52) int local52 = super.anInt10360 >> 9;
		@Pc(57) int local57 = super.anInt10357 >> 9;
		this.aClass363_1.method8374(local14, local52, local57, local21, true, local52, arg0, local57);
		if (Static423.aBoolean622) {
			local14.method7057(local21, local47.aClass9_Sub6Array1[0], Static32.anInt849, 0);
		} else {
			local14.method7053(local21, local47.aClass9_Sub6Array1[0], 0);
		}
		if (this.aClass363_1.aClass9_Sub5_8 != null) {
			@Pc(99) Class257 local99 = this.aClass363_1.aClass9_Sub5_8.method5222();
			if (Static423.aBoolean622) {
				arg0.method6148(local99, Static32.anInt849);
			} else {
				arg0.method6183(local99);
			}
		}
		this.aBoolean159 = local14.F() || this.aClass363_1.aClass9_Sub5_8 != null;
		if (this.aClass243_1 == null) {
			this.aClass243_1 = Static126.method2627(super.anInt10365, super.anInt10360, local14, super.anInt10357);
		} else {
			Static499.method7244(super.anInt10365, super.anInt10360, super.anInt10357, local14, this.aClass243_1);
		}
		return local47;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8439(@OriginalArg(1) Class5 arg0) {
		this.aClass363_1.method8373(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
	@Override
	public int method8436() {
		return this.aClass363_1.anInt10317;
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass363_1.method8378();
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8422() {
		return this.aBoolean159;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)I")
	@Override
	public int method8435() {
		return this.aClass363_1.anInt10304;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)I")
	@Override
	public int method8420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8413();
		}
		return this.aClass363_1.method8382();
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
		@Pc(12) Class92 local12 = this.aClass363_1.method8376(false, 262144, arg0, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10360 >> 9;
		@Pc(24) int local24 = super.anInt10357 >> 9;
		@Pc(27) Class115 local27 = arg0.method6156();
		local27.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
		this.aClass363_1.method8374(local12, local19, local24, local27, false, local19, arg0, local24);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	@Override
	public void method8433() {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8437() {
		return this.aClass363_1.method8377();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8434(@OriginalArg(0) Class5 arg0) {
		this.aClass363_1.method8371(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!mg;Z)V")
	public void method1872(@OriginalArg(0) Class200 arg0) {
		this.aClass363_1.method8380(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class92 local12 = this.aClass363_1.method8376(false, 131072, arg1, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class115 local19 = arg1.method6156();
			local19.method6290(super.anInt10360 + super.aShort119, super.anInt10365, super.anInt10357 + super.aShort118);
			return Static423.aBoolean622 ? local12.method7061(arg0, arg2, local19, false, 0, Static32.anInt849) : local12.method7067(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8413() {
		return false;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
	@Override
	public int method8438() {
		return this.aClass363_1.anInt10325;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		return this.aClass243_1;
	}
}
