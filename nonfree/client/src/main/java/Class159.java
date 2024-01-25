import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class159 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	private int anInt3847;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "Lclient!wk;")
	public Class246 aClass246_17;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Lclient!wk;")
	private Class246 aClass246_18;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "Ljava/lang/String;")
	private String aString44 = "null";

	static {
		new Class32("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method3547(@OriginalArg(1) String arg0) {
		if (this.aClass246_17 == null) {
			return false;
		}
		if (this.aClass246_18 == null) {
			this.method3554();
		}
		for (@Pc(25) Class2_Sub7 local25 = (Class2_Sub7) this.aClass246_18.method5613(Static164.method2918(arg0)); local25 != null; local25 = (Class2_Sub7) this.aClass246_18.method5608()) {
			if (local25.aString7.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	private void method3548() {
		this.aClass246_18 = new Class246(this.aClass246_17.method5607());
		for (@Pc(20) Class2_Sub14 local20 = (Class2_Sub14) this.aClass246_17.method5606(); local20 != null; local20 = (Class2_Sub14) this.aClass246_17.method5614()) {
			@Pc(29) Class2_Sub14 local29 = new Class2_Sub14((int) local20.aLong209);
			this.aClass246_18.method5609(local29, (long) local20.anInt1455);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method3549(@OriginalArg(1) int arg0) {
		if (this.aClass246_17 == null) {
			return this.aString44;
		} else {
			@Pc(17) Class2_Sub8 local17 = (Class2_Sub8) this.aClass246_17.method5613((long) arg0);
			return local17 == null ? this.aString44 : local17.aString8;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!kk;I)V")
	public void method3550(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5350();
			if (local9 == 0) {
				return;
			}
			this.method3556(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Z")
	public boolean method3552(@OriginalArg(1) int arg0) {
		if (this.aClass246_17 == null) {
			return false;
		}
		if (this.aClass246_18 == null) {
			this.method3548();
		}
		@Pc(24) Class2_Sub14 local24 = (Class2_Sub14) this.aClass246_18.method5613((long) arg0);
		return local24 != null;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	private void method3554() {
		this.aClass246_18 = new Class246(this.aClass246_17.method5607());
		for (@Pc(26) Class2_Sub8 local26 = (Class2_Sub8) this.aClass246_17.method5606(); local26 != null; local26 = (Class2_Sub8) this.aClass246_17.method5614()) {
			@Pc(37) Class2_Sub7 local37 = new Class2_Sub7(local26.aString8, (int) local26.aLong209);
			this.aClass246_18.method5609(local37, Static164.method2918(local26.aString8));
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!kk;)V")
	private void method3556(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static294.method4424(arg1.method5330());
		} else if (arg0 == 2) {
			this.aChar2 = Static294.method4424(arg1.method5330());
		} else if (arg0 == 3) {
			this.aString44 = arg1.method5364();
		} else if (arg0 == 4) {
			this.anInt3847 = arg1.method5346();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(49) int local49 = arg1.method5312();
			this.aClass246_17 = new Class246(Static6.method148(local49));
			for (@Pc(59) int local59 = 0; local59 < local49; local59++) {
				@Pc(65) int local65 = arg1.method5346();
				@Pc(77) Class2 local77;
				if (arg0 == 5) {
					local77 = new Class2_Sub8(arg1.method5364());
				} else {
					local77 = new Class2_Sub14(arg1.method5346());
				}
				this.aClass246_17.method5609(local77, (long) local65);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)I")
	public int method3558(@OriginalArg(1) int arg0) {
		if (this.aClass246_17 == null) {
			return this.anInt3847;
		} else {
			@Pc(17) Class2_Sub14 local17 = (Class2_Sub14) this.aClass246_17.method5613((long) arg0);
			return local17 == null ? this.anInt3847 : local17.anInt1455;
		}
	}
}
