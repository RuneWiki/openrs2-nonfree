import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class64 {

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	private final int anInt1705;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public final int anInt1704;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(II)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1705 = arg0;
		this.anInt1704 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
	public int method1581() {
		return this.anInt1705;
	}
}
