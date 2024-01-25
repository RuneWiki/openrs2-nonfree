import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class21_Sub1_Sub2 extends Class21_Sub1 {

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "Lclient!bl;")
	private Class20_Sub1 aClass20_Sub1_2;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	private final int anInt5347;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
	private final int anInt5351;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	private final int anInt5349;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
	private final int anInt5346;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
	private final int anInt5348;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
	private final int anInt5350;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_36;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!fu;IIIIII)V")
	public Class21_Sub1_Sub2(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5347 = arg2;
		this.anInt5351 = arg4;
		this.anInt5349 = arg6;
		this.anInt5346 = arg1;
		this.anInt5348 = arg3;
		this.anInt5350 = arg5;
		this.aClass63_Sub2_36 = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)Lclient!bl;")
	@Override
	public Class20_Sub1 method4646() {
		if (this.aClass20_Sub1_2 == null) {
			@Pc(13) Interface9 local13 = this.aClass63_Sub2_36.anInterface9_3;
			Static313.anIntArray1058[5] = this.anInt5349;
			Static313.anIntArray1058[1] = this.anInt5347;
			Static313.anIntArray1058[0] = this.anInt5346;
			Static313.anIntArray1058[4] = this.anInt5350;
			Static313.anIntArray1058[2] = this.anInt5348;
			Static313.anIntArray1058[3] = this.anInt5351;
			@Pc(45) boolean local45 = false;
			@Pc(47) int local47 = 0;
			@Pc(49) int local49;
			for (local49 = 0; local49 < 6; local49++) {
				if (!local13.method142(Static313.anIntArray1058[local49])) {
					return null;
				}
				@Pc(69) Class132 local69 = local13.method139(Static313.anIntArray1058[local49]);
				@Pc(76) int local76 = local69.aBoolean249 ? 64 : 128;
				if (local76 > local47) {
					local47 = local76;
				}
				if (local69.aByte30 > 0) {
					local45 = true;
				}
			}
			for (local49 = 0; local49 < 6; local49++) {
				Static313.anIntArrayArray41[local49] = local13.method143(Static313.anIntArray1058[local49], local47, local47, false, 1.0F);
			}
			this.aClass20_Sub1_2 = new Class20_Sub1(this.aClass63_Sub2_36, 6407, local47, local45, Static313.anIntArrayArray41);
		}
		return this.aClass20_Sub1_2;
	}
}
