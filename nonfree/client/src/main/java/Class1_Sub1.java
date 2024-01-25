import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!gga", name = "k", descriptor = "Lclient!tea;")
	public final Class20_Sub4_Sub1 aClass20_Sub4_Sub1_4;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lclient!nv;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass20_Sub4_Sub1_4 = Static383.method6154(arg1, arg2, arg3, arg0);
		this.aClass20_Sub4_Sub1_4.method7626(false, false);
	}
}
