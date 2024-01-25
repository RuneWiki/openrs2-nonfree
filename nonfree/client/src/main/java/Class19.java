import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class19 {

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "B")
	public final byte aByte7;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
	public final int anInt296;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
	public final int anInt294;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "S")
	public final short aShort10;

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "S")
	public final short aShort11;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
	public final int anInt295;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "Z")
	public final boolean aBoolean16;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "S")
	public final short aShort12;

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
	public final int anInt297;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	public final int anInt293;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte7 = (byte) arg8;
		this.anInt296 = arg11;
		this.anInt294 = arg2;
		this.aShort10 = (short) arg4;
		this.aShort11 = (short) arg5;
		this.anInt295 = arg3;
		this.aBoolean16 = arg10;
		this.aShort12 = (short) arg6;
		this.anInt297 = arg1;
		this.anInt293 = arg0;
	}
}
