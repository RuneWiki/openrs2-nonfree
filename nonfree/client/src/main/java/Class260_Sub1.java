import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class Class260_Sub1 extends Class260 {

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "I")
	public final int anInt8148;

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "I")
	public final int anInt8150;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
	public final int anInt8144;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "I")
	public final int anInt8146;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
	public final int anInt8145;

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
	public final int anInt8147;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!ffa;Lclient!oca;IIIIIIIIIIIII)V")
	public Class260_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8148 = arg13;
		this.anInt8150 = arg14;
		this.anInt8144 = arg12;
		this.anInt8146 = arg10;
		this.anInt8145 = arg11;
		this.anInt8147 = arg9;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)Lclient!fl;")
	@Override
	public Class103 method7774() {
		return Static5.aClass103_1;
	}
}
