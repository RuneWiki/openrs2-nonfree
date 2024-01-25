import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class167 implements Interface20 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString45;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!ga;")
	private final Class111 aClass111_51;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!ga;Ljava/lang/String;)V")
	public Class167(@OriginalArg(0) Class111 arg0, @OriginalArg(1) String arg1) {
		this.aString45 = arg1;
		this.aClass111_51 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lclient!rba;")
	@Override
	public Class277 method7281() {
		return Static450.aClass277_3;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I")
	@Override
	public int method7282() {
		return this.aClass111_51.method2466(this.aString45) ? 100 : 0;
	}
}
