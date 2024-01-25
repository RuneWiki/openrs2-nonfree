import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Lclient!kr;")
	public Class30_Sub2 aClass30_Sub2_9;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "Lclient!kr;")
	public Class30_Sub2 aClass30_Sub2_10;

	static {
		new Class40("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
	public final void method4419() {
		if (this.aClass30_Sub2_10 != null) {
			this.aClass30_Sub2_10.aClass30_Sub2_9 = this.aClass30_Sub2_9;
			this.aClass30_Sub2_9.aClass30_Sub2_10 = this.aClass30_Sub2_10;
			this.aClass30_Sub2_9 = null;
			this.aClass30_Sub2_10 = null;
		}
	}
}
