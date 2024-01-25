import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class65 implements Interface9 {

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
	public final int anInt2081;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class65(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2081 = arg1;
	}

	@OriginalMember(owner = "client!dw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
