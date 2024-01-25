import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class220 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
	public final int anInt6224;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
	public Class220(@OriginalArg(0) int arg0) {
		this.anInt6224 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
