import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "Lclient!an;")
	public final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!en;II[B)V")
	public Class17_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass16_Sub1_Sub1_1 = Static238.method3727(arg1, arg3, arg2, arg0);
		this.aClass16_Sub1_Sub1_1.method303(false, false);
	}
}
