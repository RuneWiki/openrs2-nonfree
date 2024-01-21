import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class106 {

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Z")
	public boolean aBoolean184 = true;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	public final int anInt4097;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public final int anInt4098;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	public final int anInt4096;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	public final int anInt4091;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "I")
	public final int anInt4090;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "I")
	public final int anInt4089;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4097 = arg0;
		this.anInt4098 = arg3;
		this.anInt4096 = arg4;
		this.anInt4091 = arg1;
		this.anInt4090 = arg2;
		this.anInt4089 = arg5;
		this.aBoolean184 = arg6;
	}
}
