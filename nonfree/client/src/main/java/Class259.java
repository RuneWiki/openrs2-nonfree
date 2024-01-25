import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public final class Class259 {

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "S")
	public final short aShort104;

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	public final int anInt7516;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
	public final int anInt7521;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "S")
	public final short aShort105;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "B")
	public final byte aByte103;

	@OriginalMember(owner = "client!vu", name = "o", descriptor = "Z")
	public final boolean aBoolean642;

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
	public final int anInt7522;

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
	public final int anInt7519;

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
	public final int anInt7523;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort104 = (short) arg4;
		this.aShort106 = (short) arg6;
		this.anInt7516 = arg2;
		this.anInt7521 = arg3;
		this.aShort105 = (short) arg5;
		this.aByte103 = (byte) arg7;
		this.aBoolean642 = arg10;
		this.aByte102 = (byte) arg8;
		this.anInt7522 = arg1;
		this.anInt7519 = arg11;
		this.anInt7523 = arg0;
	}
}
