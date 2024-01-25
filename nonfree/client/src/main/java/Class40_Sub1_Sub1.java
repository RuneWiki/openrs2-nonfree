import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class40_Sub1_Sub1 extends Class40_Sub1 {

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "Lclient!vq;")
	private Interface25 anInterface25_1;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	private final int anInt1601;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	private final int anInt1600;

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
	private final int anInt1602;

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "Lclient!ln;")
	private final Class16_Sub1 aClass16_Sub1_3;

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
	private final int anInt1598;

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
	private final int anInt1603;

	@OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
	private final int anInt1605;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!ln;IIIIII)V")
	public Class40_Sub1_Sub1(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1601 = arg3;
		this.anInt1600 = arg5;
		this.anInt1602 = arg2;
		this.aClass16_Sub1_3 = arg0;
		this.anInt1598 = arg4;
		this.anInt1603 = arg1;
		this.anInt1605 = arg6;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Lclient!vq;")
	@Override
	public Interface25 method1385() {
		if (this.anInterface25_1 == null) {
			Static56.anIntArray74[0] = this.anInt1603;
			Static56.anIntArray74[5] = this.anInt1605;
			Static56.anIntArray74[2] = this.anInt1601;
			@Pc(35) Interface2 local35 = this.aClass16_Sub1_3.anInterface2_12;
			Static56.anIntArray74[3] = this.anInt1598;
			Static56.anIntArray74[1] = this.anInt1602;
			Static56.anIntArray74[4] = this.anInt1600;
			@Pc(52) boolean local52 = false;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local35.method4025(Static56.anIntArray74[local56])) {
					return null;
				}
				@Pc(74) Class218 local74 = local35.method4027(Static56.anIntArray74[local56]);
				@Pc(81) int local81 = local74.aBoolean476 ? 64 : 128;
				if (local74.aByte65 > 0) {
					local52 = true;
				}
				if (local81 > local54) {
					local54 = local81;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static144.anIntArrayArray14[local97] = local35.method4026(false, local54, Static56.anIntArray74[local97], 1.0F, local54);
			}
			this.anInterface25_1 = this.aClass16_Sub1_3.method3898(local54, local52, Static144.anIntArrayArray14);
		}
		return this.anInterface25_1;
	}
}
