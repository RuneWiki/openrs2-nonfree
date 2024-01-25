import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class6_Sub7_Sub2 extends Class6_Sub7 {

	@OriginalMember(owner = "client!js", name = "p", descriptor = "Ljava/lang/String;")
	private String aString58;

	@OriginalMember(owner = "client!js", name = "r", descriptor = "B")
	private byte aByte83;

	@OriginalMember(owner = "client!js", name = "t", descriptor = "B")
	private byte aByte84;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!ag;I)V")
	@Override
	public void method6990(@OriginalArg(0) Class6_Sub2 arg0) {
		if (this.aString58 != null) {
			arg0.aByte13 = this.aByte83;
			arg0.aByte12 = this.aByte84;
		}
		arg0.aString9 = this.aString58;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!gga;B)V")
	@Override
	public void method6993(@OriginalArg(0) Class6_Sub23 arg0) {
		this.aString58 = arg0.method8359();
		if (this.aString58 != null) {
			arg0.method8374();
			this.aByte84 = arg0.method8391();
			this.aByte83 = arg0.method8391();
		}
	}
}
