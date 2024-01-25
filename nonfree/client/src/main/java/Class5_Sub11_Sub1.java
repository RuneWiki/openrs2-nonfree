import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class5_Sub11_Sub1 extends Class5_Sub11 {

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Ljava/lang/String;")
	private String aString35;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "B")
	private byte aByte34;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "B")
	private byte aByte35;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method7461(@OriginalArg(1) Class5_Sub23 arg0) {
		this.aString35 = arg0.method8475();
		if (this.aString35 != null) {
			arg0.method8529();
			this.aByte34 = arg0.method8488();
			this.aByte35 = arg0.method8488();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!wca;)V")
	@Override
	public void method7459(@OriginalArg(1) Class5_Sub53 arg0) {
		if (this.aString35 != null) {
			arg0.aByte148 = this.aByte34;
			arg0.aByte147 = this.aByte35;
		}
		arg0.aString136 = this.aString35;
	}
}
