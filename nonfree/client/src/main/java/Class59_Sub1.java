import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Lclient!we;")
	public final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!od;II[B)V")
	public Class59_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass5_Sub1_Sub1_1 = Static16.method2731(arg0, arg2, arg1, arg3);
		this.aClass5_Sub1_Sub1_1.method5547(false, false);
	}
}
