import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	public final int anInt10350;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(ILclient!ada;Lclient!oe;III)V")
	public Class47_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class249 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt10350 = arg5;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Lclient!of;")
	@Override
	public Class251 method8737() {
		return Static395.aClass251_4;
	}
}
