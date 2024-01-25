import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class6_Sub15_Sub9 extends Class6_Sub15 {

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	private int anInt6594;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "Ljava/lang/String;")
	private String aString91;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.method3144(this.aString91, this.anInt6594);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		this.anInt6594 = arg0.method8369();
		this.aString91 = arg0.method8354();
	}
}
