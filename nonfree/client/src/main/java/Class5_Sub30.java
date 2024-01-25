import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class5_Sub30 extends Class5 {

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "Ljava/lang/String;")
	public String aString227;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	private Class5_Sub30() {
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub30(@OriginalArg(0) String arg0) {
		this.aString227 = arg0;
	}
}
