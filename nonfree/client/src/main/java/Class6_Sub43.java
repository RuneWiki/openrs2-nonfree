import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class6_Sub43 extends Class6 {

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	public int anInt6289;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	private Class6_Sub43() {
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(I)V")
	public Class6_Sub43(@OriginalArg(0) int arg0) {
		this.anInt6289 = arg0;
	}
}
