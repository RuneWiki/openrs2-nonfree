import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public final class Class251 {

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
	private final int anInt7039;

	@OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
	public final int anInt7040;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(II)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7039 = arg0;
		this.anInt7040 = arg1;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)I")
	public int method6136() {
		return this.anInt7039;
	}

	@OriginalMember(owner = "client!nha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
