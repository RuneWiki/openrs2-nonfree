import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class42 {

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	public final int anInt1131;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Class42(@OriginalArg(0) int arg0) {
		this.anInt1131 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
