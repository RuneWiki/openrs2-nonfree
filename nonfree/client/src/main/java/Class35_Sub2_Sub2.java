import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class35_Sub2_Sub2 extends Class35_Sub2 {

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "Lclient!efa;")
	private Class85_Sub1 aClass85_Sub1_2;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
	private final int anInt5585;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_21;

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
	private final int anInt5588;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
	private final int anInt5587;

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
	private final int anInt5586;

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
	private final int anInt5584;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
	private final int anInt5581;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!dia;IIIIII)V")
	public Class35_Sub2_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5585 = arg6;
		this.aClass13_Sub2_21 = arg0;
		this.anInt5588 = arg2;
		this.anInt5587 = arg4;
		this.anInt5586 = arg1;
		this.anInt5584 = arg5;
		this.anInt5581 = arg3;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Lclient!efa;")
	@Override
	public Class85_Sub1 method5092() {
		if (this.aClass85_Sub1_2 == null) {
			@Pc(17) Interface4 local17 = this.aClass13_Sub2_21.anInterface4_14;
			Static1.anIntArray541[4] = this.anInt5584;
			Static1.anIntArray541[2] = this.anInt5581;
			Static1.anIntArray541[3] = this.anInt5587;
			Static1.anIntArray541[5] = this.anInt5585;
			Static1.anIntArray541[1] = this.anInt5588;
			Static1.anIntArray541[0] = this.anInt5586;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method4672(Static1.anIntArray541[local53])) {
					return null;
				}
				@Pc(71) Class119 local71 = local17.method4673(Static1.anIntArray541[local53]);
				@Pc(78) int local78 = local71.aBoolean292 ? 64 : 128;
				if (local71.aByte58 > 0) {
					local49 = true;
				}
				if (local78 > local51) {
					local51 = local78;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static289.anIntArrayArray29[local97] = local17.method4676(local51, false, local51, 1.0F, Static1.anIntArray541[local97]);
			}
			this.aClass85_Sub1_2 = new Class85_Sub1(this.aClass13_Sub2_21, 6407, local51, local49, Static289.anIntArrayArray29);
		}
		return this.aClass85_Sub1_2;
	}
}
