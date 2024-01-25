import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!cda", name = "r", descriptor = "I")
	public final int anInt9784;

	@OriginalMember(owner = "client!cda", name = "u", descriptor = "I")
	public final int anInt9786;

	@OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
	public final int anInt9782;

	@OriginalMember(owner = "client!cda", name = "t", descriptor = "I")
	public final int anInt9785;

	@OriginalMember(owner = "client!cda", name = "v", descriptor = "I")
	public final int anInt9787;

	@OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
	public final int anInt9783;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!gq;Lclient!kfa;IIIIIIIIIIIII)V")
	public Class41_Sub1(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9784 = arg13;
		this.anInt9786 = arg9;
		this.anInt9782 = arg11;
		this.anInt9785 = arg14;
		this.anInt9787 = arg12;
		this.anInt9783 = arg10;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)Lclient!qi;")
	@Override
	public Class275 method8059() {
		return Static423.aClass275_5;
	}
}
