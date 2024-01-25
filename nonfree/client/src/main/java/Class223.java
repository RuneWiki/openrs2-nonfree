import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class223 implements Interface13 {

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	public final int anInt6054;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class223(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6054 = arg1;
	}

	@OriginalMember(owner = "client!ml", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
