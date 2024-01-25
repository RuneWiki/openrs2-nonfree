import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class265 implements Interface1 {

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
	public final int anInt6903;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class265(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6903 = arg1;
	}

	@OriginalMember(owner = "client!vo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
