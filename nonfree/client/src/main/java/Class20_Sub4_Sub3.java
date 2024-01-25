import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class20_Sub4_Sub3 extends Class20_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!rba", name = "M", descriptor = "Lclient!so;")
	private Class271 aClass271_6;

	@OriginalMember(owner = "client!rba", name = "N", descriptor = "Lclient!lo;")
	public final Class178 aClass178_3;

	@OriginalMember(owner = "client!rba", name = "L", descriptor = "Z")
	private final boolean aBoolean553;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!qa;Lclient!cn;IIIIIZIIIIII)V")
	public Class20_Sub4_Sub3(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static490.method7525(arg12, arg11));
		this.aClass178_3 = new Class178(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean553 = arg1.anInt1632 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method8045(@OriginalArg(0) Class4 arg0) {
		this.aClass178_3.method4878(arg0);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return this.aClass178_3.method4877(false, false, arg0, 0, arg1, 0);
	}

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "(I)I")
	@Override
	public int method6522() {
		return this.aClass178_3.method4880();
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return this.aClass271_6;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
		@Pc(20) Class97 local20 = this.aClass178_3.method4877(false, true, 262144, super.anInt7242, arg0, super.anInt7239);
		if (local20 != null) {
			@Pc(27) int local27 = super.anInt7239 >> 7;
			@Pc(32) int local32 = super.anInt7242 >> 7;
			this.aClass178_3.method4883(local27, local20, arg0, local32, false, local32, local27);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)I")
	@Override
	public int method8046() {
		return this.aClass178_3.anInt5317;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return this.aClass178_3.anInt5310;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)V")
	@Override
	public void method8050() {
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method8043(@OriginalArg(1) Class4 arg0) {
		this.aClass178_3.method4886(arg0);
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aClass178_3.method4884();
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		@Pc(20) Class97 local20 = this.aClass178_3.method4877(false, true, 2048, super.anInt7242, arg0, super.anInt7239);
		if (local20 == null) {
			return null;
		}
		@Pc(27) Class128 local27 = arg0.method7165();
		local27.oa(super.anInt7239 + super.anInt7238, super.anInt7234, super.anInt7242 + super.anInt7245);
		@Pc(44) Class46_Sub6 local44 = null;
		if (this.aBoolean553) {
			local44 = Static490.method7528(1);
		}
		if (this.aClass178_3.aClass46_Sub7_3 == null) {
			local20.method6773(local27, local44 == null ? null : local44.aClass46_Sub1Array1[0], 0);
		} else {
			@Pc(74) Class158 local74 = this.aClass178_3.aClass46_Sub7_3.method7408();
			arg0.method7211(local20, local74, local27, local44 == null ? null : local44.aClass46_Sub1Array1[0]);
		}
		if (this.aClass271_6 == null) {
			this.aClass271_6 = Static161.method2903(super.anInt7234, super.anInt7239, local20, super.anInt7242);
		} else {
			Static120.method7556(super.anInt7234, this.aClass271_6, super.anInt7242, local20, super.anInt7239);
		}
		@Pc(120) int local120 = super.anInt7239 >> 7;
		@Pc(125) int local125 = super.anInt7242 >> 7;
		this.aClass178_3.method4883(local120, local20, arg0, local125, true, local125, local120);
		return local44;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class97 local16 = this.aClass178_3.method4877(false, false, 131072, super.anInt7242, arg0, super.anInt7239);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class128 local23 = arg0.method7165();
			local23.oa(super.anInt7239 + super.anInt7238, super.anInt7234, super.anInt7245 + super.anInt7242);
			return local16.method6785(arg1, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)I")
	@Override
	public int method8044() {
		return this.aClass178_3.anInt5297;
	}
}
