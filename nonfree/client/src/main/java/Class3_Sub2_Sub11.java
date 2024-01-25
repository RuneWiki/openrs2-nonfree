import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!paa", name = "u", descriptor = "B")
	private byte aByte114;

	@OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
	private int anInt7226 = -1;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method8291(@OriginalArg(1) Class3_Sub4 arg0) {
		this.anInt7226 = arg0.method7951();
		this.aByte114 = arg0.method7960();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!tn;I)V")
	@Override
	public void method8290(@OriginalArg(0) Class342 arg0) {
		arg0.method7737(this.aByte114, this.anInt7226);
	}
}
