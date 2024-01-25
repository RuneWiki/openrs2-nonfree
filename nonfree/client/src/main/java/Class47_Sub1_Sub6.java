import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class47_Sub1_Sub6 extends Class47_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Lclient!ws;")
	public final Class266 aClass266_3;

	@OriginalMember(owner = "client!u", name = "z", descriptor = "Z")
	private final boolean aBoolean592;

	static {
		new Class96("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!qa;Lclient!bo;IIIIIZIIIIIII)V")
	public Class47_Sub1_Sub6(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt531 == 1, Static232.method3381(arg13, arg12));
		this.aClass266_3 = new Class266(arg0, arg1, arg12, arg13, super.aByte97, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean592 = arg1.anInt550 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)I")
	@Override
	public int method5447() {
		return this.aClass266_3.method5985();
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	@Override
	public void method5723() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5743(@OriginalArg(0) Class121 arg0) {
		this.aClass266_3.method5981(arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5741(@OriginalArg(0) Class121 arg0) {
		this.aClass266_3.method5983(arg0);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I")
	@Override
	public int method5742() {
		return this.aClass266_3.anInt7784;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	@Override
	public void method5745() {
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5740() {
		return this.aClass266_3.method5984();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
	@Override
	public int method5744() {
		return this.aClass266_3.anInt7786;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
		@Pc(22) Class37 local22 = this.aClass266_3.method5988(super.anInt7066, super.anInt7060, true, arg0, 262144, true);
		if (local22 != null) {
			this.aClass266_3.method5990(super.aShort107, super.aShort105, super.aShort106, local22, false, super.aShort104, arg0);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		@Pc(18) Class37 local18 = this.aClass266_3.method5988(super.anInt7066, super.anInt7060, false, arg0, 2048, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class43 local25 = arg0.method4588();
		local25.R(super.anInt7060, super.anInt7064, super.anInt7066);
		@Pc(41) Class36_Sub1 local41 = null;
		if (this.aBoolean592) {
			local41 = Static309.method4241(1);
		}
		if (this.aClass266_3.aClass36_Sub7_7 == null) {
			local18.method4167(local25, local41 == null ? null : local41.aClass36_Sub8Array1[0], 0);
		} else {
			@Pc(71) Class101 local71 = this.aClass266_3.aClass36_Sub7_7.method4874();
			arg0.method4574(local18, local71, local25, local41 == null ? null : local41.aClass36_Sub8Array1[0]);
		}
		this.aClass266_3.method5990(super.aShort107, super.aShort105, super.aShort106, local18, true, super.aShort104, arg0);
		return local41;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(16) Class37 local16 = this.aClass266_3.method5988(super.anInt7066, super.anInt7060, false, arg2, 131072, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class43 local23 = arg2.method4588();
			local23.R(super.anInt7060, super.anInt7064, super.anInt7066);
			return local16.method4166(arg1, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)I")
	@Override
	public int method5747() {
		return this.aClass266_3.anInt7768;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method5746(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.aClass266_3.method5988(0, 0, false, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5725() {
		return false;
	}
}
