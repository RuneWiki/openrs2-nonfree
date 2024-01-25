import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	public final int anInt537;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
	public final int anInt536;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(II)V")
	public Class6_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt537 = arg0;
		this.anInt536 = arg1;
	}
}
