import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class349 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public final int anInt9176;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	private final int anInt9177;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(II)V")
	public Class349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9176 = arg1;
		this.anInt9177 = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)I")
	public int method7331() {
		return this.anInt9177;
	}

	@OriginalMember(owner = "client!vg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
