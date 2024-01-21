import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!c", name = "u", descriptor = "I")
	public final int anInt459;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	public final int anInt462;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II)V")
	public Class3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt459 = arg0;
		this.anInt462 = arg1;
	}
}
