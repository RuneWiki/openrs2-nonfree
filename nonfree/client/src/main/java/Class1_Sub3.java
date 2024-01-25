import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!m;")
	public final Class88_Sub2_Sub1 aClass88_Sub2_Sub1_3;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!oea;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass88_Sub2_Sub1_3 = Static608.method2888(arg3, arg1, arg2, arg0);
		this.aClass88_Sub2_Sub1_3.method5202(false, false);
	}
}
