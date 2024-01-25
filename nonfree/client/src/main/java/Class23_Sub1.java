import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	public final int anInt1974;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
	public final int anInt1979;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
	public final int anInt1977;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	public final int anInt1975;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
	public final int anInt1978;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
	public final int anInt1981;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!or;Lclient!ma;IIIIIIIIIIIII)V")
	public Class23_Sub1(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1974 = arg12;
		this.anInt1979 = arg9;
		this.anInt1977 = arg10;
		this.anInt1975 = arg14;
		this.anInt1978 = arg11;
		this.anInt1981 = arg13;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lclient!oh;")
	@Override
	public Class252 method6715() {
		return Static191.aClass252_7;
	}
}
