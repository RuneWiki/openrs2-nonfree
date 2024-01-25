import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rga", name = "r", descriptor = "Lclient!oh;")
	private Class50_Sub3 aClass50_Sub3_1;

	@OriginalMember(owner = "client!rga", name = "o", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_33;

	@OriginalMember(owner = "client!rga", name = "s", descriptor = "I")
	private final int anInt9139;

	@OriginalMember(owner = "client!rga", name = "w", descriptor = "I")
	private final int anInt9143;

	@OriginalMember(owner = "client!rga", name = "q", descriptor = "I")
	private final int anInt9138;

	@OriginalMember(owner = "client!rga", name = "v", descriptor = "I")
	private final int anInt9142;

	@OriginalMember(owner = "client!rga", name = "u", descriptor = "I")
	private final int anInt9141;

	@OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
	private final int anInt9137;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lclient!lea;IIIIII)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass101_Sub2_33 = arg0;
		this.anInt9139 = arg1;
		this.anInt9143 = arg6;
		this.anInt9138 = arg2;
		this.anInt9142 = arg5;
		this.anInt9141 = arg3;
		this.anInt9137 = arg4;
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)Lclient!oh;")
	@Override
	public Class50_Sub3 method8765() {
		if (this.aClass50_Sub3_1 == null) {
			Static98.anIntArray90[3] = this.anInt9137;
			@Pc(17) Interface3 local17 = this.aClass101_Sub2_33.anInterface3_12;
			Static98.anIntArray90[1] = this.anInt9138;
			Static98.anIntArray90[2] = this.anInt9141;
			Static98.anIntArray90[0] = this.anInt9139;
			Static98.anIntArray90[4] = this.anInt9142;
			Static98.anIntArray90[5] = this.anInt9143;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local17.method1940(Static98.anIntArray90[local48])) {
					return null;
				}
				@Pc(66) Class136 local66 = local17.method1941(Static98.anIntArray90[local48]);
				@Pc(73) int local73 = local66.aBoolean333 ? 64 : 128;
				if (local66.aByte63 > 0) {
					local44 = true;
				}
				if (local46 < local73) {
					local46 = local73;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static336.anIntArrayArray28[local98] = local17.method1938(false, 1.0F, local46, Static98.anIntArray90[local98], local46);
			}
			this.aClass50_Sub3_1 = new Class50_Sub3(this.aClass101_Sub2_33, 6407, local46, local44, Static336.anIntArrayArray28);
		}
		return this.aClass50_Sub3_1;
	}
}
