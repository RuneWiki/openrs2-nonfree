import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class24_Sub4_Sub2 extends Class24_Sub4 implements Interface10 {

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "Lclient!jp;")
	public final Class133 aClass133_2;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!za;Lclient!jc;IIIIIZII)V")
	public Class24_Sub4_Sub2(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt3796, arg1.aBoolean243, arg1.aBoolean252);
		this.aClass133_2 = new Class133(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean318 = arg1.anInt3778 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class63 local16 = this.aClass133_2.method3149(super.anInt5738, super.anInt5734, 131072, arg0, false, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class34 local23 = arg0.method5819();
			local23.U(super.anInt5738, super.anInt5733, super.anInt5734);
			return local16.method6101(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	@Override
	public void method5700() {
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5701() {
		return this.aClass133_2.method3153();
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
		@Pc(21) Class63 local21 = this.aClass133_2.method3149(super.anInt5738, super.anInt5734, 262144, arg0, true, true);
		if (local21 != null) {
			@Pc(28) int local28 = super.anInt5738 >> 7;
			@Pc(33) int local33 = super.anInt5734 >> 7;
			this.aClass133_2.method3152(local28, local33, local28, local33, local21, false, arg0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)I")
	@Override
	public int method5706() {
		return this.aClass133_2.anInt3964;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I")
	@Override
	public int method5702() {
		return this.aClass133_2.anInt3978;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		return this.aClass133_2.method3149(0, 0, arg1, arg0, false, false);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		@Pc(18) Class63 local18 = this.aClass133_2.method3149(super.anInt5738, super.anInt5734, 2048, arg0, true, false);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class34 local25 = arg0.method5819();
		local25.U(super.anInt5738, super.anInt5733, super.anInt5734);
		@Pc(35) Class40_Sub5 local35 = null;
		if (this.aBoolean318) {
			local35 = Static171.method2916(1);
		}
		if (this.aClass133_2.aClass40_Sub6_4 == null) {
			local18.method6090(local25, local35 == null ? null : local35.aClass40_Sub8Array1[0], 0);
		} else {
			@Pc(77) Class121 local77 = this.aClass133_2.aClass40_Sub6_4.method4088();
			arg0.method5845(local18, local77, local25, local35 == null ? null : local35.aClass40_Sub8Array1[0]);
		}
		@Pc(96) int local96 = super.anInt5738 >> 7;
		@Pc(101) int local101 = super.anInt5734 >> 7;
		this.aClass133_2.method3152(local96, local101, local96, local101, local18, true, arg0);
		return local35;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!za;Z)V")
	@Override
	public void method5699(@OriginalArg(0) Class50 arg0) {
		this.aClass133_2.method3161(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)I")
	@Override
	public int method5705() {
		return this.aClass133_2.anInt3962;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class50 arg0) {
		this.aClass133_2.method3154(arg0);
	}
}
