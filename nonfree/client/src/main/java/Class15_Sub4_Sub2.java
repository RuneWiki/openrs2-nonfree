import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class15_Sub4_Sub2 extends Class15_Sub4 implements Interface22 {

	@OriginalMember(owner = "client!pt", name = "D", descriptor = "Lclient!ac;")
	private Class4 aClass4_7;

	@OriginalMember(owner = "client!pt", name = "G", descriptor = "Lclient!s;")
	public final Class286 aClass286_3;

	@OriginalMember(owner = "client!pt", name = "E", descriptor = "Z")
	private final boolean aBoolean498;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!oa;Lclient!lt;IIIIIZIIIIII)V")
	public Class15_Sub4_Sub2(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static391.method5696(arg12, arg11));
		this.aClass286_3 = new Class286(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean498 = arg1.anInt5582 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return this.aClass4_7;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
		@Pc(16) Class24 local16 = this.aClass286_3.method6452(arg0, super.anInt9048, false, super.anInt9052, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt9048 >> 9;
		@Pc(28) int local28 = super.anInt9052 >> 9;
		@Pc(31) Class93 local31 = arg0.method7455();
		local31.GA(super.anInt9048, super.anInt9049, super.anInt9052);
		this.aClass286_3.method6454(local23, local31, arg0, local28, local28, local23, false, local16);
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return this.aClass286_3.method6456();
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
		this.aClass286_3.method6446(arg0);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return this.aClass286_3.anInt8133;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
		this.aClass286_3.method6457(arg0);
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return this.aClass286_3.method6452(arg1, 0, false, 0, arg0, false);
	}

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "(I)I")
	@Override
	public int method7166() {
		return this.aClass286_3.method6448();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class24 local21 = this.aClass286_3.method6452(arg1, super.anInt9048, false, super.anInt9052, 131072, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class93 local28 = arg1.method7455();
			local28.GA(super.anInt9048 + super.anInt9047, super.anInt9049, super.anInt9050 + super.anInt9052);
			return local21.method7386(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		@Pc(18) Class24 local18 = this.aClass286_3.method6452(arg0, super.anInt9048, false, super.anInt9052, 2048, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class93 local25 = arg0.method7455();
		local25.GA(super.anInt9048 + super.anInt9047, super.anInt9049, super.anInt9052 + super.anInt9050);
		@Pc(42) Class60_Sub8 local42 = null;
		if (this.aBoolean498) {
			local42 = Static191.method3243(1);
		}
		@Pc(54) int local54 = super.anInt9048 >> 9;
		@Pc(59) int local59 = super.anInt9052 >> 9;
		this.aClass286_3.method6454(local54, local25, arg0, local59, local59, local54, true, local18);
		if (this.aClass286_3.aClass60_Sub4_7 == null) {
			local18.method7393(local25, local42 == null ? null : local42.aClass60_Sub6Array1[0], 0);
		} else {
			@Pc(80) Class127 local80 = this.aClass286_3.aClass60_Sub4_7.method3587();
			arg0.method7470(local18, local80, local25, local42 == null ? null : local42.aClass60_Sub6Array1[0], 0);
		}
		if (this.aClass4_7 == null) {
			this.aClass4_7 = Static171.method7159(super.anInt9048, super.anInt9049, local18, super.anInt9052);
		} else {
			Static238.method3722(super.anInt9052, super.anInt9049, super.anInt9048, this.aClass4_7, local18);
		}
		return local42;
	}

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return this.aClass286_3.anInt8120;
	}

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return this.aClass286_3.anInt8129;
	}
}
