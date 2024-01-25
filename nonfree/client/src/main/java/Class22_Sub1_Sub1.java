import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class22_Sub1_Sub1 extends Class22_Sub1 {

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!ni;")
	private Class88_Sub3 aClass88_Sub3_1;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
	private final int anInt9309;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
	private final int anInt9311;

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
	private final int anInt9310;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	private final int anInt9306;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_39;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
	private final int anInt9313;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	private final int anInt9307;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!oea;IIIIII)V")
	public Class22_Sub1_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9309 = arg3;
		this.anInt9311 = arg2;
		this.anInt9310 = arg4;
		this.anInt9306 = arg1;
		this.aClass87_Sub2_39 = arg0;
		this.anInt9313 = arg6;
		this.anInt9307 = arg5;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lclient!ni;")
	@Override
	public Class88_Sub3 method8508() {
		if (this.aClass88_Sub3_1 == null) {
			Static437.anIntArray531[3] = this.anInt9310;
			Static437.anIntArray531[0] = this.anInt9306;
			Static437.anIntArray531[1] = this.anInt9311;
			@Pc(35) Interface6 local35 = this.aClass87_Sub2_39.anInterface6_11;
			Static437.anIntArray531[2] = this.anInt9309;
			Static437.anIntArray531[4] = this.anInt9307;
			Static437.anIntArray531[5] = this.anInt9313;
			@Pc(52) boolean local52 = false;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local35.method6355(Static437.anIntArray531[local56])) {
					return null;
				}
				@Pc(74) Class199 local74 = local35.method6357(Static437.anIntArray531[local56]);
				@Pc(81) int local81 = local74.aBoolean428 ? 64 : 128;
				if (local74.aByte85 > 0) {
					local52 = true;
				}
				if (local81 > local54) {
					local54 = local81;
				}
			}
			for (@Pc(104) int local104 = 0; local104 < 6; local104++) {
				Static627.anIntArrayArray103[local104] = local35.method6354(1.0F, local54, false, Static437.anIntArray531[local104], local54);
			}
			this.aClass88_Sub3_1 = new Class88_Sub3(this.aClass87_Sub2_39, 6407, local54, local52, Static627.anIntArrayArray103);
		}
		return this.aClass88_Sub3_1;
	}
}
