import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class5_Sub36 extends Class5 {

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	private Class5_Sub36() {
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub36(@OriginalArg(0) String arg0) {
		this.aString106 = arg0;
	}
}
