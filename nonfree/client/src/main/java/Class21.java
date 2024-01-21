import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class21 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Z")
	public boolean aBoolean127 = true;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
	public final int anInt1640;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
	public final int anInt1642;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public final int anInt1635;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
	public final int anInt1637;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
	public final int anInt1641;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	public final int anInt1638;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1640 = arg3;
		this.aBoolean127 = arg6;
		this.anInt1642 = arg2;
		this.anInt1635 = arg1;
		this.anInt1637 = arg4;
		this.anInt1641 = arg0;
		this.anInt1638 = arg5;
	}
}
