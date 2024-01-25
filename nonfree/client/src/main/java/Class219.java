import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class219 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
	public final int anInt5809;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(I)V")
	public Class219(@OriginalArg(0) int arg0) {
		this.anInt5809 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
