import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class103_Sub1_Sub1 extends Class103_Sub1 {

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "Lclient!lm;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	private final int anInt6439;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "Lclient!bda;")
	private final Class4_Sub2 aClass4_Sub2_11;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
	private final int anInt6442;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	private final int anInt6435;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
	private final int anInt6438;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	private final int anInt6437;

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
	private final int anInt6444;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!bda;IIIIII)V")
	public Class103_Sub1_Sub1(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6439 = arg6;
		this.aClass4_Sub2_11 = arg0;
		this.anInt6442 = arg1;
		this.anInt6435 = arg4;
		this.anInt6438 = arg3;
		this.anInt6437 = arg5;
		this.anInt6444 = arg2;
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)Lclient!lm;")
	@Override
	public Interface11 method5799() {
		if (this.anInterface11_1 == null) {
			Static420.anIntArray704[2] = this.anInt6438;
			@Pc(22) Interface13 local22 = this.aClass4_Sub2_11.anInterface13_13;
			Static420.anIntArray704[3] = this.anInt6435;
			Static420.anIntArray704[4] = this.anInt6437;
			Static420.anIntArray704[0] = this.anInt6442;
			Static420.anIntArray704[5] = this.anInt6439;
			Static420.anIntArray704[1] = this.anInt6444;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local22.method5788(Static420.anIntArray704[local53])) {
					return null;
				}
				@Pc(71) Class296 local71 = local22.method5789(Static420.anIntArray704[local53]);
				@Pc(78) int local78 = local71.aBoolean638 ? 64 : 128;
				if (local71.aByte102 > 0) {
					local49 = 1;
				}
				if (local51 < local78) {
					local51 = local78;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static516.anIntArrayArray119[local98] = local22.method5790(local51, false, 1.0F, Static420.anIntArray704[local98], local51);
			}
			this.anInterface11_1 = this.aClass4_Sub2_11.method7329(local51, Static516.anIntArrayArray119, local49 != 0);
		}
		return this.anInterface11_1;
	}
}
