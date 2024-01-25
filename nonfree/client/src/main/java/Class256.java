import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class256 {

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
	public final int anInt7552;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class256(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7552 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I")
	public int method5764() {
		return this.anInt7552;
	}
}
