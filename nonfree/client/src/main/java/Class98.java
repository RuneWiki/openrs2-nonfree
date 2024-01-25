import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class98 {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public final int anInt2737;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	private final int anInt2742;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
	public Class98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2737 = arg1;
		this.anInt2742 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I")
	public int method2336() {
		return this.anInt2742;
	}
}
