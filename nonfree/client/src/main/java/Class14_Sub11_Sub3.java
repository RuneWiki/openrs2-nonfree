import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class14_Sub11_Sub3 extends Class14_Sub11 {

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
	private int anInt3511 = 0;

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "Ljava/lang/String;")
	private String aString41 = null;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "J")
	private long aLong118 = -1L;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.method339(this.aString41, this.aLong118, this.anInt3511);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		if (arg0.method7695(97) != 255) {
			arg0.anInt8936--;
			this.aLong118 = arg0.method7729();
		}
		this.aString41 = arg0.method7706();
		this.anInt3511 = arg0.method7717(-1978450544);
		if (Static403.aBoolean494) {
			System.out.println("memberhash:" + this.aLong118 + " membername:" + this.aString41);
		}
	}
}
