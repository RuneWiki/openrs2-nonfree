import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!uja", name = "n", descriptor = "J")
	private long aLong282;

	@OriginalMember(owner = "client!uja", name = "p", descriptor = "I")
	private int anInt10170;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method8291(@OriginalArg(1) Class3_Sub4 arg0) {
		this.anInt10170 = arg0.method7895();
		this.aLong282 = arg0.method7946();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!tn;I)V")
	@Override
	public void method8290(@OriginalArg(0) Class342 arg0) {
		arg0.method7733(this.aLong282, this.anInt10170);
	}
}
