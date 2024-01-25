import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class6_Sub28 extends Class6 {

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
	private Class6_Sub28() {
	}

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub28(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString56 = arg0;
	}
}
