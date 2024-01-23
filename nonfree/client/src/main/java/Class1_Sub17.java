import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub17(@OriginalArg(0) String arg0) {
		this.aString105 = arg0;
	}
}
