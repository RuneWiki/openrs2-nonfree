import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class19 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_3;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "J")
	public final long aLong14;

	static {
		new Class134("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!pg;JI)V")
	public Class19(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass163_Sub2_3 = arg0;
		this.aLong14 = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass163_Sub2_3.method4155(this.aLong14);
		super.finalize();
	}
}
