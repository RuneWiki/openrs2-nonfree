import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ima")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!ima", name = "m", descriptor = "I")
	public final int anInt4371;

	@OriginalMember(owner = "client!ima", name = "o", descriptor = "I")
	public int anInt4369;

	@OriginalMember(owner = "client!ima", name = "<init>", descriptor = "(II)V")
	public Class3_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4371 = arg0;
		this.anInt4369 = arg1;
	}
}
