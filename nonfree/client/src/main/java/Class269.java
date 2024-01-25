import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public final class Class269 implements Interface7 {

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
	public final int anInt7310;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class269(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7310 = arg1;
	}

	@OriginalMember(owner = "client!qfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
