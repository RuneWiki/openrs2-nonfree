import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	public final int anInt1472;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(ILclient!ja;Lclient!mea;III)V")
	public Class46_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class154 arg1, @OriginalArg(2) Class201 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1472 = arg5;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!eu;")
	@Override
	public Class95 method6314() {
		return Static590.aClass95_9;
	}
}
