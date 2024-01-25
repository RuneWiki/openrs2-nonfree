import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class186 {

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "Z")
	public final boolean aBoolean380;

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
	public final int anInt5073;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "B")
	public final byte aByte65;

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
	public final int anInt5070;

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "S")
	public final short aShort76;

	@OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
	public final int anInt5074;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "S")
	public final short aShort77;

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "S")
	public final short aShort78;

	@OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
	public final int anInt5076;

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
	public final int anInt5072;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aBoolean380 = arg10;
		this.anInt5073 = arg0;
		this.aByte65 = (byte) arg8;
		this.anInt5070 = arg2;
		this.aShort76 = (short) arg6;
		this.anInt5074 = arg3;
		this.aShort77 = (short) arg5;
		this.aShort78 = (short) arg4;
		this.anInt5076 = arg1;
		this.anInt5072 = arg11;
	}
}
