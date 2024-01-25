import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public final class Class2_Sub47 extends Class2 {

	@OriginalMember(owner = "client!pba", name = "m", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "()V")
	private Class2_Sub47() {
	}

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub47(@OriginalArg(0) String arg0) {
		this.aString88 = arg0;
	}
}
