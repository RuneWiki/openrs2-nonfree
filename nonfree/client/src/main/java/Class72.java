import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public final class Class72 {

	@OriginalMember(owner = "client!dga", name = "l", descriptor = "B")
	public final byte aByte48;

	@OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
	public final int anInt1931;

	@OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
	public final int anInt1928;

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
	public final int anInt1927;

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
	public final int anInt1926;

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "S")
	public final short aShort40;

	@OriginalMember(owner = "client!dga", name = "j", descriptor = "S")
	public final short aShort41;

	@OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
	public final int anInt1929;

	@OriginalMember(owner = "client!dga", name = "k", descriptor = "S")
	public final short aShort42;

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "Z")
	public final boolean aBoolean144;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte48 = (byte) arg8;
		this.anInt1931 = arg1;
		this.anInt1928 = arg11;
		this.anInt1927 = arg0;
		this.anInt1926 = arg3;
		this.aShort40 = (short) arg6;
		this.aShort41 = (short) arg5;
		this.anInt1929 = arg2;
		this.aShort42 = (short) arg4;
		this.aBoolean144 = arg10;
	}
}
