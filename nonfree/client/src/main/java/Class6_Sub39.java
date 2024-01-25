import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class6_Sub39 extends Class6 {

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
	public int anInt6429;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	private Class6_Sub39() {
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(I)V")
	public Class6_Sub39(@OriginalArg(0) int arg0) {
		this.anInt6429 = arg0;
	}
}
