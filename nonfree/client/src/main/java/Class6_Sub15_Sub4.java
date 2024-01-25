import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class6_Sub15_Sub4 extends Class6_Sub15 {

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "J")
	private long aLong112 = -1L;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Ljava/lang/String;")
	private String aString34 = null;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.method3147(this.aString34, this.aLong112);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		if (arg0.method8374() != 255) {
			arg0.anInt9901--;
			this.aLong112 = arg0.method8381();
		}
		this.aString34 = arg0.method8359();
	}
}
