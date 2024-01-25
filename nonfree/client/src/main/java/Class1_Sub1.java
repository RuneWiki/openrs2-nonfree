import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!cca", name = "s", descriptor = "Lclient!oga;")
	public final Interface21 anInterface21_2;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!pj;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface21_2 = arg0.method8030(arg1, arg2, arg3, false, Static202.aClass363_3);
		this.anInterface21_2.method9033(false, false);
	}

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!pj;II[I)V")
	public Class1_Sub1(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface21_2 = arg0.method7982(false, arg2, arg3, arg1);
		this.anInterface21_2.method9033(false, false);
	}
}
