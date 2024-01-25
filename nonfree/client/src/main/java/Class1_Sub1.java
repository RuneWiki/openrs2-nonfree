import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!gfa", name = "f", descriptor = "Lclient!rc;")
	public final Class80_Sub2_Sub1 aClass80_Sub2_Sub1_5;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!ck;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass80_Sub2_Sub1_5 = Static107.method2042(arg2, arg0, arg3, arg1);
		this.aClass80_Sub2_Sub1_5.method7150(false, false);
	}
}
