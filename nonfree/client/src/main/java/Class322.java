import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class322 {

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "S")
	public final short aShort111;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
	public final int anInt8863;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "B")
	public final byte aByte99;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "S")
	public final short aShort109;

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "S")
	public final short aShort110;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "Z")
	public final boolean aBoolean612;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "B")
	public final byte aByte100;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort111 = (short) arg4;
		this.anInt8863 = arg0;
		this.aByte99 = (byte) arg7;
		this.aShort109 = (short) arg6;
		this.aShort110 = (short) arg5;
		this.aBoolean612 = arg9;
		this.aByte100 = (byte) arg8;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIII)Lclient!tt;")
	public Class322 method7280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class322(arg1, arg2, arg3, arg0, this.aShort111, this.aShort110, this.aShort109, this.aByte99, this.aByte100, this.aBoolean612);
	}
}
