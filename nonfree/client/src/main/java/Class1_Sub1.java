import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "Lclient!uk;")
	public final Class50_Sub4_Sub1 aClass50_Sub4_Sub1_1;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!lea;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass50_Sub4_Sub1_1 = Static266.method4569(arg0, arg1, arg2, arg3);
		this.aClass50_Sub4_Sub1_1.method9152(false, false);
	}
}
