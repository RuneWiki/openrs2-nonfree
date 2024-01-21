import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class60 {

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Z")
	public boolean aBoolean75 = true;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	public final int anInt1899;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public final int anInt1900;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public final int anInt1891;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public final int anInt1895;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public final int anInt1897;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public final int anInt1892;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1899 = arg3;
		this.anInt1900 = arg0;
		this.anInt1891 = arg1;
		this.aBoolean75 = arg6;
		this.anInt1895 = arg5;
		this.anInt1897 = arg2;
		this.anInt1892 = arg4;
	}
}
