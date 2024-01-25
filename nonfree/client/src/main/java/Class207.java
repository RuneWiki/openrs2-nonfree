import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class207 {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "S")
	public final short aShort58;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "Lclient!ika;")
	public Interface17 anInterface17_4;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "B")
	public byte aByte78;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!ika;III)V")
	public Class207(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort58 = (short) arg1;
		this.anInterface17_4 = arg0;
		this.aByte78 = (byte) arg3;
		this.aByte77 = (byte) arg2;
	}
}
