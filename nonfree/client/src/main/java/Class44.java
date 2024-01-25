import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class44 {

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
	public final int anInt1088;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class44(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1088 = arg1;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)I")
	public int method951() {
		return this.anInt1088;
	}

	@OriginalMember(owner = "client!cv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
