import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class44 {

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
	public final int anInt1423;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "S")
	public final short aShort16;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Z")
	public final boolean aBoolean108;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	public final int anInt1422;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "S")
	public final short aShort17;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "B")
	public final byte aByte19;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "B")
	public final byte aByte20;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	public final int anInt1421;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public final int anInt1417;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "S")
	public final short aShort15;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public final int anInt1418;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt1423 = arg0;
		this.aShort16 = (short) arg6;
		this.aBoolean108 = arg10;
		this.anInt1422 = arg2;
		this.aShort17 = (short) arg4;
		this.aByte19 = (byte) arg7;
		this.aByte20 = (byte) arg8;
		this.anInt1421 = arg11;
		this.anInt1417 = arg1;
		this.aShort15 = (short) arg5;
		this.anInt1418 = arg3;
	}
}
