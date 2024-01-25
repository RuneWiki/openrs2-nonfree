import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class4_Sub4_Sub3 extends Class4_Sub4 implements Interface9 {

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Lclient!id;")
	public final Class117 aClass117_4;

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "Z")
	private final boolean aBoolean654;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!qa;Lclient!us;IIIIIZIII)V")
	public Class4_Sub4_Sub3(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static64.method1257(arg8, arg9));
		this.aClass117_4 = new Class117(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt7607, super.anInt7604, arg7, arg10);
		this.aBoolean654 = arg1.anInt7186 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
		@Pc(16) Class32 local16 = this.aClass117_4.method2618(true, true, arg0, super.anInt7604, super.anInt7607, 262144);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt7607 >> 7;
			@Pc(28) int local28 = super.anInt7604 >> 7;
			this.aClass117_4.method2614(local16, arg0, local23, local28, local28, local23, false);
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	@Override
	public Class32 method5906(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		return this.aClass117_4.method2618(false, false, arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5903(@OriginalArg(1) Class26 arg0) {
		this.aClass117_4.method2617(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5905() {
		return this.aClass117_4.method2625();
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		@Pc(16) Class32 local16 = this.aClass117_4.method2618(false, true, arg0, super.anInt7604, super.anInt7607, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class102 local23 = arg0.method2223();
		local23.R(super.anInt7607, super.anInt7603, super.anInt7604);
		@Pc(38) Class38_Sub3 local38 = null;
		if (this.aBoolean654) {
			local38 = Static313.method4433(1);
		}
		if (this.aClass117_4.aClass38_Sub6_1 == null) {
			local16.method5675(local23, local38 == null ? null : local38.aClass38_Sub4Array1[0], 0);
		} else {
			@Pc(68) Class192 local68 = this.aClass117_4.aClass38_Sub6_1.method3549();
			arg0.method2218(local16, local68, local23, local38 == null ? null : local38.aClass38_Sub4Array1[0]);
		}
		@Pc(87) int local87 = super.anInt7607 >> 7;
		@Pc(92) int local92 = super.anInt7604 >> 7;
		this.aClass117_4.method2614(local16, arg0, local87, local92, local92, local87, true);
		return local38;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5900(@OriginalArg(0) Class26 arg0) {
		this.aClass117_4.method2619(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class32 local16 = this.aClass117_4.method2618(false, false, arg1, super.anInt7604, super.anInt7607, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class102 local23 = arg1.method2223();
			local23.R(super.anInt7607, super.anInt7603, super.anInt7604);
			return local16.method5671(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.aClass117_4.anInt3237;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)I")
	@Override
	public int method5904() {
		return this.aClass117_4.anInt3233;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)I")
	@Override
	public int method5901() {
		return this.aClass117_4.anInt3240;
	}
}
