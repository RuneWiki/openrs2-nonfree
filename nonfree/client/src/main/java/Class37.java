import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class37 {

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
	public final int anInt764;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	public final int anInt762;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public final int anInt763;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
	public final int anInt768;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IIII)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt764 = arg2;
		this.anInt762 = arg3;
		this.anInt763 = arg0;
		this.anInt768 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
