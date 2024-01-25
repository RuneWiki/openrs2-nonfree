import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class242 {

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "B")
	public final byte aByte91;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "S")
	public final short aShort79;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public final int anInt6779;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "S")
	public final short aShort80;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "S")
	public final short aShort81;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	public final int anInt6775;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	public final int anInt6784;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public final int anInt6781;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
	public final boolean aBoolean525;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
	public final int anInt6776;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte91 = (byte) arg8;
		this.aShort79 = (short) arg4;
		this.anInt6779 = arg1;
		this.aShort80 = (short) arg6;
		this.aShort81 = (short) arg5;
		this.anInt6775 = arg2;
		this.anInt6784 = arg11;
		this.anInt6781 = arg3;
		this.aBoolean525 = arg10;
		this.anInt6776 = arg0;
	}
}
