import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class68 {

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
	public final int anInt1398;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(I)V")
	public Class68(@OriginalArg(0) int arg0) {
		this.anInt1398 = arg0;
	}

	@OriginalMember(owner = "client!cw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
