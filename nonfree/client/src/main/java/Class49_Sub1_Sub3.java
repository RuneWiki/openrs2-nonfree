import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class49_Sub1_Sub3 extends Class49_Sub1 implements Interface18 {

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!ud;")
	private Class291 aClass291_8;

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Lclient!ej;")
	public final Class80 aClass80_4;

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "Z")
	private final boolean aBoolean566;

	static {
		new Class306("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!qa;Lclient!bu;IIIIIZIII)V")
	public Class49_Sub1_Sub3(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static538.method7478(arg9, arg8));
		this.aClass80_4 = new Class80(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt8035, super.anInt8032, arg7, arg10);
		this.aBoolean566 = arg1.anInt992 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	@Override
	public void method7472() {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7466(@OriginalArg(1) Class122 arg0) {
		this.aClass80_4.method1890(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
	@Override
	public int method7469() {
		return this.aClass80_4.anInt2255;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	@Override
	public Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		return this.aClass80_4.method1894(0, false, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class122 arg0) {
		this.aClass80_4.method1898(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
		@Pc(19) Class145 local19 = this.aClass80_4.method1894(super.anInt8032, true, true, super.anInt8035, 262144, arg0);
		if (local19 != null) {
			@Pc(26) int local26 = super.anInt8035 >> 9;
			@Pc(31) int local31 = super.anInt8032 >> 9;
			this.aClass80_4.method1901(local19, local31, false, local26, local31, local26, arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7471() {
		return this.aClass80_4.method1899();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)I")
	@Override
	public int method7467() {
		return this.aClass80_4.anInt2245;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		@Pc(18) Class145 local18 = this.aClass80_4.method1894(super.anInt8032, true, false, super.anInt8035, 2048, arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class118 local25 = arg0.method7256();
		local25.oa(super.anInt8035, super.anInt8033, super.anInt8032);
		@Pc(35) Class72_Sub7 local35 = null;
		if (this.aBoolean566) {
			local35 = Static186.method2914(1);
		}
		if (this.aClass80_4.aClass72_Sub4_4 == null) {
			local18.method6686(local25, local35 == null ? null : local35.aClass72_Sub2Array1[0], 0);
		} else {
			@Pc(51) Class175 local51 = this.aClass80_4.aClass72_Sub4_4.method4537();
			arg0.method7246(local18, local51, local25, local35 == null ? null : local35.aClass72_Sub2Array1[0]);
		}
		if (this.aClass291_8 == null) {
			this.aClass291_8 = Static158.method2472(local18, super.anInt8032, super.anInt8033, super.anInt8035);
		} else {
			Static391.method5898(this.aClass291_8, super.anInt8035, local18, super.anInt8033, super.anInt8032);
		}
		@Pc(111) int local111 = super.anInt8035 >> 9;
		@Pc(116) int local116 = super.anInt8032 >> 9;
		this.aClass80_4.method1901(local18, local116, true, local111, local116, local111, arg0);
		return local35;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(21) Class145 local21 = this.aClass80_4.method1894(super.anInt8032, false, false, super.anInt8035, 131072, arg2);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class118 local28 = arg2.method7256();
			local28.oa(super.anInt8035, super.anInt8033, super.anInt8032);
			return local21.method6683(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return this.aClass291_8;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I")
	@Override
	public int method7465() {
		return this.aClass80_4.anInt2233;
	}
}
