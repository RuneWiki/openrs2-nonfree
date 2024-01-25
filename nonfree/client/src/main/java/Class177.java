import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class177 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
	private final int anInt5257;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(II)V")
	public Class177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5257 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)I")
	public int method4037() {
		return this.anInt5257;
	}
}
