import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
	public final int anInt7262;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
	public final int anInt7256;

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
	public final int anInt7260;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
	public final int anInt7257;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
	public final int anInt7255;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
	public final int anInt7258;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!al;Lclient!mfa;IIIIIIIIIIIII)V")
	public Class33_Sub2(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt7262 = arg10;
		this.anInt7256 = arg14;
		this.anInt7260 = arg11;
		this.anInt7257 = arg9;
		this.anInt7255 = arg12;
		this.anInt7258 = arg13;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class152 method9627() {
		return Static639.aClass152_7;
	}
}
