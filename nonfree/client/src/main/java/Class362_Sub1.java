import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class362_Sub1 extends Class362 {

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public final int anInt10888;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(ILclient!sd;Lclient!ec;III)V")
	public Class362_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt10888 = arg5;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Lclient!ad;")
	@Override
	public Class6 method9087() {
		return Static225.aClass6_5;
	}
}
