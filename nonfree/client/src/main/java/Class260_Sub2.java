import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class260_Sub2 extends Class260 {

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	public final int anInt8347;

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
	public final int anInt8345;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!ffa;Lclient!oca;IIIIIIIII)V")
	public Class260_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8347 = arg9;
		this.anInt8345 = arg10;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)Lclient!fl;")
	@Override
	public Class103 method7774() {
		return Static244.aClass103_3;
	}
}
