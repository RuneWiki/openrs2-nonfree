import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class307 {

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
	public final int anInt8085;

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
	public final int anInt8091;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "Z")
	public final boolean aBoolean610;

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "S")
	public final short aShort107;

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
	public final int anInt8088;

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "S")
	public final short aShort105;

	@OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
	public final int anInt8090;

	@OriginalMember(owner = "client!sca", name = "i", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
	public final int anInt8089;

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "B")
	public final byte aByte110;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt8085 = arg3;
		this.anInt8091 = arg0;
		this.aBoolean610 = arg10;
		this.aShort107 = (short) arg6;
		this.anInt8088 = arg1;
		this.aShort105 = (short) arg4;
		this.anInt8090 = arg2;
		this.aShort106 = (short) arg5;
		this.anInt8089 = arg11;
		this.aByte110 = (byte) arg8;
	}
}
