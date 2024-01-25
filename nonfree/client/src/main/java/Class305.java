import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class305 {

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	public final int anInt9059;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	private final int anInt9061;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V")
	public Class305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9059 = arg1;
		this.anInt9061 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)I")
	public int method7835() {
		return this.anInt9061;
	}
}
