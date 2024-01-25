import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
	public int anInt2197;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class4_Sub16() {
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
	public Class4_Sub16(@OriginalArg(0) int arg0) {
		this.anInt2197 = arg0;
	}
}
