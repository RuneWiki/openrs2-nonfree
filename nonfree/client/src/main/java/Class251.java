import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public final class Class251 {

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
	public final int anInt7941;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(I)V")
	public Class251(@OriginalArg(0) int arg0) {
		this.anInt7941 = arg0;
	}

	@OriginalMember(owner = "client!pea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
