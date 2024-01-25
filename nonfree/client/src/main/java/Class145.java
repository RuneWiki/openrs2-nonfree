import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public final class Class145 {

	@OriginalMember(owner = "client!iha", name = "q", descriptor = "I")
	public final int anInt5188;

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
	public final int anInt5181;

	@OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
	public final int anInt5186;

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "S")
	public final short aShort55;

	@OriginalMember(owner = "client!iha", name = "l", descriptor = "S")
	public final short aShort56;

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
	public final int anInt5182;

	@OriginalMember(owner = "client!iha", name = "n", descriptor = "Z")
	public final boolean aBoolean387;

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
	public final int anInt5185;

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "B")
	public final byte aByte55;

	@OriginalMember(owner = "client!iha", name = "o", descriptor = "S")
	public final short aShort57;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt5188 = arg0;
		this.anInt5181 = arg1;
		this.anInt5186 = arg11;
		this.aShort55 = (short) arg5;
		this.aShort56 = (short) arg6;
		this.anInt5182 = arg2;
		this.aBoolean387 = arg10;
		this.anInt5185 = arg3;
		this.aByte55 = (byte) arg8;
		this.aShort57 = (short) arg4;
	}
}
