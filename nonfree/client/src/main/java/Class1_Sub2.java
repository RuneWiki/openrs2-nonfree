import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "Lclient!qd;")
	public final Class24_Sub4_Sub1 aClass24_Sub4_Sub1_2;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!rda;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass24_Sub4_Sub1_2 = Static163.method2450(arg3, arg0, arg2, arg1);
		this.aClass24_Sub4_Sub1_2.method6792(false, false);
	}
}
