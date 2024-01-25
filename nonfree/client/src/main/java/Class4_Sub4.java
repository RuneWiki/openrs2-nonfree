import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!br", name = "g", descriptor = "I")
	public final int anInt1052;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(I)V")
	public Class4_Sub4(@OriginalArg(0) int arg0) {
		this.anInt1052 = arg0;
	}
}
