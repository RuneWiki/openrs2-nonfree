import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public final class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!gja", name = "q", descriptor = "I")
	public final int anInt4039;

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(ILclient!rj;Lclient!mq;III)V")
	public Class137_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class318 arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4039 = arg5;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)Lclient!uu;")
	@Override
	public Class369 method8734() {
		return Static272.aClass369_4;
	}
}
