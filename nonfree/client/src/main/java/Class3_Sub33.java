import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
	public final int anInt5749;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
	public final int anInt5747;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(II)V")
	public Class3_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5749 = arg1;
		this.anInt5747 = arg0;
	}
}
