import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class67 {

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public final int anInt1264;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	private final int anInt1262;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V")
	public Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1264 = arg1;
		this.anInt1262 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
	public int method1107() {
		return this.anInt1262;
	}

	@OriginalMember(owner = "client!eh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
