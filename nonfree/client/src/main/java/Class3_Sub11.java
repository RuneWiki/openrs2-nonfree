import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!de", name = "r", descriptor = "I")
	public final int anInt2309;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	public final int anInt2310;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(II)V")
	public Class3_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2309 = arg0;
		this.anInt2310 = arg1;
	}
}
