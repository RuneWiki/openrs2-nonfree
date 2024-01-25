import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class20_Sub2_Sub2 extends Class20_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!tv", name = "N", descriptor = "Lclient!so;")
	private Class271 aClass271_8;

	@OriginalMember(owner = "client!tv", name = "D", descriptor = "Lclient!lo;")
	public final Class178 aClass178_4;

	@OriginalMember(owner = "client!tv", name = "z", descriptor = "Z")
	private final boolean aBoolean634;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!qa;Lclient!cn;IIIIIZIII)V")
	public Class20_Sub2_Sub2(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static458.method7006(arg9, arg8));
		this.aClass178_4 = new Class178(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt9298, super.anInt9297, arg7, arg10);
		this.aBoolean634 = arg1.anInt1632 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return this.aClass271_8;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return this.aClass178_4.anInt5310;
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		@Pc(24) Class97 local24 = this.aClass178_4.method4877(false, true, 2048, super.anInt9297, arg0, super.anInt9298);
		if (local24 == null) {
			return null;
		}
		@Pc(31) Class128 local31 = arg0.method7165();
		local31.oa(super.anInt9298, super.anInt9300, super.anInt9297);
		@Pc(41) Class46_Sub6 local41 = null;
		if (this.aBoolean634) {
			local41 = Static490.method7528(1);
		}
		if (this.aClass178_4.aClass46_Sub7_3 == null) {
			local24.method6773(local31, local41 == null ? null : local41.aClass46_Sub1Array1[0], 0);
		} else {
			@Pc(73) Class158 local73 = this.aClass178_4.aClass46_Sub7_3.method7408();
			arg0.method7211(local24, local73, local31, local41 == null ? null : local41.aClass46_Sub1Array1[0]);
		}
		if (this.aClass271_8 == null) {
			this.aClass271_8 = Static161.method2903(super.anInt9300, super.anInt9298, local24, super.anInt9297);
		} else {
			Static120.method7556(super.anInt9300, this.aClass271_8, super.anInt9297, local24, super.anInt9298);
		}
		@Pc(119) int local119 = super.anInt9298 >> 7;
		@Pc(124) int local124 = super.anInt9297 >> 7;
		this.aClass178_4.method4883(local119, local24, arg0, local124, true, local124, local119);
		return local41;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)I")
	@Override
	public int method8044() {
		return this.aClass178_4.anInt5297;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
	@Override
	public void method8050() {
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aClass178_4.method4884();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method8043(@OriginalArg(1) Class4 arg0) {
		this.aClass178_4.method4886(arg0);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class97 local16 = this.aClass178_4.method4877(false, false, 131072, super.anInt9297, arg0, super.anInt9298);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class128 local29 = arg0.method7165();
			local29.oa(super.anInt9298, super.anInt9300, super.anInt9297);
			return local16.method6785(arg1, arg2, local29, false);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
	@Override
	public int method8046() {
		return this.aClass178_4.anInt5317;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method8045(@OriginalArg(0) Class4 arg0) {
		this.aClass178_4.method4878(arg0);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return this.aClass178_4.method4877(false, false, arg0, 0, arg1, 0);
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
		@Pc(20) Class97 local20 = this.aClass178_4.method4877(true, true, 262144, super.anInt9297, arg0, super.anInt9298);
		if (local20 != null) {
			@Pc(27) int local27 = super.anInt9298 >> 7;
			@Pc(32) int local32 = super.anInt9297 >> 7;
			this.aClass178_4.method4883(local27, local20, arg0, local32, false, local32, local27);
		}
	}
}
