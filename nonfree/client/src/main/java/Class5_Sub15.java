import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class5_Sub15 extends Class5 {

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
	public final int anInt2420;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
	public int anInt2422;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(II)V")
	public Class5_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2420 = arg0;
		this.anInt2422 = arg1;
	}
}
