import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class7_Sub2_Sub4 extends Class7_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!bn", name = "F", descriptor = "Lclient!ik;")
	public final Class115 aClass115_1;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "Z")
	private final boolean aBoolean92;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!qa;Lclient!gm;IIIIIZIIIIIII)V")
	public Class7_Sub2_Sub4(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2752 == 1, Static389.method5058(arg12, arg13));
		this.aClass115_1 = new Class115(arg0, arg1, arg12, arg13, super.aByte77, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean92 = arg1.anInt2768 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method4804(@OriginalArg(0) Class172 arg0) {
		this.aClass115_1.method2760(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)I")
	@Override
	public int method4807() {
		return this.aClass115_1.anInt3435;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
	@Override
	public int method3494() {
		return this.aClass115_1.method2769();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4809() {
		return this.aClass115_1.method2766();
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)I")
	@Override
	public int method4808() {
		return this.aClass115_1.anInt3450;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)I")
	@Override
	public int method4810() {
		return this.aClass115_1.anInt3443;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4806(@OriginalArg(1) Class172 arg0) {
		this.aClass115_1.method2764(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	@Override
	public Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		return this.aClass115_1.method2765(arg1, false, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		@Pc(16) Class9 local16 = this.aClass115_1.method2765(2048, true, arg0, super.anInt4321, false, super.anInt4318);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class107 local23 = arg0.method5495();
		local23.R(super.anInt4318, super.anInt4320, super.anInt4321);
		@Pc(33) Class6_Sub1 local33 = null;
		if (this.aBoolean92) {
			local33 = Static43.method829(1);
		}
		if (this.aClass115_1.aClass6_Sub8_5 == null) {
			local16.method5695(local23, local33 == null ? null : local33.aClass6_Sub5Array1[0], 0);
		} else {
			@Pc(49) Class227 local49 = this.aClass115_1.aClass6_Sub8_5.method5923();
			arg0.method5520(local16, local49, local23, local33 == null ? null : local33.aClass6_Sub5Array1[0]);
		}
		this.aClass115_1.method2762(super.aShort70, arg0, super.aShort71, super.aShort72, true, local16, super.aShort73);
		return local33;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class9 local16 = this.aClass115_1.method2765(131072, false, arg0, super.anInt4321, false, super.anInt4318);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class107 local23 = arg0.method5495();
			local23.R(super.anInt4318, super.anInt4320, super.anInt4321);
			return local16.method5693(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	@Override
	public void method4811() {
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return false;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
		@Pc(24) Class9 local24 = this.aClass115_1.method2765(262144, true, arg0, super.anInt4321, true, super.anInt4318);
		if (local24 != null) {
			this.aClass115_1.method2762(super.aShort70, arg0, super.aShort71, super.aShort72, false, local24, super.aShort73);
		}
	}
}
