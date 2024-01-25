import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!in", name = "t", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	private Class2_Sub24() {
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub24(@OriginalArg(0) String arg0) {
		this.aString24 = arg0;
	}
}
