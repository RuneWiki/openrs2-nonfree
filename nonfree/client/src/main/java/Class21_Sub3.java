import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!tw", name = "s", descriptor = "I")
	public final int anInt9582;

	@OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
	public final int anInt9581;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!og;Lclient!gi;IIIIIIIIII)V")
	public Class21_Sub3(@OriginalArg(0) Class266 arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9582 = arg10;
		this.anInt9581 = arg11;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)Lclient!eo;")
	@Override
	public Class108 method7808() {
		return Static289.aClass108_7;
	}
}
