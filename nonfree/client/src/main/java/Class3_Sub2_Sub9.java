import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "Ljava/lang/String;")
	private String aString84 = null;

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "J")
	private long aLong187 = -1L;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method8291(@OriginalArg(1) Class3_Sub4 arg0) {
		if (arg0.method7954() != 255) {
			arg0.anInt9739--;
			this.aLong187 = arg0.method7946();
		}
		this.aString84 = arg0.method7917();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!tn;I)V")
	@Override
	public void method8290(@OriginalArg(0) Class342 arg0) {
		arg0.method7744(this.aString84, this.aLong187);
	}
}
