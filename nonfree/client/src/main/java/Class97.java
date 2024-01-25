import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class97 {

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	public final int anInt2128;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class97(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2128 = arg1;
	}

	@OriginalMember(owner = "client!el", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)I")
	public int method1932() {
		return this.anInt2128;
	}
}
