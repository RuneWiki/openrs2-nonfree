import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class171 {

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "B")
	public final byte aByte66;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public final int anInt5054;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "B")
	public final byte aByte65;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "S")
	public final short aShort66;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Z")
	public final boolean aBoolean368;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "S")
	public final short aShort67;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aByte66 = (byte) arg8;
		this.anInt5054 = arg0;
		this.aByte65 = (byte) arg7;
		this.aShort68 = (short) arg6;
		this.aShort66 = (short) arg5;
		this.aBoolean368 = arg9;
		this.aShort67 = (short) arg4;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)Lclient!oa;")
	public Class171 method4169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class171(arg1, arg3, arg2, arg0, this.aShort67, this.aShort66, this.aShort68, this.aByte65, this.aByte66, this.aBoolean368);
	}
}
