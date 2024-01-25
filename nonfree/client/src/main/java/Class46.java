import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class46 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	public final int anInt1234;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1234 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
