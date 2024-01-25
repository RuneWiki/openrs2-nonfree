import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "Lclient!wa;")
	private Class257 aClass257_2;

	static {
		new Class151("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!dh;)V")
	private void method726(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(20) int local20 = arg1.method4463();
		@Pc(27) int local27;
		if (this.aClass257_2 == null) {
			local27 = Static88.method1286(local20);
			this.aClass257_2 = new Class257(local27);
		}
		for (local27 = 0; local27 < local20; local27++) {
			@Pc(46) boolean local46 = arg1.method4463() == 1;
			@Pc(50) int local50 = arg1.method4493();
			@Pc(59) Class1 local59;
			if (local46) {
				local59 = new Class1_Sub40(arg1.method4484());
			} else {
				local59 = new Class1_Sub6(arg1.method4487());
			}
			this.aClass257_2.method5504(local59, (long) local50);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZI)I")
	public int method729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass257_2 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub6 local21 = (Class1_Sub6) this.aClass257_2.method5503((long) arg1);
			return local21 == null ? arg0 : local21.anInt796;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!dh;)V")
	public void method731(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4463();
			if (local5 == 0) {
				return;
			}
			this.method726(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method732(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass257_2 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub40 local21 = (Class1_Sub40) this.aClass257_2.method5503((long) arg1);
			return local21 == null ? arg0 : local21.aString54;
		}
	}
}
