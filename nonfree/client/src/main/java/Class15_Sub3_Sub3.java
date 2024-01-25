import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class15_Sub3_Sub3 extends Class15_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!rca", name = "A", descriptor = "Lclient!ac;")
	private Class4 aClass4_8;

	@OriginalMember(owner = "client!rca", name = "K", descriptor = "Lclient!s;")
	public final Class286 aClass286_4;

	@OriginalMember(owner = "client!rca", name = "L", descriptor = "Z")
	private final boolean aBoolean515;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!oa;Lclient!lt;IIIIIZII)V")
	public Class15_Sub3_Sub3(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt5578, arg1.aBoolean391, arg1.aBoolean392);
		this.aClass286_4 = new Class286(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean515 = arg1.anInt5582 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return this.aClass286_4.anInt8120;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return this.aClass286_4.anInt8133;
	}

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		@Pc(18) Class24 local18 = this.aClass286_4.method6452(arg0, super.anInt7821, false, super.anInt7817, 2048, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class93 local25 = arg0.method7455();
		local25.GA(super.anInt7821, super.anInt7818, super.anInt7817);
		@Pc(35) Class60_Sub8 local35 = null;
		if (this.aBoolean515) {
			local35 = Static191.method3243(1);
		}
		@Pc(47) int local47 = super.anInt7821 >> 9;
		@Pc(52) int local52 = super.anInt7817 >> 9;
		this.aClass286_4.method6454(local47, local25, arg0, local52, local52, local47, true, local18);
		if (this.aClass286_4.aClass60_Sub4_7 == null) {
			local18.method7393(local25, local35 == null ? null : local35.aClass60_Sub6Array1[0], 0);
		} else {
			@Pc(87) Class127 local87 = this.aClass286_4.aClass60_Sub4_7.method3587();
			arg0.method7470(local18, local87, local25, local35 == null ? null : local35.aClass60_Sub6Array1[0], 0);
		}
		if (this.aClass4_8 == null) {
			this.aClass4_8 = Static171.method7159(super.anInt7821, super.anInt7818, local18, super.anInt7817);
		} else {
			Static238.method3722(super.anInt7817, super.anInt7818, super.anInt7821, this.aClass4_8, local18);
		}
		return local35;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class24 local16 = this.aClass286_4.method6452(arg1, super.anInt7821, false, super.anInt7817, 131072, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class93 local23 = arg1.method7455();
			local23.GA(super.anInt7821, super.anInt7818, super.anInt7817);
			return local16.method7386(arg0, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
		this.aClass286_4.method6446(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
		this.aClass286_4.method6457(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return this.aClass286_4.method6452(arg1, 0, false, 0, arg0, false);
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return this.aClass286_4.anInt8129;
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return this.aClass286_4.method6456();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
		@Pc(16) Class24 local16 = this.aClass286_4.method6452(arg0, super.anInt7821, true, super.anInt7817, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt7821 >> 9;
		@Pc(28) int local28 = super.anInt7817 >> 9;
		@Pc(31) Class93 local31 = arg0.method7455();
		local31.GA(super.anInt7821, super.anInt7818, super.anInt7817);
		this.aClass286_4.method6454(local23, local31, arg0, local28, local28, local23, false, local16);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return this.aClass4_8;
	}
}
