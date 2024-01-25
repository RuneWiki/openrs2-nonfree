import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public final class Class5_Sub6_Sub3 extends Class5_Sub6 {

	@OriginalMember(owner = "client!kja", name = "A", descriptor = "B")
	private byte aByte75;

	@OriginalMember(owner = "client!kja", name = "r", descriptor = "Ljava/lang/String;")
	private String aString59;

	@OriginalMember(owner = "client!kja", name = "o", descriptor = "B")
	private byte aByte76;

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(Lclient!wt;I)V")
	@Override
	public void method9152(@OriginalArg(0) Class5_Sub55 arg0) {
		arg0.aString123 = this.aString59;
		if (this.aString59 != null) {
			arg0.aByte150 = this.aByte75;
			arg0.aByte149 = this.aByte76;
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(Lclient!wq;I)V")
	@Override
	public void method9154(@OriginalArg(0) Class5_Sub36 arg0) {
		this.aString59 = arg0.method7312();
		if (this.aString59 != null) {
			arg0.method7291();
			this.aByte75 = arg0.method7318();
			this.aByte76 = arg0.method7318();
		}
	}
}
