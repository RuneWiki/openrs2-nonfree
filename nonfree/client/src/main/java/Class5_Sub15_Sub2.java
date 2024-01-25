import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public final class Class5_Sub15_Sub2 extends Class5_Sub15 {

	@OriginalMember(owner = "client!fha", name = "r", descriptor = "J")
	private long aLong86 = -1L;

	@OriginalMember(owner = "client!fha", name = "q", descriptor = "Ljava/lang/String;")
	private String aString22 = null;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		if (arg0.method7291() != 255) {
			arg0.anInt8456--;
			this.aLong86 = arg0.method7304();
		}
		this.aString22 = arg0.method7312();
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.method7385(this.aLong86, this.aString22);
	}
}
