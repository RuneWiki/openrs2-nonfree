import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class263 {

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
	public final int anInt7957;

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
	public final int anInt7963;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "Z")
	public final boolean aBoolean634;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	public final int anInt7960;

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
	public final int anInt7961;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
	public final int anInt7958;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "S")
	public final short aShort95;

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "S")
	public final short aShort93;

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "S")
	public final short aShort94;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt7957 = arg11;
		this.anInt7963 = arg1;
		this.aBoolean634 = arg10;
		this.anInt7960 = arg0;
		this.anInt7961 = arg3;
		this.anInt7958 = arg2;
		this.aShort95 = (short) arg4;
		this.aShort93 = (short) arg5;
		this.aShort94 = (short) arg6;
		this.aByte101 = (byte) arg8;
	}
}
