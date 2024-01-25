import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class36_Sub1_Sub1 extends Class36_Sub1 {

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "Lclient!jn;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
	private final int anInt1237;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
	private final int anInt1244;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
	private final int anInt1242;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
	private final int anInt1236;

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
	private final int anInt1243;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	private final int anInt1240;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "Lclient!qq;")
	private final Class12_Sub2 aClass12_Sub2_4;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!qq;IIIIII)V")
	public Class36_Sub1_Sub1(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1237 = arg6;
		this.anInt1244 = arg3;
		this.anInt1242 = arg5;
		this.anInt1236 = arg2;
		this.anInt1243 = arg1;
		this.anInt1240 = arg4;
		this.aClass12_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)Lclient!jn;")
	@Override
	public Interface12 method1133() {
		if (this.anInterface12_1 == null) {
			Static287.anIntArray371[1] = this.anInt1236;
			Static287.anIntArray371[5] = this.anInt1237;
			Static287.anIntArray371[0] = this.anInt1243;
			Static287.anIntArray371[4] = this.anInt1242;
			Static287.anIntArray371[3] = this.anInt1240;
			@Pc(42) Interface5 local42 = this.aClass12_Sub2_4.anInterface5_10;
			Static287.anIntArray371[2] = this.anInt1244;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local42.method4045(Static287.anIntArray371[local53])) {
					return null;
				}
				@Pc(71) Class45 local71 = local42.method4043(Static287.anIntArray371[local53]);
				@Pc(78) int local78 = local71.aBoolean124 ? 64 : 128;
				if (local51 < local78) {
					local51 = local78;
				}
				if (local71.aByte27 > 0) {
					local49 = 1;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static273.anIntArrayArray33[local98] = local42.method4048(Static287.anIntArray371[local98], local51, false, 1.0F, local51);
			}
			this.anInterface12_1 = this.aClass12_Sub2_4.method6248(local51, local49 != 0, Static273.anIntArrayArray33);
		}
		return this.anInterface12_1;
	}
}
