import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class3_Sub4_Sub5 extends Class3_Sub4 implements Interface2 {

	@OriginalMember(owner = "client!up", name = "L", descriptor = "Lclient!dj;")
	public final Class53 aClass53_4;

	@OriginalMember(owner = "client!up", name = "M", descriptor = "Z")
	private final boolean aBoolean483;

	static {
		new Class134("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
		new Class134("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!za;Lclient!pm;IIIIIZIIIIIII)V")
	public Class3_Sub4_Sub5(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5339 == 1, Static285.method3787(arg13, arg12));
		this.aClass53_4 = new Class53(arg0, arg1, arg12, arg13, super.aByte91, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean483 = arg1.anInt5357 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!up", name = "f", descriptor = "(I)I")
	@Override
	public int method5286() {
		return this.aClass53_4.method1094();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		@Pc(16) Class59 local16 = this.aClass53_4.method1093(super.anInt6835, false, arg0, 2048, super.anInt6833, true);
		if (local16 == null) {
			return null;
		}
		@Pc(29) Class31 local29 = arg0.method5539();
		local29.U(super.anInt6833, super.anInt6832, super.anInt6835);
		@Pc(39) Class21_Sub6 local39 = null;
		if (this.aBoolean483) {
			local39 = Static209.method2805(1);
		}
		if (this.aClass53_4.aClass21_Sub2_2 == null) {
			local16.method5736(local29, local39 == null ? null : local39.aClass21_Sub7Array1[0], 0);
		} else {
			@Pc(57) Class256 local57 = this.aClass53_4.aClass21_Sub2_2.method634();
			arg0.method5551(local16, local57, local29, local39 == null ? null : local39.aClass21_Sub7Array1[0]);
		}
		this.aClass53_4.method1088(arg0, super.aShort89, super.aShort91, super.aShort92, true, local16, super.aShort90);
		return local39;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return false;
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
	@Override
	public void method5297() {
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5294(@OriginalArg(0) Class163 arg0) {
		this.aClass53_4.method1100(arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	@Override
	public Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		return this.aClass53_4.method1093(0, false, arg1, arg0, 0, false);
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5295() {
		return this.aClass53_4.method1090();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!up", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
	@Override
	public int method5292() {
		return this.aClass53_4.anInt1413;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(B)I")
	@Override
	public int method5298() {
		return this.aClass53_4.anInt1408;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5293(@OriginalArg(0) Class163 arg0) {
		this.aClass53_4.method1087(arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)I")
	@Override
	public int method5296() {
		return this.aClass53_4.anInt1391;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
		@Pc(16) Class59 local16 = this.aClass53_4.method1093(super.anInt6835, true, arg0, 262144, super.anInt6833, true);
		if (local16 != null) {
			this.aClass53_4.method1088(arg0, super.aShort89, super.aShort91, super.aShort92, false, local16, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(16) Class59 local16 = this.aClass53_4.method1093(super.anInt6835, false, arg2, 131072, super.anInt6833, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class31 local28 = arg2.method5539();
			local28.U(super.anInt6833, super.anInt6832, super.anInt6835);
			return local16.method5748(arg1, arg0, local28, false);
		}
	}
}
