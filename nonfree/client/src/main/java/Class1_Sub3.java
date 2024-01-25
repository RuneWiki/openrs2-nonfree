import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!al", name = "t", descriptor = "I")
	public final int anInt261;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	public final int anInt258;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt261 = arg0;
		this.anInt258 = arg1;
	}
}
