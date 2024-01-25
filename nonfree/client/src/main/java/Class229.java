import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class229 {

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
	public final int anInt6908;

	@OriginalMember(owner = "client!mca", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString84;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class229(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6908 = arg1;
		this.aString84 = arg0;
	}

	@OriginalMember(owner = "client!mca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
