import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!gia", name = "x", descriptor = "I")
	public final int anInt6049;

	@OriginalMember(owner = "client!gia", name = "y", descriptor = "I")
	public final int anInt6050;

	@OriginalMember(owner = "client!gia", name = "w", descriptor = "I")
	public final int anInt6048;

	@OriginalMember(owner = "client!gia", name = "A", descriptor = "I")
	public final int anInt6044;

	@OriginalMember(owner = "client!gia", name = "t", descriptor = "I")
	public final int anInt6047;

	@OriginalMember(owner = "client!gia", name = "z", descriptor = "I")
	public final int anInt6045;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Lclient!jk;Lclient!tda;IIIIIIIIIIIII)V")
	public Class132_Sub1(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt6049 = arg14;
		this.anInt6050 = arg9;
		this.anInt6048 = arg11;
		this.anInt6044 = arg10;
		this.anInt6047 = arg12;
		this.anInt6045 = arg13;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Z)Lclient!wh;")
	@Override
	public Class392 method8802() {
		return Static678.aClass392_10;
	}
}
