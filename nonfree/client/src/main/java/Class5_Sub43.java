import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class5_Sub43 extends Class5 {

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Ljava/lang/String;")
	public String aString126;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	private Class5_Sub43() {
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class5_Sub43(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString126 = arg0;
	}
}
