import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class166 {

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!kj;")
	private Class2_Sub10 aClass2_Sub10_40 = new Class2_Sub10();

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!go;")
	private final Class87 aClass87_12 = new Class87();

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	private final int anInt4014;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	private int anInt4016;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!wk;")
	private final Class246 aClass246_20;

	static {
		new Class32("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
	public Class166(@OriginalArg(0) int arg0) {
		this.anInt4014 = arg0;
		this.anInt4016 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass246_20 = new Class246(local19);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJ)Lclient!kj;")
	public Class2_Sub10 method3688(@OriginalArg(1) long arg0) {
		@Pc(18) Class2_Sub10 local18 = (Class2_Sub10) this.aClass246_20.method5613(arg0);
		if (local18 != null) {
			this.aClass87_12.method2360(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public void method3691() {
		this.aClass87_12.method2358();
		this.aClass246_20.method5610();
		this.aClass2_Sub10_40 = new Class2_Sub10();
		this.anInt4016 = this.anInt4014;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(JILclient!kj;)V")
	public void method3693(@OriginalArg(0) long arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (this.anInt4016 == 0) {
			@Pc(21) Class2_Sub10 local21 = this.aClass87_12.method2359();
			local21.method5617();
			local21.method5572();
			if (local21 == this.aClass2_Sub10_40) {
				local21 = this.aClass87_12.method2359();
				local21.method5617();
				local21.method5572();
			}
		} else {
			this.anInt4016--;
		}
		this.aClass246_20.method5609(arg1, arg0);
		this.aClass87_12.method2360(arg1);
	}
}
