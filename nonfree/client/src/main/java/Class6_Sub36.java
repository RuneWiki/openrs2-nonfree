import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class6_Sub36 extends Class6 {

	@OriginalMember(owner = "client!no", name = "r", descriptor = "I")
	public final int anInt6771;

	@OriginalMember(owner = "client!no", name = "n", descriptor = "I")
	public final int anInt6767;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "I")
	public final int anInt6770;

	@OriginalMember(owner = "client!no", name = "p", descriptor = "I")
	public final int anInt6769;

	@OriginalMember(owner = "client!no", name = "o", descriptor = "I")
	public final int anInt6768;

	@OriginalMember(owner = "client!no", name = "s", descriptor = "Z")
	public final boolean aBoolean509;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt6771 = arg1;
		this.anInt6767 = arg3;
		this.anInt6770 = arg2;
		this.anInt6769 = arg4;
		this.anInt6768 = arg0;
		this.aBoolean509 = arg5;
	}
}
