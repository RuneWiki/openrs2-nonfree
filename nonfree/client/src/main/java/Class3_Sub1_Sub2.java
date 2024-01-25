import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "Lclient!fr;")
	public final Class83 aClass83_2;

	@OriginalMember(owner = "client!lp", name = "L", descriptor = "Z")
	private final boolean aBoolean317;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!ya;Lclient!jo;IIIIIZII)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean270, arg1.aBoolean267);
		this.aClass83_2 = new Class83(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean317 = arg1.anInt3653 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5151(@OriginalArg(1) Class49 arg0) {
		this.aClass83_2.method2052(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	@Override
	public Class91 method5154(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		return this.aClass83_2.method2051(false, false, 0, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5152() {
		return this.aClass83_2.method2044();
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
		@Pc(20) Class91 local20 = this.aClass83_2.method2051(true, true, super.anInt4392, super.anInt4393, arg0, 262144);
		if (local20 != null) {
			@Pc(27) int local27 = super.anInt4392 >> 7;
			@Pc(32) int local32 = super.anInt4393 >> 7;
			this.aClass83_2.method2045(false, local32, arg0, local27, local27, local32, local20);
		}
	}

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return false;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class91 local16 = this.aClass83_2.method2051(false, false, super.anInt4392, super.anInt4393, arg1, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class35 local28 = arg1.method4445();
			local28.j(super.anInt4392, super.anInt4391, super.anInt4393);
			return local16.method3288(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
	@Override
	public void method5150() {
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		@Pc(16) Class91 local16 = this.aClass83_2.method2051(true, false, super.anInt4392, super.anInt4393, arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(29) Class35 local29 = arg0.method4445();
		local29.j(super.anInt4392, super.anInt4391, super.anInt4393);
		@Pc(39) Class8_Sub5 local39 = null;
		if (this.aBoolean317) {
			local39 = Static367.method4998(1);
		}
		if (this.aClass83_2.aClass8_Sub3_3 == null) {
			local16.method3276(local29, local39 == null ? null : local39.aClass8_Sub4Array1[0], 0);
		} else {
			@Pc(69) Class194 local69 = this.aClass83_2.aClass8_Sub3_3.method561();
			arg0.method4468(local16, local69, local29, local39 == null ? null : local39.aClass8_Sub4Array1[0]);
		}
		@Pc(88) int local88 = super.anInt4392 >> 7;
		@Pc(93) int local93 = super.anInt4393 >> 7;
		this.aClass83_2.method2045(true, local93, arg0, local88, local88, local93, local16);
		return local39;
	}

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)I")
	@Override
	public int method5155() {
		return this.aClass83_2.anInt2633;
	}

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)I")
	@Override
	public int method5153() {
		return this.aClass83_2.anInt2630;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5156(@OriginalArg(1) Class49 arg0) {
		this.aClass83_2.method2043(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
	@Override
	public int method5149() {
		return this.aClass83_2.anInt2619;
	}
}
