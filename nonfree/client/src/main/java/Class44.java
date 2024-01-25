import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class44 {

	static {
		new Class189("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public abstract void method3065();

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I")
	public abstract int method3067(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)J")
	public abstract long method3068();
}
