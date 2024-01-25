import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class106_Sub3 extends Class106 {

	@OriginalMember(owner = "client!mba", name = "s", descriptor = "I")
	public final int anInt5847;

	@OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
	public final int anInt5844;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!ur;Lclient!cf;IIIIIIIII)V")
	public Class106_Sub3(@OriginalArg(0) Class356 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5847 = arg10;
		this.anInt5844 = arg9;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)Lclient!hv;")
	@Override
	public Class146 method5444() {
		return Static89.aClass146_9;
	}
}
