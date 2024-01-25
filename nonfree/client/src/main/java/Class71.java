import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class71 {

	@OriginalMember(owner = "client!er", name = "d", descriptor = "B")
	public byte aByte15;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Lclient!gg;")
	public Interface4 anInterface4_4;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "B")
	public final byte aByte16;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "S")
	public final short aShort16;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!gg;III)V")
	public Class71(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte15 = (byte) arg3;
		this.anInterface4_4 = arg0;
		this.aByte16 = (byte) arg2;
		this.aShort16 = (short) arg1;
	}
}
