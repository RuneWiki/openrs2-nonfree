import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!k", name = "p", descriptor = "I")
	public final int anInt5342;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "I")
	public final int anInt5343;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!jg;Lclient!jha;IIIIIIIII)V")
	public Class8_Sub3(@OriginalArg(0) Class174 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5342 = arg10;
		this.anInt5343 = arg9;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Lclient!jw;")
	@Override
	public Class184 method7078() {
		return Static545.aClass184_11;
	}
}
