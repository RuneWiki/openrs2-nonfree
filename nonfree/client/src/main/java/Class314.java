import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public final class Class314 {

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString110;

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
	public final int anInt8647;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class314(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString110 = arg0;
		this.anInt8647 = arg1;
	}

	@OriginalMember(owner = "client!uea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
