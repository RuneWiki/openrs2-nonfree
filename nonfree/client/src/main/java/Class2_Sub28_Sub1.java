import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class2_Sub28_Sub1 extends Class2_Sub28 {

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "Ljava/lang/String;")
	private String aString48;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "B")
	private byte aByte59;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "B")
	private byte aByte60;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!hi;B)V")
	@Override
	public void method9518(@OriginalArg(0) Class2_Sub30 arg0) {
		arg0.aString54 = this.aString48;
		if (this.aString48 != null) {
			arg0.aByte71 = this.aByte60;
			arg0.aByte72 = this.aByte59;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ol;I)V")
	@Override
	public void method9519(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aString48 = arg0.method5224();
		if (this.aString48 != null) {
			arg0.method5203();
			this.aByte59 = arg0.method5175();
			this.aByte60 = arg0.method5175();
		}
	}
}
