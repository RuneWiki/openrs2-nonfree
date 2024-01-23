import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class111 {

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Z")
	public boolean aBoolean191 = true;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	public int anInt4059;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "I")
	public int anInt4065;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "I")
	public int anInt4062;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	public int anInt4056;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	public int anInt4053;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	public int anInt4055;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4059 = arg0;
		this.aBoolean191 = arg6;
		this.anInt4065 = arg4;
		this.anInt4062 = arg2;
		this.anInt4056 = arg3;
		this.anInt4053 = arg5;
		this.anInt4055 = arg1;
	}
}
