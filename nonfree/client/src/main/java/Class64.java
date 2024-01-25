import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class Class64 implements Interface20 {

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString19;

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "Lclient!ga;")
	private final Class111 aClass111_19;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!ga;Ljava/lang/String;)V")
	public Class64(@OriginalArg(0) Class111 arg0, @OriginalArg(1) String arg1) {
		this.aString19 = arg1;
		this.aClass111_19 = arg0;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)Lclient!rba;")
	@Override
	public Class277 method7281() {
		return Static450.aClass277_4;
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)I")
	@Override
	public int method7282() {
		return this.aClass111_19.method2464(this.aString19) ? 100 : this.aClass111_19.method2467(this.aString19);
	}
}
