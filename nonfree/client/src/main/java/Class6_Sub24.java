import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class6_Sub24 extends Class6 {

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	public int anInt4156;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	private Class6_Sub24() {
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
	public Class6_Sub24(@OriginalArg(0) int arg0) {
		this.anInt4156 = arg0;
	}
}
