import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public final class Class28 {

	@OriginalMember(owner = "client!bfa", name = "j", descriptor = "B")
	public final byte aByte11;

	@OriginalMember(owner = "client!bfa", name = "f", descriptor = "S")
	public final short aShort5;

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "S")
	public final short aShort4;

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
	public final int anInt563;

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "B")
	public final byte aByte10;

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "Z")
	public final boolean aBoolean20;

	@OriginalMember(owner = "client!bfa", name = "k", descriptor = "S")
	public final short aShort6;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aByte11 = (byte) arg8;
		this.aShort5 = (short) arg5;
		this.aShort4 = (short) arg4;
		this.anInt563 = arg0;
		this.aByte10 = (byte) arg7;
		this.aBoolean20 = arg9;
		this.aShort6 = (short) arg6;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZIII)Lclient!bfa;")
	public Class28 method465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class28(arg2, arg3, arg0, arg1, this.aShort4, this.aShort5, this.aShort6, this.aByte10, this.aByte11, this.aBoolean20);
	}
}
