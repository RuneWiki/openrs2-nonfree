import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class5_Sub10_Sub2 extends Class5_Sub10 {

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
	private int anInt6428 = -1;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!qc;Z)V")
	@Override
	public void method6635(@OriginalArg(0) Class5_Sub45 arg0) {
		arg0.method6684(this.anInt6428);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!mc;)V")
	@Override
	public void method6633(@OriginalArg(1) Class5_Sub41 arg0) {
		this.anInt6428 = arg0.method7860();
		arg0.method7816();
		if (arg0.method7816() != 255) {
			arg0.anInt9230--;
			arg0.method7823();
		}
	}
}
