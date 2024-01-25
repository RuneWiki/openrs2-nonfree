import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class63 {

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
	public final int anInt1356;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
	public final int anInt1357;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
	public final int anInt1354;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	public final int anInt1355;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(IIII)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1356 = arg0;
		this.anInt1357 = arg3;
		this.anInt1354 = arg2;
		this.anInt1355 = arg1;
	}

	@OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
