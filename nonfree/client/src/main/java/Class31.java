import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class31 {

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Z")
	public boolean aBoolean66 = true;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "I")
	public final int anInt1402;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "I")
	public final int anInt1401;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public final int anInt1392;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	public final int anInt1396;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "I")
	public final int anInt1395;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "I")
	public final int anInt1403;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1402 = arg1;
		this.anInt1401 = arg0;
		this.anInt1392 = arg4;
		this.aBoolean66 = arg6;
		this.anInt1396 = arg3;
		this.anInt1395 = arg2;
		this.anInt1403 = arg5;
	}
}
