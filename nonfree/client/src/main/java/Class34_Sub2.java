import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Lclient!ls;")
	public final Class21_Sub2_Sub1 aClass21_Sub2_Sub1_2;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!qg;II[B)V")
	public Class34_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass21_Sub2_Sub1_2 = Static301.method4106(arg0, arg2, arg1, arg3);
		this.aClass21_Sub2_Sub1_2.method3487(false, false);
	}
}
