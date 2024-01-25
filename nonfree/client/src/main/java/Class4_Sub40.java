import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class4_Sub40 extends Class4 {

	@OriginalMember(owner = "client!un", name = "t", descriptor = "I")
	public final int anInt6419;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	public final int anInt6417;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(II)V")
	public Class4_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6419 = arg1;
		this.anInt6417 = arg0;
	}
}
