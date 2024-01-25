import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "J")
	private long aLong50 = -1L;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "Ljava/lang/String;")
	private String aString27 = null;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method8291(@OriginalArg(1) Class3_Sub4 arg0) {
		if (arg0.method7954() != 255) {
			arg0.anInt9739--;
			this.aLong50 = arg0.method7946();
		}
		this.aString27 = arg0.method7917();
		if (Static501.aBoolean552) {
			System.out.println("memberhash:" + this.aLong50 + " membername:" + this.aString27);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!tn;I)V")
	@Override
	public void method8290(@OriginalArg(0) Class342 arg0) {
		arg0.method7752(this.aLong50, this.aString27);
	}
}
