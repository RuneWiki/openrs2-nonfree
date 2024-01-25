import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class186 implements Interface5 {

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	public final int anInt5418;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class186(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5418 = arg1;
	}

	@OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
