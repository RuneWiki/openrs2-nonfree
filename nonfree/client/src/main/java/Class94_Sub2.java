import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class94_Sub2 extends Class94 {

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
	public final int anInt5985;

	@OriginalMember(owner = "client!ms", name = "z", descriptor = "I")
	public final int anInt5986;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!sc;Lclient!ia;IIIIIIIII)V")
	public Class94_Sub2(@OriginalArg(0) Class300 arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5985 = arg10;
		this.anInt5986 = arg9;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)Lclient!ph;")
	@Override
	public Class260 method6943() {
		return Static360.aClass260_6;
	}
}
