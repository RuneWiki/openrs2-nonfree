import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class36_Sub1_Sub1 extends Class36_Sub1 {

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "Lclient!gi;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
	private final int anInt573;

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
	private final int anInt574;

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
	private final int anInt571;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
	private final int anInt572;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
	private final int anInt575;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "Lclient!ifa;")
	private final Class44_Sub2 aClass44_Sub2_2;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
	private final int anInt569;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!ifa;IIIIII)V")
	public Class36_Sub1_Sub1(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt573 = arg2;
		this.anInt574 = arg4;
		this.anInt571 = arg1;
		this.anInt572 = arg3;
		this.anInt575 = arg6;
		this.aClass44_Sub2_2 = arg0;
		this.anInt569 = arg5;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)Lclient!gi;")
	@Override
	public Interface13 method523() {
		if (this.anInterface13_1 == null) {
			Static196.anIntArray182[2] = this.anInt572;
			Static196.anIntArray182[4] = this.anInt569;
			Static196.anIntArray182[1] = this.anInt573;
			@Pc(32) Interface11 local32 = this.aClass44_Sub2_2.anInterface11_11;
			Static196.anIntArray182[3] = this.anInt574;
			Static196.anIntArray182[5] = this.anInt575;
			Static196.anIntArray182[0] = this.anInt571;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local32.method7407(Static196.anIntArray182[local53])) {
					return null;
				}
				@Pc(71) Class14 local71 = local32.method7405(Static196.anIntArray182[local53]);
				@Pc(78) int local78 = local71.aBoolean12 ? 64 : 128;
				if (local78 > local51) {
					local51 = local78;
				}
				if (local71.aByte10 > 0) {
					local49 = 1;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static446.anIntArrayArray49[local97] = local32.method7408(local51, false, local51, Static196.anIntArray182[local97], 1.0F);
			}
			this.anInterface13_1 = this.aClass44_Sub2_2.method4364(local51, local49 != 0, Static446.anIntArrayArray49);
		}
		return this.anInterface13_1;
	}
}
