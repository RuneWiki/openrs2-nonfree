import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class113_Sub1_Sub1 extends Class113_Sub1 {

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!ih;")
	private Class18_Sub2 aClass18_Sub2_1;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	private final int anInt3596;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_23;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	private final int anInt3597;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private final int anInt3594;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	private final int anInt3595;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	private final int anInt3598;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	private final int anInt3593;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!hj;IIIIII)V")
	public Class113_Sub1_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3596 = arg6;
		this.aClass2_Sub1_23 = arg0;
		this.anInt3597 = arg1;
		this.anInt3594 = arg4;
		this.anInt3595 = arg5;
		this.anInt3598 = arg2;
		this.anInt3593 = arg3;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Lclient!ih;")
	@Override
	public Class18_Sub2 method4247() {
		if (this.aClass18_Sub2_1 == null) {
			Static173.anIntArray422[4] = this.anInt3595;
			Static173.anIntArray422[3] = this.anInt3594;
			Static173.anIntArray422[1] = this.anInt3598;
			Static173.anIntArray422[2] = this.anInt3593;
			Static173.anIntArray422[0] = this.anInt3597;
			@Pc(40) Interface7 local40 = this.aClass2_Sub1_23.anInterface7_5;
			Static173.anIntArray422[5] = this.anInt3596;
			@Pc(47) boolean local47 = false;
			@Pc(49) int local49 = 0;
			@Pc(51) int local51;
			for (local51 = 0; local51 < 6; local51++) {
				if (!local40.method2789(Static173.anIntArray422[local51])) {
					return null;
				}
				@Pc(71) Class215 local71 = local40.method2788(Static173.anIntArray422[local51]);
				@Pc(78) int local78 = local71.aBoolean566 ? 64 : 128;
				if (local71.aByte68 > 0) {
					local47 = true;
				}
				if (local49 < local78) {
					local49 = local78;
				}
			}
			for (local51 = 0; local51 < 6; local51++) {
				Static173.anIntArrayArray36[local51] = local40.method2786(1.0F, Static173.anIntArray422[local51], local49, false, local49);
			}
			this.aClass18_Sub2_1 = new Class18_Sub2(this.aClass2_Sub1_23, 6407, local49, local47, Static173.anIntArrayArray36);
		}
		return this.aClass18_Sub2_1;
	}
}
