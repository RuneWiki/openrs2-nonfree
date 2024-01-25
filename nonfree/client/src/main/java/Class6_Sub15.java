import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class6_Sub15 extends Class6 {

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
	public final int anInt2629;

	@OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
	public final int anInt2630;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(II)V")
	public Class6_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2629 = arg0;
		this.anInt2630 = arg1;
	}
}
