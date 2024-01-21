import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
	public final int anInt554;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8(@OriginalArg(0) int arg0) {
		this.anInt554 = arg0;
	}
}
