import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class5_Sub45 extends Class5 {

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
	public final int anInt7218;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
	public final int anInt7221;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(II)V")
	public Class5_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7218 = arg1;
		this.anInt7221 = arg0;
	}
}
