import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class91_Sub1 extends Class91 {

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
	public final int anInt2870;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(ILclient!sc;Lclient!ia;III)V")
	public Class91_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class300 arg1, @OriginalArg(2) Class140 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2870 = arg5;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Lclient!ph;")
	@Override
	public Class260 method6943() {
		return Static395.aClass260_10;
	}
}
