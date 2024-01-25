import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "Lclient!fr;")
	public final Class83 aClass83_1;

	@OriginalMember(owner = "client!gt", name = "O", descriptor = "Z")
	private final boolean aBoolean223;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!ya;Lclient!jo;IIIIIZIIIIII)V")
	public Class3_Sub3_Sub2(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static140.method2380(arg11, arg12));
		this.aClass83_1 = new Class83(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean223 = arg1.anInt3653 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	@Override
	public Class91 method5154(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		return this.aClass83_1.method2051(false, false, 0, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
		@Pc(23) Class91 local23 = this.aClass83_1.method2051(true, false, super.anInt4202, super.anInt4204, arg0, 262144);
		if (local23 != null) {
			@Pc(30) int local30 = super.anInt4202 >> 7;
			@Pc(35) int local35 = super.anInt4204 >> 7;
			this.aClass83_1.method2045(false, local35, arg0, local30, local30, local35, local23);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5151(@OriginalArg(1) Class49 arg0) {
		this.aClass83_1.method2052(arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		@Pc(16) Class91 local16 = this.aClass83_1.method2051(true, false, super.anInt4202, super.anInt4204, arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class35 local23 = arg0.method4445();
		local23.j(super.anInt4206 + super.anInt4202, super.anInt4212, super.anInt4215 + super.anInt4204);
		@Pc(44) Class8_Sub5 local44 = null;
		if (this.aBoolean223) {
			local44 = Static367.method4998(1);
		}
		if (this.aClass83_1.aClass8_Sub3_3 == null) {
			local16.method3276(local23, local44 == null ? null : local44.aClass8_Sub4Array1[0], 0);
		} else {
			@Pc(74) Class194 local74 = this.aClass83_1.aClass8_Sub3_3.method561();
			arg0.method4468(local16, local74, local23, local44 == null ? null : local44.aClass8_Sub4Array1[0]);
		}
		@Pc(93) int local93 = super.anInt4202 >> 7;
		@Pc(98) int local98 = super.anInt4204 >> 7;
		this.aClass83_1.method2045(true, local98, arg0, local93, local93, local98, local16);
		return local44;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5152() {
		return this.aClass83_1.method2044();
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5156(@OriginalArg(1) Class49 arg0) {
		this.aClass83_1.method2043(arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		@Pc(22) Class91 local22 = this.aClass83_1.method2051(false, false, super.anInt4202, super.anInt4204, arg1, 131072);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class35 local29 = arg1.method4445();
			local29.j(super.anInt4206 + super.anInt4202, super.anInt4212, super.anInt4215 + super.anInt4204);
			return local22.method3288(arg2, arg0, local29, false);
		}
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)I")
	@Override
	public int method5155() {
		return this.aClass83_1.anInt2633;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
	@Override
	public int method5149() {
		return this.aClass83_1.anInt2619;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
	@Override
	public void method5150() {
	}

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "(I)I")
	@Override
	public int method3426() {
		return this.aClass83_1.method2048();
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)I")
	@Override
	public int method5153() {
		return this.aClass83_1.anInt2630;
	}
}
