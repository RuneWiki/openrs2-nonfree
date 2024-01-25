import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public final class Class289 {

	@OriginalMember(owner = "client!us", name = "b", descriptor = "S")
	public final short aShort143;

	@OriginalMember(owner = "client!us", name = "i", descriptor = "I")
	public final int anInt8682;

	@OriginalMember(owner = "client!us", name = "n", descriptor = "I")
	public final int anInt8684;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "S")
	public final short aShort145;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "S")
	public final short aShort144;

	@OriginalMember(owner = "client!us", name = "j", descriptor = "B")
	public final byte aByte103;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "I")
	public final int anInt8683;

	@OriginalMember(owner = "client!us", name = "g", descriptor = "I")
	public final int anInt8681;

	@OriginalMember(owner = "client!us", name = "h", descriptor = "Z")
	public final boolean aBoolean623;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "I")
	public final int anInt8678;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort143 = (short) arg5;
		this.anInt8682 = arg0;
		this.anInt8684 = arg11;
		this.aByte102 = (byte) arg7;
		this.aShort145 = (short) arg4;
		this.aShort144 = (short) arg6;
		this.aByte103 = (byte) arg8;
		this.anInt8683 = arg2;
		this.anInt8681 = arg3;
		this.aBoolean623 = arg10;
		this.anInt8678 = arg1;
	}
}
