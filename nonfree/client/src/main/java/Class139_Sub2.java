import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class Class139_Sub2 extends Class139 {

	@OriginalMember(owner = "client!raa", name = "y", descriptor = "I")
	public final int anInt8368;

	@OriginalMember(owner = "client!raa", name = "u", descriptor = "I")
	public final int anInt8364;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
	public final int anInt8359;

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
	public final int anInt8362;

	@OriginalMember(owner = "client!raa", name = "v", descriptor = "I")
	public final int anInt8365;

	@OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
	public final int anInt8361;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lclient!mp;Lclient!fe;IIIIIIIIIIIII)V")
	public Class139_Sub2(@OriginalArg(0) Class236 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8368 = arg12;
		this.anInt8364 = arg14;
		this.anInt8359 = arg13;
		this.anInt8362 = arg11;
		this.anInt8365 = arg9;
		this.anInt8361 = arg10;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)Lclient!hl;")
	@Override
	public Class148 method9592() {
		return Static198.aClass148_9;
	}
}
