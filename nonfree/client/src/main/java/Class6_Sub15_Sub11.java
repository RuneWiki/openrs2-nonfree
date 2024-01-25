import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class6_Sub15_Sub11 extends Class6_Sub15 {

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "Ljava/lang/String;")
	private String aString132;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.aString37 = this.aString132;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		this.aString132 = arg0.method8354();
	}
}
