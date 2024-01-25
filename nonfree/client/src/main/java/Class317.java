import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class317 {

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	public final int anInt9454;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class317(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt9454 = arg1;
	}

	@OriginalMember(owner = "client!sk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
	public int method7864() {
		return this.anInt9454;
	}
}
