import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class25_Sub1_Sub1 extends Class25_Sub1 {

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Lclient!fp;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	private final int anInt3154;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	private final int anInt3160;

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
	private final int anInt3163;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "Lclient!lba;")
	private final Class132_Sub1 aClass132_Sub1_10;

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
	private final int anInt3162;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	private final int anInt3157;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	private final int anInt3156;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!lba;IIIIII)V")
	public Class25_Sub1_Sub1(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3154 = arg4;
		this.anInt3160 = arg6;
		this.anInt3163 = arg5;
		this.aClass132_Sub1_10 = arg0;
		this.anInt3162 = arg3;
		this.anInt3157 = arg1;
		this.anInt3156 = arg2;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lclient!fp;")
	@Override
	public Interface9 method2637() {
		if (this.anInterface9_1 == null) {
			Static345.anIntArray338[5] = this.anInt3160;
			Static345.anIntArray338[2] = this.anInt3162;
			Static345.anIntArray338[1] = this.anInt3156;
			Static345.anIntArray338[0] = this.anInt3157;
			Static345.anIntArray338[3] = this.anInt3154;
			@Pc(42) Interface6 local42 = this.aClass132_Sub1_10.anInterface6_11;
			Static345.anIntArray338[4] = this.anInt3163;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local42.method7090(Static345.anIntArray338[local53])) {
					return null;
				}
				@Pc(71) Class294 local71 = local42.method7088(Static345.anIntArray338[local53]);
				@Pc(78) int local78 = local71.aBoolean574 ? 64 : 128;
				if (local71.aByte119 > 0) {
					local49 = 1;
				}
				if (local78 > local51) {
					local51 = local78;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static515.anIntArrayArray48[local97] = local42.method7085(local51, false, Static345.anIntArray338[local97], 1.0F, local51);
			}
			this.anInterface9_1 = this.aClass132_Sub1_10.method7528(local49 != 0, local51, Static515.anIntArrayArray48);
		}
		return this.anInterface9_1;
	}
}
