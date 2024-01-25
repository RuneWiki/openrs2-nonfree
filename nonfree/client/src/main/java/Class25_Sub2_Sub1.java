import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class25_Sub2_Sub1 extends Class25_Sub2 {

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!wv;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
	private final int anInt7104;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	private final int anInt7094;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	private final int anInt7095;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	private final int anInt7098;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
	private final int anInt7099;

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "Lclient!cb;")
	private final Class9_Sub1 aClass9_Sub1_16;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
	private final int anInt7105;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!cb;IIIIII)V")
	public Class25_Sub2_Sub1(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7104 = arg2;
		this.anInt7094 = arg1;
		this.anInt7095 = arg6;
		this.anInt7098 = arg3;
		this.anInt7099 = arg4;
		this.aClass9_Sub1_16 = arg0;
		this.anInt7105 = arg5;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Lclient!wv;")
	@Override
	public Interface20 method6076() {
		if (this.anInterface20_1 == null) {
			Static510.anIntArray738[2] = this.anInt7098;
			Static510.anIntArray738[5] = this.anInt7095;
			@Pc(27) Interface8 local27 = this.aClass9_Sub1_16.anInterface8_13;
			Static510.anIntArray738[1] = this.anInt7104;
			Static510.anIntArray738[4] = this.anInt7105;
			Static510.anIntArray738[0] = this.anInt7094;
			Static510.anIntArray738[3] = this.anInt7099;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local27.method7084(Static510.anIntArray738[local53])) {
					return null;
				}
				@Pc(71) Class175 local71 = local27.method7085(Static510.anIntArray738[local53]);
				@Pc(78) int local78 = local71.aBoolean354 ? 64 : 128;
				if (local71.aByte55 > 0) {
					local49 = true;
				}
				if (local78 > local51) {
					local51 = local78;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static277.anIntArrayArray44[local97] = local27.method7088(local51, false, local51, 1.0F, Static510.anIntArray738[local97]);
			}
			this.anInterface20_1 = this.aClass9_Sub1_16.method7770(local51, local49, Static277.anIntArrayArray44);
		}
		return this.anInterface20_1;
	}
}
