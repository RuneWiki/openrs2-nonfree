import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class44 {

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
	public final int anInt1111;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1111 = arg0;
	}

	@OriginalMember(owner = "client!cu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
