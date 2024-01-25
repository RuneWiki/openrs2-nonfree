import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class11_Sub1_Sub2_Sub2 extends Class11_Sub1_Sub2 implements Interface27 {

	@OriginalMember(owner = "client!pt", name = "ab", descriptor = "Lclient!tb;")
	private Class316 aClass316_6;

	@OriginalMember(owner = "client!pt", name = "J", descriptor = "Z")
	private boolean aBoolean591 = false;

	@OriginalMember(owner = "client!pt", name = "O", descriptor = "Lclient!fc;")
	public final Class104 aClass104_2;

	@OriginalMember(owner = "client!pt", name = "R", descriptor = "Z")
	private final boolean aBoolean592;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!ha;Lclient!uw;IIIIIZIII)V")
	public Class11_Sub1_Sub2_Sub2(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static153.method2913(arg8, arg9));
		this.aClass104_2 = new Class104(arg0, arg1, arg8, arg9, super.aByte124, arg3, this, arg7, arg10);
		this.aBoolean592 = arg1.anInt9624 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method8313() {
		return false;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8325(@OriginalArg(0) Class87 arg0) {
		this.aClass104_2.method2729(arg0);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)I")
	@Override
	public int method8326() {
		return this.aClass104_2.anInt3183;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V")
	@Override
	public void method8331() {
	}

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return this.aClass104_2.method2732();
	}

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "(I)V")
	@Override
	public void method8311() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aBoolean591;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)I")
	@Override
	public int method8328() {
		return this.aClass104_2.anInt3176;
	}

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		if (arg0 != -83) {
			Static443.aClass274_126 = null;
		}
		return this.aClass104_2.method2734(false);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		return this.aClass316_6;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		@Pc(14) Class25 local14 = this.aClass104_2.method2724(2048, arg0, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class6 local21 = arg0.method7892();
		local21.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
		@Pc(40) Class11_Sub10 local40 = Static600.method8238(1, this.aBoolean592);
		@Pc(45) int local45 = super.anInt9925 >> 9;
		@Pc(50) int local50 = super.anInt9929 >> 9;
		this.aClass104_2.method2731(local50, arg0, local21, true, local50, local45, local14, local45);
		if (Static172.aBoolean322) {
			local14.method7725(local21, local40.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
		} else {
			local14.method7735(local21, local40.aClass11_Sub7Array1[0], 0);
		}
		if (this.aClass104_2.aClass11_Sub4_4 != null) {
			@Pc(92) Class247 local92 = this.aClass104_2.aClass11_Sub4_4.method2638();
			if (Static172.aBoolean322) {
				arg0.method7972(local92, Static388.anInt6979);
			} else {
				arg0.method7939(local92);
			}
		}
		this.aBoolean591 = local14.F() || this.aClass104_2.aClass11_Sub4_4 != null;
		if (this.aClass316_6 == null) {
			this.aClass316_6 = Static492.method7054(super.anInt9925, super.anInt9929, local14, super.anInt9930);
		} else {
			Static106.method8252(super.anInt9929, super.anInt9930, this.aClass316_6, local14, super.anInt9925);
		}
		return local40;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8327(@OriginalArg(1) Class87 arg0) {
		this.aClass104_2.method2728(arg0);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class25 local12 = this.aClass104_2.method2724(131072, arg0, false, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class6 local19 = arg0.method7892();
			local19.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
			return Static172.aBoolean322 ? local12.method7730(arg2, arg1, local19, false, 0, Static388.anInt6979) : local12.method7721(arg2, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)I")
	@Override
	public int method8329() {
		return this.aClass104_2.anInt3177;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8330() {
		return this.aClass104_2.method2730();
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
		@Pc(12) Class25 local12 = this.aClass104_2.method2724(262144, arg0, true, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt9925 >> 9;
		@Pc(24) int local24 = super.anInt9929 >> 9;
		@Pc(27) Class6 local27 = arg0.method7892();
		local27.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
		this.aClass104_2.method2731(local24, arg0, local27, false, local24, local19, local12, local19);
	}

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		return false;
	}
}
