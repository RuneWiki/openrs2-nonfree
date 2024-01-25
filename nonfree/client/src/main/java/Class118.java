import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class118 {

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
	public final int anInt2992;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
	public Class118(@OriginalArg(0) int arg0) {
		this.anInt2992 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
