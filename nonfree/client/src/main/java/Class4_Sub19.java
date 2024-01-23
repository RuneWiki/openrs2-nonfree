import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public final class Class4_Sub19 extends Class4 {

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
	public int anInt2869;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public Class4_Sub19() {
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I)V")
	public Class4_Sub19(@OriginalArg(0) int arg0) {
		this.anInt2869 = arg0;
	}
}
