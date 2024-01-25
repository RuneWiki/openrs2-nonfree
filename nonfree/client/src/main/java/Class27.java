import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public final class Class27 {

	@OriginalMember(owner = "client!bja", name = "f", descriptor = "I")
	public final int anInt884;

	@OriginalMember(owner = "client!bja", name = "e", descriptor = "I")
	public final int anInt883;

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "I")
	public final int anInt882;

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "I")
	public final int anInt880;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(IIII)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt884 = arg2;
		this.anInt883 = arg0;
		this.anInt882 = arg1;
		this.anInt880 = arg3;
	}

	@OriginalMember(owner = "client!bja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
