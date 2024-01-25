import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public final class Class219 {

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
	public final int anInt7325;

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "I")
	public final int anInt7326;

	@OriginalMember(owner = "client!nea", name = "h", descriptor = "I")
	public final int anInt7329;

	@OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
	public final int anInt7328;

	@OriginalMember(owner = "client!nea", name = "i", descriptor = "B")
	public final byte aByte109;

	@OriginalMember(owner = "client!nea", name = "k", descriptor = "Z")
	public final boolean aBoolean535;

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "S")
	public final short aShort81;

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
	public final int anInt7327;

	@OriginalMember(owner = "client!nea", name = "g", descriptor = "S")
	public final short aShort82;

	@OriginalMember(owner = "client!nea", name = "j", descriptor = "S")
	public final short aShort83;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt7325 = arg1;
		this.anInt7326 = arg3;
		this.anInt7329 = arg2;
		this.anInt7328 = arg11;
		this.aByte109 = (byte) arg8;
		this.aBoolean535 = arg10;
		this.aShort81 = (short) arg4;
		this.anInt7327 = arg0;
		this.aShort82 = (short) arg6;
		this.aShort83 = (short) arg5;
	}
}
