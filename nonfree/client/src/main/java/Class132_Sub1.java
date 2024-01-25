import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	public final int anInt6615;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILclient!or;Lclient!ma;III)V")
	public Class132_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class216 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6615 = arg5;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!oh;")
	@Override
	public Class252 method6715() {
		return Static429.aClass252_15;
	}
}
