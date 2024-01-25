import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class20_Sub1_Sub2 extends Class20_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!jw", name = "I", descriptor = "Lclient!so;")
	private Class271 aClass271_3;

	@OriginalMember(owner = "client!jw", name = "N", descriptor = "Lclient!lo;")
	public final Class178 aClass178_1;

	@OriginalMember(owner = "client!jw", name = "K", descriptor = "Z")
	private final boolean aBoolean353;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lclient!qa;Lclient!cn;IIIIIZIIIIIII)V")
	public Class20_Sub1_Sub2(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1652 == 1, Static385.method6172(arg12, arg13));
		this.aClass178_1 = new Class178(arg0, arg1, arg12, arg13, super.aByte108, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean353 = arg1.anInt1632 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return this.aClass271_3;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)I")
	@Override
	public int method8044() {
		return this.aClass178_1.anInt5297;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aClass178_1.method4884();
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class97 local16 = this.aClass178_1.method4877(false, false, 131072, super.anInt8949, arg0, super.anInt8954);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class128 local23 = arg0.method7165();
			local23.oa(super.anInt8954, super.anInt8947, super.anInt8949);
			return local16.method6785(arg1, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "(I)I")
	@Override
	public int method7798() {
		return this.aClass178_1.method4880();
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method8045(@OriginalArg(0) Class4 arg0) {
		this.aClass178_1.method4878(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method8043(@OriginalArg(1) Class4 arg0) {
		this.aClass178_1.method4886(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
	@Override
	public void method8050() {
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
		@Pc(16) Class97 local16 = this.aClass178_1.method4877(true, true, 262144, super.anInt8949, arg0, super.anInt8954);
		if (local16 != null) {
			this.aClass178_1.method4883(super.aShort126, local16, arg0, super.aShort125, false, super.aShort123, super.aShort124);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return this.aClass178_1.anInt5310;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		@Pc(20) Class97 local20 = this.aClass178_1.method4877(false, true, 2048, super.anInt8949, arg0, super.anInt8954);
		if (local20 == null) {
			return null;
		}
		@Pc(27) Class128 local27 = arg0.method7165();
		local27.oa(super.anInt8954, super.anInt8947, super.anInt8949);
		@Pc(37) Class46_Sub6 local37 = null;
		if (this.aBoolean353) {
			local37 = Static490.method7528(1);
		}
		if (this.aClass178_1.aClass46_Sub7_3 == null) {
			local20.method6773(local27, local37 == null ? null : local37.aClass46_Sub1Array1[0], 0);
		} else {
			@Pc(55) Class158 local55 = this.aClass178_1.aClass46_Sub7_3.method7408();
			arg0.method7211(local20, local55, local27, local37 == null ? null : local37.aClass46_Sub1Array1[0]);
		}
		if (this.aClass271_3 == null) {
			this.aClass271_3 = Static161.method2903(super.anInt8947, super.anInt8954, local20, super.anInt8949);
		} else {
			Static120.method7556(super.anInt8947, this.aClass271_3, super.anInt8949, local20, super.anInt8954);
		}
		this.aClass178_1.method4883(super.aShort126, local20, arg0, super.aShort125, true, super.aShort123, super.aShort124);
		return local37;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return this.aClass178_1.method4877(false, false, arg0, 0, arg1, 0);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)I")
	@Override
	public int method8046() {
		return this.aClass178_1.anInt5317;
	}

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return false;
	}
}
