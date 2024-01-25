import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class11_Sub1_Sub4_Sub2 extends Class11_Sub1_Sub4 implements Interface27 {

	@OriginalMember(owner = "client!su", name = "J", descriptor = "Lclient!tb;")
	private Class316 aClass316_7;

	@OriginalMember(owner = "client!su", name = "O", descriptor = "Z")
	private boolean aBoolean654 = false;

	@OriginalMember(owner = "client!su", name = "bb", descriptor = "Lclient!fc;")
	public final Class104 aClass104_3;

	@OriginalMember(owner = "client!su", name = "T", descriptor = "Z")
	private final boolean aBoolean655;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!ha;Lclient!uw;IIIIIZII)V")
	public Class11_Sub1_Sub4_Sub2(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt9618);
		this.aClass104_3 = new Class104(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean655 = arg1.anInt9624 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8330() {
		return this.aClass104_3.method2730();
	}

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(I)V")
	@Override
	public void method8311() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8325(@OriginalArg(0) Class87 arg0) {
		this.aClass104_3.method2729(arg0);
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V")
	@Override
	public void method8331() {
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class25 local17 = this.aClass104_3.method2724(131072, arg0, false, false);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class6 local24 = arg0.method7892();
			local24.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
			return Static172.aBoolean322 ? local17.method7730(arg2, arg1, local24, false, 0, Static388.anInt6979) : local17.method7721(arg2, arg1, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		@Pc(14) Class25 local14 = this.aClass104_3.method2724(2048, arg0, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(33) Class6 local33 = arg0.method7892();
		local33.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
		@Pc(47) Class11_Sub10 local47 = Static600.method8238(1, this.aBoolean655);
		@Pc(52) int local52 = super.anInt9925 >> 9;
		@Pc(57) int local57 = super.anInt9929 >> 9;
		this.aClass104_3.method2731(local57, arg0, local33, true, local57, local52, local14, local52);
		if (Static172.aBoolean322) {
			local14.method7725(local33, local47.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
		} else {
			local14.method7735(local33, local47.aClass11_Sub7Array1[0], 0);
		}
		if (this.aClass104_3.aClass11_Sub4_4 != null) {
			@Pc(99) Class247 local99 = this.aClass104_3.aClass11_Sub4_4.method2638();
			if (Static172.aBoolean322) {
				arg0.method7972(local99, Static388.anInt6979);
			} else {
				arg0.method7939(local99);
			}
		}
		this.aBoolean654 = local14.F() || this.aClass104_3.aClass11_Sub4_4 != null;
		if (this.aClass316_7 == null) {
			this.aClass316_7 = Static492.method7054(super.anInt9925, super.anInt9929, local14, super.anInt9930);
		} else {
			Static106.method8252(super.anInt9929, super.anInt9930, this.aClass316_7, local14, super.anInt9925);
		}
		return local47;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)I")
	@Override
	public int method8328() {
		return this.aClass104_3.anInt3176;
	}

	@OriginalMember(owner = "client!su", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return this.aClass104_3.method2732();
	}

	@OriginalMember(owner = "client!su", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aBoolean654;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8327(@OriginalArg(1) Class87 arg0) {
		this.aClass104_3.method2728(arg0);
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
		@Pc(16) Class25 local16 = this.aClass104_3.method2724(262144, arg0, true, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt9925 >> 9;
		@Pc(28) int local28 = super.anInt9929 >> 9;
		@Pc(31) Class6 local31 = arg0.method7892();
		local31.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
		this.aClass104_3.method2731(local28, arg0, local31, false, local28, local23, local16, local23);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		return this.aClass316_7;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!su", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method8313() {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)I")
	@Override
	public int method8326() {
		return this.aClass104_3.anInt3183;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)I")
	@Override
	public int method8329() {
		return this.aClass104_3.anInt3177;
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		return arg0 == -83 ? this.aClass104_3.method2734(false) : -41;
	}
}
