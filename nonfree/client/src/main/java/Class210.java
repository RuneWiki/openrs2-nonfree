import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class210 {

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_34;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "J")
	public final long aLong202;

	static {
		new Class83("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!fd;J[Lclient!wl;)V")
	public Class210(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class267[] arg2) {
		this.aClass19_Sub2_34 = arg0;
		this.aLong202 = arg1;
	}

	@OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub2_34.method1973(this.aLong202);
		super.finalize();
	}
}
