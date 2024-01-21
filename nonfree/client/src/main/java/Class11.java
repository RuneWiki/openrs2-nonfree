import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class11 {

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Z")
	public boolean aBoolean13 = true;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	public final int anInt421;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
	public final int anInt424;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public final int anInt422;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
	public final int anInt431;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
	public final int anInt429;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
	public final int anInt430;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean13 = arg6;
		this.anInt421 = arg2;
		this.anInt424 = arg4;
		this.anInt422 = arg5;
		this.anInt431 = arg0;
		this.anInt429 = arg3;
		this.anInt430 = arg1;
	}
}
