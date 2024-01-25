import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class91 implements Interface19 {

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	public final int anInt2796;

	static {
		new Class67(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class91(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2796 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
