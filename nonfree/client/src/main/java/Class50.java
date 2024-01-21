import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class50 {

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Z")
	public boolean aBoolean86 = true;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
	public final int anInt1927;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
	public final int anInt1935;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public final int anInt1932;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public final int anInt1936;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
	public final int anInt1928;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public final int anInt1925;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1927 = arg2;
		this.aBoolean86 = arg6;
		this.anInt1935 = arg4;
		this.anInt1932 = arg1;
		this.anInt1936 = arg5;
		this.anInt1928 = arg3;
		this.anInt1925 = arg0;
	}
}
