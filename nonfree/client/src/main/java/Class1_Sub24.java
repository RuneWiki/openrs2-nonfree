import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Ljava/lang/String;")
	public String aString91;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	private Class1_Sub24() {
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub24(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString91 = arg0;
	}
}
