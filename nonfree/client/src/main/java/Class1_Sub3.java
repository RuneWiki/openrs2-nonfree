import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Lclient!mba;")
	public final Class121_Sub2_Sub1 aClass121_Sub2_Sub1_5;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!eq;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass121_Sub2_Sub1_5 = Static370.method5905(arg2, arg3, arg1, arg0);
		this.aClass121_Sub2_Sub1_5.method5567(false, false);
	}
}
