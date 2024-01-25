import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class Class109_Sub2 extends Class109 {

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
	public final int anInt9600;

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
	public final int anInt9605;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!ee;Lclient!haa;IIIIIIIIII)V")
	public Class109_Sub2(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9600 = arg11;
		this.anInt9605 = arg10;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Lclient!hda;")
	@Override
	public Class129 method8540() {
		return Static264.aClass129_6;
	}
}
