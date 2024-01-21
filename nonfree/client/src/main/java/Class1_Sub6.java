import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public final int anInt423;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6(@OriginalArg(0) int arg0) {
		this.anInt423 = arg0;
	}
}
