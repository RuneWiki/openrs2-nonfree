import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class Class25 {

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	public final int anInt7042;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	public final int anInt7041;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	protected final int anInt7038;

	static {
		new Class106("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(III)V")
	protected Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7042 = arg1;
		this.anInt7041 = arg0;
		this.anInt7038 = arg2;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)V")
	public abstract void method6072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BII)V")
	public abstract void method6074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(III)V")
	public abstract void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
