import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public final class Class174 {

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "B")
	public final byte aByte51;

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
	public final int anInt4568;

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "B")
	public final byte aByte52;

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "S")
	public final short aShort45;

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "S")
	public final short aShort47;

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Z")
	public final boolean aBoolean325;

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "S")
	public final short aShort46;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aByte51 = (byte) arg7;
		this.anInt4568 = arg0;
		this.aByte52 = (byte) arg8;
		this.aShort45 = (short) arg6;
		this.aShort47 = (short) arg5;
		this.aBoolean325 = arg9;
		this.aShort46 = (short) arg4;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIII)Lclient!nu;")
	public Class174 method3720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return new Class174(arg1, arg2, arg3, arg0, this.aShort46, this.aShort47, this.aShort45, this.aByte51, this.aByte52, this.aBoolean325);
	}
}
