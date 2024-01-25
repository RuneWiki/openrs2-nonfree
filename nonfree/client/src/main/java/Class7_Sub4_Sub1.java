import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class7_Sub4_Sub1 extends Class7_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "Lclient!ik;")
	public final Class115 aClass115_4;

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "Z")
	private final boolean aBoolean276;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!qa;Lclient!gm;IIIIIZIII)V")
	public Class7_Sub4_Sub1(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static184.method2932(arg9, arg8));
		this.aClass115_4 = new Class115(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6147, super.anInt6143, arg7, arg10);
		this.aBoolean276 = arg1.anInt2768 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)I")
	@Override
	public int method4808() {
		return this.aClass115_4.anInt3450;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	@Override
	public Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		return this.aClass115_4.method2765(arg1, false, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method4804(@OriginalArg(0) Class172 arg0) {
		this.aClass115_4.method2760(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class9 local16 = this.aClass115_4.method2765(131072, false, arg0, super.anInt6143, false, super.anInt6147);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class107 local23 = arg0.method5495();
			local23.R(super.anInt6147, super.anInt6142, super.anInt6143);
			return local16.method5693(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)I")
	@Override
	public int method4810() {
		return this.aClass115_4.anInt3443;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		@Pc(16) Class9 local16 = this.aClass115_4.method2765(2048, true, arg0, super.anInt6143, false, super.anInt6147);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class107 local23 = arg0.method5495();
		local23.R(super.anInt6147, super.anInt6142, super.anInt6143);
		@Pc(33) Class6_Sub1 local33 = null;
		if (this.aBoolean276) {
			local33 = Static43.method829(1);
		}
		if (this.aClass115_4.aClass6_Sub8_5 == null) {
			local16.method5695(local23, local33 == null ? null : local33.aClass6_Sub5Array1[0], 0);
		} else {
			@Pc(49) Class227 local49 = this.aClass115_4.aClass6_Sub8_5.method5923();
			arg0.method5520(local16, local49, local23, local33 == null ? null : local33.aClass6_Sub5Array1[0]);
		}
		@Pc(82) int local82 = super.anInt6147 >> 7;
		@Pc(87) int local87 = super.anInt6143 >> 7;
		this.aClass115_4.method2762(local87, arg0, local82, local82, true, local16, local87);
		return local33;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
		@Pc(24) Class9 local24 = this.aClass115_4.method2765(262144, true, arg0, super.anInt6143, true, super.anInt6147);
		if (local24 != null) {
			@Pc(31) int local31 = super.anInt6147 >> 7;
			@Pc(36) int local36 = super.anInt6143 >> 7;
			this.aClass115_4.method2762(local36, arg0, local31, local31, false, local24, local36);
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
	@Override
	public void method4811() {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4806(@OriginalArg(1) Class172 arg0) {
		this.aClass115_4.method2764(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return false;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)I")
	@Override
	public int method4807() {
		return this.aClass115_4.anInt3435;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4809() {
		return this.aClass115_4.method2766();
	}
}
