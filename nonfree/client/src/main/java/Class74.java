import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public final class Class74 {

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
	public final int anInt2269;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(I)V")
	public Class74(@OriginalArg(0) int arg0) {
		this.anInt2269 = arg0;
	}

	@OriginalMember(owner = "client!dea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
