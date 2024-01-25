import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class181 {

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "I")
	private final int anInt5330;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(II)V")
	public Class181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5330 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)I")
	public int method4574() {
		return this.anInt5330;
	}
}
