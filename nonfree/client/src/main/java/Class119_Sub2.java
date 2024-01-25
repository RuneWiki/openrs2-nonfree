import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class119_Sub2 extends Class119 {

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
	public final int anInt4453;

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
	public final int anInt4452;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!nha;Lclient!jn;IIIIIIIII)V")
	public Class119_Sub2(@OriginalArg(0) Class245 arg0, @OriginalArg(1) Class183 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4453 = arg9;
		this.anInt4452 = arg10;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)Lclient!vj;")
	@Override
	public Class365 method9019() {
		return Static21.aClass365_1;
	}
}
