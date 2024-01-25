import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!mv", name = "P", descriptor = "Lclient!fr;")
	public final Class83 aClass83_3;

	@OriginalMember(owner = "client!mv", name = "E", descriptor = "Z")
	private final boolean aBoolean344;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!ya;Lclient!jo;IIIIIZIIIIIII)V")
	public Class3_Sub2_Sub4(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3633 == 1, Static24.method4073(arg13, arg12));
		this.aClass83_3 = new Class83(arg0, arg1, arg12, arg13, super.aByte89, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean344 = arg1.anInt3653 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I")
	@Override
	public int method5149() {
		return this.aClass83_3.anInt2619;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5151(@OriginalArg(1) Class49 arg0) {
		this.aClass83_3.method2052(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return false;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
	@Override
	public void method5150() {
	}

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)I")
	@Override
	public int method5155() {
		return this.aClass83_3.anInt2633;
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
		@Pc(23) Class91 local23 = this.aClass83_3.method2051(true, true, super.anInt6119, super.anInt6121, arg0, 262144);
		if (local23 != null) {
			this.aClass83_3.method2045(false, super.aShort88, arg0, super.aShort87, super.aShort85, super.aShort86, local23);
		}
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5152() {
		return this.aClass83_3.method2044();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		@Pc(16) Class91 local16 = this.aClass83_3.method2051(true, false, super.anInt6119, super.anInt6121, arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class35 local23 = arg0.method4445();
		local23.j(super.anInt6119, super.anInt6120, super.anInt6121);
		@Pc(33) Class8_Sub5 local33 = null;
		if (this.aBoolean344) {
			local33 = Static367.method4998(1);
		}
		if (this.aClass83_3.aClass8_Sub3_3 == null) {
			local16.method3276(local23, local33 == null ? null : local33.aClass8_Sub4Array1[0], 0);
		} else {
			@Pc(49) Class194 local49 = this.aClass83_3.aClass8_Sub3_3.method561();
			arg0.method4468(local16, local49, local23, local33 == null ? null : local33.aClass8_Sub4Array1[0]);
		}
		this.aClass83_3.method2045(true, super.aShort88, arg0, super.aShort87, super.aShort85, super.aShort86, local16);
		return local33;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	@Override
	public Class91 method5154(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		return this.aClass83_3.method2051(false, false, 0, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class91 local16 = this.aClass83_3.method2051(false, false, super.anInt6119, super.anInt6121, arg1, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(33) Class35 local33 = arg1.method4445();
			local33.j(super.anInt6119, super.anInt6120, super.anInt6121);
			return local16.method3288(arg2, arg0, local33, false);
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(Z)I")
	@Override
	public int method4916() {
		return this.aClass83_3.method2048();
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5156(@OriginalArg(1) Class49 arg0) {
		this.aClass83_3.method2043(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)I")
	@Override
	public int method5153() {
		return this.aClass83_3.anInt2630;
	}
}
