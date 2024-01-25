import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class153 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public final int anInt4625;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(II)V")
	public Class153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4625 = arg1;
	}

	@OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
