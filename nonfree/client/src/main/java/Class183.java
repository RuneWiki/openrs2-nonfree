import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class183 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "B")
	public final byte aByte73;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "S")
	public final short aShort105;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Z")
	public final boolean aBoolean400;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public final int anInt5356;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "S")
	public final short aShort104;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aByte73 = (byte) arg8;
		this.aShort106 = (short) arg6;
		this.aShort105 = (short) arg5;
		this.aBoolean400 = arg9;
		this.anInt5356 = arg0;
		this.aShort104 = (short) arg4;
		this.aByte74 = (byte) arg7;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBII)Lclient!mb;")
	public Class183 method4607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class183(arg3, arg2, arg1, arg0, this.aShort104, this.aShort105, this.aShort106, this.aByte74, this.aByte73, this.aBoolean400);
	}
}
