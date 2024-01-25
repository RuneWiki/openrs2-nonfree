import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!is", name = "w", descriptor = "Lclient!op;")
	public final Class151 aClass151_3;

	@OriginalMember(owner = "client!is", name = "B", descriptor = "Z")
	private final boolean aBoolean284;

	static {
		new Class140("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!dr;Lclient!fq;IIIIIIIZIIII)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static273.method4730(arg3, arg2));
		this.aClass151_3 = new Class151(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean284 = arg1.anInt2086 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5497() {
		return this.aClass151_3.method4333();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!dr;)V")
	@Override
	public void method5498(@OriginalArg(1) Class37 arg0) {
		this.aClass151_3.method4335(arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)I")
	@Override
	public int method5501() {
		return this.aClass151_3.anInt5115;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		@Pc(16) Class49 local16 = this.aClass151_3.method4337(super.anInt5321, false, false, arg2, 65536, super.anInt5325);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class38 local28 = arg2.method3672();
			local28.method4474(super.anInt5325 + super.anInt5318, super.anInt5320, super.anInt5322 + super.anInt5321);
			return local16.method5816(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5500(@OriginalArg(0) Class37 arg0) {
		this.aClass151_3.method4340(arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)I")
	@Override
	public int method5502() {
		return this.aClass151_3.anInt5110;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.aClass151_3.anInt5101;
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		@Pc(16) Class49 local16 = this.aClass151_3.method4337(super.anInt5321, false, true, arg0, 1024, super.anInt5325);
		if (local16 == null) {
			return null;
		}
		@Pc(31) Class38 local31 = arg0.method3672();
		local31.method4474(super.anInt5325 + super.anInt5318, super.anInt5320, super.anInt5321 + super.anInt5322);
		@Pc(47) Class57_Sub5 local47 = null;
		if (this.aBoolean284) {
			local47 = Static116.method2281(1);
		}
		if (this.aClass151_3.aClass57_Sub6_5 == null) {
			local16.method5825(local31, local47 == null ? null : local47.aClass57_Sub4Array1[0], 0);
		} else {
			@Pc(77) Class214 local77 = this.aClass151_3.aClass57_Sub6_5.method3844();
			arg0.method3692(local16, local77, local31, local47 == null ? null : local47.aClass57_Sub4Array1[0]);
		}
		this.aClass151_3.method4330(super.anInt5325 >> 7, super.anInt5325 >> 7, super.anInt5321 >> 7, local16, super.anInt5321 >> 7, arg0, true);
		return local47;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V")
	@Override
	public void method5504() {
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	@Override
	public Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		return this.aClass151_3.method4337(0, false, false, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
		@Pc(20) Class49 local20 = this.aClass151_3.method4337(super.anInt5321, false, true, arg0, 131072, super.anInt5325);
		if (local20 != null) {
			this.aClass151_3.method4330(super.anInt5325 >> 7, super.anInt5325 >> 7, super.anInt5321 >> 7, local20, super.anInt5321 >> 7, arg0, false);
		}
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(B)I")
	@Override
	public int method4509() {
		return this.aClass151_3.method4338();
	}
}
