import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class57_Sub1_Sub1 extends Class57_Sub1 {

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "Lclient!lha;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
	private final int anInt1052;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
	private final int anInt1050;

	@OriginalMember(owner = "client!cea", name = "s", descriptor = "Lclient!gd;")
	private final Class65_Sub2 aClass65_Sub2_3;

	@OriginalMember(owner = "client!cea", name = "t", descriptor = "I")
	private final int anInt1053;

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
	private final int anInt1051;

	@OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
	private final int anInt1049;

	@OriginalMember(owner = "client!cea", name = "v", descriptor = "I")
	private final int anInt1055;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!gd;IIIIII)V")
	public Class57_Sub1_Sub1(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1052 = arg6;
		this.anInt1050 = arg3;
		this.aClass65_Sub2_3 = arg0;
		this.anInt1053 = arg1;
		this.anInt1051 = arg4;
		this.anInt1049 = arg5;
		this.anInt1055 = arg2;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)Lclient!lha;")
	@Override
	public Interface14 method971() {
		if (this.anInterface14_1 == null) {
			Static155.anIntArray20[2] = this.anInt1050;
			@Pc(23) Interface4 local23 = this.aClass65_Sub2_3.anInterface4_11;
			Static155.anIntArray20[0] = this.anInt1053;
			Static155.anIntArray20[3] = this.anInt1051;
			Static155.anIntArray20[1] = this.anInt1055;
			Static155.anIntArray20[4] = this.anInt1049;
			Static155.anIntArray20[5] = this.anInt1052;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local23.method359(Static155.anIntArray20[local54])) {
					return null;
				}
				@Pc(72) Class136 local72 = local23.method358(Static155.anIntArray20[local54]);
				@Pc(79) int local79 = local72.aBoolean312 ? 64 : 128;
				if (local79 > local52) {
					local52 = local79;
				}
				if (local72.aByte54 > 0) {
					local50 = true;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static521.anIntArrayArray47[local98] = local23.method363(Static155.anIntArray20[local98], local52, 1.0F, false, local52);
			}
			this.anInterface14_1 = this.aClass65_Sub2_3.method4387(Static521.anIntArrayArray47, local52, local50);
		}
		return this.anInterface14_1;
	}
}
