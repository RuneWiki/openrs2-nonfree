import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class252 {

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "B")
	public final byte aByte99;

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
	public final int anInt7211;

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "B")
	public final byte aByte100;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
	public final int anInt7210;

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "Z")
	public final boolean aBoolean519;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "S")
	public final short aShort120;

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "S")
	public final short aShort122;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
	public final int anInt7207;

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "S")
	public final short aShort121;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
	public final int anInt7206;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
	public final int anInt7209;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte99 = (byte) arg8;
		this.anInt7211 = arg3;
		this.aByte100 = (byte) arg7;
		this.anInt7210 = arg1;
		this.aBoolean519 = arg10;
		this.aShort120 = (short) arg4;
		this.aShort122 = (short) arg6;
		this.anInt7207 = arg11;
		this.aShort121 = (short) arg5;
		this.anInt7206 = arg0;
		this.anInt7209 = arg2;
	}
}
