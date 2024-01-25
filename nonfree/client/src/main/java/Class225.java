import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class225 {

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public final int anInt5879;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	private final int anInt5883;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(II)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5879 = arg1;
		this.anInt5883 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
	public int method5268() {
		return this.anInt5883;
	}
}
