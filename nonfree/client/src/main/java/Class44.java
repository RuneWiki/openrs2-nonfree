import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class44 {

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Z")
	public boolean aBoolean82 = true;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public final int anInt1738;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	public final int anInt1747;

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
	public final int anInt1748;

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
	public final int anInt1749;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public final int anInt1737;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
	public final int anInt1746;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1738 = arg4;
		this.aBoolean82 = arg6;
		this.anInt1747 = arg0;
		this.anInt1748 = arg3;
		this.anInt1749 = arg1;
		this.anInt1737 = arg5;
		this.anInt1746 = arg2;
	}
}
