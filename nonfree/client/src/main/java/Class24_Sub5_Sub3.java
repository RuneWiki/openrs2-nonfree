import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class24_Sub5_Sub3 extends Class24_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "Lclient!jp;")
	public final Class133 aClass133_4;

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "Z")
	private final boolean aBoolean471;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!za;Lclient!jc;IIIIIZIII)V")
	public Class24_Sub5_Sub3(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static208.method3233(arg9, arg8));
		this.aClass133_4 = new Class133(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt7219, super.anInt7222, arg7, arg10);
		this.aBoolean471 = arg1.anInt3778 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class63 local16 = this.aClass133_4.method3149(super.anInt7219, super.anInt7222, 131072, arg0, false, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class34 local23 = arg0.method5819();
			local23.U(super.anInt7219, super.anInt7221, super.anInt7222);
			return local16.method6101(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)I")
	@Override
	public int method5702() {
		return this.aClass133_4.anInt3978;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	@Override
	public void method5700() {
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)I")
	@Override
	public int method5705() {
		return this.aClass133_4.anInt3962;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
		@Pc(20) Class63 local20 = this.aClass133_4.method3149(super.anInt7219, super.anInt7222, 262144, arg0, true, true);
		if (local20 != null) {
			@Pc(27) int local27 = super.anInt7219 >> 7;
			@Pc(32) int local32 = super.anInt7222 >> 7;
			this.aClass133_4.method3152(local27, local32, local27, local32, local20, false, arg0);
		}
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)I")
	@Override
	public int method5706() {
		return this.aClass133_4.anInt3964;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class50 arg0) {
		this.aClass133_4.method3154(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!za;Z)V")
	@Override
	public void method5699(@OriginalArg(0) Class50 arg0) {
		this.aClass133_4.method3161(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		@Pc(16) Class63 local16 = this.aClass133_4.method3149(super.anInt7219, super.anInt7222, 2048, arg0, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class34 local23 = arg0.method5819();
		local23.U(super.anInt7219, super.anInt7221, super.anInt7222);
		@Pc(33) Class40_Sub5 local33 = null;
		if (this.aBoolean471) {
			local33 = Static171.method2916(1);
		}
		if (this.aClass133_4.aClass40_Sub6_4 == null) {
			local16.method6090(local23, local33 == null ? null : local33.aClass40_Sub8Array1[0], 0);
		} else {
			@Pc(69) Class121 local69 = this.aClass133_4.aClass40_Sub6_4.method4088();
			arg0.method5845(local16, local69, local23, local33 == null ? null : local33.aClass40_Sub8Array1[0]);
		}
		@Pc(88) int local88 = super.anInt7219 >> 7;
		@Pc(93) int local93 = super.anInt7222 >> 7;
		this.aClass133_4.method3152(local88, local93, local88, local93, local16, true, arg0);
		return local33;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5701() {
		return this.aClass133_4.method3153();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		return this.aClass133_4.method3149(0, 0, arg1, arg0, false, false);
	}
}
