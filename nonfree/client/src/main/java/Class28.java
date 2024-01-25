import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class28 {

	@OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
	public final int anInt653;

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
	public final int anInt657;

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
	public final int anInt656;

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
	public final int anInt654;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(IIII)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt653 = arg2;
		this.anInt657 = arg0;
		this.anInt656 = arg1;
		this.anInt654 = arg3;
	}

	@OriginalMember(owner = "client!baa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
