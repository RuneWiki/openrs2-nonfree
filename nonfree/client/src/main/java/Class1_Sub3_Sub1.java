import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!f", name = "B", descriptor = "Lclient!af;")
	public final Class6 aClass6_2;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "Z")
	private final boolean aBoolean152;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!oj;Lclient!cu;IIIIIZIIIIII)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static176.method3279(arg12, arg11));
		this.aClass6_2 = new Class6(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean152 = arg1.anInt1274 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)I")
	@Override
	public int method6031() {
		return this.aClass6_2.anInt155;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
	@Override
	public int method6027() {
		return this.aClass6_2.anInt161;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		@Pc(16) Class159 local16 = this.aClass6_2.method74(true, arg0, super.anInt6988, super.anInt6984, 1024, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class21 local23 = arg0.method2445();
		local23.method3711(super.anInt6984 + super.anInt6983, super.anInt6981, super.anInt6988 + super.anInt6987);
		@Pc(39) Class7_Sub5 local39 = null;
		if (this.aBoolean152) {
			local39 = Static234.method4211(1);
		}
		if (this.aClass6_2.aClass7_Sub3_1 == null) {
			local16.method4952(local23, local39 == null ? null : local39.aClass7_Sub6Array1[0], 0);
		} else {
			@Pc(69) Class34 local69 = this.aClass6_2.aClass7_Sub3_1.method519();
			arg0.method2520(local16, local69, local23, local39 == null ? null : local39.aClass7_Sub6Array1[0]);
		}
		this.aClass6_2.method77(local16, true, super.anInt6988 >> 7, super.anInt6988 >> 7, super.anInt6984 >> 7, super.anInt6984 >> 7, arg0);
		return local39;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	@Override
	public Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		return this.aClass6_2.method74(false, arg1, 0, 0, arg0, false);
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(I)I")
	@Override
	public int method6024() {
		return this.aClass6_2.method75();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I")
	@Override
	public int method6034() {
		return this.aClass6_2.anInt164;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6028(@OriginalArg(1) Class48 arg0) {
		this.aClass6_2.method73(arg0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class159 local16 = this.aClass6_2.method74(false, arg1, super.anInt6988, super.anInt6984, 65536, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(30) Class21 local30 = arg1.method2445();
			local30.method3711(super.anInt6984 + super.anInt6983, super.anInt6981, super.anInt6988 + super.anInt6987);
			return local16.method4931(arg0, arg2, local30, false);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	@Override
	public void method6030() {
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6033() {
		return this.aClass6_2.method69();
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6032(@OriginalArg(1) Class48 arg0) {
		this.aClass6_2.method68(arg0);
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
		@Pc(20) Class159 local20 = this.aClass6_2.method74(true, arg0, super.anInt6988, super.anInt6984, 131072, false);
		if (local20 != null) {
			this.aClass6_2.method77(local20, false, super.anInt6988 >> 7, super.anInt6988 >> 7, super.anInt6984 >> 7, super.anInt6984 >> 7, arg0);
		}
	}
}
