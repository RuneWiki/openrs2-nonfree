import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
	public int anInt2696;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	private Class3_Sub19() {
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V")
	public Class3_Sub19(@OriginalArg(0) int arg0) {
		this.anInt2696 = arg0;
	}
}
