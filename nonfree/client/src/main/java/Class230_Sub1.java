import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class230_Sub1 extends Class230 {

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
	public final int anInt7387;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILclient!tl;Lclient!pd;III)V")
	public Class230_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class319 arg1, @OriginalArg(2) Class247 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7387 = arg5;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Lclient!jd;")
	@Override
	public Class153 method6332() {
		return Static90.aClass153_13;
	}
}
