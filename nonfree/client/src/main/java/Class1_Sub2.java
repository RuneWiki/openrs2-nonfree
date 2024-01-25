import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Lclient!oq;")
	public final Interface20 anInterface20_2;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!ln;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface20_2 = arg0.method4005(arg3, Static526.aClass366_11, arg1, arg2, false);
		this.anInterface20_2.method6623(false, false);
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!ln;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface20_2 = arg0.method3948(arg3, arg2, arg1, false);
		this.anInterface20_2.method6623(false, false);
	}
}
