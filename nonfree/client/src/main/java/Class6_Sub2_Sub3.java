import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class6_Sub2_Sub3 extends Class6_Sub2 implements Interface15 {

	@OriginalMember(owner = "client!wo", name = "G", descriptor = "Lclient!ew;")
	private Class81 aClass81_8;

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "Lclient!tj;")
	public final Class281 aClass281_4;

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "Z")
	private final boolean aBoolean685;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!oa;Lclient!qd;IIIIIZIII)V")
	public Class6_Sub2_Sub3(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static393.method5997(arg9, arg8));
		this.aClass281_4 = new Class281(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt9383, super.anInt9380, arg7, arg10);
		this.aBoolean685 = arg1.anInt7164 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)I")
	@Override
	public int method7761() {
		return this.aClass281_4.anInt8427;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)I")
	@Override
	public int method7764() {
		return this.aClass281_4.anInt8418;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return this.aClass81_8;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7757() {
		return this.aClass281_4.method6977();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
		@Pc(21) Class2 local21 = this.aClass281_4.method6979(super.anInt9383, true, super.anInt9380, 262144, arg0, true);
		if (local21 == null) {
			return;
		}
		@Pc(28) int local28 = super.anInt9383 >> 9;
		@Pc(33) int local33 = super.anInt9380 >> 9;
		@Pc(36) Class205 local36 = arg0.method7448();
		local36.GA(super.anInt9383, super.anInt9386, super.anInt9380);
		this.aClass281_4.method6974(local36, local21, local28, false, local33, local28, arg0, local33);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	@Override
	public Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return this.aClass281_4.method6979(0, false, 0, arg0, arg1, false);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		@Pc(18) Class2 local18 = this.aClass281_4.method6979(super.anInt9383, true, super.anInt9380, 2048, arg0, false);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class205 local25 = arg0.method7448();
		local25.GA(super.anInt9383, super.anInt9386, super.anInt9380);
		@Pc(35) Class4_Sub1 local35 = null;
		if (this.aBoolean685) {
			local35 = Static264.method4641(1);
		}
		@Pc(47) int local47 = super.anInt9383 >> 9;
		@Pc(52) int local52 = super.anInt9380 >> 9;
		this.aClass281_4.method6974(local25, local18, local47, true, local52, local47, arg0, local52);
		if (this.aClass281_4.aClass4_Sub4_7 == null) {
			local18.method5774(local25, local35 == null ? null : local35.aClass4_Sub7Array1[0], 0);
		} else {
			@Pc(73) Class26 local73 = this.aClass281_4.aClass4_Sub4_7.method4590();
			arg0.method7464(local18, local73, local25, local35 == null ? null : local35.aClass4_Sub7Array1[0], 0);
		}
		if (this.aClass81_8 == null) {
			this.aClass81_8 = Static257.method4541(super.anInt9380, super.anInt9386, super.anInt9383, local18);
		} else {
			Static340.method5407(super.anInt9380, this.aClass81_8, local18, super.anInt9383, super.anInt9386);
		}
		return local35;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7759(@OriginalArg(1) Class5 arg0) {
		this.aClass281_4.method6973(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	@Override
	public void method7760() {
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2 local16 = this.aClass281_4.method6979(super.anInt9383, false, super.anInt9380, 131072, arg1, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class205 local23 = arg1.method7448();
			local23.GA(super.anInt9383, super.anInt9386, super.anInt9380);
			return local16.method5786(arg0, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7762(@OriginalArg(1) Class5 arg0) {
		this.aClass281_4.method6970(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I")
	@Override
	public int method7758() {
		return this.aClass281_4.anInt8412;
	}
}
