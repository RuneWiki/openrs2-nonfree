import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class56_Sub3 extends Class56 {

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	public final int anInt4362;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
	public final int anInt4363;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!eha;Lclient!oea;IIIIIIIII)V")
	public Class56_Sub3(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4362 = arg9;
		this.anInt4363 = arg10;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Lclient!hm;")
	@Override
	public Class151 method8831() {
		return Static141.aClass151_3;
	}
}
