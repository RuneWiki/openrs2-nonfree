import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class11_Sub1_Sub1_Sub1 extends Class11_Sub1_Sub1 implements Interface27 {

	@OriginalMember(owner = "client!afa", name = "X", descriptor = "Lclient!tb;")
	private Class316 aClass316_1;

	@OriginalMember(owner = "client!afa", name = "ab", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!afa", name = "eb", descriptor = "Lclient!fc;")
	public final Class104 aClass104_1;

	@OriginalMember(owner = "client!afa", name = "gb", descriptor = "Z")
	private final boolean aBoolean21;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!ha;Lclient!uw;IIIIIZIIIIIII)V")
	public Class11_Sub1_Sub1_Sub1(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt9635 == 1, Static49.method949(arg13, arg12));
		this.aClass104_1 = new Class104(arg0, arg1, arg12, arg13, super.aByte124, arg3, this, arg7, arg14);
		this.aBoolean21 = arg1.anInt9624 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		return false;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8327(@OriginalArg(1) Class87 arg0) {
		this.aClass104_1.method2728(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)I")
	@Override
	public int method8326() {
		return this.aClass104_1.anInt3183;
	}

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method8313() {
		return false;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		if (arg0 != -83) {
			this.aClass316_1 = null;
		}
		return this.aClass104_1.method2734(false);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8325(@OriginalArg(0) Class87 arg0) {
		this.aClass104_1.method2729(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(B)I")
	@Override
	public int method8329() {
		return this.aClass104_1.anInt3177;
	}

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aBoolean20;
	}

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return this.aClass104_1.method2732();
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8330() {
		return this.aClass104_1.method2730();
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		return this.aClass316_1;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
	@Override
	public void method8331() {
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)I")
	@Override
	public int method8328() {
		return this.aClass104_1.anInt3176;
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
		@Pc(16) Class25 local16 = this.aClass104_1.method2724(262144, arg0, true, true);
		if (local16 != null) {
			@Pc(21) Class6 local21 = arg0.method7892();
			local21.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
			this.aClass104_1.method2731(super.aShort94, arg0, local21, false, super.aShort97, super.aShort95, local16, super.aShort96);
		}
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		@Pc(19) Class25 local19 = this.aClass104_1.method2724(2048, arg0, true, false);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class6 local26 = arg0.method7892();
		local26.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
		@Pc(40) Class11_Sub10 local40 = Static600.method8238(1, this.aBoolean21);
		this.aClass104_1.method2731(super.aShort94, arg0, local26, true, super.aShort97, super.aShort95, local19, super.aShort96);
		if (Static172.aBoolean322) {
			local19.method7725(local26, local40.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
		} else {
			local19.method7735(local26, local40.aClass11_Sub7Array1[0], 0);
		}
		if (this.aClass104_1.aClass11_Sub4_4 != null) {
			@Pc(86) Class247 local86 = this.aClass104_1.aClass11_Sub4_4.method2638();
			if (Static172.aBoolean322) {
				arg0.method7972(local86, Static388.anInt6979);
			} else {
				arg0.method7939(local86);
			}
		}
		this.aBoolean20 = local19.F() || this.aClass104_1.aClass11_Sub4_4 != null;
		if (this.aClass316_1 == null) {
			this.aClass316_1 = Static492.method7054(super.anInt9925, super.anInt9929, local19, super.anInt9930);
		} else {
			Static106.method8252(super.anInt9929, super.anInt9930, this.aClass316_1, local19, super.anInt9925);
		}
		return local40;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class25 local12 = this.aClass104_1.method2724(131072, arg0, false, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(28) Class6 local28 = arg0.method7892();
			local28.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
			return Static172.aBoolean322 ? local12.method7730(arg2, arg1, local28, false, 0, Static388.anInt6979) : local12.method7721(arg2, arg1, local28, false, 0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "(I)V")
	@Override
	public void method8311() {
		throw new IllegalStateException();
	}
}
