import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class24_Sub3_Sub6 extends Class24_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "Lclient!jp;")
	public final Class133 aClass133_3;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "Z")
	private final boolean aBoolean469;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!za;Lclient!jc;IIIIIZIIIIIII)V")
	public Class24_Sub3_Sub6(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3786 == 1, Static187.method3004(arg12, arg13));
		this.aClass133_3 = new Class133(arg0, arg1, arg12, arg13, super.aByte98, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean469 = arg1.anInt3778 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class50 arg0) {
		this.aClass133_3.method3154(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class63 local16 = this.aClass133_3.method3149(super.anInt7092, super.anInt7094, 131072, arg0, false, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class34 local23 = arg0.method5819();
			local23.U(super.anInt7092, super.anInt7096, super.anInt7094);
			return local16.method6101(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
	@Override
	public int method5705() {
		return this.aClass133_3.anInt3962;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5701() {
		return this.aClass133_3.method3153();
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)I")
	@Override
	public int method5706() {
		return this.aClass133_3.anInt3964;
	}

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)I")
	@Override
	public int method5579() {
		return this.aClass133_3.method3158();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		return this.aClass133_3.method3149(0, 0, arg1, arg0, false, false);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method5700() {
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		@Pc(16) Class63 local16 = this.aClass133_3.method3149(super.anInt7092, super.anInt7094, 2048, arg0, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class34 local23 = arg0.method5819();
		local23.U(super.anInt7092, super.anInt7096, super.anInt7094);
		@Pc(38) Class40_Sub5 local38 = null;
		if (this.aBoolean469) {
			local38 = Static171.method2916(1);
		}
		if (this.aClass133_3.aClass40_Sub6_4 == null) {
			local16.method6090(local23, local38 == null ? null : local38.aClass40_Sub8Array1[0], 0);
		} else {
			@Pc(68) Class121 local68 = this.aClass133_3.aClass40_Sub6_4.method4088();
			arg0.method5845(local16, local68, local23, local38 == null ? null : local38.aClass40_Sub8Array1[0]);
		}
		this.aClass133_3.method3152(super.aShort107, super.aShort105, super.aShort106, super.aShort104, local16, true, arg0);
		return local38;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
		@Pc(16) Class63 local16 = this.aClass133_3.method3149(super.anInt7092, super.anInt7094, 262144, arg0, true, true);
		if (local16 != null) {
			this.aClass133_3.method3152(super.aShort107, super.aShort105, super.aShort106, super.aShort104, local16, false, arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!za;Z)V")
	@Override
	public void method5699(@OriginalArg(0) Class50 arg0) {
		this.aClass133_3.method3161(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)I")
	@Override
	public int method5702() {
		return this.aClass133_3.anInt3978;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
