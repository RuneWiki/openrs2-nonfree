import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	private Class1_Sub35() {
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub35(@OriginalArg(0) String arg0) {
		this.aString41 = arg0;
	}
}
