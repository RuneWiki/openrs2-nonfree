import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public final class Class240 {

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
	public final int anInt6436;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
	private final int anInt6440;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(II)V")
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6436 = arg1;
		this.anInt6440 = arg0;
	}

	@OriginalMember(owner = "client!mw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)I")
	public int method5402() {
		return this.anInt6440;
	}
}
