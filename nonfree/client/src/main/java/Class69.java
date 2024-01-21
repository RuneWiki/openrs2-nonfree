import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class69 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Z")
	public boolean aBoolean109 = true;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public final int anInt2369;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public final int anInt2376;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	public final int anInt2370;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	public final int anInt2375;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	public final int anInt2371;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	public final int anInt2373;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2369 = arg1;
		this.anInt2376 = arg5;
		this.aBoolean109 = arg6;
		this.anInt2370 = arg0;
		this.anInt2375 = arg4;
		this.anInt2371 = arg3;
		this.anInt2373 = arg2;
	}
}
