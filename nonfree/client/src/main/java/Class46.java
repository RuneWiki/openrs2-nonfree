import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class46 {

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public final int anInt1164;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	private final int anInt1161;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(II)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1164 = arg1;
		this.anInt1161 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)I")
	public int method982() {
		return this.anInt1161;
	}

	@OriginalMember(owner = "client!cb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
