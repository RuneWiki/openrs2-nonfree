import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class Class103_Sub2 extends Class103 {

	@OriginalMember(owner = "client!in", name = "x", descriptor = "I")
	public final int anInt8167;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "I")
	public final int anInt8166;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "I")
	public final int anInt8165;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "I")
	public final int anInt8160;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "I")
	public final int anInt8162;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	public final int anInt8161;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!ps;Lclient!ft;IIIIIIIIIIIII)V")
	public Class103_Sub2(@OriginalArg(0) Class291 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8167 = arg11;
		this.anInt8166 = arg12;
		this.anInt8165 = arg10;
		this.anInt8160 = arg14;
		this.anInt8162 = arg13;
		this.anInt8161 = arg9;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class210 method7539() {
		return Static384.aClass210_10;
	}
}
