import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class5_Sub34 extends Class5 {

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
	public final int anInt6391;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
	public final int anInt6389;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(II)V")
	public Class5_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6391 = arg1;
		this.anInt6389 = arg0;
	}
}
