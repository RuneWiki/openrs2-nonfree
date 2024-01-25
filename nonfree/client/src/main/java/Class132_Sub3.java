import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public final class Class132_Sub3 extends Class132 {

	@OriginalMember(owner = "client!vha", name = "v", descriptor = "I")
	public final int anInt10384;

	@OriginalMember(owner = "client!vha", name = "u", descriptor = "I")
	public final int anInt10385;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Lclient!jk;Lclient!tda;IIIIIIIII)V")
	public Class132_Sub3(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt10384 = arg10;
		this.anInt10385 = arg9;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Z)Lclient!wh;")
	@Override
	public Class392 method8802() {
		return Static348.aClass392_4;
	}
}
