import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class153 implements Interface14 {

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString61;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Lclient!wu;")
	private final Class384 aClass384_56;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!wu;Ljava/lang/String;)V")
	public Class153(@OriginalArg(0) Class384 arg0, @OriginalArg(1) String arg1) {
		this.aString61 = arg1;
		this.aClass384_56 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Lclient!saa;")
	@Override
	public Class309 method3687() {
		return Static508.aClass309_3;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
	@Override
	public int method3686() {
		return this.aClass384_56.method8892(this.aString61) ? 100 : 0;
	}
}
