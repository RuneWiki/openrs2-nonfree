import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class212 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	public final int anInt5877;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V")
	public Class212(@OriginalArg(0) int arg0) {
		this.anInt5877 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
