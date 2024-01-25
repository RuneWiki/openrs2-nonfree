import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public final class Class267 {

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
	public final int anInt7238;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(I)V")
	public Class267(@OriginalArg(0) int arg0) {
		this.anInt7238 = arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
