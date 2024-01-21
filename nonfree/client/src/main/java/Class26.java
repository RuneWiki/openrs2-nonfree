import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class26 {

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Z")
	public boolean aBoolean47 = true;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	public final int anInt874;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "I")
	public final int anInt881;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public final int anInt877;

	@OriginalMember(owner = "client!h", name = "x", descriptor = "I")
	public final int anInt885;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public final int anInt878;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "I")
	public final int anInt883;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt874 = arg3;
		this.anInt881 = arg2;
		this.aBoolean47 = arg6;
		this.anInt877 = arg1;
		this.anInt885 = arg4;
		this.anInt878 = arg5;
		this.anInt883 = arg0;
	}
}
