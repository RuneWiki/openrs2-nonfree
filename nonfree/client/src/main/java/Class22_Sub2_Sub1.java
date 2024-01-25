import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class22_Sub2_Sub1 extends Class22_Sub2 {

	@OriginalMember(owner = "client!gga", name = "r", descriptor = "Lclient!saa;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!gga", name = "w", descriptor = "I")
	private final int anInt3996;

	@OriginalMember(owner = "client!gga", name = "s", descriptor = "I")
	private final int anInt3994;

	@OriginalMember(owner = "client!gga", name = "v", descriptor = "I")
	private final int anInt3995;

	@OriginalMember(owner = "client!gga", name = "z", descriptor = "I")
	private final int anInt3998;

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "I")
	private final int anInt3989;

	@OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
	private final int anInt3993;

	@OriginalMember(owner = "client!gga", name = "u", descriptor = "Lclient!gt;")
	private final Class87_Sub1 aClass87_Sub1_7;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lclient!gt;IIIIII)V")
	public Class22_Sub2_Sub1(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3996 = arg5;
		this.anInt3994 = arg1;
		this.anInt3995 = arg6;
		this.anInt3998 = arg3;
		this.anInt3989 = arg2;
		this.anInt3993 = arg4;
		this.aClass87_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Lclient!saa;")
	@Override
	public Interface22 method3286() {
		if (this.anInterface22_1 == null) {
			Static109.anIntArray195[5] = this.anInt3995;
			Static109.anIntArray195[1] = this.anInt3989;
			Static109.anIntArray195[4] = this.anInt3996;
			Static109.anIntArray195[0] = this.anInt3994;
			Static109.anIntArray195[3] = this.anInt3993;
			@Pc(43) Interface6 local43 = this.aClass87_Sub1_7.anInterface6_11;
			Static109.anIntArray195[2] = this.anInt3998;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local43.method6355(Static109.anIntArray195[local54])) {
					return null;
				}
				@Pc(76) Class199 local76 = local43.method6357(Static109.anIntArray195[local54]);
				@Pc(83) int local83 = local76.aBoolean428 ? 64 : 128;
				if (local52 < local83) {
					local52 = local83;
				}
				if (local76.aByte85 > 0) {
					local50 = true;
				}
			}
			for (@Pc(105) int local105 = 0; local105 < 6; local105++) {
				Static225.anIntArrayArray36[local105] = local43.method6354(1.0F, local52, false, Static109.anIntArray195[local105], local52);
			}
			this.anInterface22_1 = this.aClass87_Sub1_7.method5150(local50, local52, Static225.anIntArrayArray36);
		}
		return this.anInterface22_1;
	}
}
