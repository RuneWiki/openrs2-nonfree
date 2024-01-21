import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
	public final int anInt1034;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
	public Class4_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1034 = arg0;
	}
}
