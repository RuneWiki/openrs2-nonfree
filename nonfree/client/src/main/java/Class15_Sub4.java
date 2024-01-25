import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
	public final int anInt1231;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V")
	public Class15_Sub4(@OriginalArg(0) int arg0) {
		this.anInt1231 = arg0;
	}
}
