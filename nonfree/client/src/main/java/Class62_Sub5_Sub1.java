import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class62_Sub5_Sub1 extends Class62_Sub5 implements Interface9 {

	@OriginalMember(owner = "client!no", name = "E", descriptor = "Lclient!ee;")
	public final Class49 aClass49_3;

	@OriginalMember(owner = "client!no", name = "x", descriptor = "Z")
	private final boolean aBoolean372;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!ae;Lclient!jh;IIIIIIIZIIII)V")
	public Class62_Sub5_Sub1(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static138.method2746(arg2, arg3));
		this.aClass49_3 = new Class49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean372 = arg1.anInt3115 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
		@Pc(16) Class7 local16 = this.aClass49_3.method1575(false, 131072, arg0, super.anInt5051, true, super.anInt5056);
		if (local16 != null) {
			this.aClass49_3.method1576(super.anInt5051 >> 7, super.anInt5056 >> 7, super.anInt5051 >> 7, false, arg0, local16, super.anInt5056 >> 7);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ae;ZI)Lclient!bk;")
	@Override
	public Class7 method5582(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		return this.aClass49_3.method1575(false, arg1, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!ae;)V")
	@Override
	public void method5584(@OriginalArg(1) Class4 arg0) {
		this.aClass49_3.method1584(arg0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
	@Override
	public int method5583() {
		return this.aClass49_3.anInt1530;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(I)I")
	@Override
	public int method5581() {
		return this.aClass49_3.anInt1517;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	@Override
	public void method5577() {
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(B)I")
	@Override
	public int method4631() {
		return this.aClass49_3.method1577();
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5579() {
		return this.aClass49_3.method1586();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		@Pc(16) Class7 local16 = this.aClass49_3.method1575(false, 1024, arg0, super.anInt5051, true, super.anInt5056);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class133 local28 = arg0.method4244();
		local28.method4324(super.anInt5056 + super.anInt5047, super.anInt5048, super.anInt5051 + super.anInt5057);
		@Pc(45) Class55_Sub3 local45 = null;
		if (this.aBoolean372) {
			local45 = Static241.method4172(1);
		}
		if (this.aClass49_3.aClass55_Sub7_1 == null) {
			local16.method1441(local28, local45 == null ? null : local45.aClass55_Sub4Array1[0], 0);
		} else {
			@Pc(61) Class75 local61 = this.aClass49_3.aClass55_Sub7_1.method4034();
			arg0.method4245(local16, local61, local28, local45 == null ? null : local45.aClass55_Sub4Array1[0]);
		}
		this.aClass49_3.method1576(super.anInt5051 >> 7, super.anInt5056 >> 7, super.anInt5051 >> 7, true, arg0, local16, super.anInt5056 >> 7);
		return local45;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class7 local16 = this.aClass49_3.method1575(false, 65536, arg1, super.anInt5051, false, super.anInt5056);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class133 local28 = arg1.method4244();
			local28.method4324(super.anInt5056 + super.anInt5047, super.anInt5048, super.anInt5057 + super.anInt5051);
			return local16.method1407(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ae;I)V")
	@Override
	public void method5578(@OriginalArg(0) Class4 arg0) {
		this.aClass49_3.method1571(arg0);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)I")
	@Override
	public int method5580() {
		return this.aClass49_3.anInt1541;
	}
}
