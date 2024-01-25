import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class9 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public final int anInt161;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Z")
	public final boolean aBoolean10;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "S")
	public final short aShort5;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "B")
	public final byte aByte3;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "S")
	public final short aShort6;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "S")
	public final short aShort4;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.anInt161 = arg0;
		this.aBoolean10 = arg9;
		this.aByte2 = (byte) arg7;
		this.aShort5 = (short) arg5;
		this.aByte3 = (byte) arg8;
		this.aShort6 = (short) arg6;
		this.aShort4 = (short) arg4;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)Lclient!ai;")
	public Class9 method127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class9(arg0, arg1, arg3, arg2, this.aShort4, this.aShort5, this.aShort6, this.aByte2, this.aByte3, this.aBoolean10);
	}
}
