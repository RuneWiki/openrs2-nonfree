import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class247 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	public final int anInt7282;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class247(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7282 = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)I")
	public int method5656() {
		return this.anInt7282;
	}
}
