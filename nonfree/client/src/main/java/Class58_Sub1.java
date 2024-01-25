import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!cja", name = "s", descriptor = "I")
	public final int anInt1068;

	@OriginalMember(owner = "client!cja", name = "r", descriptor = "I")
	public final int anInt1067;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(Lclient!rj;Lclient!mq;IIIIIIIII)V")
	public Class58_Sub1(@OriginalArg(0) Class318 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1068 = arg10;
		this.anInt1067 = arg9;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)Lclient!uu;")
	@Override
	public Class369 method8734() {
		return Static378.aClass369_10;
	}
}
