import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class47_Sub1_Sub1 extends Class47_Sub1 {

	@OriginalMember(owner = "client!br", name = "q", descriptor = "Lclient!sba;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "I")
	private final int anInt928;

	@OriginalMember(owner = "client!br", name = "o", descriptor = "I")
	private final int anInt930;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "I")
	private final int anInt931;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "I")
	private final int anInt934;

	@OriginalMember(owner = "client!br", name = "r", descriptor = "Lclient!he;")
	private final Class144_Sub1 aClass144_Sub1_4;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "I")
	private final int anInt927;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "I")
	private final int anInt929;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!he;IIIIII)V")
	public Class47_Sub1_Sub1(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt928 = arg6;
		this.anInt930 = arg2;
		this.anInt931 = arg4;
		this.anInt934 = arg5;
		this.aClass144_Sub1_4 = arg0;
		this.anInt927 = arg1;
		this.anInt929 = arg3;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)Lclient!sba;")
	@Override
	public Interface20 method967() {
		if (this.anInterface20_1 == null) {
			Static5.anIntArray3[0] = this.anInt927;
			Static5.anIntArray3[1] = this.anInt930;
			Static5.anIntArray3[4] = this.anInt934;
			@Pc(34) Interface4 local34 = this.aClass144_Sub1_4.anInterface4_12;
			Static5.anIntArray3[3] = this.anInt931;
			Static5.anIntArray3[2] = this.anInt929;
			Static5.anIntArray3[5] = this.anInt928;
			@Pc(51) byte local51 = 0;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local34.method8974(Static5.anIntArray3[local55])) {
					return null;
				}
				@Pc(78) Class69 local78 = local34.method8975(Static5.anIntArray3[local55]);
				@Pc(86) int local86 = local78.aBoolean113 ? 64 : 128;
				if (local86 > local53) {
					local53 = local86;
				}
				if (local78.aByte21 > 0) {
					local51 = 1;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static589.anIntArrayArray58[local102] = local34.method8977(1.0F, Static5.anIntArray3[local102], local53, local53, false);
			}
			this.anInterface20_1 = this.aClass144_Sub1_4.method5741(Static589.anIntArrayArray58, local53, local51 != 0);
		}
		return this.anInterface20_1;
	}
}
