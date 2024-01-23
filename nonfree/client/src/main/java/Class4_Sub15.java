import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class4_Sub15 extends Class4 {

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
	public int anInt1798;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
	public int anInt1796;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V")
	public Class4_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1798 = arg0;
		this.anInt1796 = arg1;
	}
}
