import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	private Class1_Sub3() {
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub3(@OriginalArg(0) String arg0) {
		this.aString3 = arg0;
	}
}
