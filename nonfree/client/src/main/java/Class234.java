import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public final class Class234 {

	@OriginalMember(owner = "client!mja", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "I")
	public final int anInt5621;

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class234(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.aString72 = arg0;
		this.anInt5621 = arg2;
	}

	@OriginalMember(owner = "client!mja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
