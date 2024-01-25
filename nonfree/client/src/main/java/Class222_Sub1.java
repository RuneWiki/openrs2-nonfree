import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public final class Class222_Sub1 extends Class222 {

	@OriginalMember(owner = "client!mja", name = "j", descriptor = "I")
	public final int anInt6034;

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(ILclient!ur;Lclient!cf;III)V")
	public Class222_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6034 = arg5;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)Lclient!hv;")
	@Override
	public Class146 method5444() {
		return Static633.aClass146_39;
	}
}
