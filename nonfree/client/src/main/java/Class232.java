import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class232 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public final int anInt5969;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class232(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5969 = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
