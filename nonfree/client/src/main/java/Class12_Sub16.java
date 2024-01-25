import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class12_Sub16 extends Class12 {

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	private Class12_Sub16() {
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class12_Sub16(@OriginalArg(0) String arg0) {
		this.aString30 = arg0;
	}
}
