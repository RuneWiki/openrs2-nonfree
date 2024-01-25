import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class111 {

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
	public final int anInt3159;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
	public final int anInt3152;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
	public final int anInt3154;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "S")
	public final short aShort38;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
	public final int anInt3160;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "S")
	public final short aShort39;

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "B")
	public final byte aByte49;

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
	public final int anInt3158;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "S")
	public final short aShort37;

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "B")
	public final byte aByte50;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "Z")
	public final boolean aBoolean244;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt3159 = arg2;
		this.anInt3152 = arg3;
		this.anInt3154 = arg1;
		this.aShort38 = (short) arg5;
		this.anInt3160 = arg0;
		this.aShort39 = (short) arg4;
		this.aByte49 = (byte) arg7;
		this.anInt3158 = arg11;
		this.aShort37 = (short) arg6;
		this.aByte50 = (byte) arg8;
		this.aBoolean244 = arg10;
	}
}
