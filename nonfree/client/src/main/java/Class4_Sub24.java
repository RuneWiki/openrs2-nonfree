import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public final class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!ija", name = "h", descriptor = "I")
	public int anInt4156;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "()V")
	private Class4_Sub24() {
	}

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(I)V")
	public Class4_Sub24(@OriginalArg(0) int arg0) {
		this.anInt4156 = arg0;
	}
}
