import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public final class Class126 {

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
	public final int anInt3555;

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "S")
	public final short aShort70;

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
	public final int anInt3553;

	@OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
	public final int anInt3556;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
	public final int anInt3554;

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "B")
	public final byte aByte52;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
	public final int anInt3552;

	@OriginalMember(owner = "client!iba", name = "k", descriptor = "B")
	public final byte aByte53;

	@OriginalMember(owner = "client!iba", name = "l", descriptor = "Z")
	public final boolean aBoolean273;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort69 = (short) arg5;
		this.anInt3555 = arg3;
		this.aShort70 = (short) arg4;
		this.anInt3553 = arg2;
		this.anInt3556 = arg11;
		this.anInt3554 = arg1;
		this.aShort71 = (short) arg6;
		this.aByte52 = (byte) arg7;
		this.anInt3552 = arg0;
		this.aByte53 = (byte) arg8;
		this.aBoolean273 = arg10;
	}
}
