import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class6_Sub21 extends Class6 {

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	private Class6_Sub21() {
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub21(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString44 = arg0;
	}
}
