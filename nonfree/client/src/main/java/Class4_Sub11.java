import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
	public final int anInt1036;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
	public final int anInt1037;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(II)V")
	public Class4_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1036 = arg0;
		this.anInt1037 = arg1;
	}
}
