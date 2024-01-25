import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class112_Sub1_Sub1 extends Class112_Sub1 {

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "Lclient!hba;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
	private final int anInt3241;

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
	private final int anInt3243;

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
	private final int anInt3240;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
	private final int anInt3242;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
	private final int anInt3238;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	private final int anInt3237;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "Lclient!nh;")
	private final Class7_Sub1 aClass7_Sub1_9;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!nh;IIIIII)V")
	public Class112_Sub1_Sub1(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3241 = arg3;
		this.anInt3243 = arg1;
		this.anInt3240 = arg2;
		this.anInt3242 = arg6;
		this.anInt3238 = arg5;
		this.anInt3237 = arg4;
		this.aClass7_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Lclient!hba;")
	@Override
	public Interface11 method2600() {
		if (this.anInterface11_1 == null) {
			Static54.anIntArray54[3] = this.anInt3237;
			Static54.anIntArray54[2] = this.anInt3241;
			@Pc(27) Interface7 local27 = this.aClass7_Sub1_9.anInterface7_12;
			Static54.anIntArray54[4] = this.anInt3238;
			Static54.anIntArray54[5] = this.anInt3242;
			Static54.anIntArray54[1] = this.anInt3240;
			Static54.anIntArray54[0] = this.anInt3243;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local27.method4463(Static54.anIntArray54[local53])) {
					return null;
				}
				@Pc(71) Class69 local71 = local27.method4460(Static54.anIntArray54[local53]);
				@Pc(78) int local78 = local71.aBoolean179 ? 64 : 128;
				if (local51 < local78) {
					local51 = local78;
				}
				if (local71.aByte45 > 0) {
					local49 = true;
				}
			}
			for (@Pc(101) int local101 = 0; local101 < 6; local101++) {
				Static75.anIntArrayArray7[local101] = local27.method4462(local51, false, Static54.anIntArray54[local101], 1.0F, local51);
			}
			this.anInterface11_1 = this.aClass7_Sub1_9.method5744(local49, Static75.anIntArrayArray7, local51);
		}
		return this.anInterface11_1;
	}
}
