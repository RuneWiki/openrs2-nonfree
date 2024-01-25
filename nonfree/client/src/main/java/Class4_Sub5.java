import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	public final int anInt698;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
	public final int anInt697;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(II)V")
	public Class4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt698 = arg0;
		this.anInt697 = arg1;
	}
}
