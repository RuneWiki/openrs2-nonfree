import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public final class Class261 implements Interface5 {

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
	public final int anInt7215;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class261(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7215 = arg1;
	}

	@OriginalMember(owner = "client!pw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
