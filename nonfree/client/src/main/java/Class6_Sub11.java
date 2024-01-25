import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public final class Class6_Sub11 extends Class6 {

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
	public final int anInt1918;

	@OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
	public final int anInt1919;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(II)V")
	public Class6_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1918 = arg0;
		this.anInt1919 = arg1;
	}
}
