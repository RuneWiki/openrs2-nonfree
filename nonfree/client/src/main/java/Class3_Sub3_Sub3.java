import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
	private int anInt2655 = -1;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method5916(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt2655 = arg0.method5272();
		arg0.method5322(-27);
		if (arg0.method5322(-56) != 255) {
			arg0.anInt6241--;
			arg0.method5287();
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!wr;B)V")
	@Override
	public void method5915(@OriginalArg(0) Class3_Sub56 arg0) {
		arg0.method9410(this.anInt2655);
	}
}
