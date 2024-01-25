import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	public final int anInt8611;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8(@OriginalArg(0) int arg0) {
		this.anInt8611 = arg0;
	}
}
