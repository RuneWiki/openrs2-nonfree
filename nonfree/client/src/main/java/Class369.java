import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class369 {

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
	public final int anInt9894;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(II)V")
	public Class369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9894 = arg1;
	}

	@OriginalMember(owner = "client!uu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
