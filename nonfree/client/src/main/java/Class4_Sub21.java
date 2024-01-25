import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	public final int anInt3458;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	public final int anInt3460;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(II)V")
	public Class4_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3458 = arg1;
		this.anInt3460 = arg0;
	}
}
