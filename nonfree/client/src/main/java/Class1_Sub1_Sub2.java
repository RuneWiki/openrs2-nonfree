import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "Lclient!af;")
	public final Class6 aClass6_1;

	@OriginalMember(owner = "client!dt", name = "I", descriptor = "Z")
	private final boolean aBoolean135;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!oj;Lclient!cu;IIIIIZII)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean96, arg1.aBoolean105);
		this.aClass6_1 = new Class6(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean135 = arg1.anInt1274 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)I")
	@Override
	public int method6027() {
		return this.aClass6_1.anInt161;
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6028(@OriginalArg(1) Class48 arg0) {
		this.aClass6_1.method73(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class159 local16 = this.aClass6_1.method74(false, arg1, super.anInt4089, super.anInt4088, 65536, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(35) Class21 local35 = arg1.method2445();
			local35.method3711(super.anInt4088, super.anInt4087, super.anInt4089);
			return local16.method4931(arg0, arg2, local35, false);
		}
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
		@Pc(18) Class159 local18 = this.aClass6_1.method74(true, arg0, super.anInt4089, super.anInt4088, 131072, true);
		if (local18 != null) {
			this.aClass6_1.method77(local18, false, super.anInt4089 >> 7, super.anInt4089 >> 7, super.anInt4088 >> 7, super.anInt4088 >> 7, arg0);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	@Override
	public void method6030() {
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		@Pc(16) Class159 local16 = this.aClass6_1.method74(true, arg0, super.anInt4089, super.anInt4088, 1024, false);
		if (local16 == null) {
			return null;
		}
		@Pc(33) Class21 local33 = arg0.method2445();
		local33.method3711(super.anInt4088, super.anInt4087, super.anInt4089);
		@Pc(43) Class7_Sub5 local43 = null;
		if (this.aBoolean135) {
			local43 = Static234.method4211(1);
		}
		if (this.aClass6_1.aClass7_Sub3_1 == null) {
			local16.method4952(local33, local43 == null ? null : local43.aClass7_Sub6Array1[0], 0);
		} else {
			@Pc(73) Class34 local73 = this.aClass6_1.aClass7_Sub3_1.method519();
			arg0.method2520(local16, local73, local33, local43 == null ? null : local43.aClass7_Sub6Array1[0]);
		}
		this.aClass6_1.method77(local16, true, super.anInt4089 >> 7, super.anInt4089 >> 7, super.anInt4088 >> 7, super.anInt4088 >> 7, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6032(@OriginalArg(1) Class48 arg0) {
		this.aClass6_1.method68(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	@Override
	public Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		return this.aClass6_1.method74(false, arg1, 0, 0, arg0, false);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)I")
	@Override
	public int method6031() {
		return this.aClass6_1.anInt155;
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6033() {
		return this.aClass6_1.method69();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)I")
	@Override
	public int method6034() {
		return this.aClass6_1.anInt164;
	}
}
