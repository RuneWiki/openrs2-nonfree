import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class121 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "B")
	public byte aByte34;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Lclient!ob;")
	public Interface19 anInterface19_3;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "S")
	public final short aShort37;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "B")
	public final byte aByte35;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!ob;III)V")
	public Class121(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte34 = (byte) arg3;
		this.anInterface19_3 = arg0;
		this.aShort37 = (short) arg1;
		this.aByte35 = (byte) arg2;
	}
}
