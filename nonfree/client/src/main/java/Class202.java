import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class202 implements Interface2 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString65;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!sea;")
	private final Class308 aClass308_103;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!sea;Ljava/lang/String;)V")
	public Class202(@OriginalArg(0) Class308 arg0, @OriginalArg(1) String arg1) {
		this.aString65 = arg1;
		this.aClass308_103 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
	@Override
	public int method7052() {
		return this.aClass308_103.method6552(this.aString65) ? 100 : 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Lclient!mv;")
	@Override
	public Class229 method7053() {
		return Static334.aClass229_3;
	}
}
