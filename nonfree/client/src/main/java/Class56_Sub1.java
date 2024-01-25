import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
	public final int anInt9433;

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
	public final int anInt9431;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
	public final int anInt9425;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
	public final int anInt9423;

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
	public final int anInt9430;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
	public final int anInt9426;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!eha;Lclient!oea;IIIIIIIIIIIII)V")
	public Class56_Sub1(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9433 = arg10;
		this.anInt9431 = arg14;
		this.anInt9425 = arg9;
		this.anInt9423 = arg12;
		this.anInt9430 = arg13;
		this.anInt9426 = arg11;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Lclient!hm;")
	@Override
	public Class151 method8831() {
		return Static261.aClass151_6;
	}
}
