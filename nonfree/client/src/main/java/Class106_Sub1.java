import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
	public final int anInt3390;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
	public final int anInt3387;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
	public final int anInt3385;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
	public final int anInt3388;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
	public final int anInt3389;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
	public final int anInt3391;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!ur;Lclient!cf;IIIIIIIIIIIII)V")
	public Class106_Sub1(@OriginalArg(0) Class356 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt3390 = arg11;
		this.anInt3387 = arg9;
		this.anInt3385 = arg10;
		this.anInt3388 = arg12;
		this.anInt3389 = arg14;
		this.anInt3391 = arg13;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Lclient!hv;")
	@Override
	public Class146 method5444() {
		return Static215.aClass146_16;
	}
}
