import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!gka;")
	public final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!he;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface9_3 = arg0.method5714(arg3, arg1, false, arg2, Static60.aClass260_3);
		this.anInterface9_3.method4773(false, false);
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!he;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface9_3 = arg0.method5687(arg1, false, arg2, arg3);
		this.anInterface9_3.method4773(false, false);
	}
}
