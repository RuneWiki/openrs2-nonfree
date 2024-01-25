import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class Class242 {

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	public final int anInt6782;

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "B")
	public final byte aByte94;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
	public final int anInt6781;

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "S")
	public final short aShort70;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	public final int anInt6784;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Z")
	public final boolean aBoolean484;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
	public final int anInt6783;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	public final int anInt6778;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt6782 = arg2;
		this.aShort71 = (short) arg5;
		this.aByte94 = (byte) arg8;
		this.anInt6781 = arg1;
		this.aShort70 = (short) arg4;
		this.anInt6784 = arg11;
		this.aBoolean484 = arg10;
		this.anInt6783 = arg3;
		this.anInt6778 = arg0;
		this.aShort69 = (short) arg6;
	}
}
