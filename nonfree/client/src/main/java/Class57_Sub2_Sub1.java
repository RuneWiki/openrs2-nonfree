import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class57_Sub2_Sub1 extends Class57_Sub2 {

	@OriginalMember(owner = "client!rca", name = "v", descriptor = "Lclient!iv;")
	private Class10_Sub3 aClass10_Sub3_1;

	@OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
	private final int anInt8076;

	@OriginalMember(owner = "client!rca", name = "w", descriptor = "I")
	private final int anInt8077;

	@OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
	private final int anInt8069;

	@OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
	private final int anInt8078;

	@OriginalMember(owner = "client!rca", name = "m", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_34;

	@OriginalMember(owner = "client!rca", name = "s", descriptor = "I")
	private final int anInt8075;

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "I")
	private final int anInt8068;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!lf;IIIIII)V")
	public Class57_Sub2_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8076 = arg6;
		this.anInt8077 = arg1;
		this.anInt8069 = arg2;
		this.anInt8078 = arg4;
		this.aClass95_Sub3_34 = arg0;
		this.anInt8075 = arg5;
		this.anInt8068 = arg3;
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)Lclient!iv;")
	@Override
	public Class10_Sub3 method8388() {
		if (this.aClass10_Sub3_1 == null) {
			Static292.anIntArray286[2] = this.anInt8068;
			Static292.anIntArray286[1] = this.anInt8069;
			@Pc(22) Interface2 local22 = this.aClass95_Sub3_34.anInterface2_12;
			Static292.anIntArray286[3] = this.anInt8078;
			Static292.anIntArray286[5] = this.anInt8076;
			Static292.anIntArray286[4] = this.anInt8075;
			Static292.anIntArray286[0] = this.anInt8077;
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local22.method8328(Static292.anIntArray286[local48])) {
					return null;
				}
				@Pc(68) Class250 local68 = local22.method8330(Static292.anIntArray286[local48]);
				@Pc(75) int local75 = local68.aBoolean462 ? 64 : 128;
				if (local46 < local75) {
					local46 = local75;
				}
				if (local68.aByte98 > 0) {
					local44 = 1;
				}
			}
			for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
				Static198.anIntArrayArray24[local94] = local22.method8329(local46, local46, false, Static292.anIntArray286[local94], 1.0F);
			}
			this.aClass10_Sub3_1 = new Class10_Sub3(this.aClass95_Sub3_34, 6407, local46, local44 != 0, Static198.anIntArrayArray24);
		}
		return this.aClass10_Sub3_1;
	}
}
