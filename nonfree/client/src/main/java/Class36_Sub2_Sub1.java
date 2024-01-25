import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class36_Sub2_Sub1 extends Class36_Sub2 {

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!d;")
	private Class52_Sub2 aClass52_Sub2_1;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	private final int anInt5730;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "I")
	private final int anInt5731;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	private final int anInt5725;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_22;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	private final int anInt5726;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "I")
	private final int anInt5732;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	private final int anInt5727;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ag;IIIIII)V")
	public Class36_Sub2_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5730 = arg6;
		this.anInt5731 = arg1;
		this.anInt5725 = arg5;
		this.aClass12_Sub1_22 = arg0;
		this.anInt5726 = arg2;
		this.anInt5732 = arg4;
		this.anInt5727 = arg3;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Lclient!d;")
	@Override
	public Class52_Sub2 method5045() {
		if (this.aClass52_Sub2_1 == null) {
			Static42.anIntArray43[4] = this.anInt5725;
			@Pc(17) Interface5 local17 = this.aClass12_Sub1_22.anInterface5_10;
			Static42.anIntArray43[5] = this.anInt5730;
			Static42.anIntArray43[2] = this.anInt5727;
			Static42.anIntArray43[0] = this.anInt5731;
			Static42.anIntArray43[1] = this.anInt5726;
			Static42.anIntArray43[3] = this.anInt5732;
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local17.method4045(Static42.anIntArray43[local48])) {
					return null;
				}
				@Pc(66) Class45 local66 = local17.method4043(Static42.anIntArray43[local48]);
				@Pc(73) int local73 = local66.aBoolean124 ? 64 : 128;
				if (local66.aByte27 > 0) {
					local44 = 1;
				}
				if (local46 < local73) {
					local46 = local73;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static555.anIntArrayArray57[local98] = local17.method4048(Static42.anIntArray43[local98], local46, false, 1.0F, local46);
			}
			this.aClass52_Sub2_1 = new Class52_Sub2(this.aClass12_Sub1_22, 6407, local46, local44 != 0, Static555.anIntArrayArray57);
		}
		return this.aClass52_Sub2_1;
	}
}
