import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class23 {

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public final int anInt388;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
	public Class23(@OriginalArg(0) int arg0) {
		this.anInt388 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
