import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "Ljava/lang/String;")
	private String aString14 = null;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "J")
	private long aLong22 = -1L;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		if (arg0.method8529() != 255) {
			arg0.anInt9869--;
			this.aLong22 = arg0.method8509();
		}
		this.aString14 = arg0.method8475();
		if (Static628.aBoolean762) {
			System.out.println("memberhash:" + this.aLong22 + " membername:" + this.aString14);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.method4884(this.aLong22, this.aString14);
	}
}
