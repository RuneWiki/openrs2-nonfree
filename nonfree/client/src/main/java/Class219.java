import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class219 {

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public final int anInt6234;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class219(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6234 = arg1;
	}

	@OriginalMember(owner = "client!rj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
