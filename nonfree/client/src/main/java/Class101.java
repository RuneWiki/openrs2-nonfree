import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class101 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public final int anInt2782;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class101(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2782 = arg1;
		this.aString23 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
