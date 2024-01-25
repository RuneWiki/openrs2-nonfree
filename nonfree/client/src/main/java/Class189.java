import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class189 {

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
	public final int anInt5304;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Z")
	public final boolean aBoolean353;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	public final int anInt5305;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "S")
	public final short aShort77;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "S")
	public final short aShort75;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "S")
	public final short aShort76;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt5304 = arg10;
		this.aBoolean353 = arg9;
		this.aByte76 = (byte) arg7;
		this.anInt5305 = arg0;
		this.aShort77 = (short) arg4;
		this.aShort75 = (short) arg5;
		this.aByte77 = (byte) arg8;
		this.aShort76 = (short) arg6;
	}
}
