import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class177 {

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "B")
	public final byte aByte56;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!vd;")
	public Interface11 anInterface11_7;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "B")
	public byte aByte55;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!vd;III)V")
	public Class177(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte56 = (byte) arg2;
		this.aShort68 = (short) arg1;
		this.anInterface11_7 = arg0;
		this.aByte55 = (byte) arg3;
	}
}
