import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class55_Sub4 extends Class55 {

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
	private final int anInt7561;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	private final int anInt7565;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	private final int anInt7564;

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
	private final int anInt7563;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class55_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7561 = arg0;
		this.anInt7565 = arg2;
		this.anInt7564 = arg3;
		this.anInt7563 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
	@Override
	public void method6527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7561 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt7565 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt7563 >> 12;
		@Pc(36) int local36 = this.anInt7564 * arg1 >> 12;
		Static147.method2483(local29, super.anInt7553, local36, local22, local10);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	@Override
	public void method6528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7561 >> 12;
		@Pc(17) int local17 = this.anInt7565 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt7563 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt7564 * arg0 >> 12;
		Static54.method1300(super.anInt7555, local17, local10, super.anInt7557, local36, super.anInt7553, local24);
	}
}
