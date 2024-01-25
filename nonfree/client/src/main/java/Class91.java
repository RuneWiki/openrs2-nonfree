import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class91 {

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "Lclient!gda;")
	public Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "S")
	public final short aShort28;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!gda;III)V")
	public Class91(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte48 = (byte) arg3;
		this.aByte47 = (byte) arg2;
		this.anInterface8_1 = arg0;
		this.aShort28 = (short) arg1;
	}
}
