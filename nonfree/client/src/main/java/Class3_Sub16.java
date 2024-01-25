import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	private Class3_Sub16() {
	}

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub16(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString12 = arg0;
	}
}
