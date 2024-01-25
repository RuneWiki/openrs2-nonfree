import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class73 {

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
	public final int anInt1861;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
	private final int anInt1858;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(II)V")
	public Class73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1861 = arg1;
		this.anInt1858 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)I")
	public int method1751() {
		return this.anInt1858;
	}
}
