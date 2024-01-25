import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public final class Class6_Sub15_Sub12 extends Class6_Sub15 {

	@OriginalMember(owner = "client!vha", name = "p", descriptor = "J")
	private long aLong295 = -1L;

	@OriginalMember(owner = "client!vha", name = "u", descriptor = "Ljava/lang/String;")
	private String aString141 = null;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.method3151(this.aString141, this.aLong295);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		if (arg0.method8374() != 255) {
			arg0.anInt9901--;
			this.aLong295 = arg0.method8381();
		}
		this.aString141 = arg0.method8359();
		if (Static236.aBoolean268) {
			System.out.println("memberhash:" + this.aLong295 + " membername:" + this.aString141);
		}
	}
}
