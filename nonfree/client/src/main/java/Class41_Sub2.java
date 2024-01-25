import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
	public final int anInt1912;

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
	public final int anInt1910;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!gq;Lclient!kfa;IIIIIIIII)V")
	public Class41_Sub2(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1912 = arg9;
		this.anInt1910 = arg10;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Lclient!qi;")
	@Override
	public Class275 method8059() {
		return Static555.aClass275_8;
	}
}
