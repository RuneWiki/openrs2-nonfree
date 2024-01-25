import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class176 implements Interface26 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Lclient!la;")
	private final Class207 aClass207_56;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString49;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!la;Ljava/lang/String;)V")
	public Class176(@OriginalArg(0) Class207 arg0, @OriginalArg(1) String arg1) {
		this.aClass207_56 = arg0;
		this.aString49 = arg1;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
	@Override
	public int method8918() {
		return this.aClass207_56.method4699(this.aString49) ? 100 : this.aClass207_56.method4688(this.aString49);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)Lclient!oi;")
	@Override
	public Class258 method8919() {
		return Static403.aClass258_3;
	}
}
