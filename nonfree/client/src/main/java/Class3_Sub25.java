import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
	public final int anInt3630;

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
	public int anInt3631;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(II)V")
	public Class3_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3630 = arg0;
		this.anInt3631 = arg1;
	}
}
