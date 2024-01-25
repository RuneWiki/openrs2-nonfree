import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class77_Sub2_Sub1 extends Class77_Sub2 {

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Lclient!gr;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
	private final int anInt6316;

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
	private final int anInt6321;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
	private final int anInt6315;

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
	private final int anInt6317;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "Lclient!nb;")
	private final Class67_Sub1 aClass67_Sub1_12;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
	private final int anInt6314;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
	private final int anInt6320;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!nb;IIIIII)V")
	public Class77_Sub2_Sub1(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6316 = arg1;
		this.anInt6321 = arg5;
		this.anInt6315 = arg2;
		this.anInt6317 = arg6;
		this.aClass67_Sub1_12 = arg0;
		this.anInt6314 = arg3;
		this.anInt6320 = arg4;
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Lclient!gr;")
	@Override
	public Interface7 method5355() {
		if (this.anInterface7_1 == null) {
			Static87.anIntArray89[3] = this.anInt6320;
			Static87.anIntArray89[5] = this.anInt6317;
			Static87.anIntArray89[4] = this.anInt6321;
			Static87.anIntArray89[2] = this.anInt6314;
			@Pc(41) Interface2 local41 = this.aClass67_Sub1_12.anInterface2_11;
			Static87.anIntArray89[1] = this.anInt6315;
			Static87.anIntArray89[0] = this.anInt6316;
			@Pc(53) byte local53 = 0;
			@Pc(55) int local55 = 0;
			for (@Pc(57) int local57 = 0; local57 < 6; local57++) {
				if (!local41.method1024(Static87.anIntArray89[local57])) {
					return null;
				}
				@Pc(78) Class32 local78 = local41.method1027(Static87.anIntArray89[local57]);
				@Pc(86) int local86 = local78.aBoolean71 ? 64 : 128;
				if (local78.aByte21 > 0) {
					local53 = 1;
				}
				if (local55 < local86) {
					local55 = local86;
				}
			}
			for (@Pc(106) int local106 = 0; local106 < 6; local106++) {
				Static723.anIntArrayArray64[local106] = local41.method1025(local55, local55, 1.0F, Static87.anIntArray89[local106], false);
			}
			this.anInterface7_1 = this.aClass67_Sub1_12.method5599(local53 != 0, local55, Static723.anIntArrayArray64);
		}
		return this.anInterface7_1;
	}
}
