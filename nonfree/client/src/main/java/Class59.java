import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class Class59 {

	static {
		new Class256("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I")
	public abstract int method4362(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	public abstract void method4363();

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)J")
	public abstract long method4364();
}
