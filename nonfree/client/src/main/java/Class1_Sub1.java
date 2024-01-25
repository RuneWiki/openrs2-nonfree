import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!eba;")
	public final Class85_Sub1_Sub1 aClass85_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!qo;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass85_Sub1_Sub1_1 = Static163.method3529(arg3, arg2, arg0, arg1);
		this.aClass85_Sub1_Sub1_1.method2893(false, false);
	}
}
