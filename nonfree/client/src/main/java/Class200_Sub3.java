import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class200_Sub3 extends Class200 {

	@OriginalMember(owner = "client!po", name = "l", descriptor = "Lclient!ck;")
	public final Class52_Sub1_Sub1 aClass52_Sub1_Sub1_5;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!ag;II[B)V")
	public Class200_Sub3(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass52_Sub1_Sub1_5 = Static463.method6577(arg3, arg1, arg2, arg0);
		this.aClass52_Sub1_Sub1_5.method1504(false, false);
	}
}
