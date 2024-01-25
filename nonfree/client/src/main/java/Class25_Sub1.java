import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
	public final int anInt7827;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(ILclient!eda;Lclient!cga;III)V")
	public Class25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7827 = arg5;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)Lclient!hr;")
	@Override
	public Class146 method8713() {
		return Static635.aClass146_11;
	}
}
