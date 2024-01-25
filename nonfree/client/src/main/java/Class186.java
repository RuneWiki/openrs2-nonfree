import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class186 {

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
	public final int anInt5081;

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
	public final int anInt5085;

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "Z")
	public final boolean aBoolean371;

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
	public final int anInt5083;

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
	public final int anInt5084;

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
	public final int anInt5082;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte75 = (byte) arg8;
		this.anInt5081 = arg0;
		this.anInt5085 = arg1;
		this.aBoolean371 = arg10;
		this.aShort50 = (short) arg5;
		this.aShort51 = (short) arg6;
		this.anInt5083 = arg2;
		this.anInt5084 = arg11;
		this.aShort52 = (short) arg4;
		this.anInt5082 = arg3;
	}
}
