import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public final class Class156 implements Interface8 {

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString49;

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "Lclient!ae;")
	private final Class8 aClass8_64;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!ae;Ljava/lang/String;)V")
	public Class156(@OriginalArg(0) Class8 arg0, @OriginalArg(1) String arg1) {
		this.aString49 = arg1;
		this.aClass8_64 = arg0;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)Lclient!jea;")
	@Override
	public Class173 method9104() {
		return Static268.aClass173_2;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)I")
	@Override
	public int method9105() {
		return this.aClass8_64.method272(this.aString49) ? 100 : 0;
	}
}
