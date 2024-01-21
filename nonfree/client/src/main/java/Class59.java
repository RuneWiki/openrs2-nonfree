import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class59 {

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Z")
	public boolean aBoolean101 = true;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
	public final int anInt2323;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
	public final int anInt2322;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	public final int anInt2317;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	public final int anInt2319;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public final int anInt2314;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	public final int anInt2321;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2323 = arg4;
		this.anInt2322 = arg3;
		this.anInt2317 = arg2;
		this.anInt2319 = arg0;
		this.anInt2314 = arg1;
		this.anInt2321 = arg5;
		this.aBoolean101 = arg6;
	}
}
