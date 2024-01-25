import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class84 implements Interface8 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
	public final int anInt2059;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class84(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2059 = arg1;
	}

	@OriginalMember(owner = "client!ej", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
