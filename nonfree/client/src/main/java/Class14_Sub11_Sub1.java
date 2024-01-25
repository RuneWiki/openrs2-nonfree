import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public final class Class14_Sub11_Sub1 extends Class14_Sub11 {

	@OriginalMember(owner = "client!cha", name = "r", descriptor = "Ljava/lang/String;")
	private String aString21 = null;

	@OriginalMember(owner = "client!cha", name = "u", descriptor = "J")
	private long aLong56 = -1L;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		if (arg0.method7695(122) != 255) {
			arg0.anInt8936--;
			this.aLong56 = arg0.method7729();
		}
		this.aString21 = arg0.method7706();
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.method333(this.aLong56, this.aString21);
	}
}
