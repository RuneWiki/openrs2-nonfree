import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bia", name = "m", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!bia", name = "r", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method8291(@OriginalArg(1) Class3_Sub4 arg0) {
		this.anInt941 = arg0.method7895();
		this.anInt944 = arg0.method7895();
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lclient!tn;I)V")
	@Override
	public void method8290(@OriginalArg(0) Class342 arg0) {
		arg0.method7751(this.anInt944, this.anInt941);
	}
}
