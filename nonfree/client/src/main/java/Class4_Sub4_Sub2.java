import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class4_Sub4_Sub2 extends Class4_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "Lclient!mj;")
	public final Class133 aClass133_3;

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "Z")
	private final boolean aBoolean225;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!ea;Lclient!p;IIIIIIZI)V")
	public Class4_Sub4_Sub2(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		super(arg5, arg6, arg7, arg1.aBoolean395, arg1.aBoolean393);
		this.aClass133_3 = new Class133(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
		this.aBoolean225 = arg1.anInt4756 != 0 && !arg8;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
	@Override
	public int method5908() {
		return this.aClass133_3.anInt3925;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5909() {
		return this.aClass133_3.method3490();
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		@Pc(18) Class112 local18 = this.aClass133_3.method3491(super.anInt2907, arg0, false, super.anInt2905, 1024, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class66 local25 = arg0.method5195();
		local25.method5822(super.anInt2907, super.anInt2906, super.anInt2905);
		@Pc(35) Class32_Sub4 local35 = null;
		if (this.aBoolean225) {
			local35 = Static232.method4183(1);
		}
		if (this.aClass133_3.aClass32_Sub7_4 == null) {
			local18.method4338(local25, local35 == null ? null : local35.aClass32_Sub8Array1[0], 0);
		} else {
			@Pc(65) Class146 local65 = this.aClass133_3.aClass32_Sub7_4.method4955();
			arg0.method5241(local18, local65, local25, local35 == null ? null : local35.aClass32_Sub8Array1[0]);
		}
		this.aClass133_3.method3493(arg0, true, super.anInt2905 >> 7, super.anInt2905 >> 7, super.anInt2907 >> 7, super.anInt2907 >> 7, local18);
		return local35;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!ea;)V")
	@Override
	public void method5911(@OriginalArg(1) Class55 arg0) {
		this.aClass133_3.method3494(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I")
	@Override
	public int method5913() {
		return this.aClass133_3.anInt3926;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class112 local21 = this.aClass133_3.method3491(super.anInt2907, arg1, false, super.anInt2905, 65536, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class66 local28 = arg1.method5195();
			local28.method5822(super.anInt2907, super.anInt2906, super.anInt2905);
			return local21.method4340(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!ea;)V")
	@Override
	public void method5912(@OriginalArg(1) Class55 arg0) {
		this.aClass133_3.method3484(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	@Override
	public void method5896() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
		@Pc(23) Class112 local23 = this.aClass133_3.method3491(super.anInt2907, arg0, true, super.anInt2905, 131072, true);
		if (local23 != null) {
			this.aClass133_3.method3493(arg0, false, super.anInt2905 >> 7, super.anInt2905 >> 7, super.anInt2907 >> 7, super.anInt2907 >> 7, local23);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	@Override
	public void method5907() {
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5895() {
		return false;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)I")
	@Override
	public int method5910() {
		return this.aClass133_3.anInt3933;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ea;BI)Lclient!ts;")
	@Override
	public Class112 method5906(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		return this.aClass133_3.method3491(0, arg0, false, 0, arg1, false);
	}
}
