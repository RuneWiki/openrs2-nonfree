import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class215 {

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	private final int anInt6306;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(II)V")
	public Class215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6306 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I")
	public int method4926() {
		return this.anInt6306;
	}
}
