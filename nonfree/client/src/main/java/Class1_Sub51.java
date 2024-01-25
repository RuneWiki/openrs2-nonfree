import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class1_Sub51 extends Class1 {

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	public int anInt9567;

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
	public int anInt9568;

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
	public int anInt9569;

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
	public int anInt9570;

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
	public int anInt9571;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "Z")
	public boolean aBoolean709 = false;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
	public int anInt9566 = -1;

	static {
		new Class45("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(I)V")
	public Class1_Sub51(@OriginalArg(0) int arg0) {
		this.anInt9566 = arg0;
	}
}
