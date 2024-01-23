import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
	public int anInt2279;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
	public int anInt2278;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V")
	public Class2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2279 = arg1;
		this.anInt2278 = arg0;
	}
}
