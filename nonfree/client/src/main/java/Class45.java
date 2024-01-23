import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class45 {

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Z")
	public boolean aBoolean111 = true;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public int anInt2108;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
	public int anInt2109;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public int anInt2110;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	public int anInt2114;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	public int anInt2112;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2108 = arg3;
		this.aBoolean111 = arg6;
		this.anInt2109 = arg0;
		this.anInt2115 = arg1;
		this.anInt2110 = arg4;
		this.anInt2114 = arg5;
		this.anInt2112 = arg2;
	}
}
