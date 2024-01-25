import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public final class Class47 {

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
	private final int anInt1284;

	@OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
	public final int anInt1283;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(II)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1284 = arg0;
		this.anInt1283 = arg1;
	}

	@OriginalMember(owner = "client!cga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)I")
	public int method1264() {
		return this.anInt1284;
	}
}
