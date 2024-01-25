import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public final class Class189 {

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "Z")
	public final boolean aBoolean505;

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
	public final int anInt5807;

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
	public final int anInt5805;

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
	public final int anInt5806;

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
	public final int anInt5808;

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "B")
	public final byte aByte86;

	@OriginalMember(owner = "client!kba", name = "m", descriptor = "S")
	public final short aShort53;

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
	public final int anInt5804;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aBoolean505 = arg10;
		this.aShort52 = (short) arg5;
		this.anInt5807 = arg2;
		this.anInt5805 = arg11;
		this.anInt5806 = arg3;
		this.anInt5808 = arg0;
		this.aByte86 = (byte) arg8;
		this.aShort53 = (short) arg6;
		this.anInt5804 = arg1;
		this.aShort51 = (short) arg4;
	}
}
