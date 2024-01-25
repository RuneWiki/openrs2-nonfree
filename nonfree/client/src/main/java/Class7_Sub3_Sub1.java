import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class7_Sub3_Sub1 extends Class7_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!e", name = "H", descriptor = "Lclient!ik;")
	public final Class115 aClass115_2;

	@OriginalMember(owner = "client!e", name = "U", descriptor = "Z")
	private final boolean aBoolean162;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!qa;Lclient!gm;IIIIIZIIIIII)V")
	public Class7_Sub3_Sub1(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static326.method4410(arg11, arg12));
		this.aClass115_2 = new Class115(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean162 = arg1.anInt2768 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)I")
	@Override
	public int method4807() {
		return this.aClass115_2.anInt3435;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)I")
	@Override
	public int method4808() {
		return this.aClass115_2.anInt3450;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		@Pc(16) Class9 local16 = this.aClass115_2.method2765(2048, true, arg0, super.anInt3665, false, super.anInt3661);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class107 local23 = arg0.method5495();
		local23.R(super.anInt3664 + super.anInt3661, super.anInt3663, super.anInt3660 + super.anInt3665);
		@Pc(39) Class6_Sub1 local39 = null;
		if (this.aBoolean162) {
			local39 = Static43.method829(1);
		}
		if (this.aClass115_2.aClass6_Sub8_5 == null) {
			local16.method5695(local23, local39 == null ? null : local39.aClass6_Sub5Array1[0], 0);
		} else {
			@Pc(69) Class227 local69 = this.aClass115_2.aClass6_Sub8_5.method5923();
			arg0.method5520(local16, local69, local23, local39 == null ? null : local39.aClass6_Sub5Array1[0]);
		}
		@Pc(88) int local88 = super.anInt3661 >> 7;
		@Pc(93) int local93 = super.anInt3665 >> 7;
		this.aClass115_2.method2762(local93, arg0, local88, local88, true, local16, local93);
		return local39;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4806(@OriginalArg(1) Class172 arg0) {
		this.aClass115_2.method2764(arg0);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)I")
	@Override
	public int method4810() {
		return this.aClass115_2.anInt3443;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	@Override
	public Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		return this.aClass115_2.method2765(arg1, false, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4809() {
		return this.aClass115_2.method2766();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
		@Pc(16) Class9 local16 = this.aClass115_2.method2765(262144, true, arg0, super.anInt3665, false, super.anInt3661);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt3661 >> 7;
			@Pc(28) int local28 = super.anInt3665 >> 7;
			this.aClass115_2.method2762(local28, arg0, local23, local23, false, local16, local28);
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	@Override
	public void method4811() {
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class9 local18 = this.aClass115_2.method2765(131072, false, arg0, super.anInt3665, false, super.anInt3661);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class107 local25 = arg0.method5495();
			local25.R(super.anInt3661 + super.anInt3664, super.anInt3663, super.anInt3665 + super.anInt3660);
			return local18.method5693(arg2, arg1, local25, false);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method4804(@OriginalArg(0) Class172 arg0) {
		this.aClass115_2.method2760(arg0);
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)I")
	@Override
	public int method2922() {
		return this.aClass115_2.method2769();
	}
}
