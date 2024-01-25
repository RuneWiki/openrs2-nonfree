import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class314 {

	@OriginalMember(owner = "client!st", name = "g", descriptor = "I")
	public final int anInt8959;

	@OriginalMember(owner = "client!st", name = "f", descriptor = "I")
	private final int anInt8958;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(II)V")
	public Class314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8959 = arg1;
		this.anInt8958 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)I")
	public int method7690() {
		return this.anInt8958;
	}

	@OriginalMember(owner = "client!st", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
