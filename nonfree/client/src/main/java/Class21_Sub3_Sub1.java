import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class21_Sub3_Sub1 extends Class21_Sub3 {

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
	public final int anInt3481;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!qk;Lclient!kr;IIIIIIIIIIIIII)V")
	public Class21_Sub3_Sub1(@OriginalArg(0) Class304 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
		this.anInt3481 = arg15;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return Static188.aClass409_4;
	}
}
