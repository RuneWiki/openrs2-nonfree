import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	public final int anInt365;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
	public Class5_Sub6(@OriginalArg(0) int arg0) {
		this.anInt365 = arg0;
	}
}
