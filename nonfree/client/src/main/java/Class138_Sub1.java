import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public final class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
	public final int anInt4164;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(ILclient!jg;Lclient!jha;III)V")
	public Class138_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4164 = arg5;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Lclient!jw;")
	@Override
	public Class184 method7078() {
		return Static352.aClass184_7;
	}
}
