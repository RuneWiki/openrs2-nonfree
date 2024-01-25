import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class308 {

	@OriginalMember(owner = "client!si", name = "h", descriptor = "S")
	public final short aShort108;

	@OriginalMember(owner = "client!si", name = "m", descriptor = "S")
	public final short aShort109;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public final int anInt7795;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Z")
	public final boolean aBoolean613;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "I")
	public final int anInt7801;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	public final int anInt7797;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "I")
	public final int anInt7796;

	@OriginalMember(owner = "client!si", name = "k", descriptor = "B")
	public final byte aByte116;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	public final int anInt7800;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "S")
	public final short aShort110;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort108 = (short) arg4;
		this.aShort109 = (short) arg6;
		this.anInt7795 = arg11;
		this.aBoolean613 = arg10;
		this.anInt7801 = arg1;
		this.anInt7797 = arg2;
		this.anInt7796 = arg3;
		this.aByte116 = (byte) arg8;
		this.anInt7800 = arg0;
		this.aShort110 = (short) arg5;
	}
}
