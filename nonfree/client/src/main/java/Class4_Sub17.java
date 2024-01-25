import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	public final int anInt2286;

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	public final int anInt2288;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
	public final int anInt2291;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
	public final int anInt2289;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Z")
	public final boolean aBoolean155;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public final int anInt2287;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class4_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt2286 = arg1;
		this.anInt2288 = arg0;
		this.anInt2291 = arg3;
		this.anInt2289 = arg2;
		this.aBoolean155 = arg5;
		this.anInt2287 = arg4;
	}
}
