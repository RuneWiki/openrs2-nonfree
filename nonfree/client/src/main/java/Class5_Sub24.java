import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class5_Sub24 extends Class5 {

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
	public final int anInt3194;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
	public final int anInt3188;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V")
	public Class5_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3194 = arg0;
		this.anInt3188 = arg1;
	}
}
