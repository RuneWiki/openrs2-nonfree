import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class54 {

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	private final int anInt1460;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(II)V")
	public Class54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1460 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I")
	public int method1251() {
		return this.anInt1460;
	}
}
