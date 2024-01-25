import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class25_Sub5_Sub4 extends Class25_Sub5 implements Interface8 {

	@OriginalMember(owner = "client!mm", name = "T", descriptor = "Lclient!pm;")
	public final Class190 aClass190_4;

	@OriginalMember(owner = "client!mm", name = "W", descriptor = "Z")
	private final boolean aBoolean520;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!za;Lclient!er;IIIIIZIIIIIII)V")
	public Class25_Sub5_Sub4(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1788 == 1, Static410.method4614(arg13, arg12));
		this.aClass190_4 = new Class190(arg0, arg1, arg12, arg13, super.aByte94, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean520 = arg1.anInt1821 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return this.aClass190_4.method4236();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return this.aClass190_4.anInt5412;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
		this.aClass190_4.method4225(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
		this.aClass190_4.method4240(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return this.aClass190_4.anInt5392;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)I")
	@Override
	public int method4341() {
		return this.aClass190_4.method4226();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return this.aClass190_4.method4235(0, 0, arg1, false, false, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		@Pc(16) Class57 local16 = this.aClass190_4.method4235(super.anInt5514, super.anInt5518, arg0, true, false, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class32 local23 = arg0.method5747();
		local23.U(super.anInt5518, super.anInt5517, super.anInt5514);
		@Pc(33) Class4_Sub7 local33 = null;
		if (this.aBoolean520) {
			local33 = Static142.method2157(1);
		}
		if (this.aClass190_4.aClass4_Sub2_7 == null) {
			local16.method5953(local23, local33 == null ? null : local33.aClass4_Sub8Array1[0], 0);
		} else {
			@Pc(49) Class71 local49 = this.aClass190_4.aClass4_Sub2_7.method1240();
			arg0.method5762(local16, local49, local23, local33 == null ? null : local33.aClass4_Sub8Array1[0]);
		}
		this.aClass190_4.method4227(local16, super.aShort96, super.aShort97, super.aShort95, arg0, super.aShort94, true);
		return local33;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
		@Pc(20) Class57 local20 = this.aClass190_4.method4235(super.anInt5514, super.anInt5518, arg0, true, true, 262144);
		if (local20 != null) {
			this.aClass190_4.method4227(local20, super.aShort96, super.aShort97, super.aShort95, arg0, super.aShort94, false);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class57 local16 = this.aClass190_4.method4235(super.anInt5514, super.anInt5518, arg1, false, false, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class32 local29 = arg1.method5747();
			local29.U(super.anInt5518, super.anInt5517, super.anInt5514);
			return local16.method5957(arg2, arg0, local29, false);
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return this.aClass190_4.anInt5385;
	}
}
