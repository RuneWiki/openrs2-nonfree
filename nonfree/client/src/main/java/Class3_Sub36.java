import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!op", name = "r", descriptor = "I")
	public final int anInt6680;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	public final int anInt6674;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "Z")
	public final boolean aBoolean425;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "I")
	public final int anInt6681;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "I")
	public final int anInt6682;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "I")
	public final int anInt6683;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt6680 = arg3;
		this.anInt6674 = arg1;
		this.aBoolean425 = arg5;
		this.anInt6681 = arg0;
		this.anInt6682 = arg2;
		this.anInt6683 = arg4;
	}
}
