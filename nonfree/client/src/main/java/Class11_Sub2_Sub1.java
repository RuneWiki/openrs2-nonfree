import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 {

	@OriginalMember(owner = "client!wia", name = "r", descriptor = "Lclient!bv;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!wia", name = "l", descriptor = "I")
	private final int anInt10347;

	@OriginalMember(owner = "client!wia", name = "u", descriptor = "Lclient!wk;")
	private final Class143_Sub1 aClass143_Sub1_23;

	@OriginalMember(owner = "client!wia", name = "n", descriptor = "I")
	private final int anInt10349;

	@OriginalMember(owner = "client!wia", name = "m", descriptor = "I")
	private final int anInt10348;

	@OriginalMember(owner = "client!wia", name = "w", descriptor = "I")
	private final int anInt10354;

	@OriginalMember(owner = "client!wia", name = "x", descriptor = "I")
	private final int anInt10355;

	@OriginalMember(owner = "client!wia", name = "p", descriptor = "I")
	private final int anInt10350;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!wk;IIIIII)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt10347 = arg2;
		this.aClass143_Sub1_23 = arg0;
		this.anInt10349 = arg5;
		this.anInt10348 = arg6;
		this.anInt10354 = arg1;
		this.anInt10355 = arg4;
		this.anInt10350 = arg3;
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(I)Lclient!bv;")
	@Override
	public Interface1 method8638() {
		if (this.anInterface1_1 == null) {
			Static608.anIntArray562[2] = this.anInt10350;
			Static608.anIntArray562[3] = this.anInt10355;
			Static608.anIntArray562[5] = this.anInt10348;
			Static608.anIntArray562[0] = this.anInt10354;
			@Pc(37) Interface3 local37 = this.aClass143_Sub1_23.anInterface3_11;
			Static608.anIntArray562[1] = this.anInt10347;
			Static608.anIntArray562[4] = this.anInt10349;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local37.method8500(Static608.anIntArray562[local53])) {
					return null;
				}
				@Pc(71) Class331 local71 = local37.method8501(Static608.anIntArray562[local53]);
				@Pc(78) int local78 = local71.aBoolean659 ? 64 : 128;
				if (local71.aByte119 > 0) {
					local49 = 1;
				}
				if (local51 < local78) {
					local51 = local78;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static429.anIntArrayArray54[local98] = local37.method8499(Static608.anIntArray562[local98], local51, false, 1.0F, local51);
			}
			this.anInterface1_1 = this.aClass143_Sub1_23.method6300(Static429.anIntArrayArray54, local49 != 0, local51);
		}
		return this.anInterface1_1;
	}
}
