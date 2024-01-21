import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class27 {

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public final int anInt1058;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "I")
	public final int anInt1064;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "I")
	public final int anInt1066;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "I")
	public final int anInt1063;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "I")
	public final int anInt1067;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "I")
	public final int anInt1060;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1058 = arg1;
		this.anInt1064 = arg2;
		this.anInt1066 = arg5;
		this.anInt1063 = arg3;
		this.anInt1067 = arg0;
		this.anInt1060 = arg4;
		this.aBoolean32 = arg6;
	}
}
