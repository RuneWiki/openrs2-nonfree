import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class36 {

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	public boolean aBoolean86 = true;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	public int anInt1465;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public int anInt1462;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	public int anInt1460;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	public int anInt1459;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public int anInt1467;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	public int anInt1466;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1465 = arg2;
		this.anInt1462 = arg4;
		this.anInt1460 = arg5;
		this.aBoolean86 = arg6;
		this.anInt1459 = arg3;
		this.anInt1467 = arg0;
		this.anInt1466 = arg1;
	}
}
