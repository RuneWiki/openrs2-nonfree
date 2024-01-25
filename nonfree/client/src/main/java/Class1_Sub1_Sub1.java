import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "Lclient!ed;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "Lclient!ba;")
	public final Class18 aClass18_1;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "Z")
	private final boolean aBoolean5;

	static {
		new Class202("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
		new Class202("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!qa;Lclient!ih;IIIIIZIIIIIII)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3679 == 1, Static493.method7268(arg13, arg12));
		this.aClass18_1 = new Class18(arg0, arg1, arg12, arg13, super.aByte90, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean5 = arg1.anInt3660 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		@Pc(23) Class63 local23 = this.aClass18_1.method636(2048, arg0, super.anInt7660, false, true, super.anInt7659);
		if (local23 == null) {
			return null;
		}
		@Pc(30) Class181 local30 = arg0.method6022();
		local30.oa(super.anInt7660, super.anInt7657, super.anInt7659);
		@Pc(40) Class6_Sub5 local40 = null;
		if (this.aBoolean5) {
			local40 = Static356.method2696(1);
		}
		if (this.aClass18_1.aClass6_Sub7_1 == null) {
			local23.method7700(local30, local40 == null ? null : local40.aClass6_Sub4Array1[0], 0);
		} else {
			@Pc(70) Class208 local70 = this.aClass18_1.aClass6_Sub7_1.method6400();
			arg0.method6020(local23, local70, local30, local40 == null ? null : local40.aClass6_Sub4Array1[0]);
		}
		if (this.aClass68_1 == null) {
			this.aClass68_1 = Static51.method920(super.anInt7657, super.anInt7660, super.anInt7659, local23);
		} else {
			Static220.method3485(this.aClass68_1, super.anInt7659, super.anInt7660, local23, super.anInt7657);
		}
		this.aClass18_1.method630(local23, arg0, super.aShort126, super.aShort127, super.aShort128, super.aShort125, true);
		return local40;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
		@Pc(16) Class63 local16 = this.aClass18_1.method636(262144, arg0, super.anInt7660, true, true, super.anInt7659);
		if (local16 != null) {
			this.aClass18_1.method630(local16, arg0, super.aShort126, super.aShort127, super.aShort128, super.aShort125, false);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return this.aClass18_1.method636(arg0, arg1, 0, false, false, 0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
		this.aClass18_1.method633(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I")
	@Override
	public int method6432() {
		return this.aClass18_1.method631();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return this.aClass18_1.method634();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class63 local21 = this.aClass18_1.method636(131072, arg1, super.anInt7660, false, false, super.anInt7659);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class181 local28 = arg1.method6022();
			local28.oa(super.anInt7660, super.anInt7657, super.anInt7659);
			return local21.method7697(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
		this.aClass18_1.method640(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return this.aClass18_1.anInt542;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return this.aClass18_1.anInt532;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return this.aClass18_1.anInt534;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return this.aClass68_1;
	}
}
