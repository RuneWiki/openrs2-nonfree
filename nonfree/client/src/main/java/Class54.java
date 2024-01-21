import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class54 {

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Z")
	public boolean aBoolean93 = true;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	public final int anInt2165;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	public final int anInt2175;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
	public final int anInt2173;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	public final int anInt2169;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
	public final int anInt2174;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public final int anInt2170;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2165 = arg3;
		this.aBoolean93 = arg6;
		this.anInt2175 = arg1;
		this.anInt2173 = arg0;
		this.anInt2169 = arg2;
		this.anInt2174 = arg5;
		this.anInt2170 = arg4;
	}
}
