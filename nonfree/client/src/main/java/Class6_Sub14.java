import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
	public final int anInt2255;

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
	public int anInt2253;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(II)V")
	public Class6_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2255 = arg0;
		this.anInt2253 = arg1;
	}
}
