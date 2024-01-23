import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	public int anInt2222;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public int anInt2216;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(II)V")
	public Class4_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2222 = arg0;
		this.anInt2216 = arg1;
	}
}
