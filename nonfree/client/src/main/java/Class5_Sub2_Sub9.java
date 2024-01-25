import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class5_Sub2_Sub9 extends Class5_Sub2 {

	@OriginalMember(owner = "client!lw", name = "o", descriptor = "J")
	private long aLong194 = -1L;

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "Ljava/lang/String;")
	private String aString77 = null;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		if (arg0.method8529() != 255) {
			arg0.anInt9869--;
			this.aLong194 = arg0.method8509();
		}
		this.aString77 = arg0.method8475();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.method4887(this.aLong194, this.aString77);
	}
}
