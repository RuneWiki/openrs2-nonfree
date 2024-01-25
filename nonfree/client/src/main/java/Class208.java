import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class208 {

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "B")
	public byte aByte72;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "Lclient!vd;")
	public Interface22 anInterface22_5;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "B")
	public final byte aByte71;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "S")
	public final short aShort77;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!vd;III)V")
	public Class208(@OriginalArg(0) Interface22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte72 = (byte) arg3;
		this.anInterface22_5 = arg0;
		this.aByte71 = (byte) arg2;
		this.aShort77 = (short) arg1;
	}
}
