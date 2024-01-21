import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class31 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	public final int anInt1454;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	public final int anInt1451;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public final int anInt1453;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "I")
	public final int anInt1465;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	public final int anInt1456;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "I")
	public final int anInt1464;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1454 = arg3;
		this.anInt1451 = arg2;
		this.anInt1453 = arg4;
		this.anInt1465 = arg0;
		this.aBoolean95 = arg6;
		this.anInt1456 = arg5;
		this.anInt1464 = arg1;
	}
}
