import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class82_Sub1_Sub1 extends Class82_Sub1 {

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "Lclient!gh;")
	private Class19_Sub3 aClass19_Sub3_1;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	private final int anInt6434;

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_34;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
	private final int anInt6436;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
	private final int anInt6437;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
	private final int anInt6439;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	private final int anInt6435;

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
	private final int anInt6438;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!rl;IIIIII)V")
	public Class82_Sub1_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6434 = arg4;
		this.aClass66_Sub2_34 = arg0;
		this.anInt6436 = arg2;
		this.anInt6437 = arg5;
		this.anInt6439 = arg3;
		this.anInt6435 = arg6;
		this.anInt6438 = arg1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Lclient!gh;")
	@Override
	public Class19_Sub3 method5702() {
		if (this.aClass19_Sub3_1 == null) {
			@Pc(17) Interface8 local17 = this.aClass66_Sub2_34.anInterface8_5;
			Static421.anIntArray516[3] = this.anInt6434;
			Static421.anIntArray516[4] = this.anInt6437;
			Static421.anIntArray516[2] = this.anInt6439;
			Static421.anIntArray516[1] = this.anInt6436;
			Static421.anIntArray516[5] = this.anInt6435;
			Static421.anIntArray516[0] = this.anInt6438;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method5562(Static421.anIntArray516[local53])) {
					return null;
				}
				@Pc(73) Class184 local73 = local17.method5566(Static421.anIntArray516[local53]);
				@Pc(80) int local80 = local73.aBoolean325 ? 64 : 128;
				if (local80 > local51) {
					local51 = local80;
				}
				if (local73.aByte71 > 0) {
					local49 = true;
				}
			}
			for (@Pc(105) int local105 = 0; local105 < 6; local105++) {
				Static438.anIntArrayArray58[local105] = local17.method5563(Static421.anIntArray516[local105], local51, false, 1.0F, local51);
			}
			this.aClass19_Sub3_1 = new Class19_Sub3(this.aClass66_Sub2_34, 6407, local51, local49, Static438.anIntArrayArray58);
		}
		return this.aClass19_Sub3_1;
	}
}
