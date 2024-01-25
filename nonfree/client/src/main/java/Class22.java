import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class22 {

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public final int anInt468;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
	private final int anInt467;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(II)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt468 = arg1;
		this.anInt467 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
	public int method527() {
		return this.anInt467;
	}
}
