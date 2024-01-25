import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "Lclient!nb;")
	private Class81_Sub3 aClass81_Sub3_1;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
	private final int anInt4420;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
	private final int anInt4423;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
	private final int anInt4419;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_22;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
	private final int anInt4418;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
	private final int anInt4422;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
	private final int anInt4421;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!ic;IIIIII)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4420 = arg5;
		this.anInt4423 = arg3;
		this.anInt4419 = arg1;
		this.aClass48_Sub2_22 = arg0;
		this.anInt4418 = arg6;
		this.anInt4422 = arg4;
		this.anInt4421 = arg2;
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)Lclient!nb;")
	@Override
	public Class81_Sub3 method5620() {
		if (this.aClass81_Sub3_1 == null) {
			Static219.anIntArray322[4] = this.anInt4420;
			Static219.anIntArray322[0] = this.anInt4419;
			Static219.anIntArray322[3] = this.anInt4422;
			Static219.anIntArray322[2] = this.anInt4423;
			@Pc(33) Interface3 local33 = this.aClass48_Sub2_22.anInterface3_4;
			Static219.anIntArray322[1] = this.anInt4421;
			Static219.anIntArray322[5] = this.anInt4418;
			@Pc(45) boolean local45 = false;
			@Pc(47) int local47 = 0;
			@Pc(49) int local49;
			for (local49 = 0; local49 < 6; local49++) {
				if (!local33.method1277(Static219.anIntArray322[local49])) {
					return null;
				}
				@Pc(70) Class166 local70 = local33.method1278(Static219.anIntArray322[local49]);
				@Pc(77) int local77 = local70.aBoolean346 ? 64 : 128;
				if (local70.aByte38 > 0) {
					local45 = true;
				}
				if (local47 < local77) {
					local47 = local77;
				}
			}
			for (local49 = 0; local49 < 6; local49++) {
				Static219.anIntArrayArray22[local49] = local33.method1279(false, Static219.anIntArray322[local49], local47, 1.0F, local47);
			}
			this.aClass81_Sub3_1 = new Class81_Sub3(this.aClass48_Sub2_22, 6407, local47, local45, Static219.anIntArrayArray22);
		}
		return this.aClass81_Sub3_1;
	}
}
