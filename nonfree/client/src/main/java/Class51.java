import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class51 {

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Z")
	public boolean aBoolean130 = true;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	public final int anInt2560;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	public final int anInt2556;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	public final int anInt2548;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
	public final int anInt2555;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	public final int anInt2557;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public final int anInt2552;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean130 = arg6;
		this.anInt2560 = arg0;
		this.anInt2556 = arg1;
		this.anInt2548 = arg4;
		this.anInt2555 = arg3;
		this.anInt2557 = arg2;
		this.anInt2552 = arg5;
	}
}
