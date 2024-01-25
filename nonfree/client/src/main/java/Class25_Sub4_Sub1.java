import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class25_Sub4_Sub1 extends Class25_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!il", name = "E", descriptor = "Lclient!pm;")
	public final Class190 aClass190_2;

	@OriginalMember(owner = "client!il", name = "C", descriptor = "Z")
	private final boolean aBoolean336;

	static {
		new Class119("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!za;Lclient!er;IIIIIZIII)V")
	public Class25_Sub4_Sub1(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static159.method2303(arg8, arg9));
		this.aClass190_2 = new Class190(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt5876, super.anInt5875, arg7, arg10);
		this.aBoolean336 = arg1.anInt1821 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
		@Pc(21) Class57 local21 = this.aClass190_2.method4235(super.anInt5875, super.anInt5876, arg0, true, true, 262144);
		if (local21 != null) {
			@Pc(28) int local28 = super.anInt5876 >> 7;
			@Pc(33) int local33 = super.anInt5875 >> 7;
			this.aClass190_2.method4227(local21, local28, local28, local33, arg0, local33, false);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class57 local16 = this.aClass190_2.method4235(super.anInt5875, super.anInt5876, arg1, false, false, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class32 local29 = arg1.method5747();
			local29.U(super.anInt5876, super.anInt5872, super.anInt5875);
			return local16.method5957(arg2, arg0, local29, false);
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return this.aClass190_2.method4236();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return this.aClass190_2.method4235(0, 0, arg1, false, false, arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
		this.aClass190_2.method4240(arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return this.aClass190_2.anInt5385;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return this.aClass190_2.anInt5392;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return this.aClass190_2.anInt5412;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
		this.aClass190_2.method4225(arg0);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		@Pc(16) Class57 local16 = this.aClass190_2.method4235(super.anInt5875, super.anInt5876, arg0, true, false, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class32 local23 = arg0.method5747();
		local23.U(super.anInt5876, super.anInt5872, super.anInt5875);
		@Pc(38) Class4_Sub7 local38 = null;
		if (this.aBoolean336) {
			local38 = Static142.method2157(1);
		}
		if (this.aClass190_2.aClass4_Sub2_7 == null) {
			local16.method5953(local23, local38 == null ? null : local38.aClass4_Sub8Array1[0], 0);
		} else {
			@Pc(70) Class71 local70 = this.aClass190_2.aClass4_Sub2_7.method1240();
			arg0.method5762(local16, local70, local23, local38 == null ? null : local38.aClass4_Sub8Array1[0]);
		}
		@Pc(89) int local89 = super.anInt5876 >> 7;
		@Pc(94) int local94 = super.anInt5875 >> 7;
		this.aClass190_2.method4227(local16, local89, local89, local94, arg0, local94, true);
		return local38;
	}
}
