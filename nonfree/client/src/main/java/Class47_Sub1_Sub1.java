import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class47_Sub1_Sub1 extends Class47_Sub1 {

	@OriginalMember(owner = "client!sca", name = "v", descriptor = "Lclient!pfa;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
	private final int anInt8352;

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
	private final int anInt8349;

	@OriginalMember(owner = "client!sca", name = "r", descriptor = "I")
	private final int anInt8351;

	@OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
	private final int anInt8354;

	@OriginalMember(owner = "client!sca", name = "t", descriptor = "I")
	private final int anInt8353;

	@OriginalMember(owner = "client!sca", name = "p", descriptor = "Lclient!rr;")
	private final Class31_Sub1 aClass31_Sub1_18;

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
	private final int anInt8347;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!rr;IIIIII)V")
	public Class47_Sub1_Sub1(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8352 = arg5;
		this.anInt8349 = arg1;
		this.anInt8351 = arg4;
		this.anInt8354 = arg2;
		this.anInt8353 = arg6;
		this.aClass31_Sub1_18 = arg0;
		this.anInt8347 = arg3;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)Lclient!pfa;")
	@Override
	public Interface18 method6554() {
		if (this.anInterface18_1 == null) {
			Static364.anIntArray358[2] = this.anInt8347;
			Static364.anIntArray358[5] = this.anInt8353;
			Static364.anIntArray358[4] = this.anInt8352;
			Static364.anIntArray358[3] = this.anInt8351;
			@Pc(37) Interface4 local37 = this.aClass31_Sub1_18.anInterface4_14;
			Static364.anIntArray358[1] = this.anInt8354;
			Static364.anIntArray358[0] = this.anInt8349;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local37.method7227(Static364.anIntArray358[local53])) {
					return null;
				}
				@Pc(71) Class172 local71 = local37.method7229(Static364.anIntArray358[local53]);
				@Pc(78) int local78 = local71.aBoolean358 ? 64 : 128;
				if (local78 > local51) {
					local51 = local78;
				}
				if (local71.aByte59 > 0) {
					local49 = true;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static261.anIntArrayArray52[local98] = local37.method7226(local51, Static364.anIntArray358[local98], false, local51, 1.0F);
			}
			this.anInterface18_1 = this.aClass31_Sub1_18.method7053(local49, Static261.anIntArrayArray52, local51);
		}
		return this.anInterface18_1;
	}
}
