import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class42 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Z")
	public boolean aBoolean89 = true;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public final int anInt1846;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	public final int anInt1852;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	public final int anInt1853;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public final int anInt1847;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	public final int anInt1849;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public final int anInt1848;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1846 = arg3;
		this.anInt1852 = arg1;
		this.anInt1853 = arg0;
		this.anInt1847 = arg5;
		this.aBoolean89 = arg6;
		this.anInt1849 = arg2;
		this.anInt1848 = arg4;
	}
}
