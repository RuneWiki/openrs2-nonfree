import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public final class Class6_Sub48 extends Class6 {

	@OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
	public int anInt9611;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V")
	private Class6_Sub48() {
	}

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(I)V")
	public Class6_Sub48(@OriginalArg(0) int arg0) {
		this.anInt9611 = arg0;
	}
}
