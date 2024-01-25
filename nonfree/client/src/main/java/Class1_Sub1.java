import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "Lclient!gda;")
	public final Class44_Sub1_Sub1 aClass44_Sub1_Sub1_1;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!ml;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass44_Sub1_Sub1_1 = Static352.method5393(arg2, arg3, arg0, arg1);
		this.aClass44_Sub1_Sub1_1.method3476(false, false);
	}
}
