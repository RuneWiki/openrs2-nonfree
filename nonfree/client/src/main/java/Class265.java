import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class265 {

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
	public final int anInt6963;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(I)V")
	public Class265(@OriginalArg(0) int arg0) {
		this.anInt6963 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
