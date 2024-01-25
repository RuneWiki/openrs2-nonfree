import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class95 {

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "S")
	public final short aShort35;

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
	public final int anInt2939;

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
	public final int anInt2937;

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "S")
	public final short aShort36;

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "Z")
	public final boolean aBoolean227;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "B")
	public final byte aByte27;

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
	public final int anInt2944;

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
	public final int anInt2936;

	@OriginalMember(owner = "client!fba", name = "m", descriptor = "S")
	public final short aShort37;

	@OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
	public final int anInt2943;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort35 = (short) arg6;
		this.anInt2939 = arg11;
		this.anInt2937 = arg3;
		this.aShort36 = (short) arg4;
		this.aBoolean227 = arg10;
		this.aByte27 = (byte) arg8;
		this.anInt2944 = arg2;
		this.anInt2936 = arg0;
		this.aShort37 = (short) arg5;
		this.anInt2943 = arg1;
	}
}
