import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class237 {

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public final int anInt6945;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	private final int anInt6942;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(II)V")
	public Class237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6945 = arg1;
		this.anInt6942 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)I")
	public int method5430() {
		return this.anInt6942;
	}
}
