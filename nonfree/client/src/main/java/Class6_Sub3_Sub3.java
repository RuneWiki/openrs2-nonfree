import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class6_Sub3_Sub3 extends Class6_Sub3 implements Interface15 {

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "Lclient!ew;")
	private Class81 aClass81_3;

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "Lclient!tj;")
	public final Class281 aClass281_1;

	@OriginalMember(owner = "client!jr", name = "F", descriptor = "Z")
	private final boolean aBoolean344;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!oa;Lclient!qd;IIIIIZII)V")
	public Class6_Sub3_Sub3(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt7174, arg1.aBoolean485, arg1.aBoolean489);
		this.aClass281_1 = new Class281(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean344 = arg1.anInt7164 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return this.aClass81_3;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7762(@OriginalArg(1) Class5 arg0) {
		this.aClass281_1.method6970(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)I")
	@Override
	public int method7761() {
		return this.aClass281_1.anInt8427;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	@Override
	public Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return this.aClass281_1.method6979(0, false, 0, arg0, arg1, false);
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I")
	@Override
	public int method7764() {
		return this.aClass281_1.anInt8418;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
		@Pc(20) Class2 local20 = this.aClass281_1.method6979(super.anInt4938, true, super.anInt4936, 262144, arg0, true);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt4938 >> 9;
		@Pc(32) int local32 = super.anInt4936 >> 9;
		@Pc(35) Class205 local35 = arg0.method7448();
		local35.GA(super.anInt4938, super.anInt4934, super.anInt4936);
		this.aClass281_1.method6974(local35, local20, local27, false, local32, local27, arg0, local32);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(22) Class2 local22 = this.aClass281_1.method6979(super.anInt4938, false, super.anInt4936, 131072, arg1, false);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class205 local29 = arg1.method7448();
			local29.GA(super.anInt4938, super.anInt4934, super.anInt4936);
			return local22.method5786(arg0, arg2, local29, false);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7759(@OriginalArg(1) Class5 arg0) {
		this.aClass281_1.method6973(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		@Pc(23) Class2 local23 = this.aClass281_1.method6979(super.anInt4938, true, super.anInt4936, 2048, arg0, false);
		if (local23 == null) {
			return null;
		}
		@Pc(30) Class205 local30 = arg0.method7448();
		local30.GA(super.anInt4938, super.anInt4934, super.anInt4936);
		@Pc(40) Class4_Sub1 local40 = null;
		if (this.aBoolean344) {
			local40 = Static264.method4641(1);
		}
		@Pc(52) int local52 = super.anInt4938 >> 9;
		@Pc(57) int local57 = super.anInt4936 >> 9;
		this.aClass281_1.method6974(local30, local23, local52, true, local57, local52, arg0, local57);
		if (this.aClass281_1.aClass4_Sub4_7 == null) {
			local23.method5774(local30, local40 == null ? null : local40.aClass4_Sub7Array1[0], 0);
		} else {
			@Pc(92) Class26 local92 = this.aClass281_1.aClass4_Sub4_7.method4590();
			arg0.method7464(local23, local92, local30, local40 == null ? null : local40.aClass4_Sub7Array1[0], 0);
		}
		if (this.aClass81_3 == null) {
			this.aClass81_3 = Static257.method4541(super.anInt4936, super.anInt4934, super.anInt4938, local23);
		} else {
			Static340.method5407(super.anInt4936, this.aClass81_3, local23, super.anInt4938, super.anInt4934);
		}
		return local40;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7757() {
		return this.aClass281_1.method6977();
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)I")
	@Override
	public int method7758() {
		return this.aClass281_1.anInt8412;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
	@Override
	public void method7760() {
	}
}
