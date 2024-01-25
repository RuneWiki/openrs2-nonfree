import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	public final int anInt678;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public final int anInt670;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	public final int anInt675;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	public final int anInt671;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	public final int anInt674;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public final int anInt677;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!og;Lclient!gi;IIIIIIIIIIIII)V")
	public Class21_Sub1(@OriginalArg(0) Class266 arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt678 = arg11;
		this.anInt670 = arg12;
		this.anInt675 = arg10;
		this.anInt671 = arg13;
		this.anInt674 = arg14;
		this.anInt677 = arg9;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Lclient!eo;")
	@Override
	public Class108 method7808() {
		return Static27.aClass108_3;
	}
}
