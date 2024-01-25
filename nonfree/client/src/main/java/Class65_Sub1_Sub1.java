import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class65_Sub1_Sub1 extends Class65_Sub1 {

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "Lclient!vfa;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	private final int anInt1988;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
	private final int anInt1991;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	private final int anInt1996;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "Lclient!fo;")
	private final Class9_Sub3 aClass9_Sub3_4;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	private final int anInt1989;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
	private final int anInt1992;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	private final int anInt1986;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!fo;IIIIII)V")
	public Class65_Sub1_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1988 = arg4;
		this.anInt1991 = arg3;
		this.anInt1996 = arg6;
		this.aClass9_Sub3_4 = arg0;
		this.anInt1989 = arg1;
		this.anInt1992 = arg5;
		this.anInt1986 = arg2;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)Lclient!vfa;")
	@Override
	public Interface22 method1834() {
		if (this.anInterface22_1 == null) {
			@Pc(17) Interface2 local17 = this.aClass9_Sub3_4.anInterface2_11;
			Static539.anIntArray808[0] = this.anInt1989;
			Static539.anIntArray808[2] = this.anInt1991;
			Static539.anIntArray808[5] = this.anInt1996;
			Static539.anIntArray808[1] = this.anInt1986;
			Static539.anIntArray808[4] = this.anInt1992;
			Static539.anIntArray808[3] = this.anInt1988;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method3583(Static539.anIntArray808[local53])) {
					return null;
				}
				@Pc(71) Class296 local71 = local17.method3585(Static539.anIntArray808[local53]);
				@Pc(78) int local78 = local71.aBoolean661 ? 64 : 128;
				if (local71.aByte106 > 0) {
					local49 = true;
				}
				if (local51 < local78) {
					local51 = local78;
				}
			}
			for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
				Static278.anIntArrayArray39[local100] = local17.method3582(1.0F, false, local51, Static539.anIntArray808[local100], local51);
			}
			this.anInterface22_1 = this.aClass9_Sub3_4.method5476(local49, Static278.anIntArrayArray39, local51);
		}
		return this.anInterface22_1;
	}
}
