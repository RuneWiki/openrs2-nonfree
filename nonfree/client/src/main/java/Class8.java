import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class8 {

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "Z")
	public boolean aBoolean25 = true;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
	public int anInt282;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public int anInt279;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
	public int anInt285;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
	public int anInt276;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public int anInt278;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	public int anInt277;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt282 = arg5;
		this.anInt279 = arg4;
		this.anInt285 = arg2;
		this.anInt276 = arg0;
		this.anInt278 = arg3;
		this.anInt277 = arg1;
		this.aBoolean25 = arg6;
	}
}
