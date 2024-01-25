import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
	private final int anInt3860;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
	private final int anInt3861;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
	private final int anInt3863;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	private final int anInt3866;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIIII)V")
	public Class55_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3860 = arg2;
		this.anInt3861 = arg3;
		this.anInt3863 = arg1;
		this.anInt3866 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
	@Override
	public void method6528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3866 >> 12;
		@Pc(17) int local17 = this.anInt3860 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt3863 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt3861 * arg0 >> 12;
		Static389.method5285(local10, local17, local24, local31, super.anInt7555, super.anInt7557);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3866 * arg1 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt3860 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt3863 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt3861 >> 12;
		Static373.method2512(super.anInt7557, local36, local22, local10, super.anInt7553, super.anInt7555, local29);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(III)V")
	@Override
	public void method6527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = arg0 * this.anInt3866 >> 12;
		@Pc(27) int local27 = arg0 * this.anInt3860 >> 12;
		@Pc(34) int local34 = arg1 * this.anInt3863 >> 12;
		@Pc(41) int local41 = arg1 * this.anInt3861 >> 12;
		Static77.method1634(local34, local27, local20, local41, super.anInt7553);
	}
}
