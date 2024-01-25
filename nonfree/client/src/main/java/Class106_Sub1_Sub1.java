import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class106_Sub1_Sub1 extends Class106_Sub1 {

	@OriginalMember(owner = "client!gda", name = "v", descriptor = "Lclient!pj;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!gda", name = "l", descriptor = "Lclient!sf;")
	private final Class16_Sub1 aClass16_Sub1_9;

	@OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
	private final int anInt3466;

	@OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
	private final int anInt3465;

	@OriginalMember(owner = "client!gda", name = "q", descriptor = "I")
	private final int anInt3467;

	@OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
	private final int anInt3470;

	@OriginalMember(owner = "client!gda", name = "r", descriptor = "I")
	private final int anInt3468;

	@OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
	private final int anInt3462;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!sf;IIIIII)V")
	public Class106_Sub1_Sub1(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass16_Sub1_9 = arg0;
		this.anInt3466 = arg6;
		this.anInt3465 = arg4;
		this.anInt3467 = arg2;
		this.anInt3470 = arg1;
		this.anInt3468 = arg3;
		this.anInt3462 = arg5;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)Lclient!pj;")
	@Override
	public Interface20 method3047() {
		if (this.anInterface20_1 == null) {
			Static227.anIntArray286[3] = this.anInt3465;
			@Pc(17) Interface5 local17 = this.aClass16_Sub1_9.anInterface5_12;
			Static227.anIntArray286[0] = this.anInt3470;
			Static227.anIntArray286[5] = this.anInt3466;
			Static227.anIntArray286[4] = this.anInt3462;
			Static227.anIntArray286[2] = this.anInt3468;
			Static227.anIntArray286[1] = this.anInt3467;
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local17.method5197(Static227.anIntArray286[local48])) {
					return null;
				}
				@Pc(66) Class342 local66 = local17.method5193(Static227.anIntArray286[local48]);
				@Pc(73) int local73 = local66.aBoolean695 ? 64 : 128;
				if (local66.aByte125 > 0) {
					local44 = 1;
				}
				if (local73 > local46) {
					local46 = local73;
				}
			}
			for (@Pc(92) int local92 = 0; local92 < 6; local92++) {
				Static58.anIntArrayArray14[local92] = local17.method5192(1.0F, local46, false, Static227.anIntArray286[local92], local46);
			}
			this.anInterface20_1 = this.aClass16_Sub1_9.method6258(local46, local44 != 0, Static58.anIntArrayArray14);
		}
		return this.anInterface20_1;
	}
}
