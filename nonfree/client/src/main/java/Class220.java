import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class220 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "S")
	public final short aShort70;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "Z")
	public final boolean aBoolean490;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
	public final int anInt6165;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "B")
	public final byte aByte84;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
	public final int anInt6166;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort70 = (short) arg5;
		this.aBoolean490 = arg9;
		this.anInt6165 = arg10;
		this.aByte84 = (byte) arg7;
		this.aShort72 = (short) arg6;
		this.anInt6166 = arg0;
		this.aByte85 = (byte) arg8;
		this.aShort71 = (short) arg4;
	}
}
