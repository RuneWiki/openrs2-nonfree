import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
	public final int anInt3046;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
	public final int anInt3044;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V")
	public Class3_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3046 = arg0;
		this.anInt3044 = arg1;
	}
}
