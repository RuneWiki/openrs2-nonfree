import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class65_Sub3 extends Class65 {

	@OriginalMember(owner = "client!md", name = "o", descriptor = "I")
	public final int anInt5465;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	public final int anInt5469;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!dba;Lclient!pa;IIIIIIIIII)V")
	public Class65_Sub3(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5465 = arg10;
		this.anInt5469 = arg11;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lclient!ib;")
	@Override
	public Class140 method7197() {
		return Static72.aClass140_10;
	}
}
