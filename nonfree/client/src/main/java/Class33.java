import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SIRALZSN")
public final class Class33 {

	@OriginalMember(owner = "client!SIRALZSN", name = "f", descriptor = "Z")
	public boolean aBoolean118 = true;

	@OriginalMember(owner = "client!SIRALZSN", name = "a", descriptor = "I")
	public int anInt418;

	@OriginalMember(owner = "client!SIRALZSN", name = "b", descriptor = "I")
	public int anInt419;

	@OriginalMember(owner = "client!SIRALZSN", name = "c", descriptor = "I")
	public int anInt420;

	@OriginalMember(owner = "client!SIRALZSN", name = "d", descriptor = "I")
	public int anInt421;

	@OriginalMember(owner = "client!SIRALZSN", name = "e", descriptor = "I")
	public int anInt422;

	@OriginalMember(owner = "client!SIRALZSN", name = "g", descriptor = "I")
	public int anInt423;

	@OriginalMember(owner = "client!SIRALZSN", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt418 = arg0;
		this.anInt419 = arg1;
		this.anInt420 = arg2;
		this.anInt421 = arg3;
		this.anInt422 = arg4;
		this.anInt423 = arg5;
		this.aBoolean118 = arg6;
	}
}
