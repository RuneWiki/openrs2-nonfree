import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V")
	private Class1_Sub24() {
	}

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub24(@OriginalArg(0) String arg0) {
		this.aString29 = arg0;
	}
}
