import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class29 {

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Z")
	public boolean aBoolean65 = true;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
	public final int anInt1332;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public final int anInt1326;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	public final int anInt1328;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
	public final int anInt1327;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
	public final int anInt1333;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	public final int anInt1324;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1332 = arg5;
		this.anInt1326 = arg0;
		this.aBoolean65 = arg6;
		this.anInt1328 = arg3;
		this.anInt1327 = arg2;
		this.anInt1333 = arg1;
		this.anInt1324 = arg4;
	}
}
