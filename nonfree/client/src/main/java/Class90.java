import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class90 {

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
	public final int anInt2417;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(I)V")
	public Class90(@OriginalArg(0) int arg0) {
		this.anInt2417 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
