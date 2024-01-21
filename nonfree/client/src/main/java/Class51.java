import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class51 {

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Z")
	public boolean aBoolean91 = true;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public final int anInt1637;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	public final int anInt1638;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
	public final int anInt1643;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public final int anInt1633;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	public final int anInt1644;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public final int anInt1636;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1637 = arg0;
		this.anInt1638 = arg3;
		this.anInt1643 = arg5;
		this.anInt1633 = arg4;
		this.anInt1644 = arg1;
		this.aBoolean91 = arg6;
		this.anInt1636 = arg2;
	}
}
