import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
	public final int anInt2287;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(I)V")
	public Class21_Sub2(@OriginalArg(0) int arg0) {
		this.anInt2287 = arg0;
	}
}
