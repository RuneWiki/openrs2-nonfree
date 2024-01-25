import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class166 {

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public final int anInt4193;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class166(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4193 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
