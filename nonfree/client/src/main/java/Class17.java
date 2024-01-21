import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class17 {

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public final int anInt854;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public final int anInt851;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
	public final int anInt855;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
	public final int anInt857;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
	public final int anInt850;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public final int anInt852;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean32 = arg6;
		this.anInt854 = arg1;
		this.anInt851 = arg5;
		this.anInt855 = arg3;
		this.anInt857 = arg0;
		this.anInt850 = arg2;
		this.anInt852 = arg4;
	}
}
