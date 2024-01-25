import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public final class Class5_Sub15_Sub3 extends Class5_Sub15 {

	@OriginalMember(owner = "client!gea", name = "s", descriptor = "J")
	private long aLong98 = -1L;

	@OriginalMember(owner = "client!gea", name = "w", descriptor = "Ljava/lang/String;")
	private String aString32 = null;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.method7400(this.aLong98, this.aString32);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		if (arg0.method7291() != 255) {
			arg0.anInt8456--;
			this.aLong98 = arg0.method7304();
		}
		this.aString32 = arg0.method7312();
		if (Static354.aBoolean391) {
			System.out.println("memberhash:" + this.aLong98 + " membername:" + this.aString32);
		}
	}
}
