import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class16_Sub1_Sub2 extends Class16_Sub1 {

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "Lclient!cd;")
	private Class15_Sub1 aClass15_Sub1_2;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
	private final int anInt3510;

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
	private final int anInt3509;

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
	private final int anInt3508;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_24;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
	private final int anInt3506;

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
	private final int anInt3507;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
	private final int anInt3505;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!nm;IIIIII)V")
	public Class16_Sub1_Sub2(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3510 = arg4;
		this.anInt3509 = arg5;
		this.anInt3508 = arg6;
		this.aClass164_Sub1_24 = arg0;
		this.anInt3506 = arg2;
		this.anInt3507 = arg3;
		this.anInt3505 = arg1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)Lclient!cd;")
	@Override
	public Class15_Sub1 method2857() {
		if (this.aClass15_Sub1_2 == null) {
			Static199.anIntArray418[2] = this.anInt3507;
			Static199.anIntArray418[1] = this.anInt3506;
			Static199.anIntArray418[0] = this.anInt3505;
			Static199.anIntArray418[4] = this.anInt3509;
			Static199.anIntArray418[5] = this.anInt3508;
			Static199.anIntArray418[3] = this.anInt3510;
			@Pc(44) Interface2 local44 = this.aClass164_Sub1_24.anInterface2_7;
			@Pc(46) boolean local46 = false;
			@Pc(48) int local48 = 0;
			@Pc(50) int local50;
			for (local50 = 0; local50 < 6; local50++) {
				if (!local44.method4740(Static199.anIntArray418[local50])) {
					return null;
				}
				@Pc(71) Class98 local71 = local44.method4741(Static199.anIntArray418[local50]);
				@Pc(78) int local78 = local71.aBoolean193 ? 64 : 128;
				if (local48 < local78) {
					local48 = local78;
				}
				if (local71.aByte28 > 0) {
					local46 = true;
				}
			}
			for (local50 = 0; local50 < 6; local50++) {
				Static199.anIntArrayArray41[local50] = local44.method4742(local48, Static199.anIntArray418[local50], local48, 1.0F, false);
			}
			this.aClass15_Sub1_2 = new Class15_Sub1(this.aClass164_Sub1_24, 6407, local48, local46, Static199.anIntArrayArray41);
		}
		return this.aClass15_Sub1_2;
	}
}
