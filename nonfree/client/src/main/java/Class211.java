import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class211 {

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
	public final int anInt5793;

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class211(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5793 = arg1;
		this.aString77 = arg0;
	}

	@OriginalMember(owner = "client!mea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
