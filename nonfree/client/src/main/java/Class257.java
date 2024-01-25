import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class Class257 {

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "S")
	public final short aShort70;

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
	public final int anInt7722;

	@OriginalMember(owner = "client!oba", name = "i", descriptor = "B")
	public final byte aByte103;

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "Z")
	public final boolean aBoolean574;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
	public final int anInt7723;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aByte102 = (byte) arg8;
		this.aShort70 = (short) arg4;
		this.aShort71 = (short) arg6;
		this.aShort72 = (short) arg5;
		this.anInt7722 = arg0;
		this.aByte103 = (byte) arg7;
		this.aBoolean574 = arg9;
		this.anInt7723 = arg10;
	}
}
