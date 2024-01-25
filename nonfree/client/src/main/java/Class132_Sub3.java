import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tka")
public final class Class132_Sub3 extends Class132 {

	@OriginalMember(owner = "client!tka", name = "B", descriptor = "I")
	public final int anInt9756;

	@OriginalMember(owner = "client!tka", name = "z", descriptor = "I")
	public final int anInt9755;

	@OriginalMember(owner = "client!tka", name = "<init>", descriptor = "(Lclient!nv;Lclient!kka;IIIIIIIIII)V")
	public Class132_Sub3(@OriginalArg(0) Class258 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9756 = arg10;
		this.anInt9755 = arg11;
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(I)Lclient!c;")
	@Override
	public Class51 method9393() {
		return Static210.aClass51_16;
	}
}
