import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class204_Sub3 extends Class204 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!oi;")
	public final Interface14 anInterface14_4;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!hea;II[B)V")
	public Class204_Sub3(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface14_4 = arg0.method6753(false, Static194.aClass203_8, arg1, arg3, arg2);
		this.anInterface14_4.method2130(false, false);
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!hea;II[I)V")
	public Class204_Sub3(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface14_4 = arg0.method6821(arg1, false, arg3, arg2);
		this.anInterface14_4.method2130(false, false);
	}
}
