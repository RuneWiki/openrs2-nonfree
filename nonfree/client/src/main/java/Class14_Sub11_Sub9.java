import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public final class Class14_Sub11_Sub9 extends Class14_Sub11 {

	@OriginalMember(owner = "client!qja", name = "w", descriptor = "Ljava/lang/String;")
	private String aString99 = null;

	@OriginalMember(owner = "client!qja", name = "u", descriptor = "J")
	private long aLong233 = -1L;

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		if (arg0.method7695(98) != 255) {
			arg0.anInt8936--;
			this.aLong233 = arg0.method7729();
		}
		this.aString99 = arg0.method7706();
		if (Static403.aBoolean494) {
			System.out.println("memberhash:" + this.aLong233 + " membername:" + this.aString99);
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.method339(this.aString99, this.aLong233, 0);
	}
}
