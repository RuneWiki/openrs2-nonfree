import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class44 {

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
	public final int anInt1114;

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "S")
	public final short aShort2;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "Z")
	public final boolean aBoolean71;

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "B")
	public final byte aByte9;

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "S")
	public final short aShort4;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "B")
	public final byte aByte10;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort3 = (short) arg5;
		this.anInt1114 = arg0;
		this.aShort2 = (short) arg4;
		this.aBoolean71 = arg9;
		this.aByte9 = (byte) arg8;
		this.aShort4 = (short) arg6;
		this.aByte10 = (byte) arg7;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BIIII)Lclient!cda;")
	public Class44 method1092(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class44(arg2, arg0, arg1, arg3, this.aShort2, this.aShort3, this.aShort4, this.aByte10, this.aByte9, this.aBoolean71);
	}
}
