import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class163 {

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Z")
	public boolean aBoolean328 = true;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	public int anInt5297;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	public int anInt5291;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	public int anInt5290;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
	public int anInt5299;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
	public int anInt5298;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public int anInt5292;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt5297 = arg3;
		this.anInt5291 = arg0;
		this.anInt5290 = arg4;
		this.anInt5299 = arg5;
		this.anInt5298 = arg2;
		this.aBoolean328 = arg6;
		this.anInt5292 = arg1;
	}
}
