import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class105 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!rj;")
	private Class2_Sub7 aClass2_Sub7_22 = new Class2_Sub7();

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!pf;")
	private final Class179 aClass179_4 = new Class179();

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	private final int anInt3097;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	private int anInt3096;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!wb;")
	private final Class243 aClass243_11;

	static {
		new Class62("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
	public Class105(@OriginalArg(0) int arg0) {
		this.anInt3097 = arg0;
		this.anInt3096 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass243_11 = new Class243(local19);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public void method2626() {
		this.aClass179_4.method4489();
		this.aClass243_11.method5970();
		this.aClass2_Sub7_22 = new Class2_Sub7();
		this.anInt3096 = this.anInt3097;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!rj;JI)V")
	public void method2630(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3096 == 0) {
			@Pc(20) Class2_Sub7 local20 = this.aClass179_4.method4490();
			local20.method6130();
			local20.method6085();
			if (local20 == this.aClass2_Sub7_22) {
				local20 = this.aClass179_4.method4490();
				local20.method6130();
				local20.method6085();
			}
		} else {
			this.anInt3096--;
		}
		this.aClass243_11.method5968(arg1, arg0);
		this.aClass179_4.method4491(arg0);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BJ)Lclient!rj;")
	public Class2_Sub7 method2632(@OriginalArg(1) long arg0) {
		@Pc(17) Class2_Sub7 local17 = (Class2_Sub7) this.aClass243_11.method5967(arg0);
		if (local17 != null) {
			this.aClass179_4.method4491(local17);
		}
		return local17;
	}
}
