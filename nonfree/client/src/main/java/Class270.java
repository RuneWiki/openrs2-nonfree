import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class270 {

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!ur;")
	public Interface27 anInterface27_6;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "S")
	public final short aShort105;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "B")
	public final byte aByte98;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ur;III)V")
	public Class270(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface27_6 = arg0;
		this.aShort105 = (short) arg1;
		this.aByte98 = (byte) arg2;
		this.aByte99 = (byte) arg3;
	}
}
