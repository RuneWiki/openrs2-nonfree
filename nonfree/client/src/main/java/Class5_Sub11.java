import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	public final int anInt1016;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public final int anInt1017;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
	public Class5_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1016 = arg1;
		this.anInt1017 = arg0;
	}
}
