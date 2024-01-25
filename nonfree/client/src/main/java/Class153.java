import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class153 implements Interface26 {

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString42;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!la;")
	private final Class207 aClass207_54;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!la;Ljava/lang/String;)V")
	public Class153(@OriginalArg(0) Class207 arg0, @OriginalArg(1) String arg1) {
		this.aString42 = arg1;
		this.aClass207_54 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Lclient!oi;")
	@Override
	public Class258 method8919() {
		return Static403.aClass258_2;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)I")
	@Override
	public int method8918() {
		return this.aClass207_54.method4675(this.aString42) ? 100 : 0;
	}
}
