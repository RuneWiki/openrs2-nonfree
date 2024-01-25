import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class239 implements Interface1 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	public final int anInt6649;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class239(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6649 = arg1;
	}

	@OriginalMember(owner = "client!mo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
