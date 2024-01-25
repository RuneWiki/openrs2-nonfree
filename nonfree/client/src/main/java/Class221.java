import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class221 {

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	public final int anInt6863;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	private final int anInt6869;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(II)V")
	public Class221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6863 = arg1;
		this.anInt6869 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)I")
	public int method5737() {
		return this.anInt6869;
	}

	@OriginalMember(owner = "client!wl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
