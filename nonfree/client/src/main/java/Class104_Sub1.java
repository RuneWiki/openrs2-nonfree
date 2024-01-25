import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!er", name = "s", descriptor = "I")
	public final int anInt2791;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "I")
	public final int anInt2790;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!lea;Lclient!taa;IIIIIIIII)V")
	public Class104_Sub1(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt2791 = arg9;
		this.anInt2790 = arg10;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)Lclient!vf;")
	@Override
	public Class390 method7510() {
		return Static56.aClass390_2;
	}
}
