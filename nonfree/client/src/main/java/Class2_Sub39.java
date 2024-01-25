import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
	public final int anInt5992;

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
	public final int anInt5993;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
	public final int anInt5989;

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "Z")
	public final boolean aBoolean529;

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
	public final int anInt5996;

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "I")
	public final int anInt5997;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5992 = arg1;
		this.anInt5993 = arg3;
		this.anInt5989 = arg4;
		this.aBoolean529 = arg5;
		this.anInt5996 = arg0;
		this.anInt5997 = arg2;
	}
}
