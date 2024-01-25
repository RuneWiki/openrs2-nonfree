import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "Ljava/lang/String;")
	public String aString206;

	static {
		new Class161("", 73);
	}

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
	private Class3_Sub42() {
	}

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub42(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString206 = arg0;
	}
}
