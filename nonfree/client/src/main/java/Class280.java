import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class280 {

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "Lclient!el;")
	public Interface7 anInterface7_5;

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "B")
	public byte aByte102;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!el;III)V")
	public Class280(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface7_5 = arg0;
		this.aShort102 = (short) arg1;
		this.aByte102 = (byte) arg3;
		this.aByte101 = (byte) arg2;
	}
}
