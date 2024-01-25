import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class2 {

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Z")
	public final boolean aBoolean3;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "S")
	public final short aShort2;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public final int anInt41;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "B")
	public final byte aByte1;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "S")
	public final short aShort1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean3 = arg9;
		this.aShort2 = (short) arg5;
		this.aByte2 = (byte) arg7;
		this.aShort3 = (short) arg4;
		this.anInt41 = arg0;
		this.aByte1 = (byte) arg8;
		this.aShort1 = (short) arg6;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)Lclient!ab;")
	public Class2 method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class2(arg1, arg3, arg0, arg2, this.aShort3, this.aShort2, this.aShort1, this.aByte2, this.aByte1, this.aBoolean3);
	}
}
