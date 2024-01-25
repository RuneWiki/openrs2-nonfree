import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class268 {

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Z")
	public final boolean aBoolean528;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "B")
	public final byte aByte97;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "B")
	public final byte aByte98;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "S")
	public final short aShort92;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	public final int anInt7003;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "S")
	public final short aShort93;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "S")
	public final short aShort94;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public final int anInt7006;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aBoolean528 = arg9;
		this.aByte97 = (byte) arg7;
		this.aByte98 = (byte) arg8;
		this.aShort92 = (short) arg6;
		this.anInt7003 = arg10;
		this.aShort93 = (short) arg4;
		this.aShort94 = (short) arg5;
		this.anInt7006 = arg0;
	}
}
