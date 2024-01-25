import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class288 {

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Z")
	public final boolean aBoolean614;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	public final int anInt8263;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "S")
	public final short aShort105;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "S")
	public final short aShort107;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	public final int anInt8262;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
	public final int anInt8264;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	public final int anInt8261;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "B")
	public final byte aByte108;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public final int anInt8259;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aBoolean614 = arg10;
		this.anInt8263 = arg2;
		this.aShort105 = (short) arg5;
		this.aShort106 = (short) arg4;
		this.aShort107 = (short) arg6;
		this.anInt8262 = arg1;
		this.anInt8264 = arg3;
		this.anInt8261 = arg0;
		this.aByte108 = (byte) arg8;
		this.anInt8259 = arg11;
	}
}
