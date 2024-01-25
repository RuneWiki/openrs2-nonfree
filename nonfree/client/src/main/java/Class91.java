import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class91 implements Interface4 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	public final int anInt2185;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class91(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2185 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
