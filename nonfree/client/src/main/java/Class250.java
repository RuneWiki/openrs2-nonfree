import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class250 {

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public final int anInt7790;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	public Class250(@OriginalArg(0) int arg0) {
		this.anInt7790 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
