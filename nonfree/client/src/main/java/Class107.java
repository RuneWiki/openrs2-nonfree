import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public final class Class107 {

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "I")
	public final int anInt3133;

	@OriginalMember(owner = "client!fha", name = "p", descriptor = "S")
	public final short aShort44;

	@OriginalMember(owner = "client!fha", name = "o", descriptor = "I")
	public final int anInt3138;

	@OriginalMember(owner = "client!fha", name = "e", descriptor = "S")
	public final short aShort42;

	@OriginalMember(owner = "client!fha", name = "m", descriptor = "B")
	public final byte aByte52;

	@OriginalMember(owner = "client!fha", name = "g", descriptor = "B")
	public final byte aByte51;

	@OriginalMember(owner = "client!fha", name = "f", descriptor = "S")
	public final short aShort43;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "Z")
	public final boolean aBoolean235;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt3133 = arg10;
		this.aShort44 = (short) arg4;
		this.anInt3138 = arg0;
		this.aShort42 = (short) arg6;
		this.aByte52 = (byte) arg7;
		this.aByte51 = (byte) arg8;
		this.aShort43 = (short) arg5;
		this.aBoolean235 = arg9;
	}
}
