import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
	public int anInt1717;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
	public final int anInt1715;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V", line = 6)
	public Class2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1717 = arg1;
		this.anInt1715 = arg0;
	}
}
