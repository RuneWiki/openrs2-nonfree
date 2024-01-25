import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	public final int anInt719;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
	public final int anInt718;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(II)V")
	public Class5_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt719 = arg0;
		this.anInt718 = arg1;
	}
}
