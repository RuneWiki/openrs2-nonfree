import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class41_Sub6 extends Class41 {

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
	public final int anInt7036;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(I)V")
	public Class41_Sub6(@OriginalArg(0) int arg0) {
		this.anInt7036 = arg0;
	}
}
