import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class27 {

	@OriginalMember(owner = "client!id", name = "y", descriptor = "Z")
	public boolean aBoolean72 = true;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	public final int anInt1464;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "I")
	public final int anInt1466;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public final int anInt1461;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "I")
	public final int anInt1465;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	public final int anInt1469;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public final int anInt1459;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean72 = arg6;
		this.anInt1464 = arg1;
		this.anInt1466 = arg0;
		this.anInt1461 = arg4;
		this.anInt1465 = arg3;
		this.anInt1469 = arg5;
		this.anInt1459 = arg2;
	}
}
