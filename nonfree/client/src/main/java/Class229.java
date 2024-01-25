import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class229 {

	@OriginalMember(owner = "client!li", name = "d", descriptor = "B")
	public byte aByte90;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "B")
	public final byte aByte91;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "S")
	public final short aShort77;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!rt;")
	public Interface24 anInterface24_5;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!rt;III)V")
	public Class229(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte90 = (byte) arg3;
		this.aByte91 = (byte) arg2;
		this.aShort77 = (short) arg1;
		this.anInterface24_5 = arg0;
	}
}
