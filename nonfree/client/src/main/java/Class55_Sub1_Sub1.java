import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class55_Sub1_Sub1 extends Class55_Sub1 {

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "Lclient!pu;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
	private final int anInt3026;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
	private final int anInt3023;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
	private final int anInt3028;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	private final int anInt3027;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
	private final int anInt3022;

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
	private final int anInt3024;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "Lclient!cf;")
	private final Class43_Sub1 aClass43_Sub1_8;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!cf;IIIIII)V")
	public Class55_Sub1_Sub1(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3026 = arg3;
		this.anInt3023 = arg2;
		this.anInt3028 = arg4;
		this.anInt3027 = arg1;
		this.anInt3022 = arg5;
		this.anInt3024 = arg6;
		this.aClass43_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Lclient!pu;")
	@Override
	public Interface20 method2720() {
		if (this.anInterface20_1 == null) {
			Static593.anIntArray701[0] = this.anInt3027;
			Static593.anIntArray701[1] = this.anInt3023;
			@Pc(28) Interface8 local28 = this.aClass43_Sub1_8.anInterface8_12;
			Static593.anIntArray701[4] = this.anInt3022;
			Static593.anIntArray701[2] = this.anInt3026;
			Static593.anIntArray701[3] = this.anInt3028;
			Static593.anIntArray701[5] = this.anInt3024;
			@Pc(50) byte local50 = 0;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local28.method6559(Static593.anIntArray701[local54])) {
					return null;
				}
				@Pc(72) Class224 local72 = local28.method6560(Static593.anIntArray701[local54]);
				@Pc(79) int local79 = local72.aBoolean490 ? 64 : 128;
				if (local52 < local79) {
					local52 = local79;
				}
				if (local72.aByte72 > 0) {
					local50 = 1;
				}
			}
			for (@Pc(99) int local99 = 0; local99 < 6; local99++) {
				Static419.anIntArrayArray65[local99] = local28.method6555(Static593.anIntArray701[local99], false, 1.0F, local52, local52);
			}
			this.anInterface20_1 = this.aClass43_Sub1_8.method4220(local50 != 0, Static419.anIntArrayArray65, local52);
		}
		return this.anInterface20_1;
	}
}
