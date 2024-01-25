import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public final class Class286 {

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
	public final int anInt7942;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
	private final int anInt7939;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(II)V")
	public Class286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7942 = arg1;
		this.anInt7939 = arg0;
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)I")
	public int method6508() {
		return this.anInt7939;
	}

	@OriginalMember(owner = "client!rga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
