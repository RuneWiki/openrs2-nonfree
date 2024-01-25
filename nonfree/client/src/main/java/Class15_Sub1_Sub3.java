import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class15_Sub1_Sub3 extends Class15_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!ac;")
	private Class4 aClass4_5;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!s;")
	public final Class286 aClass286_2;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Z")
	private final boolean aBoolean408;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!oa;Lclient!lt;IIIIIZIII)V")
	public Class15_Sub1_Sub3(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static346.method5045(arg8, arg9));
		this.aClass286_2 = new Class286(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt5699, super.anInt5704, arg7, arg10);
		this.aBoolean408 = arg1.anInt5582 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
		@Pc(16) Class24 local16 = this.aClass286_2.method6452(arg0, super.anInt5699, true, super.anInt5704, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt5699 >> 9;
		@Pc(28) int local28 = super.anInt5704 >> 9;
		@Pc(31) Class93 local31 = arg0.method7455();
		local31.GA(super.anInt5699, super.anInt5703, super.anInt5704);
		this.aClass286_2.method6454(local23, local31, arg0, local28, local28, local23, false, local16);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return this.aClass286_2.anInt8133;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
		this.aClass286_2.method6446(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return this.aClass4_5;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return this.aClass286_2.method6452(arg1, 0, false, 0, arg0, false);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return this.aClass286_2.method6456();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class24 local21 = this.aClass286_2.method6452(arg1, super.anInt5699, false, super.anInt5704, 131072, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class93 local28 = arg1.method7455();
			local28.GA(super.anInt5699, super.anInt5703, super.anInt5704);
			return local21.method7386(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return this.aClass286_2.anInt8129;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		@Pc(18) Class24 local18 = this.aClass286_2.method6452(arg0, super.anInt5699, false, super.anInt5704, 2048, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class93 local25 = arg0.method7455();
		local25.GA(super.anInt5699, super.anInt5703, super.anInt5704);
		@Pc(35) Class60_Sub8 local35 = null;
		if (this.aBoolean408) {
			local35 = Static191.method3243(1);
		}
		@Pc(47) int local47 = super.anInt5699 >> 9;
		@Pc(52) int local52 = super.anInt5704 >> 9;
		this.aClass286_2.method6454(local47, local25, arg0, local52, local52, local47, true, local18);
		if (this.aClass286_2.aClass60_Sub4_7 == null) {
			local18.method7393(local25, local35 == null ? null : local35.aClass60_Sub6Array1[0], 0);
		} else {
			@Pc(87) Class127 local87 = this.aClass286_2.aClass60_Sub4_7.method3587();
			arg0.method7470(local18, local87, local25, local35 == null ? null : local35.aClass60_Sub6Array1[0], 0);
		}
		if (this.aClass4_5 == null) {
			this.aClass4_5 = Static171.method7159(super.anInt5699, super.anInt5703, local18, super.anInt5704);
		} else {
			Static238.method3722(super.anInt5704, super.anInt5703, super.anInt5699, this.aClass4_5, local18);
		}
		return local35;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return this.aClass286_2.anInt8120;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
		this.aClass286_2.method6457(arg0);
	}
}
