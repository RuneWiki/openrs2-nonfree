import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class12_Sub8 extends Class12 {

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	public final int anInt7417;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
	public Class12_Sub8(@OriginalArg(0) int arg0) {
		this.anInt7417 = arg0;
	}
}
