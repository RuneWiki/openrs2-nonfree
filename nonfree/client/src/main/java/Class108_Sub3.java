import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public final class Class108_Sub3 extends Class108 {

	@OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
	public final int anInt9708;

	@OriginalMember(owner = "client!vaa", name = "w", descriptor = "I")
	public final int anInt9711;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!pe;Lclient!op;IIIIIIIII)V")
	public Class108_Sub3(@OriginalArg(0) Class258 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9708 = arg10;
		this.anInt9711 = arg9;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)Lclient!sq;")
	@Override
	public Class307 method8175() {
		return Static115.aClass307_3;
	}
}
