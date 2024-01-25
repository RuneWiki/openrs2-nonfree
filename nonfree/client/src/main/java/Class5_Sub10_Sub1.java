import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class5_Sub10_Sub1 extends Class5_Sub10 {

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Ljava/lang/String;")
	private String aString50;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "B")
	private byte aByte89;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!mc;)V")
	@Override
	public void method6633(@OriginalArg(1) Class5_Sub41 arg0) {
		this.aString50 = arg0.method7815();
		if (this.aString50 != null) {
			arg0.method7816();
			this.aByte89 = arg0.method7861();
			this.aByte90 = arg0.method7861();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!qc;Z)V")
	@Override
	public void method6635(@OriginalArg(0) Class5_Sub45 arg0) {
		arg0.aString75 = this.aString50;
		if (this.aString50 != null) {
			arg0.aByte117 = this.aByte90;
			arg0.aByte116 = this.aByte89;
		}
	}
}
