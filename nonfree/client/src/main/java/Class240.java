import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class240 {

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public final int anInt7401;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(II)V")
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7401 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
