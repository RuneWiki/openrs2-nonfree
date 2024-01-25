import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class251_Sub1 extends Class251 {

	@OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
	public final int anInt6892;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(ILclient!tl;Lclient!fn;III)V")
	public Class251_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6892 = arg5;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)Lclient!tca;")
	@Override
	public Class307 method7827() {
		return Static279.aClass307_10;
	}
}
