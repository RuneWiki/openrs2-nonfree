import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class130_Sub2_Sub1 extends Class130_Sub2 {

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "Lclient!io;")
	private Class167_Sub1 aClass167_Sub1_1;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
	private final int anInt3977;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_9;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
	private final int anInt3985;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
	private final int anInt3980;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	private final int anInt3976;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
	private final int anInt3979;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
	private final int anInt3984;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!rs;IIIIII)V")
	public Class130_Sub2_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3977 = arg6;
		this.aClass133_Sub3_9 = arg0;
		this.anInt3985 = arg3;
		this.anInt3980 = arg5;
		this.anInt3976 = arg2;
		this.anInt3979 = arg1;
		this.anInt3984 = arg4;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class167_Sub1 method5475() {
		if (this.aClass167_Sub1_1 == null) {
			Static190.anIntArray185[5] = this.anInt3977;
			Static190.anIntArray185[0] = this.anInt3979;
			Static190.anIntArray185[4] = this.anInt3980;
			@Pc(32) Interface3 local32 = this.aClass133_Sub3_9.anInterface3_12;
			Static190.anIntArray185[2] = this.anInt3985;
			Static190.anIntArray185[1] = this.anInt3976;
			Static190.anIntArray185[3] = this.anInt3984;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local32.method4654(Static190.anIntArray185[local53])) {
					return null;
				}
				@Pc(71) Class145 local71 = local32.method4656(Static190.anIntArray185[local53]);
				@Pc(78) int local78 = local71.aBoolean293 ? 64 : 128;
				if (local71.aByte63 > 0) {
					local49 = true;
				}
				if (local78 > local51) {
					local51 = local78;
				}
			}
			for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
				Static409.anIntArrayArray15[local94] = local32.method4653(1.0F, local51, Static190.anIntArray185[local94], local51, false);
			}
			this.aClass167_Sub1_1 = new Class167_Sub1(this.aClass133_Sub3_9, 6407, local51, local49, Static409.anIntArrayArray15);
		}
		return this.aClass167_Sub1_1;
	}
}
