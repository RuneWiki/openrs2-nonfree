import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
	public final int anInt4150;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
	public final int anInt4145;

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
	public final int anInt4154;

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
	public final int anInt4151;

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
	public final int anInt4147;

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
	public final int anInt4155;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!og;Lclient!ega;IIIIIIIIIIIII)V")
	public Class22_Sub1(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4150 = arg10;
		this.anInt4145 = arg14;
		this.anInt4154 = arg11;
		this.anInt4151 = arg12;
		this.anInt4147 = arg13;
		this.anInt4155 = arg9;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class152 method5661() {
		return Static30.aClass152_7;
	}
}
