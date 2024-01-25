import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!gt", name = "D", descriptor = "Lclient!ck;")
	public final Class42 aClass42_2;

	@OriginalMember(owner = "client!gt", name = "F", descriptor = "Z")
	private final boolean aBoolean183;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!qq;Lclient!in;IIIIIZIIIIIII)V")
	public Class3_Sub3_Sub2(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3023 == 1, Static330.method3985(arg12, arg13));
		this.aClass42_2 = new Class42(arg0, arg1, arg12, arg13, super.aByte93, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean183 = arg1.anInt2984 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)I")
	@Override
	public int method5807() {
		return this.aClass42_2.anInt1043;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5809(@OriginalArg(1) Class28 arg0) {
		this.aClass42_2.method967(arg0);
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5806() {
		return this.aClass42_2.method960();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		@Pc(16) Class39 local16 = this.aClass42_2.method968(true, super.anInt6677, super.anInt6675, arg0, false, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class132 local23 = arg0.method3564();
		local23.method3986(super.anInt6675, super.anInt6673, super.anInt6677);
		@Pc(33) Class48_Sub6 local33 = null;
		if (this.aBoolean183) {
			local33 = Static403.method5489(1);
		}
		if (this.aClass42_2.aClass48_Sub1_1 == null) {
			local16.method4910(local23, local33 == null ? null : local33.aClass48_Sub7Array1[0], 0);
		} else {
			@Pc(69) Class115 local69 = this.aClass42_2.aClass48_Sub1_1.method1293();
			arg0.method3571(local16, local69, local23, local33 == null ? null : local33.aClass48_Sub7Array1[0]);
		}
		this.aClass42_2.method966(super.aShort95, super.aShort97, super.aShort98, local16, true, arg0, super.aShort96);
		return local33;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
		@Pc(16) Class39 local16 = this.aClass42_2.method968(true, super.anInt6677, super.anInt6675, arg0, true, 262144);
		if (local16 != null) {
			this.aClass42_2.method966(super.aShort95, super.aShort97, super.aShort98, local16, false, arg0, super.aShort96);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.aClass42_2.method961();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method5813(@OriginalArg(0) Class28 arg0) {
		this.aClass42_2.method965(arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	@Override
	public Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return this.aClass42_2.method968(false, 0, 0, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)I")
	@Override
	public int method5812() {
		return this.aClass42_2.anInt1029;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
	@Override
	public void method5810() {
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aClass42_2.anInt1023;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class39 local18 = this.aClass42_2.method968(false, super.anInt6677, super.anInt6675, arg0, false, 131072);
		if (local18 == null) {
			return false;
		} else {
			@Pc(32) Class132 local32 = arg0.method3564();
			local32.method3986(super.anInt6675, super.anInt6673, super.anInt6677);
			return local18.method4888(arg1, arg2, local32, false);
		}
	}
}
