import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class244 {

	@OriginalMember(owner = "client!up", name = "e", descriptor = "I")
	public final int anInt6955;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_39;

	static {
		new Class198("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!tt;II)V")
	public Class244(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6955 = arg2;
		this.aClass200_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass200_Sub2_39.method5305(this.anInt6955);
		super.finalize();
	}
}
