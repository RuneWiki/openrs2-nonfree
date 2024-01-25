import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class24_Sub1_Sub1 extends Class24_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!bg", name = "K", descriptor = "Lclient!jp;")
	public final Class133 aClass133_1;

	@OriginalMember(owner = "client!bg", name = "P", descriptor = "Z")
	private final boolean aBoolean36;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!za;Lclient!jc;IIIIIZIIIIII)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static350.method4744(arg11, arg12));
		this.aClass133_1 = new Class133(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean36 = arg1.anInt3778 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	@Override
	public void method5700() {
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5701() {
		return this.aClass133_1.method3153();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class63 local16 = this.aClass133_1.method3149(super.anInt4861, super.anInt4858, 131072, arg0, false, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class34 local23 = arg0.method5819();
			local23.U(super.anInt4871 + super.anInt4861, super.anInt4859, super.anInt4866 + super.anInt4858);
			return local16.method6101(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class50 arg0) {
		this.aClass133_1.method3154(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)I")
	@Override
	public int method3930() {
		return this.aClass133_1.method3158();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)I")
	@Override
	public int method5702() {
		return this.aClass133_1.anInt3978;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
		@Pc(20) Class63 local20 = this.aClass133_1.method3149(super.anInt4861, super.anInt4858, 262144, arg0, true, false);
		if (local20 != null) {
			@Pc(27) int local27 = super.anInt4861 >> 7;
			@Pc(32) int local32 = super.anInt4858 >> 7;
			this.aClass133_1.method3152(local27, local32, local27, local32, local20, false, arg0);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		return this.aClass133_1.method3149(0, 0, arg1, arg0, false, false);
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)I")
	@Override
	public int method5706() {
		return this.aClass133_1.anInt3964;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)I")
	@Override
	public int method5705() {
		return this.aClass133_1.anInt3962;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		@Pc(16) Class63 local16 = this.aClass133_1.method3149(super.anInt4861, super.anInt4858, 2048, arg0, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class34 local23 = arg0.method5819();
		local23.U(super.anInt4861 + super.anInt4871, super.anInt4859, super.anInt4866 + super.anInt4858);
		@Pc(40) Class40_Sub5 local40 = null;
		if (this.aBoolean36) {
			local40 = Static171.method2916(1);
		}
		if (this.aClass133_1.aClass40_Sub6_4 == null) {
			local16.method6090(local23, local40 == null ? null : local40.aClass40_Sub8Array1[0], 0);
		} else {
			@Pc(56) Class121 local56 = this.aClass133_1.aClass40_Sub6_4.method4088();
			arg0.method5845(local16, local56, local23, local40 == null ? null : local40.aClass40_Sub8Array1[0]);
		}
		@Pc(94) int local94 = super.anInt4861 >> 7;
		@Pc(99) int local99 = super.anInt4858 >> 7;
		this.aClass133_1.method3152(local94, local99, local94, local99, local16, true, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!za;Z)V")
	@Override
	public void method5699(@OriginalArg(0) Class50 arg0) {
		this.aClass133_1.method3161(arg0);
	}
}
