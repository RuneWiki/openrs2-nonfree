import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class86_Sub1_Sub1 extends Class86_Sub1 {

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "Lclient!hg;")
	private Class8_Sub3 aClass8_Sub3_1;

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
	private final int anInt2587;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
	private final int anInt2589;

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
	private final int anInt2586;

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
	private final int anInt2591;

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_14;

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
	private final int anInt2590;

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
	private final int anInt2588;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ih;IIIIII)V")
	public Class86_Sub1_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2587 = arg4;
		this.anInt2589 = arg3;
		this.anInt2586 = arg2;
		this.anInt2591 = arg5;
		this.aClass106_Sub2_14 = arg0;
		this.anInt2590 = arg6;
		this.anInt2588 = arg1;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Lclient!hg;")
	@Override
	public Class8_Sub3 method3600() {
		if (this.aClass8_Sub3_1 == null) {
			Static273.anIntArray499[0] = this.anInt2588;
			Static273.anIntArray499[3] = this.anInt2587;
			Static273.anIntArray499[1] = this.anInt2586;
			Static273.anIntArray499[5] = this.anInt2590;
			Static273.anIntArray499[4] = this.anInt2591;
			@Pc(37) Interface7 local37 = this.aClass106_Sub2_14.anInterface7_10;
			Static273.anIntArray499[2] = this.anInt2589;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local37.method77(Static273.anIntArray499[local48])) {
					return null;
				}
				@Pc(66) Class150 local66 = local37.method78(Static273.anIntArray499[local48]);
				@Pc(73) int local73 = local66.aBoolean272 ? 64 : 128;
				if (local46 < local73) {
					local46 = local73;
				}
				if (local66.aByte51 > 0) {
					local44 = true;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
				Static2.anIntArrayArray1[local91] = local37.method76(Static273.anIntArray499[local91], 1.0F, local46, local46, false);
			}
			this.aClass8_Sub3_1 = new Class8_Sub3(this.aClass106_Sub2_14, 6407, local46, local44, Static2.anIntArrayArray1);
		}
		return this.aClass8_Sub3_1;
	}
}
