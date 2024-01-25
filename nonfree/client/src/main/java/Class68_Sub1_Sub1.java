import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class68_Sub1_Sub1 extends Class68_Sub1 {

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!mia;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
	private final int anInt10353;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!wg;")
	private final Class33_Sub2 aClass33_Sub2_23;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	private final int anInt10354;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	private final int anInt10349;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	private final int anInt10347;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
	private final int anInt10351;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	private final int anInt10350;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!wg;IIIIII)V")
	public Class68_Sub1_Sub1(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt10353 = arg4;
		this.aClass33_Sub2_23 = arg0;
		this.anInt10354 = arg3;
		this.anInt10349 = arg2;
		this.anInt10347 = arg1;
		this.anInt10351 = arg5;
		this.anInt10350 = arg6;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lclient!mia;")
	@Override
	public Interface17 method8742() {
		if (this.anInterface17_1 == null) {
			Static377.anIntArray432[1] = this.anInt10349;
			Static377.anIntArray432[4] = this.anInt10351;
			Static377.anIntArray432[3] = this.anInt10353;
			Static377.anIntArray432[5] = this.anInt10350;
			Static377.anIntArray432[2] = this.anInt10354;
			Static377.anIntArray432[0] = this.anInt10347;
			@Pc(42) Interface9 local42 = this.aClass33_Sub2_23.anInterface9_12;
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local42.method1557(Static377.anIntArray432[local48])) {
					return null;
				}
				@Pc(66) Class130 local66 = local42.method1558(Static377.anIntArray432[local48]);
				@Pc(73) int local73 = local66.aBoolean236 ? 64 : 128;
				if (local66.aByte37 > 0) {
					local44 = 1;
				}
				if (local46 < local73) {
					local46 = local73;
				}
			}
			for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
				Static442.anIntArrayArray41[local89] = local42.method1555(Static377.anIntArray432[local89], 1.0F, false, local46, local46);
			}
			this.anInterface17_1 = this.aClass33_Sub2_23.method8251(local44 != 0, Static442.anIntArrayArray41, local46);
		}
		return this.anInterface17_1;
	}
}
