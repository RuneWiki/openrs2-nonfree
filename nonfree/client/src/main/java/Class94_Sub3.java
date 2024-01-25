import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class94_Sub3 extends Class94 {

	@OriginalMember(owner = "client!u", name = "w", descriptor = "I")
	public final int anInt8276;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "I")
	public final int anInt8273;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!sc;Lclient!ia;IIIIIIIIII)V")
	public Class94_Sub3(@OriginalArg(0) Class300 arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8276 = arg11;
		this.anInt8273 = arg10;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lclient!ph;")
	@Override
	public Class260 method6943() {
		return Static415.aClass260_13;
	}
}
