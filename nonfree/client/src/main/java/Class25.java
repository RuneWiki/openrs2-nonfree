import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class25 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_3;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
	public final int anInt671;

	static {
		new Class256("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!bo;II)V")
	public Class25(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass26_Sub1_3 = arg0;
		this.anInt671 = arg2;
	}

	@OriginalMember(owner = "client!bm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass26_Sub1_3.method700(this.anInt671);
		super.finalize();
	}
}
