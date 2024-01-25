import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class15_Sub2_Sub3 extends Class15_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!dt", name = "M", descriptor = "Lclient!ac;")
	private Class4 aClass4_2;

	@OriginalMember(owner = "client!dt", name = "E", descriptor = "Lclient!s;")
	public final Class286 aClass286_1;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "Z")
	private final boolean aBoolean127;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!oa;Lclient!lt;IIIIIZIIIIIII)V")
	public Class15_Sub2_Sub3(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5622 == 1, Static156.method2462(arg13, arg12));
		this.aClass286_1 = new Class286(arg0, arg1, arg12, arg13, super.aByte98, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean127 = arg1.anInt5582 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
		this.aClass286_1.method6457(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return this.aClass4_2;
	}

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "(I)I")
	@Override
	public int method7123() {
		return this.aClass286_1.method6448();
	}

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return this.aClass286_1.anInt8129;
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return this.aClass286_1.anInt8120;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
		this.aClass286_1.method6446(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
		@Pc(16) Class24 local16 = this.aClass286_1.method6452(arg0, super.anInt8911, true, super.anInt8913, 262144, true);
		if (local16 != null) {
			@Pc(21) Class93 local21 = arg0.method7455();
			local21.GA(super.anInt8911, super.anInt8915, super.anInt8913);
			this.aClass286_1.method6454(super.aShort115, local21, arg0, super.aShort114, super.aShort117, super.aShort116, false, local16);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return this.aClass286_1.method6452(arg1, 0, false, 0, arg0, false);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class24 local23 = this.aClass286_1.method6452(arg1, super.anInt8911, false, super.anInt8913, 131072, false);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class93 local30 = arg1.method7455();
			local30.GA(super.anInt8911, super.anInt8915, super.anInt8913);
			return local23.method7386(arg0, arg2, local30, false);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		@Pc(18) Class24 local18 = this.aClass286_1.method6452(arg0, super.anInt8911, false, super.anInt8913, 2048, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class93 local25 = arg0.method7455();
		local25.GA(super.anInt8911, super.anInt8915, super.anInt8913);
		@Pc(35) Class60_Sub8 local35 = null;
		if (this.aBoolean127) {
			local35 = Static191.method3243(1);
		}
		this.aClass286_1.method6454(super.aShort115, local25, arg0, super.aShort114, super.aShort117, super.aShort116, true, local18);
		if (this.aClass286_1.aClass60_Sub4_7 == null) {
			local18.method7393(local25, local35 == null ? null : local35.aClass60_Sub6Array1[0], 0);
		} else {
			@Pc(67) Class127 local67 = this.aClass286_1.aClass60_Sub4_7.method3587();
			arg0.method7470(local18, local67, local25, local35 == null ? null : local35.aClass60_Sub6Array1[0], 0);
		}
		if (this.aClass4_2 == null) {
			this.aClass4_2 = Static171.method7159(super.anInt8911, super.anInt8915, local18, super.anInt8913);
		} else {
			Static238.method3722(super.anInt8913, super.anInt8915, super.anInt8911, this.aClass4_2, local18);
		}
		return local35;
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return this.aClass286_1.method6456();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return this.aClass286_1.anInt8133;
	}
}
