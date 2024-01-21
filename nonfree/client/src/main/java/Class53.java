import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class53 {

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Z")
	public boolean aBoolean138 = true;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public final int anInt2297;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	public final int anInt2294;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	public final int anInt2300;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public final int anInt2291;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
	public final int anInt2298;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public final int anInt2295;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2297 = arg0;
		this.aBoolean138 = arg6;
		this.anInt2294 = arg1;
		this.anInt2300 = arg2;
		this.anInt2291 = arg4;
		this.anInt2298 = arg3;
		this.anInt2295 = arg5;
	}
}
