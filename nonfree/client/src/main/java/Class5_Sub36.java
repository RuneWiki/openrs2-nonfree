import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class5_Sub36 extends Class5 {

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "Ljava/lang/String;")
	public String aString90;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V")
	private Class5_Sub36() {
	}

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class5_Sub36(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString90 = arg0;
	}
}
