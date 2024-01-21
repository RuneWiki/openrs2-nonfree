import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class38 {

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Z")
	public boolean aBoolean101 = true;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public final int anInt1404;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public final int anInt1403;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public final int anInt1407;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public final int anInt1401;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public final int anInt1406;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public final int anInt1405;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1404 = arg3;
		this.aBoolean101 = arg6;
		this.anInt1403 = arg0;
		this.anInt1407 = arg2;
		this.anInt1401 = arg5;
		this.anInt1406 = arg1;
		this.anInt1405 = arg4;
	}
}
