import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public final class Class4_Sub19 extends Class4 {

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	private Class4_Sub19() {
	}

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub19(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString31 = arg0;
	}
}
