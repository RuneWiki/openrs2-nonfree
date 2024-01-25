import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	public int anInt4057;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	private Class4_Sub24() {
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
	public Class4_Sub24(@OriginalArg(0) int arg0) {
		this.anInt4057 = arg0;
	}
}
