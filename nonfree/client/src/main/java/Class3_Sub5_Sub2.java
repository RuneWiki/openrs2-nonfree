import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!op", name = "u", descriptor = "Lclient!fr;")
	public final Class83 aClass83_4;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "Z")
	private final boolean aBoolean381;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!ya;Lclient!jo;IIIIIZIII)V")
	public Class3_Sub5_Sub2(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static332.method4608(arg9, arg8));
		this.aClass83_4 = new Class83(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6512, super.anInt6510, arg7, arg10);
		this.aBoolean381 = arg1.anInt3653 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5152() {
		return this.aClass83_4.method2044();
	}

	@OriginalMember(owner = "client!op", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
		@Pc(16) Class91 local16 = this.aClass83_4.method2051(true, true, super.anInt6512, super.anInt6510, arg0, 262144);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt6512 >> 7;
			@Pc(28) int local28 = super.anInt6510 >> 7;
			this.aClass83_4.method2045(false, local28, arg0, local23, local23, local28, local16);
		}
	}

	@OriginalMember(owner = "client!op", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return false;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class91 local16 = this.aClass83_4.method2051(false, false, super.anInt6512, super.anInt6510, arg1, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class35 local28 = arg1.method4445();
			local28.j(super.anInt6512, super.anInt6515, super.anInt6510);
			return local16.method3288(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(I)I")
	@Override
	public int method5153() {
		return this.aClass83_4.anInt2630;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	@Override
	public Class91 method5154(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		return this.aClass83_4.method2051(false, false, 0, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5156(@OriginalArg(1) Class49 arg0) {
		this.aClass83_4.method2043(arg0);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5151(@OriginalArg(1) Class49 arg0) {
		this.aClass83_4.method2052(arg0);
	}

	@OriginalMember(owner = "client!op", name = "e", descriptor = "(I)I")
	@Override
	public int method5155() {
		return this.aClass83_4.anInt2633;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)I")
	@Override
	public int method5149() {
		return this.aClass83_4.anInt2619;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	@Override
	public void method5150() {
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		@Pc(16) Class91 local16 = this.aClass83_4.method2051(true, false, super.anInt6512, super.anInt6510, arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class35 local23 = arg0.method4445();
		local23.j(super.anInt6512, super.anInt6515, super.anInt6510);
		@Pc(38) Class8_Sub5 local38 = null;
		if (this.aBoolean381) {
			local38 = Static367.method4998(1);
		}
		if (this.aClass83_4.aClass8_Sub3_3 == null) {
			local16.method3276(local23, local38 == null ? null : local38.aClass8_Sub4Array1[0], 0);
		} else {
			@Pc(54) Class194 local54 = this.aClass83_4.aClass8_Sub3_3.method561();
			arg0.method4468(local16, local54, local23, local38 == null ? null : local38.aClass8_Sub4Array1[0]);
		}
		@Pc(87) int local87 = super.anInt6512 >> 7;
		@Pc(92) int local92 = super.anInt6510 >> 7;
		this.aClass83_4.method2045(true, local92, arg0, local87, local87, local92, local16);
		return local38;
	}
}
