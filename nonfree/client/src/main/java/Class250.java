import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public final class Class250 {

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
	public final int anInt7253;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(I)V")
	public Class250(@OriginalArg(0) int arg0) {
		this.anInt7253 = arg0;
	}

	@OriginalMember(owner = "client!oea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
