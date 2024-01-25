import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class239 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public final int anInt6113;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
	public Class239(@OriginalArg(0) int arg0) {
		this.anInt6113 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
