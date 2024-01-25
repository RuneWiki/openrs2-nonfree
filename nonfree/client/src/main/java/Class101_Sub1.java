import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public final class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
	public final int anInt2939;

	@OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
	public final int anInt2937;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!ida;Lclient!ce;IIIIIIII)V")
	public Class101_Sub1(@OriginalArg(0) Class148 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		this.anInt2939 = arg9;
		this.anInt2937 = arg8;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lclient!qv;")
	@Override
	public Class271 method8097() {
		return Static260.aClass271_5;
	}
}
