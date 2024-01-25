import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!vj;")
	public final Class60_Sub4_Sub1 aClass60_Sub4_Sub1_5;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!mm;II[B)V")
	public Class46_Sub2(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass60_Sub4_Sub1_5 = Static369.method5854(arg2, arg3, arg1, arg0);
		this.aClass60_Sub4_Sub1_5.method5849(false, false);
	}
}
