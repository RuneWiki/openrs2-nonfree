import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class64 {

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "S")
	public final short aShort25;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "B")
	public final byte aByte21;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "S")
	public final short aShort24;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "Z")
	public final boolean aBoolean126;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "B")
	public final byte aByte20;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
	public final int anInt1474;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort25 = (short) arg5;
		this.aByte21 = (byte) arg8;
		this.aShort24 = (short) arg6;
		this.aBoolean126 = arg9;
		this.aByte20 = (byte) arg7;
		this.aShort23 = (short) arg4;
		this.anInt1474 = arg0;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIII)Lclient!dv;")
	public Class64 method1177(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class64(arg2, arg3, arg1, arg0, this.aShort23, this.aShort25, this.aShort24, this.aByte20, this.aByte21, this.aBoolean126);
	}
}
