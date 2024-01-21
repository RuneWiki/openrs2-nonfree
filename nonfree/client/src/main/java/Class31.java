import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!REDJECON")
public final class Class31 {

	@OriginalMember(owner = "client!REDJECON", name = "f", descriptor = "Z")
	public boolean aBoolean141 = true;

	@OriginalMember(owner = "client!REDJECON", name = "a", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!REDJECON", name = "b", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!REDJECON", name = "c", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!REDJECON", name = "d", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!REDJECON", name = "e", descriptor = "I")
	public int anInt444;

	@OriginalMember(owner = "client!REDJECON", name = "g", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!REDJECON", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt440 = arg0;
		this.anInt441 = arg1;
		this.anInt442 = arg2;
		this.anInt443 = arg3;
		this.anInt444 = arg4;
		this.anInt445 = arg5;
		this.aBoolean141 = arg6;
	}
}
