import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class254 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
	private final int anInt7537;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(II)V")
	public Class254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7537 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)I")
	public int method5804() {
		return this.anInt7537;
	}

	@OriginalMember(owner = "client!vp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
