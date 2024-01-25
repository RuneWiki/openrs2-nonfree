import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class248 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	public final int anInt7303;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class248(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7303 = arg1;
	}

	@OriginalMember(owner = "client!ui", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
