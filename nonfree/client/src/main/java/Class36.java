import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public final class Class36 {

	@OriginalMember(owner = "client!bja", name = "f", descriptor = "I")
	public final int anInt1130;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(I)V")
	public Class36(@OriginalArg(0) int arg0) {
		this.anInt1130 = arg0;
	}

	@OriginalMember(owner = "client!bja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
