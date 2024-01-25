import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class5_Sub42 extends Class5 {

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
	private Class5_Sub42() {
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub42(@OriginalArg(0) String arg0) {
		this.aString105 = arg0;
	}
}
