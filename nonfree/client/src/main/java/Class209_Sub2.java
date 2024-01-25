import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class209_Sub2 extends Class209 {

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Lclient!hc;")
	public final Interface8 anInterface8_4;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!kw;II[B)V")
	public Class209_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface8_4 = arg0.method6198(false, arg3, arg1, arg2, Static160.aClass150_3);
		this.anInterface8_4.method5780(false, false);
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!kw;II[I)V")
	public Class209_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface8_4 = arg0.method6106(arg3, false, arg2, arg1);
		this.anInterface8_4.method5780(false, false);
	}
}
