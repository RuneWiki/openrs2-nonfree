import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public final class Class244 {

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
	public final int anInt7387;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(I)V")
	public Class244(@OriginalArg(0) int arg0) {
		this.anInt7387 = arg0;
	}

	@OriginalMember(owner = "client!nea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
