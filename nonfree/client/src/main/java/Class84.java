import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class84 implements Interface1 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "I")
	public final int anInt2516;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class84(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2516 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
