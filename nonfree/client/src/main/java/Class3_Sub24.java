import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "Ljava/lang/String;")
	public String aString96;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	private Class3_Sub24() {
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub24(@OriginalArg(0) String arg0) {
		this.aString96 = arg0;
	}
}
