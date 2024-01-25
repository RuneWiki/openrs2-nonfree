import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class31_Sub4_Sub1 extends Class31_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Lclient!gp;")
	public final Class92 aClass92_2;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "Z")
	private final boolean aBoolean133;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!ya;Lclient!jt;IIIIIZIIIIII)V")
	public Class31_Sub4_Sub1(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static130.method2270(arg11, arg12));
		this.aClass92_2 = new Class92(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean133 = arg1.anInt3504 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
		@Pc(16) Class105 local16 = this.aClass92_2.method2319(super.anInt6193, super.anInt6195, 262144, true, arg0, false);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt6193 >> 7;
			@Pc(28) int local28 = super.anInt6195 >> 7;
			this.aClass92_2.method2313(arg0, local23, local28, local16, false, local23, local28);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return this.aClass92_2.anInt2672;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return this.aClass92_2.method2319(0, 0, arg1, false, arg0, false);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
		this.aClass92_2.method2315(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class105 local16 = this.aClass92_2.method2319(super.anInt6193, super.anInt6195, 131072, false, arg0, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(33) Class33 local33 = arg0.method4516();
			local33.j(super.anInt6198 + super.anInt6193, super.anInt6192, super.anInt6195 + super.anInt6200);
			return local16.method3526(arg2, arg1, local33, false);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
		this.aClass92_2.method2321(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)I")
	@Override
	public int method5164() {
		return this.aClass92_2.method2312();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		@Pc(21) Class105 local21 = this.aClass92_2.method2319(super.anInt6193, super.anInt6195, 2048, true, arg0, false);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class33 local28 = arg0.method4516();
		local28.j(super.anInt6198 + super.anInt6193, super.anInt6192, super.anInt6195 + super.anInt6200);
		@Pc(45) Class4_Sub1 local45 = null;
		if (this.aBoolean133) {
			local45 = Static241.method3635(1);
		}
		if (this.aClass92_2.aClass4_Sub7_4 == null) {
			local21.method3534(local28, local45 == null ? null : local45.aClass4_Sub5Array1[0], 0);
		} else {
			@Pc(61) Class140 local61 = this.aClass92_2.aClass4_Sub7_4.method3777();
			arg0.method4526(local21, local61, local28, local45 == null ? null : local45.aClass4_Sub5Array1[0]);
		}
		@Pc(94) int local94 = super.anInt6193 >> 7;
		@Pc(99) int local99 = super.anInt6195 >> 7;
		this.aClass92_2.method2313(arg0, local94, local99, local21, true, local94, local99);
		return local45;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return this.aClass92_2.anInt2679;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return this.aClass92_2.anInt2686;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return this.aClass92_2.method2310();
	}
}
