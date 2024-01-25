import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public final class Class317 {

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "S")
	public final short aShort111;

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "Z")
	public final boolean aBoolean574;

	@OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
	public final int anInt8893;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
	public final int anInt8887;

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "S")
	public final short aShort113;

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "S")
	public final short aShort112;

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
	public final int anInt8892;

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
	public final int anInt8890;

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "B")
	public final byte aByte96;

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
	public final int anInt8888;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort111 = (short) arg5;
		this.aBoolean574 = arg10;
		this.anInt8893 = arg0;
		this.anInt8887 = arg11;
		this.aShort113 = (short) arg6;
		this.aShort112 = (short) arg4;
		this.anInt8892 = arg3;
		this.anInt8890 = arg2;
		this.aByte96 = (byte) arg8;
		this.anInt8888 = arg1;
	}
}
