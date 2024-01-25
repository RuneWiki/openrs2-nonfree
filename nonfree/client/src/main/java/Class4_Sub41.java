import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class4_Sub41 extends Class4 {

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
	public int anInt6968;

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
	public final int anInt6970;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(II)V")
	public Class4_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6968 = arg1;
		this.anInt6970 = arg0;
	}
}
