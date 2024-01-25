import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class5_Sub10_Sub2 extends Class5_Sub10 {

	@OriginalMember(owner = "client!er", name = "l", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "B")
	private byte aByte30;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "B")
	private byte aByte31;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!rv;)V")
	@Override
	public void method7528(@OriginalArg(1) Class5_Sub15 arg0) {
		this.aString22 = arg0.method3691();
		if (this.aString22 != null) {
			arg0.method3642();
			this.aByte30 = arg0.method3677();
			this.aByte31 = arg0.method3677();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ua;I)V")
	@Override
	public void method7530(@OriginalArg(0) Class5_Sub49 arg0) {
		if (this.aString22 != null) {
			arg0.aByte137 = this.aByte30;
			arg0.aByte136 = this.aByte31;
		}
		arg0.aString103 = this.aString22;
	}
}
