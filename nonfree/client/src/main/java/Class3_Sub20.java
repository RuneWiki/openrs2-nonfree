import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	public final int anInt2136;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public final int anInt2137;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(II)V")
	public Class3_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2136 = arg1;
		this.anInt2137 = arg0;
	}
}
