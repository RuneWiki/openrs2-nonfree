import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class11_Sub1_Sub3_Sub2 extends Class11_Sub1_Sub3 implements Interface27 {

	@OriginalMember(owner = "client!vp", name = "ib", descriptor = "Lclient!tb;")
	private Class316 aClass316_8;

	@OriginalMember(owner = "client!vp", name = "Y", descriptor = "Z")
	private boolean aBoolean733 = false;

	@OriginalMember(owner = "client!vp", name = "X", descriptor = "Lclient!fc;")
	public final Class104 aClass104_4;

	@OriginalMember(owner = "client!vp", name = "hb", descriptor = "Z")
	private boolean aBoolean734;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!ha;Lclient!uw;IIIIIZIIIII)V")
	public Class11_Sub1_Sub3_Sub2(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass104_4 = new Class104(arg0, arg1, arg10, arg11, super.aByte124, arg3, this, arg7, arg12);
		this.aBoolean734 = arg1.anInt9624 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aBoolean733;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		if (arg0 != -83) {
			this.aBoolean734 = false;
		}
		return this.aClass104_4.method2734(false);
	}

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		return false;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8327(@OriginalArg(1) Class87 arg0) {
		this.aClass104_4.method2728(arg0);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)I")
	@Override
	public int method8326() {
		return this.aClass104_4.anInt3183;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class25 local17 = this.aClass104_4.method2724(131072, arg0, false, false);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class6 local24 = arg0.method7892();
			local24.method6701(super.aShort122 + super.anInt9925, super.anInt9930, super.anInt9929 + super.aShort121);
			return Static172.aBoolean322 ? local17.method7730(arg2, arg1, local24, false, 0, Static388.anInt6979) : local17.method7721(arg2, arg1, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return this.aClass104_4.method2732();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8330() {
		return this.aClass104_4.method2730();
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)I")
	@Override
	public int method8329() {
		return this.aClass104_4.anInt3177;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
		@Pc(19) Class25 local19 = this.aClass104_4.method2724(262144, arg0, true, false);
		if (local19 == null) {
			return;
		}
		@Pc(26) int local26 = super.anInt9925 >> 9;
		@Pc(31) int local31 = super.anInt9929 >> 9;
		@Pc(34) Class6 local34 = arg0.method7892();
		local34.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
		this.aClass104_4.method2731(local31, arg0, local34, false, local31, local26, local19, local26);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8325(@OriginalArg(0) Class87 arg0) {
		this.aClass104_4.method2729(arg0);
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		@Pc(14) Class25 local14 = this.aClass104_4.method2724(2048, arg0, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class6 local21 = arg0.method7892();
		local21.method6701(super.anInt9925 + super.aShort122, super.anInt9930, super.anInt9929 + super.aShort121);
		@Pc(42) Class11_Sub10 local42 = Static600.method8238(1, this.aBoolean734);
		@Pc(47) int local47 = super.anInt9925 >> 9;
		@Pc(52) int local52 = super.anInt9929 >> 9;
		this.aClass104_4.method2731(local52, arg0, local21, true, local52, local47, local14, local47);
		if (Static172.aBoolean322) {
			local14.method7725(local21, local42.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
		} else {
			local14.method7735(local21, local42.aClass11_Sub7Array1[0], 0);
		}
		if (this.aClass104_4.aClass11_Sub4_4 != null) {
			@Pc(99) Class247 local99 = this.aClass104_4.aClass11_Sub4_4.method2638();
			if (Static172.aBoolean322) {
				arg0.method7972(local99, Static388.anInt6979);
			} else {
				arg0.method7939(local99);
			}
		}
		this.aBoolean733 = local14.F() || this.aClass104_4.aClass11_Sub4_4 != null;
		if (this.aClass316_8 == null) {
			this.aClass316_8 = Static492.method7054(super.anInt9925, super.anInt9929, local14, super.anInt9930);
		} else {
			Static106.method8252(super.anInt9929, super.anInt9930, this.aClass316_8, local14, super.anInt9925);
		}
		return local42;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		return this.aClass316_8;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)I")
	@Override
	public int method8328() {
		return this.aClass104_4.anInt3176;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
	@Override
	public void method8331() {
	}
}
