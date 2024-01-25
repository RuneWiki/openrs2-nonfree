import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
	private int anInt6427;

	@OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
	private int anInt6428;

	@OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
	private int anInt6431;

	@OriginalMember(owner = "client!mv", name = "v", descriptor = "I")
	private int anInt6434 = -1;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!tn;I)V")
	@Override
	public void method8290(@OriginalArg(0) Class342 arg0) {
		arg0.method7745(this.anInt6431, this.anInt6434, this.anInt6427, this.anInt6428);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method8291(@OriginalArg(1) Class3_Sub4 arg0) {
		this.anInt6434 = arg0.method7951();
		this.anInt6427 = arg0.method7895();
		this.anInt6428 = arg0.method7954();
		this.anInt6431 = arg0.method7954();
	}
}
