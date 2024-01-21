import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class11 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Z")
	public boolean aBoolean18 = true;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	public final int anInt377;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public final int anInt369;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	public final int anInt372;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	public final int anInt368;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public final int anInt375;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public final int anInt371;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean18 = arg6;
		this.anInt377 = arg2;
		this.anInt369 = arg4;
		this.anInt372 = arg0;
		this.anInt368 = arg1;
		this.anInt375 = arg5;
		this.anInt371 = arg3;
	}
}
