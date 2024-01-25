import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class96 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "I")
	public final int anInt3290;

	@OriginalMember(owner = "client!en", name = "l", descriptor = "I")
	public final int anInt3295;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "S")
	public final short aShort26;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "I")
	public final int anInt3292;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "I")
	public final int anInt3294;

	@OriginalMember(owner = "client!en", name = "f", descriptor = "B")
	public final byte aByte40;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	public final int anInt3291;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "S")
	public final short aShort27;

	@OriginalMember(owner = "client!en", name = "m", descriptor = "Z")
	public final boolean aBoolean253;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "S")
	public final short aShort28;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt3290 = arg3;
		this.anInt3295 = arg1;
		this.aShort26 = (short) arg5;
		this.anInt3292 = arg2;
		this.anInt3294 = arg11;
		this.aByte40 = (byte) arg8;
		this.anInt3291 = arg0;
		this.aShort27 = (short) arg4;
		this.aBoolean253 = arg10;
		this.aShort28 = (short) arg6;
	}
}
