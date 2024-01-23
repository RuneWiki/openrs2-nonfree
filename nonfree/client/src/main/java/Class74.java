import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class74 {

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
	public boolean aBoolean149 = true;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public int anInt2046;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	public int anInt2053;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public int anInt2049;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public int anInt2048;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	public int anInt2045;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	public int anInt2047;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2046 = arg3;
		this.anInt2053 = arg4;
		this.anInt2049 = arg5;
		this.anInt2048 = arg2;
		this.anInt2045 = arg1;
		this.aBoolean149 = arg6;
		this.anInt2047 = arg0;
	}
}
