import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public final class Class391 {

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
	public final int anInt10768;

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "B")
	public final byte aByte146;

	@OriginalMember(owner = "client!wfa", name = "k", descriptor = "Z")
	public final boolean aBoolean761;

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "I")
	public final int anInt10770;

	@OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
	public final int anInt10769;

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
	public final int anInt10766;

	@OriginalMember(owner = "client!wfa", name = "g", descriptor = "S")
	public final short aShort125;

	@OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
	public final int anInt10767;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "S")
	public final short aShort126;

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "S")
	public final short aShort124;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt10768 = arg2;
		this.aByte146 = (byte) arg8;
		this.aBoolean761 = arg10;
		this.anInt10770 = arg0;
		this.anInt10769 = arg1;
		this.anInt10766 = arg11;
		this.aShort125 = (short) arg4;
		this.anInt10767 = arg3;
		this.aShort126 = (short) arg5;
		this.aShort124 = (short) arg6;
	}
}
