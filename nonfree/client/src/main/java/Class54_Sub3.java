import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class54_Sub3 extends Class54 {

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
	public final int anInt4151;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
	public final int anInt4150;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!ut;Lclient!gi;IIIIIIIII)V")
	public Class54_Sub3(@OriginalArg(0) Class335 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4151 = arg10;
		this.anInt4150 = arg9;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Lclient!rw;")
	@Override
	public Class297 method7306() {
		return Static192.aClass297_9;
	}
}
