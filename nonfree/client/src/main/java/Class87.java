import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class87 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "Lclient!lm;")
	public Interface8 anInterface8_2;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "B")
	public byte aByte19;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "B")
	public final byte aByte20;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "S")
	public final short aShort27;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!lm;III)V")
	public Class87(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface8_2 = arg0;
		this.aByte19 = (byte) arg3;
		this.aByte20 = (byte) arg2;
		this.aShort27 = (short) arg1;
	}
}
