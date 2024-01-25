import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class360 {

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
	public final int anInt9539;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class360(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt9539 = arg1;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)I")
	public int method7931() {
		return this.anInt9539;
	}

	@OriginalMember(owner = "client!wl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
